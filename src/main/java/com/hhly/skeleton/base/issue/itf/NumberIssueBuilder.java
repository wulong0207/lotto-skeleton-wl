package com.hhly.skeleton.base.issue.itf;

import java.util.Date;
import java.util.Map;

import org.apache.commons.lang.time.DateUtils;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import com.hhly.skeleton.base.exception.ServiceRuntimeException;
import com.hhly.skeleton.base.issue.entity.NewIssueBO;
import com.hhly.skeleton.base.issue.entity.NewTypeBO;
import com.hhly.skeleton.base.util.DateUtil;

/**
 * @desc 数字彩彩期生成
 * @author jiangwei
 * @date 2017-1-20
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class NumberIssueBuilder extends AbstractIssueBuilder {

	public NumberIssueBuilder(NewIssueBO lastIssuePO,
			NewTypeBO lotteryBO) {
		super(lastIssuePO, lotteryBO);
	}

	@Override
	public void computeIssueCode() {
		Assert.notNull(lastIssuePO.getOfficialEndTime(), "上期官方截止时间不能为空");
		String issueCode = String.valueOf((Long.valueOf(lastIssuePO.getIssueCode()) + 1));
		issuePO.setIssueCode(issueCode);
	}
	/**
	 * 检查是否跨年
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年3月30日 下午6:14:33
	 */
	@SuppressWarnings("deprecation")
	private void checkIssue(){
		// 数字彩(当前期加1):注意跨年
		if (issuePO.getOfficialEndTime().getYear() != lastIssuePO.getSaleTime().getYear()) {
			//如果开售时间与官方截止时间不在一年表示跨年
			String issueCode = DateUtil.convertDateToStr(
					issuePO.getOfficialEndTime(), this.YEAR_HEAD_WELFARE);
			//检查是否已经跨年
			if(issuePO.getIssueCode().indexOf(issueCode) != -1){
				return;
			}
			for (int i = 1; i < lotteryBO.getEnd(); i++) {
				issueCode += "0";
			}
			issueCode += "1";
			issuePO.setIssueCode(issueCode);
			
		}
	}
	@Override
	public void computeOfficialEndTime() {
		// 常规数字彩，需要查找下个周期日期（根据上期官方销售截止日期计算）
		Date oet = lastIssuePO.getOfficialEndTime();
		// 对上一期截止时间不断累加天数，直到到达下一个官方截止时间
		Map<String, String[]> endRule = lotteryBO.getEndRule();
		if (endRule == null) {
			throw new ServiceRuntimeException("官方截止时间规则不存在,创建彩期失败");
		}
		while (true) {
			oet = DateUtils.addDays(oet, 1);
			String week = String.valueOf(DateUtil.dayForWeek(oet));
			if (!endRule.containsKey(week)) {
				continue;
			}
			String r[] = endRule.get(week);
			// 判断是否是休市日期
			if (isVacation(oet)) {
				continue;
			}
			String dateStr = DateUtil.convertDateToStr(oet,
					DateUtil.DATE_FORMAT) + " " + r[1] + ":00";
			issuePO.setOfficialEndTime(DateUtil.convertStrToDate2(dateStr,
					DateUtil.DEFAULT_FORMAT));
			break;
		}
		checkIssue();
	}

	@Override
	public void computeLotteryTime() {
		// 数字彩，日期为截止销售日期
		String week = String.valueOf(DateUtil.dayForWeek(issuePO.getOfficialEndTime()));
		String[] timeRule = null; 
		if(CollectionUtils.isEmpty(lotteryBO.getDrawTimeRule())
				|| (timeRule = lotteryBO.getDrawTimeRule().get(week)) == null){
			throw new ServiceRuntimeException("数字彩开奖规则错误week："+week+"|"+timeRule);
		}
		String date = DateUtil.convertDateToStr(issuePO.getOfficialEndTime(),DateUtil.DATE_FORMAT);
		issuePO.setLotteryTime(DateUtil.convertStrToDate2(date + " " + timeRule[1],DateUtil.DATETIME_FORMAT_NO_SEC));
	}

	@Override
	public void computeSaleTime() {
		//数字彩开始送票时间，上期官方截止日期，加上配置官方可送票时间规则，（需要注意跨天）,在加上配置延迟时间
		Date saleTime = setDateStartRule(lastIssuePO.getOfficialEndTime());
		if(saleTime.getTime() < lastIssuePO.getOfficialEndTime().getTime()){
			saleTime = DateUtils.addDays(saleTime, 1);
			saleTime = setDateStartRule(saleTime);
		}
		issuePO.setOfficialStartTime(saleTime);
		saleTime = DateUtils.addSeconds(saleTime,lotteryBO.getSaleTime());
		issuePO.setSaleTime(saleTime);
	}
	
}

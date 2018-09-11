package com.hhly.skeleton.base.issue.itf;

import java.util.Date;
import java.util.Map;

import org.apache.commons.lang.time.DateUtils;

import com.hhly.skeleton.base.exception.ServiceRuntimeException;
import com.hhly.skeleton.base.issue.entity.NewIssueBO;
import com.hhly.skeleton.base.issue.entity.NewTypeBO;
import com.hhly.skeleton.base.util.DateUtil;

/**
 * @desc 北京单场，胜负过关
 * @author jiangwei
 * @date 2017年7月18日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class SingleMarketIssueBuilder extends AbstractIssueBuilder {

	public SingleMarketIssueBuilder(NewIssueBO lastIssuePO, NewTypeBO lotteryBO) {
		super(lastIssuePO, lotteryBO);
	}

	@Override
	public void computeIssueCode() {
		
	}
	/**
	 * 创建彩期期号，需要计算出截止时间才能计算出期号
	 * 
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年7月18日 上午11:04:18
	 */
	private void createIssueCode() {
		// 期号规则，比赛截止日期月份，+2位从01开始递增数，每月开始都需要重置
		String str = DateUtil.convertDateToStr(issuePO.getOfficialEndTime(), DateUtil.FORMAT_YYYYMM);
		if(lastIssuePO.getIssueCode().indexOf(str) == -1){
			issuePO.setIssueCode(str+"01");
		}else{
			int code = Integer.parseInt(lastIssuePO.getIssueCode()) + 1;
			issuePO.setIssueCode(String.valueOf(code));
		}
	}

	@Override
	public void computeOfficialEndTime() {
		Date oet = lastIssuePO.getOfficialEndTime();
		Map<String, String[]> endRule = lotteryBO.getEndRule();
		if (endRule == null) {
			throw new ServiceRuntimeException("官方截止时间规则不存在,创建彩期失败");
		}
		while (true) {
			oet = DateUtils.addDays(oet, 1);
			int w = DateUtil.dayForWeek(oet);
			String week = String.valueOf(w);
			if (!endRule.containsKey(week) || w != 2) {
				//北京单场，胜负过关只能是星期2切换彩期
				continue;
			}
			String r[] = endRule.get(week);
			// 判断是否是休市日期
			if (isVacation(oet)) {
				continue;
			}
			String dateStr = DateUtil.convertDateToStr(oet, DateUtil.DATE_FORMAT) + " " + r[1] + ":00";
			issuePO.setOfficialEndTime(DateUtil.convertStrToDate2(dateStr, DateUtil.DEFAULT_FORMAT));
			break;
		}
		createIssueCode();
	}

	@Override
	public void computeLotteryTime() {
		Date date = issuePO.getOfficialEndTime();
		date = DateUtils.setHours(date, 11);
		date = DateUtils.setMinutes(date, 0);
		date = DateUtils.setSeconds(date, 0);
		issuePO.setLotteryTime(date);
	}

	@Override
	public void computeSaleTime() {
		Date saleTime = setDateStartRule(lastIssuePO.getOfficialEndTime());
		issuePO.setOfficialStartTime(saleTime);
		saleTime = DateUtils.addSeconds(saleTime, lotteryBO.getSaleTime());
		issuePO.setSaleTime(saleTime);
	}

}

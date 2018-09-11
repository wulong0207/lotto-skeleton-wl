package com.hhly.skeleton.base.issue.itf;

import java.util.Date;
import java.util.Map;

import org.apache.commons.lang.time.DateUtils;

import com.hhly.skeleton.base.constants.SymbolConstants;
import com.hhly.skeleton.base.exception.ServiceRuntimeException;
import com.hhly.skeleton.base.issue.entity.NewIssueBO;
import com.hhly.skeleton.base.issue.entity.NewTypeBO;
import com.hhly.skeleton.base.util.DateUtil;

/**
 * @desc 竞彩彩期生成期
 * @author jiangwei
 * @date 2017-1-20
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class SportIssueBuilder extends AbstractIssueBuilder {

	public SportIssueBuilder(NewIssueBO lastIssuePO, NewTypeBO lotteryBO) {
		super(lastIssuePO, lotteryBO);
	}

	@Override
	public void computeIssueCode() {
		// 竞技彩（期号为日期格式，下一期为当前期+1天）
		Date date = getRationalDate(lastIssuePO.getIssueCode());
		issuePO.setIssueCode(DateUtil.convertDateToStr(date, DateUtil.DATE_FORMAT_NO_LINE));
	}
	
	
	@Override
	public void computeOfficialEndTime() {
		// 竞彩(需要注意是否跨天)，根据期号获取日期
		String issueCode = issuePO.getIssueCode();
		Date date = DateUtil.convertStrToDate2(issueCode,DateUtil.DATE_FORMAT_NO_LINE);
		
		String week = String.valueOf(DateUtil.dayForWeek(date));
		Map<String, String[]> endRule = lotteryBO.getEndRule();
		if (endRule == null) {
			throw new ServiceRuntimeException("官方截止时间规则不存在,创建彩期失败");
		}
		if (!endRule.containsKey(week)) {
			throw new ServiceRuntimeException("官方截止销售时间不存在：" + issueCode+ "," + endRule);
		}
		String se[] = endRule.get(week);
		if (TOMORROW.equals(se[2])) {
			// 表示跨天
			date = DateUtils.addDays(date, 1);
		}
		String time [] = se[1].split(SymbolConstants.COLON);
		date = DateUtils.addHours(date,Integer.valueOf(time[0]));
		date = DateUtils.addMinutes(date,Integer.valueOf(time[1]));
		issuePO.setOfficialEndTime(date);
	}

	@Override
	public void computeLotteryTime() {
		
	}

	@Override
	public void computeSaleTime() {
		if(lotteryBO.getStartRule() ==null){
			throw new ServiceRuntimeException("竞技彩销售开始时间格式错误");
		}
		Date date = DateUtil.convertStrToDate2(issuePO.getIssueCode(),
				DateUtil.DATE_FORMAT_NO_LINE);
		String week = String.valueOf(DateUtil.dayForWeek(date));
		String[] str = lotteryBO.getStartRule().get(week);
		if (str == null) {
			throw new ServiceRuntimeException("", "竞技彩计算开售时间错误!开售规则不全");
		}
		//开售时间
		date = DateUtil.convertStrToDate2(issuePO.getIssueCode() + " " + str[1] + ":00",DateUtil.DATE_FORMAT_LINE);
		issuePO.setOfficialStartTime(date);
		issuePO.setSaleTime(date);
	}
}

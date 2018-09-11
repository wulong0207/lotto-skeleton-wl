package com.hhly.skeleton.base.issue.itf;

import java.util.Date;
import java.util.Map;

import org.apache.commons.lang.time.DateUtils;
import org.springframework.util.NumberUtils;
import org.springframework.util.StringUtils;

import com.hhly.skeleton.base.constants.SymbolConstants;
import com.hhly.skeleton.base.exception.ServiceRuntimeException;
import com.hhly.skeleton.base.issue.entity.NewIssueBO;
import com.hhly.skeleton.base.issue.entity.NewTypeBO;
import com.hhly.skeleton.base.util.DateUtil;

public class HighIssueBuilder extends AbstractIssueBuilder {

	public HighIssueBuilder(NewIssueBO lastIssuePO, NewTypeBO lotteryBO) {
		super(lastIssuePO, lotteryBO);
	}

	@Override
	public void before() {
		super.before();
		splitSailDayCycle();
	}

	/**
	 * 计算高频彩的销售周期
	 * 
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017-1-20 上午10:11:09
	 */
	private void splitSailDayCycle() {
		if (lotteryBO.getCycles() != null) {
			return;
		}
		String sailDayCycle = lotteryBO.getSailDayCycle();
		if (StringUtils.hasText(sailDayCycle)) {
			String[] cycles = sailDayCycle.split(SymbolConstants.COMMA);
			int[][] cycle = new int[cycles.length][3];
			for (int i = 0; i < cycles.length; i++) {
				String range[] = StringUtils.tokenizeToStringArray(cycles[i],
						"-|");
				int[] cyc = new int[3];
				cyc[0] = NumberUtils.parseNumber(range[0], Integer.class);
				cyc[1] = NumberUtils.parseNumber(range[1], Integer.class);
				cyc[2] = NumberUtils.parseNumber(range[2], Integer.class);
				cycle[i] = cyc;
			}
			lotteryBO.setCycles(cycle);
		} else {
			throw new ServiceRuntimeException("该高频彩销售周期为空,不能创建彩期失败");
		}
	}

	@Override
	public void computeIssueCode() {
		// 高频彩（如果是当天最后一期，则为次天第一期，否则+1）
		// 判断是否当天的最后一期
		String lastIssueCode = lastIssuePO.getIssueCode();
		if (lastIssueCode.length() != (8 + lotteryBO.getEnd())) {
			String format = "yyyyMMdd";
			for (int i = 0; i < lotteryBO.getEnd(); i++) {
				format += "X";
			}
			throw new ServiceRuntimeException("高频彩上一期彩期格式错误" + lastIssueCode
					+ "，目前只能解析"+format+"格式");
		}
		// 获取最大期数
		int maxNum = 0;
		for (int i = 0; i < lotteryBO.getCycles().length; i++) {
			int num = lotteryBO.getCycles()[i][1];
			if (num > maxNum) {
				maxNum = num;
			}
		}
		//根据最大期号判断是否是当天最后一期
		String issueCode = null;
		if (lastIssueCode.endsWith(String.valueOf(maxNum))) {
			Date date = getRationalDate(lastIssueCode.substring(0, 8));
			String endStr = "1";
			for (int i = 1; i < lotteryBO.getEnd(); i++) {
				endStr  = "0" + endStr;
			}
			issueCode = DateUtil.convertDateToStr(date,
					DateUtil.DATE_FORMAT_NO_LINE) + endStr;
		} else {
			long lastIssueCodeLong = Long.parseLong(lastIssueCode);
			issueCode = String.valueOf((lastIssueCodeLong + 1));
		}
		issuePO.setIssueCode(issueCode);
	}
	

	@Override
	public void computeOfficialEndTime() {
		Date officialEndTime = null;
		// 高频彩（需要判断是否是当天的第一期，期号获取日期）
		String issueCode = issuePO.getIssueCode();
		int code = getCode(issueCode);// 当天第几期
		if (code == 1) {
			Map<String, String[]> endRule = lotteryBO.getEndRule();
			if (endRule == null) {
				throw new ServiceRuntimeException("官方截止时间规则不存在,创建彩期失败");
			}
			String dateStr = issueCode.substring(0, 8);
			Date date = DateUtil.convertStrToDate2(dateStr,DateUtil.DATE_FORMAT_NO_LINE);
			String week = String.valueOf(DateUtil.dayForWeek(date));
			dateStr = dateStr + " " + endRule.get(week)[1];
			officialEndTime = DateUtil.convertStrToDate2(dateStr,"yyyyMMdd HH:mm");
		} else {
			// 不是当天第一期需要解析格式：1-30|300,31-60|600（期数|销售秒）获取当前期的销售时间
			int[][] cycles = lotteryBO.getCycles();
			for (int i = 0; i < cycles.length; i++) {
				if (code >= cycles[i][0] && code <= cycles[i][1]) {
					officialEndTime = DateUtils.addSeconds(lastIssuePO.getOfficialEndTime(),cycles[i][2]);
					break;
				}
			}
			if (officialEndTime == null) {
				throw new ServiceRuntimeException("高频彩期号不在开奖周期里："+ issueCode);
			}
		}
		issuePO.setOfficialEndTime(officialEndTime);
	}

	@Override
	public void computeLotteryTime() {
		issuePO.setLotteryTime(DateUtils.addSeconds(issuePO.getOfficialEndTime(), 30)); 
	}

	@Override
	public void computeSaleTime() {
		//高频彩的开售时间（官方送票时间），如果是当天第一期需要按照配置规则（官方可送票时间）计算
		int code = getCode(issuePO.getIssueCode());
		Date saleTime = lastIssuePO.getOfficialEndTime();
		if(code == 1){
			String  str  =issuePO.getIssueCode().substring(0, 8);
			Date date = DateUtil.convertStrToDate(str, DateUtil.DATE_FORMAT_NO_LINE);
			saleTime = setDateStartRule(date);
			//如果开售时间比截止时间晚，说明前一天开始销售
			if(saleTime.getTime() > issuePO.getOfficialEndTime().getTime()){
				saleTime =  DateUtils.addDays(saleTime, -1);
			}
		}
		issuePO.setOfficialStartTime(saleTime);
		saleTime = DateUtils.addSeconds(saleTime, lotteryBO.getSaleTime());
		issuePO.setSaleTime(saleTime);
	}
	
	/**
	 * 计算该期为当天第几期
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年3月1日 上午11:48:43
	 * @param issueCode
	 * @return
	 */
	private int getCode(String issueCode){
		return  Integer.parseInt(issueCode.substring(8));
	}
}

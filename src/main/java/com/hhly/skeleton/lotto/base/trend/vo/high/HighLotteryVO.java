package com.hhly.skeleton.lotto.base.trend.vo.high;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.constants.HighConstants;
import com.hhly.skeleton.base.vo.BaseVO;

/**
 * @desc    高频彩遗漏VO
 * @author  Tony Wang
 * @date    2017年3月13日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class HighLotteryVO extends BaseVO {

	/**
	 * 彩种编号
	 */
	@JsonIgnore
	private Integer lotteryCode;
	
	/**
	 * 遗漏类型
	 * 1->冷热数据,2->遗漏数据(当前遗漏),3->最大遗漏,4->上次遗漏
	 */
	private List<Integer> omitTypes;
	
	/**
	 * 多个子玩法
	 * 十一选五：1任选;2.万位;3:千位;4:百位;5:前二组选;6:前三组选
	 */
	private List<Integer> subPlays;

	/**
	 * 要查询的彩期数量，历史的默认为10期
	 */
	private Integer qryCount = HighConstants.QRY_DEFAULT_ISSUE_COUNT;

	/**
	 * 1：普通；2：近期走势；3：胆拖；4：和值。默认1
	 */
	private Byte qryFlag = 1;
	
//	/**
//	 * 不同的走势或子玩法查询不同的表
//	 */
//	@JsonIgnore
//	private String tableName;
	
	private boolean showIssue;
	private boolean showDrawCode;
	private boolean showFlag;
	private boolean showLotteryCode;
	
	public HighLotteryVO() {
		super();
	}

	public HighLotteryVO(int lotteryCode, int subPlay, int omitType) {
		this.lotteryCode = lotteryCode;
		this.subPlays = Arrays.asList(subPlay);
		this.omitTypes = Arrays.asList(omitType);
	}
	
	public HighLotteryVO(Integer lotteryCode, List<Integer> subPlays, List<Integer> omitTypes) {
		this.lotteryCode = lotteryCode;
		this.subPlays = subPlays;
		this.omitTypes = omitTypes;
	}


	public List<Integer> getOmitTypes() {
		return omitTypes;
	}

	public void setOmitTypes(List<Integer> omitTypes) {
		this.omitTypes = omitTypes;
	}

	public List<Integer> getSubPlays() {
		return subPlays;
	}

	public void setSubPlays(List<Integer> subPlays) {
		this.subPlays = subPlays;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public Integer getQryCount() {
		return qryCount;
	}

	public void setQryCount(Integer qryCount) {
		this.qryCount = qryCount;
	}

	public Byte getQryFlag() {
		return qryFlag;
	}

	public void setQryFlag(Byte qryFlag) {
		this.qryFlag = qryFlag;
	}
	public boolean isShowIssue() {
		return showIssue;
	}
	public void setShowIssue(boolean showIssue) {
		this.showIssue = showIssue;
	}
	public boolean isShowDrawCode() {
		return showDrawCode;
	}

	public void setShowDrawCode(boolean showDrawCode) {
		this.showDrawCode = showDrawCode;
	}

	public boolean isShowFlag() {
		return showFlag;
	}
	public void setShowFlag(boolean showFlag) {
		this.showFlag = showFlag;
	}

	public boolean isShowLotteryCode() {
		return showLotteryCode;
	}

	public void setShowLotteryCode(boolean showLotteryCode) {
		this.showLotteryCode = showLotteryCode;
	}
}

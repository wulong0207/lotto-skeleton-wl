package com.hhly.skeleton.cms.report.vo;

/**
 * @desc    r_log表VO
 * @author  Tony Wang
 * @boolean    2017年9月8日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class ReportLogVO implements java.io.Serializable {
	
	//用户是否去重
	private boolean distinctUserCount;
	//是否统计总数
    private boolean count;
    //是否统计投注金额
    private boolean sumOrderAmount;
    //是否统计充值金额
    private boolean sumFillAmount;
    //是否统计中奖金额
    private boolean sumWinningAmount;
    //是否统计最小次数
    private boolean minTimes;
    //是否区分  1：代购；2：追加；3：合买
    private boolean flag;
    //子玩法编码
    private boolean childCode;
    //彩种编码
    private boolean lotteryCode;
    
	public boolean isDistinctUserCount() {
		return distinctUserCount;
	}
	public void setDistinctUserCount(boolean distinctUserCount) {
		this.distinctUserCount = distinctUserCount;
	}
	public boolean isCount() {
		return count;
	}
	public void setCount(boolean count) {
		this.count = count;
	}
	public boolean isSumOrderAmount() {
		return sumOrderAmount;
	}
	public void setSumOrderAmount(boolean sumOrderAmount) {
		this.sumOrderAmount = sumOrderAmount;
	}
	public boolean isSumFillAmount() {
		return sumFillAmount;
	}
	public void setSumFillAmount(boolean sumFillAmount) {
		this.sumFillAmount = sumFillAmount;
	}
	public boolean isSumWinningAmount() {
		return sumWinningAmount;
	}
	public void setSumWinningAmount(boolean sumWinningAmount) {
		this.sumWinningAmount = sumWinningAmount;
	}
	public boolean isMinTimes() {
		return minTimes;
	}
	public void setMinTimes(boolean minTimes) {
		this.minTimes = minTimes;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public boolean isChildCode() {
		return childCode;
	}
	public void setChildCode(boolean childCode) {
		this.childCode = childCode;
	}
	public boolean isLotteryCode() {
		return lotteryCode;
	}
	public void setLotteryCode(boolean lotteryCode) {
		this.lotteryCode = lotteryCode;
	}
}

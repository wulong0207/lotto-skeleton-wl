package com.hhly.skeleton.lotto.base.lottery.bo;

import java.util.List;

import com.hhly.skeleton.activity.bo.ActivityBO;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.lotto.base.issue.bo.IssueBO;
import com.hhly.skeleton.lotto.base.issue.bo.IssueDrawBO;

/**
 * @desc 封装每个彩种首页必备的基础信息
 * @author Bruce
 * @date 2017年3月8日
 * @company 益彩网络科技有限公司
 * @version 1.0
 */
public class LotteryIssueBaseBO extends BaseBO {

	private static final long serialVersionUID = 4513172048349500140L;

	/**
	 * 彩种基本信息
	 */
	private LotteryBO curLottery;

	/**
	 * 当前彩期信息
	 */
	private IssueBO curIssue;

	/**
	 * 最新开奖彩期及详情
	 */
	private IssueDrawBO latestIssue;

	/**
	 * 当前期下一期信息
	 */
	private IssueBO nextIssue;

	/**
	 * 彩种投注注数，倍数截止时间配置
	 */
	private List<LotBettingMulBO> lotBetMulList;

	/**
	 * 彩种子玩法配置
	 */
	private List<LotChildBO> lotChildList;

	/**
	 * 限号信息
	 */
	private List<LimitNumberInfoBO> limitInfoList;
	
	/**
	 * 加奖信息
	 */
	private ActivityBO activityBO;

	public LotteryIssueBaseBO() {
	}

	public LotteryIssueBaseBO(LotteryBO curLottery, IssueBO curIssue, IssueDrawBO latestIssue,
			List<LotBettingMulBO> lotBetMulList, List<LotChildBO> lotChildList, List<LimitNumberInfoBO> limitInfoList) {
		this.curLottery = curLottery;
		this.curIssue = curIssue;
		this.latestIssue = latestIssue;
		this.lotBetMulList = lotBetMulList;
		this.lotChildList = lotChildList;
		this.limitInfoList = limitInfoList;
	}

	public LotteryIssueBaseBO(LotteryBO curLottery, IssueBO curIssue, IssueDrawBO latestIssue, IssueBO nextIssue,
							  List<LotBettingMulBO> lotBetMulList, List<LotChildBO> lotChildList, List<LimitNumberInfoBO> limitInfoList) {
		this.curLottery = curLottery;
		this.curIssue = curIssue;
		this.latestIssue = latestIssue;
		this.lotBetMulList = lotBetMulList;
		this.lotChildList = lotChildList;
		this.limitInfoList = limitInfoList;
		this.nextIssue = nextIssue;
	}

	public ActivityBO getActivityBO() {
		return activityBO;
	}

	public void setActivityBO(ActivityBO activityBO) {
		this.activityBO = activityBO;
	}

	public IssueBO getNextIssue() {
		return nextIssue;
	}

	public void setNextIssue(IssueBO nextIssue) {
		this.nextIssue = nextIssue;
	}

	public LotteryBO getCurLottery() {
		return curLottery;
	}

	public void setCurLottery(LotteryBO curLottery) {
		this.curLottery = curLottery;
	}

	public IssueBO getCurIssue() {
		return curIssue;
	}

	public void setCurIssue(IssueBO curIssue) {
		this.curIssue = curIssue;
	}

	public List<LotBettingMulBO> getLotBetMulList() {
		return lotBetMulList;
	}

	public void setLotBetMulList(List<LotBettingMulBO> lotBetMulList) {
		this.lotBetMulList = lotBetMulList;
	}

	public List<LotChildBO> getLotChildList() {
		return lotChildList;
	}

	public void setLotChildList(List<LotChildBO> lotChildList) {
		this.lotChildList = lotChildList;
	}

	public IssueDrawBO getLatestIssue() {
		return latestIssue;
	}

	public void setLatestIssue(IssueDrawBO latestIssue) {
		this.latestIssue = latestIssue;
	}

	public List<LimitNumberInfoBO> getLimitInfoList() {
		return limitInfoList;
	}

	public void setLimitInfoList(List<LimitNumberInfoBO> limitInfoList) {
		this.limitInfoList = limitInfoList;
	}

}

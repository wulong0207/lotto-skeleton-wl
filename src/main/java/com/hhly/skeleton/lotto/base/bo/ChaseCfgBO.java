package com.hhly.skeleton.lotto.base.bo;

import java.util.List;

import com.hhly.skeleton.cms.lotterymgr.bo.LotteryBettingMulBO;
import com.hhly.skeleton.lotto.base.lottery.bo.LotChildBO;

/**
 * 追号列表的后台设置的动态验证条件
 * @author wytong
 * @Version 1.0
 * @CreatDate 2016年12月16日 上午10:46:38
 */
public class ChaseCfgBO {

	// 用户所购买的彩种是否正常销售
	private final boolean salable;
	// 用户追号时的当前期
	private final String currIssue;
	// 追号列表是否包含当前期
	private final boolean containCurrIssue;
	// 若用户有追当前期，则验证当前期是否正常销售
	private final boolean currIssueSalable;
	// 当前期是否已经过了销售时间
	private final boolean currIssueOverdue;
	// 若用户有追当前期，用户验证追号时彩种即时的注数和倍数配置信息
	private final LotteryBettingMulBO lotBetCurrCfg;
	// 彩种的最大注数和倍数配置信息
	private final LotteryBettingMulBO lotBetMaxCfg;
	// 用户所购买的所有子玩法的即时配置信息
	private final List<LotChildBO> lotChildrenCfg;

	public ChaseCfgBO(boolean salable, String currIssue, boolean containCurrIssue, boolean currIssueSalable,
	    boolean currIssueOverdue, LotteryBettingMulBO lotBetCurrCfg, LotteryBettingMulBO lotBetMaxCfg,
	    List<LotChildBO> lotChildrenCfg) {
		this.salable = salable;
		this.currIssue = currIssue;
		this.containCurrIssue = containCurrIssue;
		this.currIssueSalable = currIssueSalable;
		this.currIssueOverdue = currIssueOverdue;
		this.lotBetCurrCfg = lotBetCurrCfg;
		this.lotBetMaxCfg = lotBetMaxCfg;
		this.lotChildrenCfg = lotChildrenCfg;
	}

	public boolean isSalable() {
		return salable;
	}

	public String getCurrIssue() {
		return currIssue;
	}

	public boolean isContainCurrIssue() {
		return containCurrIssue;
	}

	public boolean isCurrIssueSalable() {
		return currIssueSalable;
	}

	public boolean isCurrIssueOverdue() {
		return currIssueOverdue;
	}

	public LotteryBettingMulBO getLotBetCurrCfg() {
		return lotBetCurrCfg;
	}

	public LotteryBettingMulBO getLotBetMaxCfg() {
		return lotBetMaxCfg;
	}

	public List<LotChildBO> getLotChildrenCfg() {
		return lotChildrenCfg;
	}
}

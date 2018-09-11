package com.hhly.skeleton.lotto.base.bo;

import java.util.List;

import com.hhly.skeleton.cms.lotterymgr.bo.LotteryBettingMulBO;
import com.hhly.skeleton.lotto.base.lottery.bo.LotChildBO;

/**
 * 投注列表的后台设置的动态验证条件
 * @author wytong
 * @Version 1.0
 * @CreatDate 2016年12月16日 上午10:46:38
 */
public class ValidateOrderCfgBO {

	// 用户所购买的彩种是否正常销售
	private final boolean salable;
	// 用户所购买的彩种是否为当前期
	//private boolean isCurrIssue;
	// 用户所购买期是否正常销售
	private final boolean buyIssueSalable;
	// 用户所购买期是否已经过了销售时间
	private final boolean overdue;
	// 用户所购买的彩种即时的注数和倍数配置信息
	private final LotteryBettingMulBO lotBetCfg;
	// 用户所购买的所有子玩法的即时配置信息
	private final List<LotChildBO> lotChildrenCfg;
	
	public ValidateOrderCfgBO(boolean salable, boolean buyIssueSalable, boolean overdue, LotteryBettingMulBO lotBetCfg,
	    List<LotChildBO> lotChildrenCfg) {
		this.salable = salable;
		this.buyIssueSalable = buyIssueSalable;
		this.overdue = overdue;
		this.lotBetCfg = lotBetCfg;
		this.lotChildrenCfg = lotChildrenCfg;
	}
	
	public boolean isSalable() {
		return salable;
	}
	public boolean isBuyIssueSalable() {
		return buyIssueSalable;
	}
	public boolean isOverdue() {
		return overdue;
	}
	public LotteryBettingMulBO getLotBetCfg() {
		return lotBetCfg;
	}
	public List<LotChildBO> getLotChildrenCfg() {
		return lotChildrenCfg;
	}
}

package com.hhly.skeleton.lotto.base.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.lotto.base.issue.bo.IssueBO;

/**
 * @desc    销售信息BO
 * @author  Tony Wang
 * @date    2017年2月10日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class SalesInfoBO extends BaseBO {

	private static final long serialVersionUID = 6734367102699809519L;
	/**
	 * 当前销售期或当天/明天的第一期
	 */
	private final IssueBO currIssue;
	/**
	 * 倒计时
	 */
	private final CountdownBO countdown;
	
//	/**
//	 * 销售状态
//	 */
//	private final short saleStatus;
	
	/**
	 * 当前彩种是否正常销售
	 */
	private final boolean salable;
	
	/**
	 * 已销售的彩期数量
	 */
	private final short saledNum;
	
	/**
	 * 未销售的彩期数量
	 */
	private final short notSaleNum;

	public static class Builder {
		private IssueBO currIssue;
		private CountdownBO countdown;
		private boolean salable;
		private short saledNum;
		private short notSaleNum;
		
		public Builder currIssue(IssueBO currIssue) {
			this.currIssue = currIssue;
			return this;
		}
		public Builder countdown(CountdownBO countdown) {
			this.countdown = countdown;
			return this;
		}
		public Builder salable(boolean salable) {
			this.salable = salable;
			return this;
		}
		public Builder saledNum(short saledNum) {
			this.saledNum = saledNum;
			return this;
		}
		public Builder notSaleNum(short notSaleNum) {
			this.notSaleNum = notSaleNum;
			return this;
		}
		public SalesInfoBO build() {
			return new SalesInfoBO(this);
		}
	}
	private SalesInfoBO(Builder builder) {
		currIssue = builder.currIssue;
		countdown = builder.countdown;
		salable = builder.salable;
		saledNum = builder.saledNum;
		notSaleNum = builder.notSaleNum;
	}

	public IssueBO getCurrIssue() {
		return currIssue;
	}

	public CountdownBO getCountdown() {
		return countdown;
	}

	public boolean isSalable() {
		return salable;
	}

	public short getSaledNum() {
		return saledNum;
	}

	public short getNotSaleNum() {
		return notSaleNum;
	}

//	public void setSaleStatus(short saleStatus) {
//		this.saleStatus = saleStatus;
//		setBanned(this.saleStatus == 0);
//	}
	
}

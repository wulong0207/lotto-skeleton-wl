package com.hhly.skeleton.base.common;

import java.math.BigDecimal;

/**
 * 代理枚举
 * 
 * @author huangchengfang1219
 *
 */
public class AgentEnum {

	private final static BigDecimal ZERO = new BigDecimal(0.00);

	/**
	 * 返佣规则
	 * 
	 * @author huangchengfang1219
	 *
	 */
	public enum AGENT_REBATE_RULE {
		/**
		 * 0<amount<300,000
		 */
		LEVEL_0_30W(0, 300000, 0.020),
		/**
		 * 300,000<=amount<1,000,000
		 */
		LEVEL_30W_100W(300000, 1000000, 0.030),
		/**
		 * 1,000,000<=amount<2,000,000
		 */
		LEVEL_100W_200W(1000000, 2000000, 0.035),
		/**
		 * 2,000,000<=amount
		 */
		LEVEL_200W(2000000, null, 0.040);
		private BigDecimal minAmount;
		private BigDecimal maxAmount;

		private BigDecimal ratio;

		private AGENT_REBATE_RULE(Integer minAmount, Integer maxAmount, double ratio) {
			this.minAmount = minAmount == null ? null : new BigDecimal(minAmount);
			this.maxAmount = maxAmount == null ? null : new BigDecimal(maxAmount);
			this.ratio = new BigDecimal(ratio);
		}

		public static BigDecimal calculateIncome(BigDecimal amount) {
			if (amount == null) {
				return ZERO;
			}
			BigDecimal ratio = getRatio(amount);
			BigDecimal result = ratio.multiply(amount);
			result = result.setScale(2, BigDecimal.ROUND_HALF_UP);
			return result;
		}

		public static BigDecimal getRatio(BigDecimal amount) {
			if (amount == null) {
				return ZERO;
			}
			for (AGENT_REBATE_RULE rule : AGENT_REBATE_RULE.values()) {
				BigDecimal min = rule.getMinAmount();
				BigDecimal max = rule.getMaxAmount();
				if (min.compareTo(amount) <= 0 && (max == null || max.compareTo(amount) > 0)) {
					return rule.getRatio();
				}
			}
			return ZERO;
		}

		public BigDecimal getMinAmount() {
			return minAmount;
		}

		public void setMinAmount(BigDecimal minAmount) {
			this.minAmount = minAmount;
		}

		public BigDecimal getMaxAmount() {
			return maxAmount;
		}

		public void setMaxAmount(BigDecimal maxAmount) {
			this.maxAmount = maxAmount;
		}

		public BigDecimal getRatio() {
			return ratio;
		}

		public void setRatio(BigDecimal ratio) {
			this.ratio = ratio;
		}

	}

	/**
	 * 奖励规则
	 * 
	 * @author huangchengfang1219
	 *
	 */
	public enum AGENT_REWARD_RULE {
		/**
		 * 100,000<=amount<300,000
		 */
		LEVEL_10W_30W(100000, 300000, 0.005),
		/**
		 * 300,000<=amount<1,000,000
		 */
		LEVEL_30W_100W(300000, 1000000, 0.008),
		/**
		 * 1,000,000<=amount<2,000,000
		 */
		LEVEL_100W_200W(1000000, 2000000, 0.010),
		/**
		 * 2000,000<=amount
		 */
		LEVEL_200W(2000000, null, 0.012);
		private BigDecimal minAmount;
		private BigDecimal maxAmount;

		private BigDecimal ratio;

		private AGENT_REWARD_RULE(Integer minAmount, Integer maxAmount, double ratio) {
			this.minAmount = minAmount == null ? null : new BigDecimal(minAmount);
			this.maxAmount = maxAmount == null ? null : new BigDecimal(maxAmount);
			this.ratio = new BigDecimal(ratio);
		}

		public static BigDecimal calculateIncome(BigDecimal amount) {
			if (amount == null) {
				return ZERO;
			}
			BigDecimal ratio = getRatio(amount);
			BigDecimal result = ratio.multiply(amount);
			result = result.setScale(2, BigDecimal.ROUND_HALF_UP);
			return result;
		}

		public static BigDecimal getRatio(BigDecimal amount) {
			if (amount == null) {
				return ZERO;
			}
			for (AGENT_REWARD_RULE rule : AGENT_REWARD_RULE.values()) {
				BigDecimal min = rule.getMinAmount();
				BigDecimal max = rule.getMaxAmount();
				if (min.compareTo(amount) <= 0 && (max == null || max.compareTo(amount) > 0)) {
					return rule.getRatio();
				}
			}
			return ZERO;
		}

		public BigDecimal getMinAmount() {
			return minAmount;
		}

		public void setMinAmount(BigDecimal minAmount) {
			this.minAmount = minAmount;
		}

		public BigDecimal getMaxAmount() {
			return maxAmount;
		}

		public void setMaxAmount(BigDecimal maxAmount) {
			this.maxAmount = maxAmount;
		}

		public BigDecimal getRatio() {
			return ratio;
		}

		public void setRatio(BigDecimal ratio) {
			this.ratio = ratio;
		}

	}

}

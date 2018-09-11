package com.hhly.skeleton.lotto.base.bo;

/**
 * @desc    统计数据BO
 * @author  Tony Wang
 * @date    2016年12月10日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class StatisBO {
	/**
	 * 开奖号码中大数的个数
	 */
	private final byte big;
	
	/**
	 * 开奖号码中小数的个数
	 */
	private final byte small;
	
	/**
	 * 开奖号码中奇数的个数
	 */
	private final byte odd;
	
	/**
	 * 开奖号码中偶数的个数
	 */
	private final byte even;
	
	public byte getBig() {
		return big;
	}
	public byte getSmall() {
		return small;
	}
	public byte getOdd() {
		return odd;
	}
	public byte getEven() {
		return even;
	}
	public static class Builder {
		private byte big;
		private byte small;
		private byte odd;
		private byte even;

		public Builder big(byte val) {
			big = val;
			return this;
		}
		public Builder small(byte val) {
			small = val;
			return this;
		}
		public Builder odd(byte val) {
			odd = val;
			return this;
		}
		public Builder even(byte val) {
			even = val;
			return this;
		}

		public StatisBO build() {
			return new StatisBO(this);
		}
	}
	private StatisBO(Builder builder) {
		big = builder.big;
		small = builder.small;
		odd = builder.odd;
		even = builder.even;
	}
}

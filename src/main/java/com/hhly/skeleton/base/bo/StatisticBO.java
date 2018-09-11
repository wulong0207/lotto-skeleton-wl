package com.hhly.skeleton.base.bo;

/**
 * @desc 公用与各种表信息统计（如行数，不同金额字段的汇总等）
 * @author huangb
 * @date 2017年1月18日
 * @company 益彩网络
 * @version v1.0
 */
public class StatisticBO extends BaseBO {

	private static final long serialVersionUID = -870508066200464045L;
	/**
	 * 总统计数
	 */
	private int countAll;
	/**
	 * 统计数字段1
	 */
	private int count1;
	/**
	 * 统计数字段2
	 */
	private int count2;
	/**
	 * 统计数字段3
	 */
	private int count3;
	/**
	 * 统计数字段4
	 */
	private int count4;
	/**
	 * 统计数字段5
	 */
	private int count5;
	/**
	 * 总金额统计
	 */
	private double amountAll;
	/**
	 * 金额统计1
	 */
	private double amount1;
	/**
	 * 金额统计2
	 */
	private double amount2;
	/**
	 * 金额统计3
	 */
	private double amount3;
	/**
	 * 金额统计4
	 */
	private double amount4;
	/**
	 * 金额统计5
	 */
	private double amount5;

	public int getCountAll() {
		return countAll;
	}

	public void setCountAll(int countAll) {
		this.countAll = countAll;
	}

	public int getCount1() {
		return count1;
	}

	public void setCount1(int count1) {
		this.count1 = count1;
	}

	public int getCount2() {
		return count2;
	}

	public void setCount2(int count2) {
		this.count2 = count2;
	}

	public int getCount3() {
		return count3;
	}

	public void setCount3(int count3) {
		this.count3 = count3;
	}

	public int getCount4() {
		return count4;
	}

	public void setCount4(int count4) {
		this.count4 = count4;
	}

	public int getCount5() {
		return count5;
	}

	public void setCount5(int count5) {
		this.count5 = count5;
	}

	public double getAmountAll() {
		return amountAll;
	}

	public void setAmountAll(double amountAll) {
		this.amountAll = amountAll;
	}

	public double getAmount1() {
		return amount1;
	}

	public void setAmount1(double amount1) {
		this.amount1 = amount1;
	}

	public double getAmount2() {
		return amount2;
	}

	public void setAmount2(double amount2) {
		this.amount2 = amount2;
	}

	public double getAmount3() {
		return amount3;
	}

	public void setAmount3(double amount3) {
		this.amount3 = amount3;
	}

	public double getAmount4() {
		return amount4;
	}

	public void setAmount4(double amount4) {
		this.amount4 = amount4;
	}

	public double getAmount5() {
		return amount5;
	}

	public void setAmount5(double amount5) {
		this.amount5 = amount5;
	}

}

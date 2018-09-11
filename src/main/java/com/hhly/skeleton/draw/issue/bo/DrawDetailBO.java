package com.hhly.skeleton.draw.issue.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 开奖详情
 * @author huangchengfang1219
 * @date 2017年9月28日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class DrawDetailBO extends BaseBO {

	private static final long serialVersionUID = 2477036265672537348L;

	/**
	 * 奖项
	 */
	private String prize;

	/**
	 * 奖金
	 */
	private Double money;

	/**
	 * 注数
	 */
	private Integer num;

	/**
	 * 中奖条件
	 */
	private String condition;

	public String getPrize() {
		return prize;
	}

	public void setPrize(String prize) {
		this.prize = prize;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

}

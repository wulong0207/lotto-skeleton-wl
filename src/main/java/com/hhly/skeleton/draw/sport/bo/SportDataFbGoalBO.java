package com.hhly.skeleton.draw.sport.bo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hhly.skeleton.base.util.CustomDoubleSerialize;

public class SportDataFbGoalBO extends SportDataBaseBO {

	private static final long serialVersionUID = -5232058973265494753L;

	/**
	 * 总进球数0的SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spGoal0;

	/**
	 * 总进球数1的SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spGoal1;

	/**
	 * 总进球数2的SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spGoal2;

	/**
	 * 总进球数3的SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spGoal3;

	/**
	 * 总进球数4的SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spGoal4;

	/**
	 * 总进球数5的SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spGoal5;

	/**
	 * 总进球数6的SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spGoal6;

	/**
	 * 总进球数7以及以上的SP值
	 */
	@JsonSerialize(using = CustomDoubleSerialize.class)
	private Double spGoal7;

	public Double getSpGoal0() {
		return spGoal0;
	}

	public void setSpGoal0(Double spGoal0) {
		this.spGoal0 = spGoal0;
	}

	public Double getSpGoal1() {
		return spGoal1;
	}

	public void setSpGoal1(Double spGoal1) {
		this.spGoal1 = spGoal1;
	}

	public Double getSpGoal2() {
		return spGoal2;
	}

	public void setSpGoal2(Double spGoal2) {
		this.spGoal2 = spGoal2;
	}

	public Double getSpGoal3() {
		return spGoal3;
	}

	public void setSpGoal3(Double spGoal3) {
		this.spGoal3 = spGoal3;
	}

	public Double getSpGoal4() {
		return spGoal4;
	}

	public void setSpGoal4(Double spGoal4) {
		this.spGoal4 = spGoal4;
	}

	public Double getSpGoal5() {
		return spGoal5;
	}

	public void setSpGoal5(Double spGoal5) {
		this.spGoal5 = spGoal5;
	}

	public Double getSpGoal6() {
		return spGoal6;
	}

	public void setSpGoal6(Double spGoal6) {
		this.spGoal6 = spGoal6;
	}

	public Double getSpGoal7() {
		return spGoal7;
	}

	public void setSpGoal7(Double spGoal7) {
		this.spGoal7 = spGoal7;
	}

}

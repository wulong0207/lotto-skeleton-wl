package com.hhly.skeleton.lotto.base.trend.bo;

@SuppressWarnings("serial")
public class XyscColdHotOmitBo extends ColdHotOmitBo {

	private ColdHotOmitBo champion;
	private ColdHotOmitBo silver;
	private ColdHotOmitBo third;

	public ColdHotOmitBo getChampion() {
		return champion;
	}

	public void setChampion(ColdHotOmitBo champion) {
		this.champion = champion;
	}

	public ColdHotOmitBo getSilver() {
		return silver;
	}

	public void setSilver(ColdHotOmitBo silver) {
		this.silver = silver;
	}

	public ColdHotOmitBo getThird() {
		return third;
	}

	public void setThird(ColdHotOmitBo third) {
		this.third = third;
	}

}

package com.hhly.skeleton.activity.bo;

import com.hhly.skeleton.base.bo.BaseBO;
@SuppressWarnings("serial")
public class ActivityChpRetBO extends BaseBO{
	/**
     * 主队名称
     */
	private String homeName;
	/**
	 * 淘汰球队数量
	 */
	private Short outMatchNun;
	
	private Integer score;
	public ActivityChpRetBO(){
		
	}
	
	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public ActivityChpRetBO(String homeName,Short outMatchNun){
		this.homeName=homeName;
		this.outMatchNun=outMatchNun;
	}
	public String getHomeName() {
		return homeName;
	}
	public void setHomeName(String homeName) {
		this.homeName = homeName;
	}
	public Short getOutMatchNun() {
		return outMatchNun;
	}
	public void setOutMatchNun(Short outMatchNun) {
		this.outMatchNun = outMatchNun;
	}
	
}

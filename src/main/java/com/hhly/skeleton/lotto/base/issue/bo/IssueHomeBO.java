package com.hhly.skeleton.lotto.base.issue.bo;

import java.util.ArrayList;
import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;

public class IssueHomeBO  extends BaseBO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2492238825865772117L;
	/**
	 * 数字彩
	 */
	private List<IssueLottBO> numList = new ArrayList<IssueLottBO>();
	/**
	 * 高频彩
	 */
	private List<IssueLottBO> highList= new ArrayList<IssueLottBO>();
	/**
	 * 竞技彩
	 */
	private List<IssueLottBO> sportList= new ArrayList<IssueLottBO>();
	public List<IssueLottBO> getNumList() {
		return numList;
	}
	public void setNumList(List<IssueLottBO> numList) {
		this.numList = numList;
	}
	public List<IssueLottBO> getHighList() {
		return highList;
	}
	public void setHighList(List<IssueLottBO> highList) {
		this.highList = highList;
	}
	public List<IssueLottBO> getSportList() {
		return sportList;
	}
	public void setSportList(List<IssueLottBO> sportList) {
		this.sportList = sportList;
	}
	
	
}

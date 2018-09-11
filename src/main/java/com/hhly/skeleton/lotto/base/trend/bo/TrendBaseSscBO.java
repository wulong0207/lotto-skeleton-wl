package com.hhly.skeleton.lotto.base.trend.bo;

import java.util.List;

/**
 * 
 * @desc 时时彩走势数据
 * @author chenghougui
 * @Date 2018年1月3日
 * @Company 益彩网络科技公司
 * @version
 */
public class TrendBaseSscBO extends TrendBaseBO {

	private static final long serialVersionUID = -7704984829562494126L;

	
	/**
	 * 基础号码
	 */
	private List<Integer> baseList;
	
	/**
	 * 万位
	 */
	private List<Integer> wbList;
	
	/**
	 * 千位
	 */
	private List<Integer> qbList;
	
	/**
	 * 百位
	 */
	private List<Integer> bbList;
	
	/**
	 * 十位
	 */
	private List<Integer> sbList;
	
	/**
	 * 个位
	 */
	private List<Integer> gbList;
	

	
	
	public List<Integer> getBaseList() {
		return baseList;
	}


	public void setBaseList(List<Integer> baseList) {
		this.baseList = baseList;
	}


	public List<Integer> getWbList() {
		return wbList;
	}


	public void setWbList(List<Integer> wbList) {
		this.wbList = wbList;
	}


	public List<Integer> getQbList() {
		return qbList;
	}


	public void setQbList(List<Integer> qbList) {
		this.qbList = qbList;
	}


	public List<Integer> getBbList() {
		return bbList;
	}


	public void setBbList(List<Integer> bbList) {
		this.bbList = bbList;
	}


	public List<Integer> getSbList() {
		return sbList;
	}


	public void setSbList(List<Integer> sbList) {
		this.sbList = sbList;
	}


	public List<Integer> getGbList() {
		return gbList;
	}


	public void setGbList(List<Integer> gbList) {
		this.gbList = gbList;
	}





}

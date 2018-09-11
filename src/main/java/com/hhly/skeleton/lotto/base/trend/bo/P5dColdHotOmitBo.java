package com.hhly.skeleton.lotto.base.trend.bo;

import com.hhly.skeleton.lotto.base.trend.vo.NumTimeVo;

/**
 * 冷/热/遗漏 数据类
 * 
 * @desc
 * @author chenghougui
 * @Date 2018年1月5日
 * @Company 益彩网络科技公司
 * @version
 */
@SuppressWarnings("serial")
public class P5dColdHotOmitBo extends ColdHotOmitBo {

	// 个位
	private NumTimeVo gwColdBase;
	// 个位
	private NumTimeVo gwHotBase;

	// 十位
	private NumTimeVo swColdBase;
	private NumTimeVo swHotBase;

	// 百位
	private NumTimeVo bwColdBase;
	private NumTimeVo bwHotBase;
	// 千位
	private NumTimeVo qwColdBase;
	private NumTimeVo qwHotBase;
	// 万位
	private NumTimeVo wwColdBase;
	private NumTimeVo wwHotBase;
	
	public NumTimeVo getGwColdBase() {
		return gwColdBase;
	}
	public void setGwColdBase(NumTimeVo gwColdBase) {
		this.gwColdBase = gwColdBase;
	}
	public NumTimeVo getGwHotBase() {
		return gwHotBase;
	}
	public void setGwHotBase(NumTimeVo gwHotBase) {
		this.gwHotBase = gwHotBase;
	}
	public NumTimeVo getSwColdBase() {
		return swColdBase;
	}
	public void setSwColdBase(NumTimeVo swColdBase) {
		this.swColdBase = swColdBase;
	}
	public NumTimeVo getSwHotBase() {
		return swHotBase;
	}
	public void setSwHotBase(NumTimeVo swHotBase) {
		this.swHotBase = swHotBase;
	}
	public NumTimeVo getBwColdBase() {
		return bwColdBase;
	}
	public void setBwColdBase(NumTimeVo bwColdBase) {
		this.bwColdBase = bwColdBase;
	}
	public NumTimeVo getBwHotBase() {
		return bwHotBase;
	}
	public void setBwHotBase(NumTimeVo bwHotBase) {
		this.bwHotBase = bwHotBase;
	}
	public NumTimeVo getQwColdBase() {
		return qwColdBase;
	}
	public void setQwColdBase(NumTimeVo qwColdBase) {
		this.qwColdBase = qwColdBase;
	}
	public NumTimeVo getQwHotBase() {
		return qwHotBase;
	}
	public void setQwHotBase(NumTimeVo qwHotBase) {
		this.qwHotBase = qwHotBase;
	}
	public NumTimeVo getWwColdBase() {
		return wwColdBase;
	}
	public void setWwColdBase(NumTimeVo wwColdBase) {
		this.wwColdBase = wwColdBase;
	}
	public NumTimeVo getWwHotBase() {
		return wwHotBase;
	}
	public void setWwHotBase(NumTimeVo wwHotBase) {
		this.wwHotBase = wwHotBase;
	}

	
	

}

package com.hhly.skeleton.lotto.base.trend.high.bo.c11x5;

import java.util.List;

import com.hhly.skeleton.lotto.base.trend.bo.TrendBaseBO;

/**
 * 11选5  走势投注(杂烩)，包含对各个不同玩法的统计
 * 目前只针对号码
 * @desc 
 * @author chenghougui
 * @Date 2018年3月31日
 * @Company 益彩网络科技公司
 * @version
 */
@SuppressWarnings("serial")
public class C11x5TrendBetHotchBO extends TrendBaseBO{
	
	//任选
	private List<C11x5TrendBetBO> baseData;
	private List<Integer> rxOccTimesSummy;
	private List<Integer> rxAvgMissSummy;
	private List<Integer> rxMaxMissSummy;
	private List<Integer> rxMaxContSummy;
	//前一
	private List<C11x5TrendBetBO> qxBaseData;
	private List<Integer> qxOccTimesSummy;
	private List<Integer> qxAvgMissSummy;
	private List<Integer> qxMaxMissSummy;
	private List<Integer> qxMaxContSummy;
	
	//前二
	private List<C11x5TrendBetBO> q2BaseData;
	private List<Integer> q2OccTimesSummy;
	private List<Integer> q2AvgMissSummy;
	private List<Integer> q2MaxMissSummy;
	private List<Integer> q2MaxContSummy;
	
	//前三
	private List<C11x5TrendBetBO> q3BaseData;
	private List<Integer> q3OccTimesSummy;
	private List<Integer> q3AvgMissSummy;
	private List<Integer> q3MaxMissSummy;
	private List<Integer> q3MaxContSummy;
	public List<C11x5TrendBetBO> getBaseData() {
		return baseData;
	}
	public void setBaseData(List<C11x5TrendBetBO> baseData) {
		this.baseData = baseData;
	}
	public List<Integer> getRxOccTimesSummy() {
		return rxOccTimesSummy;
	}
	public void setRxOccTimesSummy(List<Integer> rxOccTimesSummy) {
		this.rxOccTimesSummy = rxOccTimesSummy;
	}
	public List<Integer> getRxAvgMissSummy() {
		return rxAvgMissSummy;
	}
	public void setRxAvgMissSummy(List<Integer> rxAvgMissSummy) {
		this.rxAvgMissSummy = rxAvgMissSummy;
	}
	public List<Integer> getRxMaxMissSummy() {
		return rxMaxMissSummy;
	}
	public void setRxMaxMissSummy(List<Integer> rxMaxMissSummy) {
		this.rxMaxMissSummy = rxMaxMissSummy;
	}
	public List<Integer> getRxMaxContSummy() {
		return rxMaxContSummy;
	}
	public void setRxMaxContSummy(List<Integer> rxMaxContSummy) {
		this.rxMaxContSummy = rxMaxContSummy;
	}
	public List<C11x5TrendBetBO> getQxBaseData() {
		return qxBaseData;
	}
	public void setQxBaseData(List<C11x5TrendBetBO> qxBaseData) {
		this.qxBaseData = qxBaseData;
	}
	public List<Integer> getQxOccTimesSummy() {
		return qxOccTimesSummy;
	}
	public void setQxOccTimesSummy(List<Integer> qxOccTimesSummy) {
		this.qxOccTimesSummy = qxOccTimesSummy;
	}
	public List<Integer> getQxAvgMissSummy() {
		return qxAvgMissSummy;
	}
	public void setQxAvgMissSummy(List<Integer> qxAvgMissSummy) {
		this.qxAvgMissSummy = qxAvgMissSummy;
	}
	public List<Integer> getQxMaxMissSummy() {
		return qxMaxMissSummy;
	}
	public void setQxMaxMissSummy(List<Integer> qxMaxMissSummy) {
		this.qxMaxMissSummy = qxMaxMissSummy;
	}
	public List<Integer> getQxMaxContSummy() {
		return qxMaxContSummy;
	}
	public void setQxMaxContSummy(List<Integer> qxMaxContSummy) {
		this.qxMaxContSummy = qxMaxContSummy;
	}
	public List<C11x5TrendBetBO> getQ2BaseData() {
		return q2BaseData;
	}
	public void setQ2BaseData(List<C11x5TrendBetBO> q2BaseData) {
		this.q2BaseData = q2BaseData;
	}
	public List<Integer> getQ2OccTimesSummy() {
		return q2OccTimesSummy;
	}
	public void setQ2OccTimesSummy(List<Integer> q2OccTimesSummy) {
		this.q2OccTimesSummy = q2OccTimesSummy;
	}
	public List<Integer> getQ2AvgMissSummy() {
		return q2AvgMissSummy;
	}
	public void setQ2AvgMissSummy(List<Integer> q2AvgMissSummy) {
		this.q2AvgMissSummy = q2AvgMissSummy;
	}
	public List<Integer> getQ2MaxMissSummy() {
		return q2MaxMissSummy;
	}
	public void setQ2MaxMissSummy(List<Integer> q2MaxMissSummy) {
		this.q2MaxMissSummy = q2MaxMissSummy;
	}
	public List<Integer> getQ2MaxContSummy() {
		return q2MaxContSummy;
	}
	public void setQ2MaxContSummy(List<Integer> q2MaxContSummy) {
		this.q2MaxContSummy = q2MaxContSummy;
	}
	public List<C11x5TrendBetBO> getQ3BaseData() {
		return q3BaseData;
	}
	public void setQ3BaseData(List<C11x5TrendBetBO> q3BaseData) {
		this.q3BaseData = q3BaseData;
	}
	public List<Integer> getQ3OccTimesSummy() {
		return q3OccTimesSummy;
	}
	public void setQ3OccTimesSummy(List<Integer> q3OccTimesSummy) {
		this.q3OccTimesSummy = q3OccTimesSummy;
	}
	public List<Integer> getQ3AvgMissSummy() {
		return q3AvgMissSummy;
	}
	public void setQ3AvgMissSummy(List<Integer> q3AvgMissSummy) {
		this.q3AvgMissSummy = q3AvgMissSummy;
	}
	public List<Integer> getQ3MaxMissSummy() {
		return q3MaxMissSummy;
	}
	public void setQ3MaxMissSummy(List<Integer> q3MaxMissSummy) {
		this.q3MaxMissSummy = q3MaxMissSummy;
	}
	public List<Integer> getQ3MaxContSummy() {
		return q3MaxContSummy;
	}
	public void setQ3MaxContSummy(List<Integer> q3MaxContSummy) {
		this.q3MaxContSummy = q3MaxContSummy;
	}
	
}

package com.hhly.skeleton.lotto.base.trend.high.bo.ssc;

import java.util.List;

import com.hhly.skeleton.lotto.base.trend.bo.TrendBaseBO;

@SuppressWarnings("serial")
public class SscTrendBetHotchBO extends TrendBaseBO	 {
	private List<SscTrendBetBO> baseData;
	private SscTrendBetBO occTimesSummy;
	private SscTrendBetBO avgMissSummy;
	private SscTrendBetBO maxMissSummy;
	private SscTrendBetBO maxContSummy;

	public SscTrendBetHotchBO(){}
	public SscTrendBetHotchBO(List<SscTrendBetBO> baseData,SscTrendBetBO occTimesSummy,SscTrendBetBO avgMissSummy,SscTrendBetBO maxMissSummy,SscTrendBetBO maxContSummy){
		this.baseData = baseData;
		this.occTimesSummy = occTimesSummy;
		this.avgMissSummy = avgMissSummy;
		this.maxMissSummy = maxMissSummy;
		this.maxContSummy = maxContSummy;
	}
	
	public List<SscTrendBetBO> getBaseData() {
		return baseData;
	}

	public void setBaseData(List<SscTrendBetBO> baseData) {
		this.baseData = baseData;
	}

	public SscTrendBetBO getOccTimesSummy() {
		return occTimesSummy;
	}

	public void setOccTimesSummy(SscTrendBetBO occTimesSummy) {
		this.occTimesSummy = occTimesSummy;
	}

	public SscTrendBetBO getAvgMissSummy() {
		return avgMissSummy;
	}

	public void setAvgMissSummy(SscTrendBetBO avgMissSummy) {
		this.avgMissSummy = avgMissSummy;
	}

	public SscTrendBetBO getMaxMissSummy() {
		return maxMissSummy;
	}

	public void setMaxMissSummy(SscTrendBetBO maxMissSummy) {
		this.maxMissSummy = maxMissSummy;
	}

	public SscTrendBetBO getMaxContSummy() {
		return maxContSummy;
	}

	public void setMaxContSummy(SscTrendBetBO maxContSummy) {
		this.maxContSummy = maxContSummy;
	}

}

package com.hhly.skeleton.lotto.base.trend.bo;

import java.util.List;

import com.hhly.skeleton.lotto.base.trend.vo.NumTimeVo;

@SuppressWarnings("serial")
public class SscColdHotOmitBo extends ColdHotOmitBo {

	private List<NumTimeVo> today;
	private List<NumTimeVo> yesterday;
	private List<NumTimeVo> before;

	public List<NumTimeVo> getToday() {
		return today;
	}

	public void setToday(List<NumTimeVo> today) {
		this.today = today;
	}

	public List<NumTimeVo> getYesterday() {
		return yesterday;
	}

	public void setYesterday(List<NumTimeVo> yesterday) {
		this.yesterday = yesterday;
	}

	public List<NumTimeVo> getBefore() {
		return before;
	}

	public void setBefore(List<NumTimeVo> before) {
		this.before = before;
	}

}

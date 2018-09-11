package com.hhly.skeleton.lotto.base.trend.bo;

import java.util.List;

import com.hhly.skeleton.lotto.base.trend.vo.NumTimeVo;

@SuppressWarnings("serial")
public class K3ColdHotOmitBo extends ColdHotOmitBo {

	private List<NumTimeVo> today;
	private List<NumTimeVo> yesterday;
	private List<NumTimeVo> before;
	
	private List<NumTimeVo> todayCold;
	private List<NumTimeVo> todayHot;
	private List<NumTimeVo> yesterdayCold;
	private List<NumTimeVo> yesterdayHot;
	private List<NumTimeVo> beforeCold;
	private List<NumTimeVo> beforeHot;
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
	public List<NumTimeVo> getTodayCold() {
		return todayCold;
	}
	public void setTodayCold(List<NumTimeVo> todayCold) {
		this.todayCold = todayCold;
	}
	public List<NumTimeVo> getTodayHot() {
		return todayHot;
	}
	public void setTodayHot(List<NumTimeVo> todayHot) {
		this.todayHot = todayHot;
	}
	public List<NumTimeVo> getYesterdayCold() {
		return yesterdayCold;
	}
	public void setYesterdayCold(List<NumTimeVo> yesterdayCold) {
		this.yesterdayCold = yesterdayCold;
	}
	public List<NumTimeVo> getYesterdayHot() {
		return yesterdayHot;
	}
	public void setYesterdayHot(List<NumTimeVo> yesterdayHot) {
		this.yesterdayHot = yesterdayHot;
	}
	public List<NumTimeVo> getBeforeCold() {
		return beforeCold;
	}
	public void setBeforeCold(List<NumTimeVo> beforeCold) {
		this.beforeCold = beforeCold;
	}
	public List<NumTimeVo> getBeforeHot() {
		return beforeHot;
	}
	public void setBeforeHot(List<NumTimeVo> beforeHot) {
		this.beforeHot = beforeHot;
	}



	

}

package com.hhly.skeleton.lotto.base.bo;

import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc    倒计时BO
 * @author  Tony Wang
 * @date    2016年12月10日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class CountdownBO extends BaseBO{

	private static final long serialVersionUID = 1675333077265064811L;
	/**
	 * 倒计时，单位毫秒
	 */
	private final long countdown;
	private final String hour;
	private final String minute;
	private final String second;
	private final String millisecond;
	
	/**
	 * 倒计时是否在2分钟内
	 */
	private final boolean lt2Minute;
	
	/**
	 * 倒计时是否>=1小时
	 */
	private final boolean gt1Hour;
	
	public long getCountdown() {
		return countdown;
	}

	public CountdownBO(long countdown) {
		this.countdown = countdown;
		this.lt2Minute = countdown <= 2*60*1000;
		this.gt1Hour = countdown >= 60*60*1000;
		long hour = (long) Math.floor(countdown/1000/60/60);
		long minute = (long) Math.floor((countdown - hour*60*60*1000)/1000/60);
		long second = (long) Math.floor((countdown - hour*60*60*1000 - minute*60*1000)/1000);
		long millisecond = (int) Math.floor(countdown - hour*60*60*1000 - minute*60*1000 - second*1000);
		this.hour = hour < 10 ? "0" + hour : "" + hour;
		this.minute = minute < 10 ? "0" + minute : "" + minute;
		this.second = second < 10 ? "0" + second : "" + second;
		this.millisecond = millisecond < 10  ? "00" + millisecond :
									 millisecond < 100 ? "0"  + millisecond : String.valueOf(millisecond);
	}

	public CountdownBO(Date target) {
		this(target.getTime() - System.currentTimeMillis());
	}

	public String getHour() {
		return hour;
	}

	public String getMinute() {
		return minute;
	}

	public String getSecond() {
		return second;
	}

	public String getMillisecond() {
		return millisecond;
	}

	public boolean getLt2Minute() {
		return lt2Minute;
	}

	public boolean getGt1Hour() {
		return gt1Hour;
	}
}

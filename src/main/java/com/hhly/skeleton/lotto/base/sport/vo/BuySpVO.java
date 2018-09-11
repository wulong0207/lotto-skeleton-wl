package com.hhly.skeleton.lotto.base.sport.vo;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * 
 * @author longguoyou
 * 
 * @date 2017年2月8日 下午4:08:51
 * 
 * @desc 购买投注赔率对象
 *
 */

public class BuySpVO extends BaseVO{
	private static final long serialVersionUID = 7596352562036814487L;
	/**
	 * 描述
	 */
	private String text;
	/**
	 * 赔率
	 */
	private double sp;
	/**
	 * 让球数
	 */
	private String handicap;
	/**
	 * 玩法
	 */
	private String way;
	
	public BuySpVO(){}
	public BuySpVO(String _text, double _sp , String _handicap , String _way){
		this.text  = _text;
		this.sp    = _sp;
		this.handicap = _handicap;
		this.way   = _way;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public double getSp() {
		return sp;
	}

	public void setSp(double sp) {
		this.sp = sp;
	}

	public String getHandicap() {
		return handicap;
	}

	public void setHandicap(String handicap) {
		this.handicap = handicap;
	}

	public String getWay() {
		return way;
	}

	public void setWay(String way) {
		this.way = way;
	}

}

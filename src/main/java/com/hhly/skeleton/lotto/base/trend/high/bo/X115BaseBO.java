package com.hhly.skeleton.lotto.base.trend.high.bo;

import com.hhly.skeleton.lotto.base.trend.bo.TrendBaseBO;

/**
 * @desc 十一选五遗漏BO
 * @author Tony Wang
 * @date 2017年3月15日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class X115BaseBO extends TrendBaseBO {

	/** 开奖号码包含1的遗漏 */
	private Integer b01;

	/** 开奖号码包含2的遗漏 */
	private Integer b02;

	/** 开奖号码包含3的遗漏 */
	private Integer b03;

	/** 开奖号码包含4的遗漏 */
	private Integer b04;

	/** 开奖号码包含5的遗漏 */
	private Integer b05;

	/** 开奖号码包含6的遗漏 */
	private Integer b06;

	/** 开奖号码包含7的遗漏 */
	private Integer b07;

	/** 开奖号码包含8的遗漏 */
	private Integer b08;

	/** 开奖号码包含9的遗漏 */
	private Integer b09;

	/** 开奖号码包含10的遗漏 */
	private Integer b10;

	/** 开奖号码包含11的遗漏 */
	private Integer b11;

	/** 彩种 */
	private Integer lotteryCode;

	/** 子玩法 */
	private String subPlay;

	public Integer getB01() {
		return b01;
	}

	public void setB01(Integer b01) {
		this.b01 = b01;
	}

	public Integer getB02() {
		return b02;
	}

	public void setB02(Integer b02) {
		this.b02 = b02;
	}

	public Integer getB03() {
		return b03;
	}

	public void setB03(Integer b03) {
		this.b03 = b03;
	}

	public Integer getB04() {
		return b04;
	}

	public void setB04(Integer b04) {
		this.b04 = b04;
	}

	public Integer getB05() {
		return b05;
	}

	public void setB05(Integer b05) {
		this.b05 = b05;
	}

	public Integer getB06() {
		return b06;
	}

	public void setB06(Integer b06) {
		this.b06 = b06;
	}

	public Integer getB07() {
		return b07;
	}

	public void setB07(Integer b07) {
		this.b07 = b07;
	}

	public Integer getB08() {
		return b08;
	}

	public void setB08(Integer b08) {
		this.b08 = b08;
	}

	public Integer getB09() {
		return b09;
	}

	public void setB09(Integer b09) {
		this.b09 = b09;
	}

	public Integer getB10() {
		return b10;
	}

	public void setB10(Integer b10) {
		this.b10 = b10;
	}

	public Integer getB11() {
		return b11;
	}

	public void setB11(Integer b11) {
		this.b11 = b11;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getSubPlay() {
		return subPlay;
	}

	public void setSubPlay(String subPlay) {
		this.subPlay = subPlay;
	}

}

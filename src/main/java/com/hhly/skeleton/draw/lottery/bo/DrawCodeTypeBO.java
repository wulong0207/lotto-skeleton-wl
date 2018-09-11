package com.hhly.skeleton.draw.lottery.bo;

import com.hhly.skeleton.base.common.DrawCodeEnum;
import com.hhly.skeleton.lotto.base.issue.bo.draw.DrawOtherBO;

/**
 * 开奖号码类型
 *
 * @author huangchengfang1219
 * @date 2018年5月9日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class DrawCodeTypeBO extends DrawOtherBO {

	private static final long serialVersionUID = -4219854204555000860L;

	/**
	 * 和值
	 */
	private Integer sum;

	/**
	 * 形态
	 */
	private Short type;

	/**
	 * 奇偶比
	 */
	private String oeRatio;

	/**
	 * 大小比
	 */
	private String bsRatio;

	/**
	 * 大小
	 */
	private Short bs;

	/**
	 * 单双
	 */
	private Short sd;

	/**
	 * 个位大小
	 */
	private Short bs1;

	/**
	 * 个位单双
	 */
	private Short sd1;

	/**
	 * 十位大小
	 */
	private Short bs2;

	/**
	 * 十位单双
	 */
	private Short sd2;

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	public Short getType() {
		return type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	public String getTypeText() {
		return DrawCodeEnum.DRAW_CODE_TYPE.getNameByValue(type);
	}

	public String getOeRatio() {
		return oeRatio;
	}

	public void setOeRatio(String oeRatio) {
		this.oeRatio = oeRatio;
	}

	public String getBsRatio() {
		return bsRatio;
	}

	public void setBsRatio(String bsRatio) {
		this.bsRatio = bsRatio;
	}

	public Short getBs() {
		return bs;
	}

	public void setBs(Short bs) {
		this.bs = bs;
	}

	public String getBsText() {
		return DrawCodeEnum.BIG_SMALL.getNameByValue(bs);
	}

	public Short getSd() {
		return sd;
	}

	public void setSd(Short sd) {
		this.sd = sd;
	}

	public String getSdText() {
		return DrawCodeEnum.SINGLE_DOUBLE.getNameByValue(sd);
	}

	public Short getBs1() {
		return bs1;
	}

	public void setBs1(Short bs1) {
		this.bs1 = bs1;
	}

	public String getBs1Text() {
		return DrawCodeEnum.BIG_SMALL.getNameByValue(bs1);
	}

	public Short getSd1() {
		return sd1;
	}

	public void setSd1(Short sd1) {
		this.sd1 = sd1;
	}

	public String getSd1Text() {
		return DrawCodeEnum.SINGLE_DOUBLE.getNameByValue(sd1);
	}

	public Short getBs2() {
		return bs2;
	}

	public void setBs2(Short bs2) {
		this.bs2 = bs2;
	}

	public String getBs2Text() {
		return DrawCodeEnum.BIG_SMALL.getNameByValue(bs2);
	}

	public Short getSd2() {
		return sd2;
	}

	public void setSd2(Short sd2) {
		this.sd2 = sd2;
	}

	public String getSd2Text() {
		return DrawCodeEnum.SINGLE_DOUBLE.getNameByValue(sd2);
	}

}

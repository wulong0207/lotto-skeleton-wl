package com.hhly.skeleton.lotto.base.ticket.bo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * 投注内容 BO
 * 
 * @author longguoyou
 * @date 2017年11月1日
 * @compay 益彩网络科技有限公司
 */
public class BetContentBO extends BaseBO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    /**
     * 是否标红
     */
	private Integer flag;
	/**
	 * 让分/大小分/
	 */
	@JsonIgnore
	private String info;
	/**
	 * 投注内容 转换310 成 胜平负 等
	 */
	private String planContent;

	/**
	 * 让分/大小分[-1]
	 */
	private String panKou;
	/**
	 * 赔率
	 */
	private String sp;

	/**
	 * 具体子彩种
	 */
	private String lotteryChildCode;

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getPlanContent() {
		return planContent;
	}

	public void setPlanContent(String planContent) {
		this.planContent = planContent;
	}

	public String getSp() {
		return sp;
	}

	public void setSp(String sp) {
		this.sp = sp;
	}

	public String getPanKou() {
		return panKou;
	}

	public void setPanKou(String panKou) {
		this.panKou = panKou;
	}

	public String getLotteryChildCode() {
		return lotteryChildCode;
	}

	public void setLotteryChildCode(String lotteryChildCode) {
		this.lotteryChildCode = lotteryChildCode;
	}
}

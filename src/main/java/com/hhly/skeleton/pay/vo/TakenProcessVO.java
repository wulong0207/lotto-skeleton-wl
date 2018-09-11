package com.hhly.skeleton.pay.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.util.MathUtil;
import com.hhly.skeleton.base.util.StringUtil;
import com.hhly.skeleton.pay.bo.TransTakenBO;

/**
 * @desc 提款进行中的记录
 * @author xiongJinGang
 * @date 2017年11月4日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class TakenProcessVO extends BaseBO {
	@JsonProperty("b_n")
	private String bankName;// 银行名称
	@JsonProperty("b_i")
	private String bImg;// 银行大图片
	@JsonProperty("s_i")
	private String sImg;// 银行小图片
	@JsonProperty("c_c")
	private String cardCode;// 银行卡号 ***3232
	@JsonProperty("t_a")
	private String takenAmount;// 提款金额 1,000
	@JsonProperty("t_c")
	private String takenCode;// 提款编号
	@JsonProperty("t_s")
	private Short takenStatus;// 提款状态
	@JsonProperty("t_s_n")
	private String takenStatusName;// 提款状态中文名称

	public TakenProcessVO() {
		super();
	}

	public TakenProcessVO(TransTakenBO transTakenBO) {
		super();
		this.cardCode = StringUtil.hideHeadString(transTakenBO.getBankCardNum());
		this.takenAmount = MathUtil.formatAmountToStr(transTakenBO.getExtractAmount());
		this.takenCode = transTakenBO.getTransTakenCode();
		this.takenStatus = transTakenBO.getTransStatus();
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getbImg() {
		return bImg;
	}

	public void setbImg(String bImg) {
		this.bImg = bImg;
	}

	public String getsImg() {
		return sImg;
	}

	public void setsImg(String sImg) {
		this.sImg = sImg;
	}

	public String getCardCode() {
		return cardCode;
	}

	public void setCardCode(String cardCode) {
		this.cardCode = cardCode;
	}

	public String getTakenAmount() {
		return takenAmount;
	}

	public void setTakenAmount(String takenAmount) {
		this.takenAmount = takenAmount;
	}

	public String getTakenCode() {
		return takenCode;
	}

	public void setTakenCode(String takenCode) {
		this.takenCode = takenCode;
	}

	public Short getTakenStatus() {
		return takenStatus;
	}

	public void setTakenStatus(Short takenStatus) {
		this.takenStatus = takenStatus;
	}

	public String getTakenStatusName() {
		return takenStatusName;
	}

	public void setTakenStatusName(String takenStatusName) {
		this.takenStatusName = takenStatusName;
	}

}

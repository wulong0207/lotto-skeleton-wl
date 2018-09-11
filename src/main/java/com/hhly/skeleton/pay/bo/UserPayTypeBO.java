package com.hhly.skeleton.pay.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;

/**
 * @author lgs on
 * @version 1.0
 * @desc 用户支付类别BO
 * @date 2017/3/22.
 * @company 益彩网络科技有限公司
 */
public class UserPayTypeBO extends BaseBO {
	private static final long serialVersionUID = 5264542424278410860L;
	/**
	 * 银行id
	 */
	@JsonProperty("b_i")
	private Integer bankId;
	/**
	 * 银行名称
	 */
	@JsonProperty("b_n")
	private String bankName;
	/**
	 * 能否使用
	 */
	@JsonProperty("flag")
	private Short flag;
	/**
	 * 快捷支付
	 */
	@JsonProperty("o_b")
	private Short openBank;
	/**
	 * 银行卡ID
	 */
	@JsonProperty("b_c_i")
	private Integer bankCardId;
	/**
	 * 银行卡号
	 */
	@JsonProperty("c_c")
	private String cardCode;
	/**
	 * 银行卡类型:1储蓄卡;2信用卡;3第三方支付
	 */
	@JsonProperty("b_t")
	private Short bankType;
	/**
	 * 针对信用卡(有效期,年,月字串)
	 */
	@JsonProperty("o_d")
	private String overdue;
	/**
	 * 最近使用支付方式id
	 */
	@JsonProperty("i_r_p")
	private Integer isRecentlyPay;
	/**
	 * 暂停开始时间
	 */
	@JsonProperty("s_t")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date startTime;
	/**
	 * 暂停结束时间
	 */
	@JsonProperty("e_t")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date endTime;
	/**
	 * 小图片
	 */
	@JsonProperty("s_lg")
	private String sLogo;
	/**
	 * 大图片
	 */
	@JsonProperty("b_lg")
	private String bLogo;
	/**
	 * 不能使用原因
	 */
	@JsonProperty("r_s")
	private String reason;
	/**
	 * 交易最高限额
	 */
	@JsonProperty("t_l")
	private String maxLimit;
	/**
	 * 交易最低限额
	 */
	@JsonProperty("m_l")
	private String minLimit;
	@JsonIgnore
	private String bankCode;// 银行卡唯一编码
	@JsonIgnore
	private Integer sort;// 程序排序字段，从小到大排序

	public UserPayTypeBO() {
	}

	public Integer getBankId() {
		return bankId;
	}

	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Short getFlag() {
		return flag;
	}

	public void setFlag(Short flag) {
		this.flag = flag;
	}

	public Short getOpenBank() {
		return openBank;
	}

	public void setOpenBank(Short openBank) {
		this.openBank = openBank;
	}

	public Integer getBankCardId() {
		return bankCardId;
	}

	public void setBankCardId(Integer bankCardId) {
		this.bankCardId = bankCardId;
	}

	public String getCardCode() {
		return cardCode;
	}

	public void setCardCode(String cardCode) {
		this.cardCode = cardCode;
	}

	public Short getBankType() {
		return bankType;
	}

	public void setBankType(Short bankType) {
		this.bankType = bankType;
	}

	public String getOverdue() {
		return overdue;
	}

	public void setOverdue(String overdue) {
		this.overdue = overdue;
	}

	public Integer getIsRecentlyPay() {
		return isRecentlyPay;
	}

	public void setIsRecentlyPay(Integer isRecentlyPay) {
		this.isRecentlyPay = isRecentlyPay;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getsLogo() {
		return sLogo;
	}

	public void setsLogo(String sLogo) {
		this.sLogo = sLogo;
	}

	public String getbLogo() {
		return bLogo;
	}

	public void setbLogo(String bLogo) {
		this.bLogo = bLogo;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getMinLimit() {
		return minLimit;
	}

	public void setMinLimit(String minLimit) {
		this.minLimit = minLimit;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getMaxLimit() {
		return maxLimit;
	}

	public void setMaxLimit(String maxLimit) {
		this.maxLimit = maxLimit;
	}

}

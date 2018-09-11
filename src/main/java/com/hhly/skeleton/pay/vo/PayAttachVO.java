package com.hhly.skeleton.pay.vo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 支付额外信息（传递给第三方，第三方原值返回）
 * @author xiongJinGang
 * @date 2017年4月25日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class PayAttachVO extends BaseBO {

	private static final long serialVersionUID = -7342713599947973764L;
	private String transCode;// 益彩交易号
	private Integer isBatchPay;// 是否批量支付 0不是 1是
	private Integer userId;// 用户ID

	public PayAttachVO() {
		super();
	}

	public PayAttachVO(String transCode, Integer buyType) {
		super();
		this.transCode = transCode;
	}

	public PayAttachVO(String transCode, Integer isBatchPay, Integer userId) {
		super();
		this.transCode = transCode;
		this.isBatchPay = isBatchPay;
		this.userId = userId;
	}

	public String getTransCode() {
		return transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public Integer getIsBatchPay() {
		return isBatchPay;
	}

	public void setIsBatchPay(Integer isBatchPay) {
		this.isBatchPay = isBatchPay;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		// 自定义参数，可存放任何内容（除=、&等特殊字符外），不会显示在页面上
		return transCode + ";" + isBatchPay + ";" + userId;
	}

}

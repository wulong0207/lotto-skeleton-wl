package com.hhly.skeleton.cms.payment.bo;

import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class PayBankBO extends BaseBO {

	private Integer id;
	/**
	 * 银行名称
	 */
	private String name;
	/**
	 * 银行简称
	 */
	private String cname;
	/**
	 * 银行状态:0停用,1可用
	 */
	private Short status;
	/**
	 * 支付类型:1银行卡,2第三方支付
	 */
	private Short paytype;
	/**
	 * 银行大Logo
	 */
	private String blogo;
	/**
	 * 银行小Logo
	 */
	private String slogo;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * PC排序
	 */
	private Integer orderPc;
	/**
	 * H5排序
	 */
	private Integer orderH5;
	/**
	 * ANDROID排序
	 */
	private Integer orderAndroid;
	/**
	 * IOS排序
	 */
	private Integer orderIos;

	private String code;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Short getPaytype() {
		return paytype;
	}

	public void setPaytype(Short paytype) {
		this.paytype = paytype;
	}

	public String getBlogo() {
		return blogo;
	}

	public void setBlogo(String blogo) {
		this.blogo = blogo;
	}

	public String getSlogo() {
		return slogo;
	}

	public void setSlogo(String slogo) {
		this.slogo = slogo;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getOrderPc() {
		return orderPc;
	}

	public void setOrderPc(Integer orderPc) {
		this.orderPc = orderPc;
	}

	public Integer getOrderH5() {
		return orderH5;
	}

	public void setOrderH5(Integer orderH5) {
		this.orderH5 = orderH5;
	}

	public Integer getOrderAndroid() {
		return orderAndroid;
	}

	public void setOrderAndroid(Integer orderAndroid) {
		this.orderAndroid = orderAndroid;
	}

	public Integer getOrderIos() {
		return orderIos;
	}

	public void setOrderIos(Integer orderIos) {
		this.orderIos = orderIos;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}

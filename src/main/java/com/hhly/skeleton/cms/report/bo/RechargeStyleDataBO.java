package com.hhly.skeleton.cms.report.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;

@SuppressWarnings("serial")
public class RechargeStyleDataBO extends BaseBO {

	/** 时间 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@ExcelHeader("日期")
	private Date dt;
	@ExcelHeader("支付宝充值人数")
	private Integer alipayUser;
	@ExcelHeader("支付宝充值金额")
	private Double alipayMoney;
	@ExcelHeader("微信充值人数")
	private Integer wxpayUser;
	@ExcelHeader("微信充值金额")
	private Double wxpayMoney;
	@ExcelHeader("快捷充值人数")
	private Integer fastUser;
	@ExcelHeader("快捷充值金额")
	private Double fastMoney;
	@ExcelHeader("网银充值人数")
	private Integer bankUser;
	@ExcelHeader("网银充值金额")
	private Double bankMoney;
	@ExcelHeader("QQ充值人数")
	private Integer qqUser;
	@ExcelHeader("QQ充值金额")
	private Double qqMoney;
	@ExcelHeader("充值卡充值人数")
	private Integer cardUser;
	@ExcelHeader("充值卡充值金额")
	private Double cardMoney;
	@ExcelHeader("第三方充值人数")
	private Integer otherUser;
	@ExcelHeader("第三方充值金额")
	private Double otherMoney;
	@ExcelHeader("京东充值人数")
	private Integer jdUser;
	@ExcelHeader("京东充值金额")
	private Double jdMoney;
	
	@ExcelHeader("人工充值人数")
	private Integer handUser;
	@ExcelHeader("人工充值金额")
	private Double handMoney;
	
	@ExcelHeader("代理充值人数")
	private Integer agentUser;
	@ExcelHeader("代理充值金额")
	private Double agentMoney;
	
	{
		alipayUser = 0;
		alipayMoney = 0d;
		wxpayUser = 0;
		wxpayMoney = 0d;
		fastUser =0;	
		fastMoney=0d;
		bankUser =0;
		bankMoney =0d;
		qqUser = 0;
		qqMoney=0d;
		cardUser=0;
		cardMoney=0d;
		otherUser=0;
		otherMoney=0d;
		jdUser=0;
		jdMoney=0d;
		handUser=0;
		handMoney=0d;
		agentUser=0;
		agentMoney=0d;
		
	}
	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	public Integer getAlipayUser() {
		return alipayUser;
	}

	public void setAlipayUser(Integer alipayUser) {
		this.alipayUser = alipayUser;
	}

	public Double getAlipayMoney() {
		return alipayMoney;
	}

	public void setAlipayMoney(Double alipayMoney) {
		this.alipayMoney = alipayMoney;
	}

	public Integer getWxpayUser() {
		return wxpayUser;
	}

	public void setWxpayUser(Integer wxpayUser) {
		this.wxpayUser = wxpayUser;
	}

	public Double getWxpayMoney() {
		return wxpayMoney;
	}

	public void setWxpayMoney(Double wxpayMoney) {
		this.wxpayMoney = wxpayMoney;
	}

	public Integer getFastUser() {
		return fastUser;
	}

	public void setFastUser(Integer fastUser) {
		this.fastUser = fastUser;
	}

	public Double getFastMoney() {
		return fastMoney;
	}

	public void setFastMoney(Double fastMoney) {
		this.fastMoney = fastMoney;
	}

	public Integer getBankUser() {
		return bankUser;
	}

	public void setBankUser(Integer bankUser) {
		this.bankUser = bankUser;
	}

	public Double getBankMoney() {
		return bankMoney;
	}

	public void setBankMoney(Double bankMoney) {
		this.bankMoney = bankMoney;
	}

	public Integer getQqUser() {
		return qqUser;
	}

	public void setQqUser(Integer qqUser) {
		this.qqUser = qqUser;
	}

	public Double getQqMoney() {
		return qqMoney;
	}

	public void setQqMoney(Double qqMoney) {
		this.qqMoney = qqMoney;
	}

	public Integer getCardUser() {
		return cardUser;
	}

	public void setCardUser(Integer cardUser) {
		this.cardUser = cardUser;
	}

	public Double getCardMoney() {
		return cardMoney;
	}

	public void setCardMoney(Double cardMoney) {
		this.cardMoney = cardMoney;
	}

	public Integer getOtherUser() {
		return otherUser;
	}

	public void setOtherUser(Integer otherUser) {
		this.otherUser = otherUser;
	}

	public Double getOtherMoney() {
		return otherMoney;
	}

	public void setOtherMoney(Double otherMoney) {
		this.otherMoney = otherMoney;
	}

	public Integer getJdUser() {
		return jdUser;
	}

	public void setJdUser(Integer jdUser) {
		this.jdUser = jdUser;
	}

	public Double getJdMoney() {
		return jdMoney;
	}

	public void setJdMoney(Double jdMoney) {
		this.jdMoney = jdMoney;
	}

	public Integer getHandUser() {
		return handUser;
	}

	public void setHandUser(Integer handUser) {
		this.handUser = handUser;
	}

	public Double getHandMoney() {
		return handMoney;
	}

	public void setHandMoney(Double handMoney) {
		this.handMoney = handMoney;
	}

	public Integer getAgentUser() {
		return agentUser;
	}

	public void setAgentUser(Integer agentUser) {
		this.agentUser = agentUser;
	}

	public Double getAgentMoney() {
		return agentMoney;
	}

	public void setAgentMoney(Double agentMoney) {
		this.agentMoney = agentMoney;
	}

	

}

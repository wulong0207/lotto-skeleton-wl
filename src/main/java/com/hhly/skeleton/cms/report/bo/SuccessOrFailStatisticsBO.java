package com.hhly.skeleton.cms.report.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;

@SuppressWarnings("serial")
public class SuccessOrFailStatisticsBO extends BaseBO {

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@ExcelHeader("日期")
	private Date dt;
	@ExcelHeader("支付宝充值成功")
	private Integer alipaySuccess;
	@ExcelHeader("支付宝充值失败(第三方返回)")
	private Integer alipayFailThird;
	@ExcelHeader("支付宝充值失败(用户原因)")
	private Integer alipayFailUser;

	@ExcelHeader("微信充值成功")
	private Integer wxpaySuccess;
	@ExcelHeader("微信充值失败(第三方返回)")
	private Integer wxpayFailThird;
	@ExcelHeader("微信充值失败(用户原因)")
	private Integer wxpayFailUser;

	@ExcelHeader("网银充值成功")
	private Integer bankSuccess;
	@ExcelHeader("网银充值失败(第三方返回)")
	private Integer bankFailThird;
	@ExcelHeader("网银充值失败(用户原因)")
	private Integer bankFailUser;

	@ExcelHeader("快捷充值成功")
	private Integer fastSuccess;
	@ExcelHeader("快捷充值失败(第三方返回)")
	private Integer fastFailThird;
	@ExcelHeader("快捷充值失败(用户原因)")
	private Integer fastFailUser;
	
	@ExcelHeader("其他充值成功")
	private Integer otherSuccess;
	@ExcelHeader("其他充值失败(第三方返回)")
	private Integer otherFailThird;
	@ExcelHeader("其他充值失败(用户原因)")
	private Integer otherFailUser;
	
	@ExcelHeader("QQ充值成功")
	private Integer qqSuccess;
	@ExcelHeader("QQ充值失败(第三方返回)")
	private Integer qqFailThird;
	@ExcelHeader("QQ充值失败(用户原因)")
	private Integer qqFailUser;
	
	@ExcelHeader("充值卡充值成功")
	private Integer cardSuccess;
	@ExcelHeader("充值卡充值失败(第三方返回)")
	private Integer cardFailThird;
	@ExcelHeader("充值卡充值失败(用户原因)")
	private Integer cardFailUser;
	
	@ExcelHeader("京东充值成功")
	private Integer jdSuccess;
	@ExcelHeader("京东充值失败(第三方返回)")
	private Integer jdFailThird;
	@ExcelHeader("京东充值失败(用户原因)")
	private Integer jdFailUser;
	
	@ExcelHeader("人工充值成功")
	private Integer handSuccess;
	@ExcelHeader("人工充值失败(第三方返回)")
	private Integer handFailThird;
	@ExcelHeader("人工充值失败(用户原因)")
	private Integer handFailUser;
	
	@ExcelHeader("代理充值成功")
	private Integer agentSuccess;
	@ExcelHeader("代理充值失败(第三方返回)")
	private Integer agentFailThird;
	@ExcelHeader("代理充值失败(用户原因)")
	private Integer agentFailUser;
	
	{
		alipaySuccess =0;
		alipayFailThird =0;
		alipayFailUser =0;
		wxpaySuccess =0;
		wxpayFailThird =0;
		wxpayFailUser =0;
		bankSuccess =0;
		bankFailThird =0;
		bankFailUser =0;
		fastSuccess =0;
		fastFailThird =0;
		fastFailUser =0;
		qqSuccess =0;
		qqFailThird =0;
		qqFailUser =0;
		otherSuccess =0;
		otherFailThird =0;
		otherFailUser =0;
		cardSuccess =0;
		cardFailThird =0;
		cardFailUser =0;
		jdSuccess=0;
		jdFailThird=0;
		jdFailUser=0;
		handSuccess=0;
		handFailThird=0;
		handFailUser=0;
		agentSuccess=0;
		agentFailThird=0;
		agentFailUser=0;
	}
	
	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	public Integer getAlipaySuccess() {
		return alipaySuccess;
	}

	public void setAlipaySuccess(Integer alipaySuccess) {
		this.alipaySuccess = alipaySuccess;
	}

	public Integer getAlipayFailThird() {
		return alipayFailThird;
	}

	public void setAlipayFailThird(Integer alipayFailThird) {
		this.alipayFailThird = alipayFailThird;
	}

	public Integer getAlipayFailUser() {
		return alipayFailUser;
	}

	public void setAlipayFailUser(Integer alipayFailUser) {
		this.alipayFailUser = alipayFailUser;
	}

	public Integer getWxpaySuccess() {
		return wxpaySuccess;
	}

	public void setWxpaySuccess(Integer wxpaySuccess) {
		this.wxpaySuccess = wxpaySuccess;
	}

	public Integer getWxpayFailThird() {
		return wxpayFailThird;
	}

	public void setWxpayFailThird(Integer wxpayFailThird) {
		this.wxpayFailThird = wxpayFailThird;
	}

	public Integer getWxpayFailUser() {
		return wxpayFailUser;
	}

	public void setWxpayFailUser(Integer wxpayFailUser) {
		this.wxpayFailUser = wxpayFailUser;
	}

	public Integer getBankSuccess() {
		return bankSuccess;
	}

	public void setBankSuccess(Integer bankSuccess) {
		this.bankSuccess = bankSuccess;
	}

	public Integer getBankFailThird() {
		return bankFailThird;
	}

	public void setBankFailThird(Integer bankFailThird) {
		this.bankFailThird = bankFailThird;
	}

	public Integer getBankFailUser() {
		return bankFailUser;
	}

	public void setBankFailUser(Integer bankFailUser) {
		this.bankFailUser = bankFailUser;
	}

	public Integer getFastSuccess() {
		return fastSuccess;
	}

	public void setFastSuccess(Integer fastSuccess) {
		this.fastSuccess = fastSuccess;
	}

	public Integer getFastFailThird() {
		return fastFailThird;
	}

	public void setFastFailThird(Integer fastFailThird) {
		this.fastFailThird = fastFailThird;
	}

	public Integer getFastFailUser() {
		return fastFailUser;
	}

	public void setFastFailUser(Integer fastFailUser) {
		this.fastFailUser = fastFailUser;
	}

	public Integer getOtherSuccess() {
		return otherSuccess;
	}

	public void setOtherSuccess(Integer otherSuccess) {
		this.otherSuccess = otherSuccess;
	}

	public Integer getOtherFailThird() {
		return otherFailThird;
	}

	public void setOtherFailThird(Integer otherFailThird) {
		this.otherFailThird = otherFailThird;
	}

	public Integer getOtherFailUser() {
		return otherFailUser;
	}

	public void setOtherFailUser(Integer otherFailUser) {
		this.otherFailUser = otherFailUser;
	}

	public Integer getQqSuccess() {
		return qqSuccess;
	}

	public void setQqSuccess(Integer qqSuccess) {
		this.qqSuccess = qqSuccess;
	}

	public Integer getQqFailThird() {
		return qqFailThird;
	}

	public void setQqFailThird(Integer qqFailThird) {
		this.qqFailThird = qqFailThird;
	}

	public Integer getQqFailUser() {
		return qqFailUser;
	}

	public void setQqFailUser(Integer qqFailUser) {
		this.qqFailUser = qqFailUser;
	}

	public Integer getCardSuccess() {
		return cardSuccess;
	}

	public void setCardSuccess(Integer cardSuccess) {
		this.cardSuccess = cardSuccess;
	}

	public Integer getCardFailThird() {
		return cardFailThird;
	}

	public void setCardFailThird(Integer cardFailThird) {
		this.cardFailThird = cardFailThird;
	}

	public Integer getCardFailUser() {
		return cardFailUser;
	}

	public void setCardFailUser(Integer cardFailUser) {
		this.cardFailUser = cardFailUser;
	}

	public Integer getJdSuccess() {
		return jdSuccess;
	}

	public void setJdSuccess(Integer jdSuccess) {
		this.jdSuccess = jdSuccess;
	}

	public Integer getJdFailThird() {
		return jdFailThird;
	}

	public void setJdFailThird(Integer jdFailThird) {
		this.jdFailThird = jdFailThird;
	}

	public Integer getJdFailUser() {
		return jdFailUser;
	}

	public void setJdFailUser(Integer jdFailUser) {
		this.jdFailUser = jdFailUser;
	}

	public Integer getHandSuccess() {
		return handSuccess;
	}

	public void setHandSuccess(Integer handSuccess) {
		this.handSuccess = handSuccess;
	}

	public Integer getHandFailThird() {
		return handFailThird;
	}

	public void setHandFailThird(Integer handFailThird) {
		this.handFailThird = handFailThird;
	}

	public Integer getHandFailUser() {
		return handFailUser;
	}

	public void setHandFailUser(Integer handFailUser) {
		this.handFailUser = handFailUser;
	}

	public Integer getAgentSuccess() {
		return agentSuccess;
	}

	public void setAgentSuccess(Integer agentSuccess) {
		this.agentSuccess = agentSuccess;
	}

	public Integer getAgentFailThird() {
		return agentFailThird;
	}

	public void setAgentFailThird(Integer agentFailThird) {
		this.agentFailThird = agentFailThird;
	}

	public Integer getAgentFailUser() {
		return agentFailUser;
	}

	public void setAgentFailUser(Integer agentFailUser) {
		this.agentFailUser = agentFailUser;
	}

}

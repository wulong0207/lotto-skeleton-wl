package com.hhly.skeleton.cms.report.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;

/**
 * 渠道报表Excel数据
 * @author houxb
 *
 */
@SuppressWarnings("serial")
public class ChannelDataExcelBO extends BaseBO {
	
	@ExcelHeader("日期")
	private String date;// 日期
	@ExcelHeader("渠道名称")
	private String channelName;//渠道名称
	@ExcelHeader("渠道id")
	private String channelId;//渠道id
	@ExcelHeader("注册用户")
	private Integer regUser;//注册用户
	@ExcelHeader("完善用户")
	private Integer perfectNumber;//完善用户
	@ExcelHeader("首充用户")
	private Integer ffUser;//首充用户
	@ExcelHeader("首充金额")
	private Double ffMoney;//首充金额
	@ExcelHeader("首投人数")
	private Integer foUser;//首投人数
	@ExcelHeader("首投金额")
	private Double foMoney;//首投金额
	@ExcelHeader("充值用户")
	private Integer fUser;//充值用户
	@ExcelHeader("充值金额")
	private Double fMoney;//充值金额
	@ExcelHeader("投注人数")
	private Integer oUser;//投注人数
	@ExcelHeader("投注金额")
	private Double oMoney;//投注金额
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public Integer getRegUser() {
		return regUser;
	}
	public void setRegUser(Integer regUser) {
		this.regUser = regUser;
	}
	public Integer getPerfectNumber() {
		return perfectNumber;
	}
	public void setPerfectNumber(Integer perfectNumber) {
		this.perfectNumber = perfectNumber;
	}
	public Integer getFfUser() {
		return ffUser;
	}
	public void setFfUser(Integer ffUser) {
		this.ffUser = ffUser;
	}
	public Double getFfMoney() {
		return ffMoney;
	}
	public void setFfMoney(Double ffMoney) {
		this.ffMoney = ffMoney;
	}
	public Integer getFoUser() {
		return foUser;
	}
	public void setFoUser(Integer foUser) {
		this.foUser = foUser;
	}
	public Double getFoMoney() {
		return foMoney;
	}
	public void setFoMoney(Double foMoney) {
		this.foMoney = foMoney;
	}
	public Integer getfUser() {
		return fUser;
	}
	public void setfUser(Integer fUser) {
		this.fUser = fUser;
	}
	public Double getfMoney() {
		return fMoney;
	}
	public void setfMoney(Double fMoney) {
		this.fMoney = fMoney;
	}
	public Integer getoUser() {
		return oUser;
	}
	public void setoUser(Integer oUser) {
		this.oUser = oUser;
	}
	public Double getoMoney() {
		return oMoney;
	}
	public void setoMoney(Double oMoney) {
		this.oMoney = oMoney;
	}
	
	
}

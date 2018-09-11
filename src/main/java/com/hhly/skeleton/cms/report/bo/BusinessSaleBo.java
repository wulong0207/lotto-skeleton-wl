package com.hhly.skeleton.cms.report.bo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @desc 业务销量报表 月度统计实体
 * @author chenghougui
 * @Date 2018年3月3日
 * @Company 益彩网络科技公司
 * @version
 */
public class BusinessSaleBo {

	private Date dt;
	private Integer agentId;
	private int drBuyNum;
	private int drBuyTimes;
	private BigDecimal drBuyMoney;
	private BigDecimal drMonthBuyMoney;
	private int agBuyNum;
	private int agBuyTimes;
	private int agBuyMoney;
	private int agmonthBuyMoney;

	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	public Integer getAgentId() {
		return agentId;
	}

	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}

	public int getDrBuyNum() {
		return drBuyNum;
	}

	public void setDrBuyNum(int drBuyNum) {
		this.drBuyNum = drBuyNum;
	}

	public BigDecimal getDrBuyMoney() {
		return drBuyMoney;
	}

	public void setDrBuyMoney(BigDecimal drBuyMoney) {
		this.drBuyMoney = drBuyMoney;
	}

	public BigDecimal getDrMonthBuyMoney() {
		return drMonthBuyMoney;
	}

	public void setDrMonthBuyMoney(BigDecimal drMonthBuyMoney) {
		this.drMonthBuyMoney = drMonthBuyMoney;
	}

	public int getAgBuyNum() {
		return agBuyNum;
	}

	public void setAgBuyNum(int agBuyNum) {
		this.agBuyNum = agBuyNum;
	}

	public int getAgBuyMoney() {
		return agBuyMoney;
	}

	public void setAgBuyMoney(int agBuyMoney) {
		this.agBuyMoney = agBuyMoney;
	}

	public int getAgmonthBuyMoney() {
		return agmonthBuyMoney;
	}

	public void setAgmonthBuyMoney(int agmonthBuyMoney) {
		this.agmonthBuyMoney = agmonthBuyMoney;
	}

	public int getDrBuyTimes() {
		return drBuyTimes;
	}

	public void setDrBuyTimes(int drBuyTimes) {
		this.drBuyTimes = drBuyTimes;
	}

	public int getAgBuyTimes() {
		return agBuyTimes;
	}

	public void setAgBuyTimes(int agBuyTimes) {
		this.agBuyTimes = agBuyTimes;
	}

}

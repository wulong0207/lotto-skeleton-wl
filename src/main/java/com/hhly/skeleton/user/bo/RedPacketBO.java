package com.hhly.skeleton.user.bo;

import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;

public class RedPacketBO extends BaseBO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 主键id
	 */
	private Integer id;
	
	/**
	 * 红包id
	 */
	private String redPacketId;
	
	/**
	 * 红包金额
	 */
	private Double money;
	
	/**
	 * 使用条件
	 */
	private Short usage;
	
	/**
	 * 红包状态
	 */
	private Short status;

	/**
	 * 红包类型
	 */
	private Short type;
	
	/**
	 * 有效时间
	 */
	private Date validTime;
	
	/**
	 * 创建时间
	 */
	private Date createTime;
	
	/**
	 * 备用字段
	 */
	private String spared;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRedPacketId() {
		return redPacketId;
	}

	public void setRedPacketId(String redPacketId) {
		this.redPacketId = redPacketId;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public Short getUsage() {
		return usage;
	}

	public void setUsage(Short usage) {
		this.usage = usage;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Short getType() {
		return type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	public Date getValidTime() {
		return validTime;
	}

	public void setValidTime(Date validTime) {
		this.validTime = validTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getSpared() {
		return spared;
	}

	public void setSpared(String spared) {
		this.spared = spared;
	}

}

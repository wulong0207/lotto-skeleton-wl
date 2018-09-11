package com.hhly.skeleton.pay.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.vo.PageVO;

import java.io.Serializable;
import java.util.Date;

/**
 * @desc 红包交易记录表
 * @author xiongJinGang
 * @date 2017年3月24日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class TransRedVO extends BasePageVo implements Serializable {

	private static final long serialVersionUID = 5870127784455253721L;
	/**
	 *  流水id
	 */
	private Integer id;
	/**
	 * 系统流水编号
	 */
	private String redTransCode;
	/**
	 * 红包编号
	 */
	private String redCode;
	/**
	 * 会员ID 
	 */
	private Integer userId;
	/**
	 * 交易分类 1：充值；2：购彩；3：返奖；4：退款；5：提款；6：其它 
	 */
	private Integer transType;
	/**
	 * 交易状态 0：交易失败；1：交易成功；
	 */
	private Integer transStatus;
	/**
	 * 订单编号
	 */
	private String orderCode;
	/**
	 * 交易时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date transTime;
	/**
	 * 更新时间 
	 */
	private Date updateTime;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 红包类型；1：充值优惠；2：消费折扣；3：彩金红包；4：加奖红包；5：大礼包；6：随机红包 
	 */
	private Short redType;
	
	private String token; // 用户token
	
	private Object[] tradeTypes;
	
	private Short timeType;// 时间类型 【1创建时间、2交易时间。默认创建时间】
	private Date startDate;// 查询开始时间
	private Date endDate;// 查询结束时间

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRedTransCode() {
		return redTransCode;
	}

	public void setRedTransCode(String redTransCode) {
		this.redTransCode = redTransCode;
	}

	public String getRedCode() {
		return redCode;
	}

	public void setRedCode(String redCode) {
		this.redCode = redCode;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getTransType() {
		return transType;
	}

	public void setTransType(Integer transType) {
		this.transType = transType;
	}

	public Integer getTransStatus() {
		return transStatus;
	}

	public void setTransStatus(Integer transStatus) {
		this.transStatus = transStatus;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Date getTransTime() {
		return transTime;
	}

	public void setTransTime(Date transTime) {
		this.transTime = transTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Short getRedType() {
		return redType;
	}

	public void setRedType(Short redType) {
		this.redType = redType;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Object[] getTradeTypes() {
		return tradeTypes;
	}

	public void setTradeTypes(Object[] tradeTypes) {
		this.tradeTypes = tradeTypes;
	}

	public Short getTimeType() {
		return timeType;
	}

	public void setTimeType(Short timeType) {
		this.timeType = timeType;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}

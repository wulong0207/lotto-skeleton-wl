package com.hhly.skeleton.cms.ordermgr.vo;

import java.util.Date;

/**
 * @author huangb
 *
 * @Date 2017年1月16日
 *
 * @Desc 追号对象-CMS用，继承公共的追号对象
 */
public class OrderAddCmsVO extends OrderAddVO {
	private static final long serialVersionUID = 181220128253415666L;

	/**
	 * 追号时间查询类型(如：购买时间=1、结束时间=2)
	 */
	private Integer timeType;
	/**
	 * 时间查询类型对应的数据库查询字段
	 */
	private String timeTypeField;
	/**
	 * 对应时间类型的开始时间
	 */
	private Date startQryTime;
	/**
	 * 对应时间类型的结束时间  (因为父类中有个endTime了，所以这里只能改名)
	 */
	private Date endQryTime;
	/**
	 * 统计判断是否关联用户表
	 */
	private Boolean joinUser;
	/**
	 * 追号内容对象(查询时会用到里面的字段，如：选号方式、内容类型)
	 */
	private OrderAddContentVO orderAddContent;

	public OrderAddCmsVO() {

	}

	public OrderAddCmsVO(Long id) {
		super(id);
	}

	public OrderAddCmsVO(Long id, String orderAddCode) {
		super(id, orderAddCode);
	}

	public Integer getTimeType() {
		return timeType;
	}

	public void setTimeType(Integer timeType) {
		this.timeType = timeType;
	}

	public String getTimeTypeField() {
		return timeTypeField;
	}

	public void setTimeTypeField(String timeTypeField) {
		this.timeTypeField = timeTypeField;
	}

	public Date getStartQryTime() {
		return startQryTime;
	}

	public void setStartQryTime(Date startQryTime) {
		this.startQryTime = startQryTime;
	}

	public Date getEndQryTime() {
		return endQryTime;
	}

	public void setEndQryTime(Date endQryTime) {
		this.endQryTime = endQryTime;
	}

	public Boolean getJoinUser() {
		return joinUser;
	}

	public void setJoinUser(Boolean joinUser) {
		this.joinUser = joinUser;
	}

	public OrderAddContentVO getOrderAddContent() {
		return orderAddContent;
	}

	public void setOrderAddContent(OrderAddContentVO orderAddContent) {
		this.orderAddContent = orderAddContent;
	}

}

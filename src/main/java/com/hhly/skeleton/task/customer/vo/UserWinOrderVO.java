package com.hhly.skeleton.task.customer.vo;

import java.util.Date;
import java.util.List;

import com.hhly.skeleton.base.util.DateUtil;
import com.hhly.skeleton.base.vo.PageVO;

@SuppressWarnings("serial")
public class UserWinOrderVO  extends PageVO{
	/**
	 * 查询起始时间
	 */
	private Date queryStartTime;
	/**
	 * 查询结束时间
	 */
	private Date queryEndTime;
	
	/**订单编号集合*/
	private List<String> orderCodes;
	
	/**订单编号集合*/
	private List<String> userIds;
	public Date getQueryStartTime() {
		return queryStartTime;
	}
	public void setQueryStartTime(Date queryStartTime) {
		this.queryStartTime = queryStartTime;
	}
	public Date getQueryEndTime() {
		return queryEndTime;
	}
	public void setQueryEndTime(Date queryEndTime) {
		this.queryEndTime = queryEndTime;
	}
	
	public List<String> getOrderCodes() {
		return orderCodes;
	}
	public void setOrderCodes(List<String> orderCodes) {
		this.orderCodes = orderCodes;
	}
	public List<String> getUserIds() {
		return userIds;
	}
	public void setUserIds(List<String> userIds) {
		this.userIds = userIds;
	}
	public String toString(){
		return "查询起始时间："+DateUtil.convertDateToStr(queryStartTime)+",查询结束时间："+DateUtil.convertDateToStr(queryEndTime)+
				",页数："+getPageIndex()+",每页行数："+getPageSize();
	}
	
}

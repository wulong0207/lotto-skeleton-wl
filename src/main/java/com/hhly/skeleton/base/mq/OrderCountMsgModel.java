package com.hhly.skeleton.base.mq;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * @desc 追号信息统计模型
 * @author lidecheng
 * @date 2018年5月3日
 * @company 益彩网络
 * @version v1.0
 */
public class OrderCountMsgModel extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4618631448150376334L;
	/**
	 * 
	 */
	private Integer status;// 执行节点
	/**
	 * 订单编号；必填
	 */
	private String orderCode;
	private String buyType;
	private String createTime;
	
	public OrderCountMsgModel(){
		
	}
	public OrderCountMsgModel(Integer nodeId, String orderCode,String buyType,String createTime) {
		this.status = nodeId;
		this.orderCode = orderCode;
		this.buyType=buyType;
		this.createTime=createTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getBuyType() {
		return buyType;
	}

	public void setBuyType(String buyType) {
		this.buyType = buyType;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}	
}

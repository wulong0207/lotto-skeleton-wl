package com.hhly.skeleton.lotto.base.order.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.common.OrderEnum.BuyType;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc 订单流程BO
 * @date 2017/4/15 11:17
 * @company 益彩网络科技公司
 */
public class OrderFlowInfoBO extends BaseBO {
	/**
	 *  
	 */
	private Integer id;
	/**
	 * 订单编号
	 */
	private String orderCode;
	/**
	 * 追号编号
	 */
	private String orderAddCode;
	/**
	 * 追号期号
	 */
	private String orderAddIssue;
	/**
	 * 用户ID
	 */
	private Integer userId;
	/**
	 * 1：代购；2：追号；3：合买
	 */
	private Integer buyType;
	/**
	 * 1:等待支付, 2:支付成功(等待出票), 3:支付失败, 4:未支付过期, 5:出票中, 6:出票失败, 7:已撤单, 8:出票成功,
	 * 9:已中奖, 10:未中奖 11:已派奖, 13:追号结束, 14:中奖追停, 15:追号撤单, 18:执行一期追号成功后,
	 * 19:执行一期追号失败后, 20:招募中, 21:合买未满员流产, 22:合买撤单流产
	 */
	private Integer status;
	/**
	 * 订单阶段 非追号专有：1：提交方案2：出票3：开奖4：派奖 追号专有5：方案已支付6：追号中7：追号结束
	 */
	private Integer position;
	/**
	 * 创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private java.util.Date createTime;
	/**
	 * 消息内容
	 */
	private String message;

	public OrderFlowInfoBO() {
		super();
	}

	public OrderFlowInfoBO(String orderCode, Integer status, Date createTime) {
		super();
		this.orderCode = orderCode;
		this.buyType = (int) BuyType.BUY.getValue();
		this.status = status;
		this.createTime = createTime;
	}

	public OrderFlowInfoBO(String orderAddCode, String orderAddIssue, Integer status, Date createTime) {
		super();
		this.orderAddCode = orderAddCode;
		this.orderAddIssue = orderAddIssue;
		this.buyType = (int) BuyType.BUY_CHASE.getValue();
		this.status = status;
		this.createTime = createTime;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 
	 * @return
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 订单编号
	 * 
	 * @param orderCode
	 */
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	/**
	 * 订单编号
	 * 
	 * @return
	 */
	public String getOrderCode() {
		return orderCode;
	}

	/**
	 * 追号编号
	 * 
	 * @param orderAddCode
	 */
	public void setOrderAddCode(String orderAddCode) {
		this.orderAddCode = orderAddCode;
	}

	/**
	 * 追号编号
	 * 
	 * @return
	 */
	public String getOrderAddCode() {
		return orderAddCode;
	}

	public String getOrderAddIssue() {
		return orderAddIssue;
	}

	public void setOrderAddIssue(String orderAddIssue) {
		this.orderAddIssue = orderAddIssue;
	}

	/**
	 * 用户ID
	 * 
	 * @param userId
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * 用户ID
	 * 
	 * @return
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * 1：代购；2：追号；3：合买
	 * 
	 * @param buyType
	 */
	public void setBuyType(Integer buyType) {
		this.buyType = buyType;
	}

	/**
	 * 1：代购；2：追号；3：合买
	 * 
	 * @return
	 */
	public Integer getBuyType() {
		return buyType;
	}

	/**
	 * 1：提交方案2:支付成功3：支付失败
	 * 代购专有：4：等待出票5：出票中6：出票成功7:部分未出票成功8:出票失败9：等待开奖10：已中奖11：未中奖12：等待派奖13：已派奖
	 * 追号专有：14：追号中15：追号结束16：中奖追停17：追号撤单
	 * 
	 * @param status
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * 1：提交方案2:支付成功3：支付失败
	 * 代购专有：4：等待出票5：出票中6：出票成功7:部分未出票成功8:出票失败9：等待开奖10：已中奖11：未中奖12：等待派奖13：已派奖
	 * 追号专有：14：追号中15：追号结束16：中奖追停17：追号撤单
	 * 
	 * @return
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * 订单阶段 非追号专有：1：提交方案2：出票3：开奖4：派奖 追号专有5：方案已支付6：追号中7：追号结束
	 * 
	 * @param position
	 */
	public void setPosition(Integer position) {
		this.position = position;
	}

	/**
	 * 订单阶段 非追号专有：1：提交方案2：出票3：开奖4：派奖 追号专有5：方案已支付6：追号中7：追号结束
	 * 
	 * @return
	 */
	public Integer getPosition() {
		return position;
	}

	/**
	 * 创建时间
	 * 
	 * @param createTime
	 */
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * 创建时间
	 * 
	 * @return
	 */
	public java.util.Date getCreateTime() {
		return createTime;
	}

	/**
	 * 提示信息，包括出票失败信息等
	 * 
	 * @param message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * 提示信息，包括出票失败信息等
	 * 
	 * @return
	 */
	public String getMessage() {
		return message;
	}
}
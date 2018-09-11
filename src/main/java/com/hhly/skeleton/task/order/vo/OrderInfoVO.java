package com.hhly.skeleton.task.order.vo;

import java.util.Date;
import java.util.List;

import com.hhly.skeleton.base.vo.PageVO;

/**
 * @desc 订单信息
 * @author huangb
 * @date 2017年5月18日
 * @company 益彩网络
 * @version v1.0
 */
public class OrderInfoVO extends PageVO {
	private static final long serialVersionUID = -3863222308060730411L;
	/**
	 * 编号
	 */
	private Long id;
	/**
	 * 订单编号
	 */
	private String orderCode;
	/**
	 * 彩种code
	 */
	private Integer lotteryCode;
	/**
	 * 彩期
	 */
	private String lotteryIssue;

	/**
	 * 订单状态;1：待上传；2：待拆票；3：拆票中；4：待出票；5:出票中；6：已出票；7：出票失败
	 */
	private Short orderStatus;
	/**
	 * 新的订单状态
	 */
	private Short newOrderStatus;
	/**
	 * 状态标识；0-表示非已出票和非已撤单和非撤单中，1-表示出票失败
	 */
	private Integer statusFlag;
	/**
	 * 订单总购买注数
	 */
	private Integer totalBuyNum;
	/**
	 * 对阵编号集合（用于竞技彩）
	 */
	private List<String> screenCodeList;
	
	/******20170824 add********/
	/**
	 * 撤单原因
	 */
	private String cancelReason;
	
	/**
	 * 开始时间
	 */
	private Date startTime;
	/**
	 * 结束时间
	 */
	private Date endTime;
	
	/**
	 * 20180328 added 分批查询时的订单自增id;分批查询时作为起始分批条件，用于确定每批的起始数据范围
	 */
	private Long batOrderId;
	/**
	 * 20180329 added 分批处理时设置的订单数据范围，通过订单自增id划出范围;下面定义的范围列表
	 */
	private List<Long> batOrderIdList;

	public OrderInfoVO() {
	}

	public OrderInfoVO(String orderCode) {
		this.orderCode = orderCode;
	}

	public OrderInfoVO(String orderCode, Short newOrderStatus) {
		this(orderCode);
		this.newOrderStatus = newOrderStatus;
	}

	public OrderInfoVO(String orderCode, Short orderStatus, Short newOrderStatus) {
		this(orderCode);
		this.orderStatus = orderStatus;
		this.newOrderStatus = newOrderStatus;
	}
	
	public OrderInfoVO(String orderCode, Short orderStatus, Short newOrderStatus, String cancelReason) {
		this(orderCode, orderStatus, newOrderStatus);
		this.cancelReason = cancelReason;
	}

	public OrderInfoVO(Integer lotteryCode, String lotteryIssue) {
		this.lotteryCode = lotteryCode;
		this.lotteryIssue = lotteryIssue;
	}

	public OrderInfoVO(Integer lotteryCode, String lotteryIssue, Integer statusFlag) {
		this(lotteryCode, lotteryIssue);
		this.statusFlag = statusFlag;
	}

	public OrderInfoVO(Integer lotteryCode, String lotteryIssue, Integer statusFlag, Integer pageIndex,
			Integer pageSize) {
		this(lotteryCode, lotteryIssue, statusFlag);
		super.setPageIndex(pageIndex);
		super.setPageSize(pageSize);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getLotteryIssue() {
		return lotteryIssue;
	}

	public void setLotteryIssue(String lotteryIssue) {
		this.lotteryIssue = lotteryIssue;
	}

	public Short getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Short orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Short getNewOrderStatus() {
		return newOrderStatus;
	}

	public void setNewOrderStatus(Short newOrderStatus) {
		this.newOrderStatus = newOrderStatus;
	}

	public Integer getStatusFlag() {
		return statusFlag;
	}

	public void setStatusFlag(Integer statusFlag) {
		this.statusFlag = statusFlag;
	}

	public Integer getTotalBuyNum() {
		return totalBuyNum;
	}

	public void setTotalBuyNum(Integer totalBuyNum) {
		this.totalBuyNum = totalBuyNum;
	}

	public List<String> getScreenCodeList() {
		return screenCodeList;
	}

	public void setScreenCodeList(List<String> screenCodeList) {
		this.screenCodeList = screenCodeList;
	}

	public String getCancelReason() {
		return cancelReason;
	}

	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Long getBatOrderId() {
		return batOrderId;
	}

	public void setBatOrderId(Long batOrderId) {
		this.batOrderId = batOrderId;
	}

	public List<Long> getBatOrderIdList() {
		return batOrderIdList;
	}

	public void setBatOrderIdList(List<Long> batOrderIdList) {
		this.batOrderIdList = batOrderIdList;
	}

}

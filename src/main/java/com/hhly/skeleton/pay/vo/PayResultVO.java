package com.hhly.skeleton.pay.vo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.util.DateUtil;
import com.hhly.skeleton.base.util.ObjectUtil;
import com.hhly.skeleton.lotto.base.order.bo.OrderBaseInfoBO;
import com.hhly.skeleton.pay.bo.OperateCouponBO;
import com.hhly.skeleton.pay.bo.TransRechargeBO;

/**
 * @desc 支付结果
 * @author xiongjingang
 * @date 2017年3月1日 下午3:40:27
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class PayResultVO extends BaseBO {
	private static final long serialVersionUID = -7368002328260963842L;
	/**
	*自定义用户充值流水编号
	*/
	@JsonProperty("t_r_c")
	private String transRechargeCode;
	/**
	 * 订单号
	 */
	@JsonProperty("o_c")
	private String orderCode;
	/**
	 * 购买类型
	 */
	@JsonProperty("b_t")
	private String buyType;
	/**
	 * 支付状态
	 */
	@JsonProperty("p_s")
	private Short payStatus;
	/**
	*交易时间
	*/
	@JsonProperty("t_t")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date transTime;
	/**
	*订单金额
	*/
	@JsonProperty("o_a")
	private Double orderAmount;
	/**
	*红包金额
	*/
	@JsonProperty("r_a")
	private Double redAmount;
	/**
	* 实际支付金额
	*/
	@JsonProperty("p_a")
	private Double payAmount;
	/**
	*服务费
	*/
	@JsonProperty("s_c")
	private Double serviceCharge;
	/**
	* 红包名称
	*/
	@JsonProperty("r_n")
	private String redName;
	@JsonProperty("r_p")
	private Short rechargePlatform;// 充值平台
	@JsonProperty("a_c")
	private String activityCode;// 充值活动编号
	/**
	* 彩种编号，多个用英文逗号隔开
	*/
	@JsonProperty("l_c")
	private String lotteryCode;
	@JsonProperty("r_r")
	private Double rechargeRed;// 充值红包
	@JsonIgnore
	private String redCode;// 红包编号
	@JsonIgnore
	private Double totalAmount;// 总余额
	@JsonIgnore
	private List<PayOrderBaseInfoVO> orderSuccessList;// 成功订单
	@JsonIgnore
	private List<PayOrderBaseInfoVO> orderFailList;// 失败订单
	@JsonIgnore
	private List<PayOrderBaseInfoVO> orderPassList;// 已过支付时间订单
	@JsonIgnore
	private List<PayOrderBaseInfoVO> alarmList;// 大额订单，需要警报

	public PayResultVO() {
		super();
	}

	public PayResultVO(TransRechargeBO transRechargeBO) {
		super();
		this.transRechargeCode = transRechargeBO.getTransRechargeCode();
		this.transTime = transRechargeBO.getTransTime();
		this.redAmount = transRechargeBO.getRedAmount();
		this.serviceCharge = transRechargeBO.getServiceCharge();
		this.payStatus = transRechargeBO.getTransStatus();
	}

	public PayResultVO(OperateCouponBO operateCouponBO, ToPayEndTimeVO toPayEndTimeVO, TransRechargeBO transRechargeBO) {
		super();
		OrderBaseInfoBO orderBaseInfo = toPayEndTimeVO.getOrderBaseInfo();
		this.transRechargeCode = transRechargeBO.getTransRechargeCode();
		this.orderCode = orderBaseInfo.getOrderCode();
		this.buyType = String.valueOf(orderBaseInfo.getBuyType());
		this.payStatus = transRechargeBO.getTransStatus();
		this.transTime = DateUtil.getNowDate();
		this.orderAmount = toPayEndTimeVO.getOrderAmount();
		if (!ObjectUtil.isBlank(operateCouponBO)) {
			this.redAmount = transRechargeBO.getRedAmount();
			this.redName = operateCouponBO.getRedName();

		}
		this.serviceCharge = transRechargeBO.getServiceCharge();
		this.lotteryCode = String.valueOf(orderBaseInfo.getLotteryCode());
	}

	public String getTransRechargeCode() {
		return transRechargeCode;
	}

	public void setTransRechargeCode(String transRechargeCode) {
		this.transRechargeCode = transRechargeCode;
	}

	public Date getTransTime() {
		return transTime;
	}

	public void setTransTime(Date transTime) {
		this.transTime = transTime;
	}

	public Double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Double getRedAmount() {
		return redAmount;
	}

	public void setRedAmount(Double redAmount) {
		this.redAmount = redAmount;
	}

	public Double getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(Double payAmount) {
		this.payAmount = payAmount;
	}

	public Double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(Double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public String getRedName() {
		return redName;
	}

	public void setRedName(String redName) {
		this.redName = redName;
	}

	public String getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(String lotteryCode) {
		this.lotteryCode = lotteryCode;
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

	public Short getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(Short payStatus) {
		this.payStatus = payStatus;
	}

	public Double getRechargeRed() {
		return rechargeRed;
	}

	public void setRechargeRed(Double rechargeRed) {
		this.rechargeRed = rechargeRed;
	}

	public String getRedCode() {
		return redCode;
	}

	public void setRedCode(String redCode) {
		this.redCode = redCode;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<PayOrderBaseInfoVO> getOrderSuccessList() {
		return orderSuccessList;
	}

	public void setOrderSuccessList(List<PayOrderBaseInfoVO> orderSuccessList) {
		this.orderSuccessList = orderSuccessList;
	}

	public List<PayOrderBaseInfoVO> getOrderFailList() {
		return orderFailList;
	}

	public void setOrderFailList(List<PayOrderBaseInfoVO> orderFailList) {
		this.orderFailList = orderFailList;
	}

	public List<PayOrderBaseInfoVO> getOrderPassList() {
		return orderPassList;
	}

	public void setOrderPassList(List<PayOrderBaseInfoVO> orderPassList) {
		this.orderPassList = orderPassList;
	}

	public List<PayOrderBaseInfoVO> getAlarmList() {
		return alarmList;
	}

	public void setAlarmList(List<PayOrderBaseInfoVO> alarmList) {
		this.alarmList = alarmList;
	}

	public Short getRechargePlatform() {
		return rechargePlatform;
	}

	public void setRechargePlatform(Short rechargePlatform) {
		this.rechargePlatform = rechargePlatform;
	}

	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

}
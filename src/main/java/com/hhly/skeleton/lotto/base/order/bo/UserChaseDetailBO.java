package com.hhly.skeleton.lotto.base.order.bo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.common.OrderEnum;
import com.hhly.skeleton.base.constants.CancellationConstants;
import com.hhly.skeleton.base.constants.Constants;

/**
 * @desc 用户追号详情
 * @author huangb
 * @date 2017年4月12日
 * @company 益彩网络
 * @version v1.0
 */
public class UserChaseDetailBO extends BaseBO {

	private static final long serialVersionUID = 7621567527052358716L;
	/**
	 * 行编号
	 */
	private Integer rn;
	/**
	 * 期号
	 */
	private String issueCode;
	/**
	 * 当期倍数
	 */
	private Integer multiple;
	/**
	 * 当期认购金额
	 */
	private Double buyAmount;
	/**
	 * 追号状态；1：追号成功；2：追号失败；3：系统撤单；4：用户撤单；5：等待追号；6:撤单中；7:停追撤单中；8:用户撤单中
	 */
	private Short addStatus;
	/**
	 * 开奖号码
	 */
	private String drawCode;
	
	/**
	 * 开奖号码类型
	 */
	private Integer drawCodeType;
	
	/**
	 * 中奖状态 1：未开奖；2：未中奖；3：已中奖；4：已派奖
	 */
	private Short winningStatus=0;

	/**
	 * 支付状态
	 */
	@JsonIgnore
	private Short payStatus=0;

	/**
	 * 1：待上传；2：待拆票；3：拆票中；4：待出票；5:出票中；6：已出票；7：出票失败；8：已撤单;9拆票失败;10撤单中
	 */
	@JsonIgnore
	private Short orderStatus=0;
	/**
	 * 中奖金额（税前奖金）
	 */
	private Double preBonus;

	/**
	 * 彩种编号
	 */
	private Integer lotteryCode;

	/**
	 * 订单编号
	 */
	private String orderCode;

	/**
	 * （前端追号状态从此取）前端显示的追号状态：1：等待追号2：追号成功3：追号失败4：系统撤单5：用户撤单
	 */
	private Short addShowStatus;

	public Integer getRn() {
		return rn;
	}

	public void setRn(Integer rn) {
		this.rn = rn;
	}

	public String getIssueCode() {
		return issueCode;
	}

	public void setIssueCode(String issueCode) {
		this.issueCode = issueCode;
	}

	public Integer getMultiple() {
		return multiple;
	}

	public void setMultiple(Integer multiple) {
		this.multiple = multiple;
	}

	public Double getBuyAmount() {
		return buyAmount;
	}

	public void setBuyAmount(Double buyAmount) {
		this.buyAmount = buyAmount;
	}

	public Short getAddStatus() {
		return addStatus;
	}

	public void setAddStatus(Short addStatus) {
		this.addStatus = addStatus;
	}

	public String getDrawCode() {
		return drawCode;
	}

	public void setDrawCode(String drawCode) {
		this.drawCode = drawCode;
	}
	
	public Integer getDrawCodeType() {
		return drawCodeType;
	}

	public void setDrawCodeType(Integer drawCodeType) {
		this.drawCodeType = drawCodeType;
	}

	public Short getWinningStatus() {
		return winningStatus;
	}

	public void setWinningStatus(Short winningStatus) {
		this.winningStatus = winningStatus;
	}

	public Double getPreBonus() {
		return preBonus;
	}

	public void setPreBonus(Double preBonus) {
		this.preBonus = preBonus;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Short getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Short orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Short getAddShowStatus() {
		//未支付 返回等待追号
		if(OrderEnum.PayStatus.USER_CANCLE_PAY.getValue()==getPayStatus() || OrderEnum.PayStatus.WAITING_PAY.getValue()==getPayStatus()
				||OrderEnum.PayStatus.FAILING_PAY.getValue()==getPayStatus() || OrderEnum.PayStatus.OVERDUE_PAY.getValue()==getPayStatus() ||OrderEnum.PayStatus.PAYING.getValue()==getPayStatus()){
              return OrderEnum.AddShowStatus.WAITTING_CHASE.getKey();
		}
		//等待追号
        for(Short status : Constants.WAITTING_ADD){
        	if(status.equals(getOrderStatus())){
				return OrderEnum.AddShowStatus.WAITTING_CHASE.getKey();
			}
		}
		//追号成功
		if(OrderEnum.OrderStatus.TICKETED.getValue() == getOrderStatus() &&
				CancellationConstants.OrderAddIssueStatusEnum.ADDSUCCESS.getKey().shortValue() == getAddStatus()){
			return OrderEnum.AddShowStatus.CHASE_SUCCESS.getKey();
		}
		//追号失败
		if(OrderEnum.OrderStatus.WITHDRAWING.getValue() == getOrderStatus()
				|| OrderEnum.OrderStatus.WITHDRAW.getValue() == getOrderStatus()){
			 return OrderEnum.AddShowStatus.CHASE_FAIL.getKey();
		}
		//系统撤单
		if(CancellationConstants.OrderAddIssueStatusEnum.CANCELLATIONSYSTEM.getKey().shortValue() == getAddStatus() ||
				CancellationConstants.OrderAddIssueStatusEnum.INCANCELLATION.getKey().shortValue() == getAddStatus()
				||CancellationConstants.OrderAddIssueStatusEnum.INSTOPADDCANCELLATION.getKey().shortValue() == getAddStatus()){
			return OrderEnum.AddShowStatus.SYSTEM_UNDO.getKey();
		}
		//用户撤单
		if(CancellationConstants.OrderAddIssueStatusEnum.CANCELLATIONUSER.getKey().shortValue() == getAddStatus()
				|| CancellationConstants.OrderAddIssueStatusEnum.INUSERCANCELLATION.getKey().shortValue() == getAddStatus()){
			return OrderEnum.AddShowStatus.USER_CANCEL.getKey();
		}
		return OrderEnum.AddShowStatus.WAITTING_CHASE.getKey();
	}

	public void setAddShowStatus(Short addShowStatus) {
		this.addShowStatus = addShowStatus;
	}

	public Short getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(Short payStatus) {
		this.payStatus = payStatus;
	}
}

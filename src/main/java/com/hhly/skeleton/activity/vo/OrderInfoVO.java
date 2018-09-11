package com.hhly.skeleton.activity.vo;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.hhly.skeleton.activity.bo.OrderInfoBO;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.constants.SymbolConstants;
import com.hhly.skeleton.lotto.base.order.vo.OrderAddVO;

/**
 * @desc 订单vo类
 * @author lidecheng
 * @date 2017年6月30日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class OrderInfoVO extends BaseBO{
	/**彩种编号*/
	private Integer lotteryCode;
	
	/**彩期号*/
	private Integer issueCode;	
	/**最大场次编号*/
	private String maxBuyScreen;
	/**订单编号*/
	private List<String> orderId;
	/**订单编号*/
	private String orderCode;
	/**中奖金额*/
	private Float  bonus;
	/**中奖状态  1：未开奖；2：未中奖；3：已中奖；4：已派奖*/
	private Short winningStatus ;
	/*** 用户id*/
	private String userId;
	/** 订单创建时间*/
	private Date createTime;
	/**订单状态 1：待上传；2：待拆票；3：拆票中；4：待出票；5:出票中；6：已出票；7：出票失败；8：已撤单;9拆票失败;10撤单中*/
	private Short orderStatus;
	/**订单详情*/
	private String planContent;
	/** 追号状态； 1：追号中；2：中奖停追；3：追号结束；4：用户撤单；5：系统撤单；*/
	private Short addStatus;
	public OrderInfoVO(){
		
	}
	public OrderInfoVO(ActivityMsgVO msgVO){
		this.orderId= Arrays.asList(msgVO.getTransId().split(SymbolConstants.COMMA));		
	}
	public OrderInfoVO(OrderInfoBO orderBO){
		this.userId = orderBO.getUserId();		
		this.lotteryCode = orderBO.getLotteryCode();
		this.createTime = orderBO.getCreateTime();
	}	
	
	public OrderInfoVO(OrderAddVO orderBO,Integer userId){
		this.userId = ""+userId;		
		this.lotteryCode = orderBO.getLotteryCode();
		this.createTime = new Date();
	}
	
	public Short getAddStatus() {
		return addStatus;
	}
	public void setAddStatus(Short addStatus) {
		this.addStatus = addStatus;
	}
	public Short getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(Short orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Short getWinningStatus() {
		return winningStatus;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setWinningStatus(Short winningStatus) {
		this.winningStatus = winningStatus;
	}
	public Float getBonus() {
		return bonus;
	}
	public void setBonus(Float bonus) {
		this.bonus = bonus;
	}
	public List<String> getOrderId() {
		return orderId;
	}
	public void setOrderId( List<String> orderId) {
		this.orderId = orderId;
	}
	public Integer getLotteryCode() {
		return lotteryCode;
	}
	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}
	public Integer getIssueCode() {
		return issueCode;
	}
	public void setIssueCode(Integer issueCode) {
		this.issueCode = issueCode;
	}
	public String getMaxBuyScreen() {
		return maxBuyScreen;
	}
	public void setMaxBuyScreen(String maxBuyScreen) {
		this.maxBuyScreen = maxBuyScreen;
	}
	public String getPlanContent() {
		return planContent;
	}
	public void setPlanContent(String planContent) {
		this.planContent = planContent;
	} 	
}

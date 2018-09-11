package com.hhly.skeleton.activity.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 订单详情表
 * @author lidecheng
 * @date 2017年7月1日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class OrderDetailBO extends BaseBO{
	private Integer id;
	private Integer orderDetailId;
	/**
	 * 数字彩，低频彩所选的投注号码；若为上传，需要保存选好方式
	 */
	private String planContent ;
	/**
	 * 子玩法
	 */
	private Integer lotteryChildCode;
	/**
	 * 税后金额
	 */
	private Double aftBonus;
	/**
	 * 倍数
	 */
	private Integer multiple;
	/**
	 * 中奖详情
	 */
	private String winningDetail;
	/**0：全部 1：单式；2：复式；3：胆拖；6：和值*/
	private Short contentType;
	/**
	 * 购买的场次编号
	 */
	private String buyScreen;
	
	public Integer getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(Integer orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getWinningDetail() {
		return winningDetail;
	}

	public String getBuyScreen() {
		return buyScreen;
	}

	public void setBuyScreen(String buyScreen) {
		this.buyScreen = buyScreen;
	}

	public void setWinningDetail(String winningDetail) {
		this.winningDetail = winningDetail;
	}

	public Integer getMultiple() {
		return multiple;
	}

	public void setMultiple(Integer multiple) {
		this.multiple = multiple;
	}

	public Integer getLotteryChildCode() {
		return lotteryChildCode;
	}

	public void setLotteryChildCode(Integer lotteryChildCode) {
		this.lotteryChildCode = lotteryChildCode;
	}

	public Double getAftBonus() {
		return aftBonus;
	}

	public void setAftBonus(Double aftBonus) {
		this.aftBonus = aftBonus;
	}

	public String getPlanContent() {
		return planContent;
	}

	public void setPlanContent(String planContent) {
		this.planContent = planContent;
	}

	public Short getContentType() {
		return contentType;
	}

	public void setContentType(Short contentType) {
		this.contentType = contentType;
	}
	
}

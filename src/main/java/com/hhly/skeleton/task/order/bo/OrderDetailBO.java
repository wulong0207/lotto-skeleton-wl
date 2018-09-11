package com.hhly.skeleton.task.order.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 订单明细
 * @author huangb
 * @date 2017年4月21日
 * @company 益彩网络
 * @version v1.0
 */
public class OrderDetailBO extends BaseBO {
	private static final long serialVersionUID = -7146003160013530283L;
	/**
	 * 编号
	 */
	private Long id;
	/**
	 * 订单编号
	 */
	private String orderCode;
	/**
	 * 上传的投注内容地址
	 */
	private String bettingContentUrl;
	/**
	 * 竞技彩购买的场次编号
	 */
	private String buyScreen;
	/**
	 * 数字彩，低频彩所选的投注号码；若为上传，需要保存选好方式
	 */
	private String planContent;
	/**
	 * 单个方案的购买倍数
	 */
	private Integer multiple;
	/**
	 * 单个方案的购买金额
	 */
	private Double amount;
	/**
	 * 玩法 ：彩种表里子玩法的名字
	 */
	private String playIntro;
	/**
	 * 选号方式 1：手选；2：机选；3：上传；
	 */
	private Integer codeWay;
	/**
	 * 内容类型 1：单式；2：复式；3：胆拖；
	 */
	private Integer contentType;
	/**
	 * 子彩种ID
	 */
	private Integer lotteryChildCode;
	/**
	 * 注数
	 */
	private Integer buyNumber;

	public OrderDetailBO() {
	}

	/**
	 * 构造
	 * 
	 * @param planContent
	 *            方案内容
	 * @param buyNumber
	 *            注数
	 * @param multiple
	 *            倍数
	 * @param amount
	 *            金额
	 * @param codeWay
	 *            选号方式
	 * @param contentType
	 *            内容类型
	 * @param lotteryChildCode
	 *            子玩法
	 */
	public OrderDetailBO(String planContent, Integer buyNumber, Integer multiple, Double amount, Integer codeWay,
			Integer contentType, Integer lotteryChildCode) {
		this.planContent = planContent;
		this.buyNumber = buyNumber;
		this.multiple = multiple;
		this.amount = amount;
		this.codeWay = codeWay;
		this.contentType = contentType;
		this.lotteryChildCode = lotteryChildCode;
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

	public String getBettingContentUrl() {
		return bettingContentUrl;
	}

	public void setBettingContentUrl(String bettingContentUrl) {
		this.bettingContentUrl = bettingContentUrl;
	}

	public String getBuyScreen() {
		return buyScreen;
	}

	public void setBuyScreen(String buyScreen) {
		this.buyScreen = buyScreen;
	}

	public String getPlanContent() {
		return planContent;
	}

	public void setPlanContent(String planContent) {
		this.planContent = planContent;
	}

	public Integer getMultiple() {
		return multiple;
	}

	public void setMultiple(Integer multiple) {
		this.multiple = multiple;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getPlayIntro() {
		return playIntro;
	}

	public void setPlayIntro(String playIntro) {
		this.playIntro = playIntro;
	}

	public Integer getCodeWay() {
		return codeWay;
	}

	public void setCodeWay(Integer codeWay) {
		this.codeWay = codeWay;
	}

	public Integer getContentType() {
		return contentType;
	}

	public void setContentType(Integer contentType) {
		this.contentType = contentType;
	}

	public Integer getLotteryChildCode() {
		return lotteryChildCode;
	}

	public void setLotteryChildCode(Integer lotteryChildCode) {
		this.lotteryChildCode = lotteryChildCode;
	}

	public Integer getBuyNumber() {
		return buyNumber;
	}

	public void setBuyNumber(Integer buyNumber) {
		this.buyNumber = buyNumber;
	}

}

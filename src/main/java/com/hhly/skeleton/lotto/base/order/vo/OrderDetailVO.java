package com.hhly.skeleton.lotto.base.order.vo;

import java.util.Date;

import com.hhly.skeleton.base.vo.BaseVO;
import com.hhly.skeleton.base.vo.PageVO;

/**
 * @author huangb
 *
 * @Date 2016年11月30日
 *
 * @Desc 订单明细
 */
public class OrderDetailVO extends PageVO {

	private static final long serialVersionUID = 6260072417448969137L;
	/**
	 * 起始行
	 */
	private Integer startRow;
	/**
	 * 编号
	 */
	private Long id;
	/**
	 * 用户id
	 */
	private Integer userId;
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
	 * 数字彩，低频彩所选的投注号码；若为上传，需要保存选好方式。 竞彩：存放投注内容字符串
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
	 * 内容类型 1：单式；2：复式；3：胆拖；4：混合；5：上传
	 */
	private Integer contentType;
	/**
	 * 子彩种ID
	 */
	private Integer lotteryChildCode;
	/**
	 * 单个方案的注数
	 */
	private Integer buyNumber;
	/**
	 * 选号模式（对应页面上的选号页签） 方便运营统计选号来源
	 */
	private Integer betMode;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 创建时间
	 */
	private Date createTime;

	public OrderDetailVO() {
	}

	/**
	 * 构造方法
	 */
	public OrderDetailVO(String planContent, Integer multiple, Double amount, String playIntro, Integer codeWay,
			Integer contentType) {
		this.planContent = planContent;
		this.multiple = multiple;
		this.amount = amount;
		this.playIntro = playIntro;
		this.codeWay = codeWay;
		this.contentType = contentType;
	}

	/**
	 * 构造方法
	 */
	public OrderDetailVO(String planContent, Integer betNum, Integer multiple, Double amount, String playIntro,
			Integer codeWay, Integer contentType, Integer betMode) {
		this(planContent, multiple, amount, playIntro, codeWay, contentType);
		this.buyNumber = betNum;
		this.betMode = betMode;
	}

	@Override
	public Integer getStartRow() {
		return startRow;
	}

	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public Integer getBetMode() {
		return betMode;
	}

	public void setBetMode(Integer betMode) {
		this.betMode = betMode;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "OrderDetailVO [id=" + id + ", orderCode=" + orderCode + ", bettingContentUrl=" + bettingContentUrl
				+ ", buyScreen=" + buyScreen + ", planContent=" + planContent + ", multiple=" + multiple + ", amount="
				+ amount + ", playIntro=" + playIntro + ", codeWay=" + codeWay + ", contentType=" + contentType
				+ ", lotteryChildCode=" + lotteryChildCode + ", buyNumber=" + buyNumber + ", betMode=" + betMode
				+ ", updateTime=" + updateTime + ", createTime=" + createTime + "]";
	}

}

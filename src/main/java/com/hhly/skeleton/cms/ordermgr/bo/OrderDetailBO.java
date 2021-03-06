package com.hhly.skeleton.cms.ordermgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * 
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2016-12-14 上午11:01:22
 * @Desc 方案类容详情
 */
public class OrderDetailBO extends BaseBO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2190594084388247333L;
	private Integer id;
	private String planContent;
	private String passWay;
	private Integer multiple;
	private Double amount;
	private Double preBonus;
	private String playIntro;
	private Integer codeWay;
	private Integer contentType;
	
	private String bettingContentUrl;
		
	private String buyScreen;
	
	private Integer lotteryChildCode;
	
	private Integer buyNumber;
	
	private String maxBuyScreen;
	/**
	 * 更新时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date updateTime;
	/**
	 * 创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;
	
	/**
	 * 奖项,中奖情况1:一等奖_X注;2:二等奖_X注.......7:七等奖_X注
	 */
	private String winningDetail;

	public Integer getBuyNumber() {
		return buyNumber;
	}

	public void setBuyNumber(Integer buyNumber) {
		this.buyNumber = buyNumber;
	}

	public Integer getLotteryChildCode() {
		return lotteryChildCode;
	}

	public void setLotteryChildCode(Integer lotteryChildCode) {
		this.lotteryChildCode = lotteryChildCode;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlanContent() {
		return planContent;
	}

	public void setPlanContent(String planContent) {
		this.planContent = planContent;
	}
	
	public String getPassWay() {
		if(planContent.indexOf("^") > -1 && planContent.lastIndexOf("^") > -1)
			passWay = planContent.substring(planContent.indexOf("^") + 1, planContent.lastIndexOf("^"));
		return passWay;
	}

	public void setPassWay(String passWay) {
		this.passWay = passWay;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
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

	public String getMaxBuyScreen() {
		return maxBuyScreen;
	}

	public void setMaxBuyScreen(String maxBuyScreen) {
		this.maxBuyScreen = maxBuyScreen;
	}

	/**
	 * @return the preBonus
	 */
	public Double getPreBonus() {
		return preBonus;
	}

	/**
	 * @param preBonus the preBonus to set
	 */
	public void setPreBonus(Double preBonus) {
		this.preBonus = preBonus;
	}

	public String getWinningDetail() {
		return winningDetail;
	}

	public void setWinningDetail(String winningDetail) {
		this.winningDetail = winningDetail;
	}

}

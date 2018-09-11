package com.hhly.skeleton.lotto.base.operate.bo;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
/**
 * 
 * @desc  彩种运营详细信息
 * @author lidecheng
 * @date 2017年3月8日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OperateLotteryDetailBO extends BaseBO{

	private static final long serialVersionUID = -36863916871925246L;


  /**
   * 彩种ID
   */
  private Integer typeId;
  
  /**
   * 彩种别名
   */
  private String typeAlias;

  /**
   * 彩种类型ID:1：数字彩；2：高频彩；3：竞技彩
   */
  private Short categoryId;

  /**
   * 彩种链接
   */
  private String typeUrl;


  /**
   * 运营图标:0无;1新;2热;3加奖;4其他
   */
  private Byte icon;

  /**
   * 打开方式:0:_blank;1:_self;
   */
  private Byte target;

  /**
   * 运营文案
   */
  private String typeKey;

  /**
   * 文案链接
   */
  private String typeKeyUrl;
  
  /**
   * 排序
   */
  private Integer orderId;
  /**
   * 下线时间
   */
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Date offlineTime;
  /**
	 * 本站截止销售时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date saleEndTime;
	/**
	 * 奖池金额
	 */
	private Long jackpotAmount;
	
	/**
	 * 彩种logourl
	 */
	private String lotteryLogoUrl;
	
	/**
	 * 比赛场次
	 */
	private Integer matchNum;
	
	/**
	 * 运营图片
	 */
	private String operUrl;
	/**
	 * 颜色
	 */
	private String color;
	/**
	 * 子玩法
	 */
	private String lotteryChildCode;
	
	public String getLotteryChildCode() {
		return lotteryChildCode;
	}

	public void setLotteryChildCode(String lotteryChildCode) {
		this.lotteryChildCode = lotteryChildCode;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOperUrl() {
		return operUrl;
	}

	public void setOperUrl(String operUrl) {
		this.operUrl = operUrl;
	}

	public Integer getMatchNum() {
		return matchNum;
	}

	public void setMatchNum(Integer matchNum) {
		this.matchNum = matchNum;
	}

	public String getLotteryLogoUrl() {
		return lotteryLogoUrl;
	}

	public void setLotteryLogoUrl(String lotteryLogoUrl) {
		this.lotteryLogoUrl = lotteryLogoUrl;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Short getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Short categoryId) {
		this.categoryId = categoryId;
	}

	public String getTypeUrl() {
		return typeUrl;
	}

	public void setTypeUrl(String typeUrl) {
		this.typeUrl = typeUrl;
	}

	public Byte getIcon() {
		return icon;
	}

	public void setIcon(Byte icon) {
		this.icon = icon;
	}

	public Byte getTarget() {
		return target;
	}

	public void setTarget(Byte target) {
		this.target = target;
	}

	public String getTypeKey() {
		return typeKey;
	}

	public void setTypeKey(String typeKey) {
		this.typeKey = typeKey;
	}

	public String getTypeKeyUrl() {
		return typeKeyUrl;
	}

	public void setTypeKeyUrl(String typeKeyUrl) {
		this.typeKeyUrl = typeKeyUrl;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getTypeAlias() {
		return typeAlias;
	}

	public void setTypeAlias(String typeAlias) {
		this.typeAlias = typeAlias;
	}

	public Date getSaleEndTime() {
		return saleEndTime;
	}

	public void setSaleEndTime(Date saleEndTime) {
		this.saleEndTime = saleEndTime;
	}

	public Long getJackpotAmount() {
		return jackpotAmount;
	}

	public void setJackpotAmount(Long jackpotAmount) {
		this.jackpotAmount = jackpotAmount;
	}

	public Date getOfflineTime() {
		return offlineTime;
	}

	public void setOfflineTime(Date offlineTime) {
		this.offlineTime = offlineTime;
	}	
	
}
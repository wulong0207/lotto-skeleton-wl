package com.hhly.skeleton.cms.operatemgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

public class OperateLotteryInfoBO extends BaseBO {

	private static final long serialVersionUID = -36863916871925246L;

	/**
	 * 自增长主键ID
	 */
	private Long id;

	/**
	 * 栏目ID,关联operateLottery的id
	 */
	private Long lotteryId;

	/**
	 * 彩种ID
	 */
	private Integer typeId;

	/**
	 * 彩种类型ID:1：数字彩；2：高频彩；3：竞技彩
	 */
	private Byte categoryId;

	/**
	 * 彩种别名
	 */
	private String typeAlias;

	/**
	 * 彩种链接
	 */
	private String typeUrl;

	/**
	 * 是否显示:0否;1是;2设定时间下线
	 */
	private Byte display;

	/**
	 * 下线时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date offlineTime;

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
	 * 颜色
	 */
	private String color;

	private String url;

	/**
	 * 子玩法
	 */
	private Integer lotteryChildCode;
	
	/**
	 * 彩种描述
	 */
	private String lotteryDescribe;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getLotteryId() {
		return lotteryId;
	}

	public OperateLotteryInfoBO setLotteryId(Long lotteryId) {
		this.lotteryId = lotteryId;
		return this;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Byte getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Byte categoryId) {
		this.categoryId = categoryId;
	}

	public String getTypeAlias() {
		return typeAlias;
	}

	public void setTypeAlias(String typeAlias) {
		this.typeAlias = typeAlias;
	}

	public String getTypeUrl() {
		return typeUrl;
	}

	public void setTypeUrl(String typeUrl) {
		this.typeUrl = typeUrl;
	}

	public Byte getDisplay() {
		return display;
	}

	public void setDisplay(Byte display) {
		this.display = display;
	}

	public Date getOfflineTime() {
		return offlineTime;
	}

	public void setOfflineTime(Date offlineTime) {
		this.offlineTime = offlineTime;
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

	public OperateLotteryInfoBO setOrderId(Integer orderId) {
		this.orderId = orderId;
		return this;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getLotteryChildCode() {
		return lotteryChildCode;
	}

	public void setLotteryChildCode(Integer lotteryChildCode) {
		this.lotteryChildCode = lotteryChildCode;
	}

	public String getLotteryDescribe() {
		return lotteryDescribe;
	}

	public void setLotteryDescribe(String lotteryDescribe) {
		this.lotteryDescribe = lotteryDescribe;
	}
}
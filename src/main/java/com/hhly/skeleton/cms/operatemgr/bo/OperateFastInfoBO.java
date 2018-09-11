package com.hhly.skeleton.cms.operatemgr.bo;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

public class OperateFastInfoBO extends BaseBO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5201402092263175334L;

	/**
	 * 自增长主键ID
	 */
  private Long id;

  /**
   * 栏目ID,关联operateLottery的id
   */
  private Long fastId;

  /**
   * 彩种ID
   */
  private Integer typeId;

  /**
   * 彩种类型ID:1：数字彩；2：高频彩；3：竞技彩
   */
  private Byte categoryId;

  /**
   * 页签别名
   */
  private String fastAlias;

  /**
   * 页签链接
   */
  private String fastUrl;

  /**
   * 默认选中:0否;1是
   */
  private Byte fastSelected;
	
  /**
   * 默认倍数
   */
  private Integer multiple;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getFastId() {
		return fastId;
	}

	public OperateFastInfoBO setFastId(Long fastId) {
		this.fastId = fastId;
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

	

	public String getFastAlias() {
		return fastAlias;
	}

	public void setFastAlias(String fastAlias) {
		this.fastAlias = fastAlias;
	}

	public String getFastUrl() {
		return fastUrl;
	}

	public void setFastUrl(String fastUrl) {
		this.fastUrl = fastUrl;
	}

	public Byte getFastSelected() {
		return fastSelected;
	}

	public void setFastSelected(Byte fastSelected) {
		this.fastSelected = fastSelected;
	}

	public Integer getMultiple() {
		return multiple;
	}

	public void setMultiple(Integer multiple) {
		this.multiple = multiple;
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

	public OperateFastInfoBO setOrderId(Integer orderId) {
		this.orderId = orderId;
		return this;
	}

}
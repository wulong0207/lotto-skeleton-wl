package com.hhly.skeleton.cms.operatemgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

public class OperateLotteryBO extends BaseBO{
	
	private static final long serialVersionUID = 3675596066523192790L;

	/**
	 * 自增长主键ID
	 */
  private Long id;

  /**
   * 发布编号
   */
  private String releaseCode;

  /**
   * 发布平台:1WEB;2WAP;3ANDROID;4IOS
   */
  private Byte platform;

  /**
   * 发布状态:0暂停发布;1待发布;2发布中;3发布结束
   */
  private Byte status;

  /**
   * 备注说明
   */
  private String lotteryDesc;

  /**
   * 上线时间
   */
  private String onlineTime;

  /**
   * 下线时间
   */
  private String offlineTime;

  /**
   * 上线时间
   */
  private Short onlineWeek;

  /**
   * 下线时间
   */
  private Short offlineWeek;
  /**
   * 创建人真实姓名
   */
  private String createBy;

  /**
   * 修改人真实姓名
   */
  private String modifyBy;
  
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Date modifyTime;
  
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Date updateTime;

  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Date createTime;

  /***
   * 是否默认
   */
  private Short isDefault;
  
public Short getIsDefault() {
	return isDefault;
}

public void setIsDefault(Short isDefault) {
	this.isDefault = isDefault;
}

  
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Short getOnlineWeek() {
		return onlineWeek;
	}

	public void setOnlineWeek(Short onlineWeek) {
		this.onlineWeek = onlineWeek;
	}

	public Short getOfflineWeek() {
		return offlineWeek;
	}

	public void setOfflineWeek(Short offlineWeek) {
		this.offlineWeek = offlineWeek;
	}

	public String getReleaseCode() {
		return releaseCode;
	}

	public void setReleaseCode(String releaseCode) {
		this.releaseCode = releaseCode;
	}

	public Byte getPlatform() {
		return platform;
	}

	public void setPlatform(Byte platform) {
		this.platform = platform;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public String getLotteryDesc() {
		return lotteryDesc;
	}

	public void setLotteryDesc(String lotteryDesc) {
		this.lotteryDesc = lotteryDesc;
	}

	public String getOnlineTime() {
		return onlineTime;
	}

	public void setOnlineTime(String onlineTime) {
		this.onlineTime = onlineTime;
	}

	public String getOfflineTime() {
		return offlineTime;
	}

	public void setOfflineTime(String offlineTime) {
		this.offlineTime = offlineTime;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}
}
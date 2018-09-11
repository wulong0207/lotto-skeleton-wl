package com.hhly.skeleton.cms.operatemgr.bo;

import static com.hhly.skeleton.base.valid.GroupValue.ADD;
import static com.hhly.skeleton.base.valid.GroupValue.UPD;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.NotNull;

public class OperateFastBO extends BaseBO{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 7884966631580591104L;

	/**
	 * 自增长主键ID
	 */
  private Long id;

  /**
   * 发布编号
   */
  private String fastCode;

  /**
   * 发布平台:1WEB;2WAP;3ANDROID;4IOS
   */
  private Byte platform;
  
  /**
   * 模块页面:1.主站Web首页
   */
  private Byte position;

  /**
   * 发布状态:0暂停发布;1待发布;2发布中;3发布结束
   */
  private Byte status;

  /**
   * 备注说明
   */
  private String fastDesc;

  /**
   * 上线时间
   */
  private String onlineTime;

  /**
   * 下线时间
   */
  private String offlineTime;

  /**
   * 创建人真实姓名
   */
  private String createBy;

  /**
   * 修改人真实姓名
   */
  private String modifyBy;
  /**
   * 上线时间
   */
  private Short onlineWeek;

  /**
   * 下线时间
   */
  private Short offlineWeek;
  
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFastCode() {
		return fastCode;
	}

	public void setFastCode(String fastCode) {
		this.fastCode = fastCode;
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

	public String getFastDesc() {
		return fastDesc;
	}

	public void setFastDesc(String fastDesc) {
		this.fastDesc = fastDesc;
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

	public Byte getPosition() {
		return position;
	}

	public void setPosition(Byte position) {
		this.position = position;
	}
}
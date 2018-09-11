package com.hhly.skeleton.cms.sportmgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

public class SportTeamInfoBO extends BaseBO {

	private static final long serialVersionUID = 8869474017553637412L;

	private Long id;

	/**
	 * 球队id
	 */
	private Long teamId;

	/**
	 * 球队类型
	 */
	private Short teamType;

	/**
	 * '球队资料URL，唯一，第三方的球队ID。例如：一比分。以便链接到一比分的球队详情页面'
	 */
	private String teamDataUrl;

	/**
	 * 球队全称
	 */
	private String teamFullName;

	/**
	 * 球队简称
	 */
	private String teamShortName;

	/**
	 * 球队排名
	 */
	private String teamOrder;

	/**
	 * 球队logo相对路径
	 */
	private String logoUrl;
	
	/**
	 * 球队logo绝对路径
	 */
	private String logoImg;

	/**
	 * sp值变化比较
	 */
	private String md5Value;

	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 修改时间
	 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date modifyTime;

	/**
	 * 修改人
	 */
	private String modifyBy;

	/**
	 * 创建时间
	 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;

	/**
	 * 创建人
	 */
	private String createBy;

	/**
	 * 更新时间
	 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date updateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTeamId() {
		return teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

	public Short getTeamType() {
		return teamType;
	}

	public void setTeamType(Short teamType) {
		this.teamType = teamType;
	}

	public String getTeamDataUrl() {
		return teamDataUrl;
	}

	public void setTeamDataUrl(String teamDataUrl) {
		this.teamDataUrl = teamDataUrl;
	}

	public String getTeamFullName() {
		return teamFullName;
	}

	public void setTeamFullName(String teamFullName) {
		this.teamFullName = teamFullName;
	}

	public String getTeamShortName() {
		return teamShortName;
	}

	public void setTeamShortName(String teamShortName) {
		this.teamShortName = teamShortName;
	}

	public String getTeamOrder() {
		return teamOrder;
	}

	public void setTeamOrder(String teamOrder) {
		this.teamOrder = teamOrder;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getLogoImg() {
		return logoImg;
	}

	public void setLogoImg(String logoImg) {
		this.logoImg = logoImg;
	}

	public String getMd5Value() {
		return md5Value;
	}

	public void setMd5Value(String md5Value) {
		this.md5Value = md5Value;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}

package com.hhly.skeleton.cms.sysmgr.vo;

import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;

public class CmsKeywordVO extends PageVO {
	private Integer id;
	/*
	 * 敏感词
	 */
	private String keyword;
	/*
	 * 敏感级别:1:一般;2危险
	 */
	private Short grade;
	/*
	 * 状态:0禁用;1启用
	 */
	private Short status;
	/*
	 * 替换内容
	 */
	private String replaced;

	private Object createBy;

	private Object modifyBy;

	private Date modifyTime;

	private Date updateTime;

	private Date createTime;
	
	private String keywords;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword == null ? null : keyword.trim();
	}

	public Short getGrade() {
		return grade;
	}

	public void setGrade(Short grade) {
		this.grade = grade;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public String getReplaced() {
		return replaced;
	}

	public void setReplaced(String replaced) {
		this.replaced = replaced == null ? null : replaced.trim();
	}

	public Object getCreateBy() {
		return createBy;
	}

	public void setCreateBy(Object createBy) {
		this.createBy = createBy;
	}

	public Object getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(Object modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
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

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

}
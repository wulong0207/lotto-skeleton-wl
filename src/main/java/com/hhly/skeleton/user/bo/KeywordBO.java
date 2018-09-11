package com.hhly.skeleton.user.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ReplaceAttribute;
import com.hhly.skeleton.base.model.DicDataEnum;

public class KeywordBO extends BaseBO {
	private Integer id;
	/*
	 * 敏感词
	 */
	private String keyword;
	/*
	 * 敏感级别:1:一般;2危险
	 */
	@ReplaceAttribute(DicDataEnum.KEYWORD_GRADE)
	private String grade;
	/*
	 * 状态:0禁用;1启用
	 */
	@ReplaceAttribute(DicDataEnum.KEYWORD_STATUS)
	private String status;
	/*
	 * 替换内容
	 */
	private String replaced;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date updateTime;

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
		this.keyword = keyword;
	}



	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReplaced() {
		return replaced;
	}

	public void setReplaced(String replaced) {
		this.replaced = replaced;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
package com.hhly.skeleton.cms.report.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;

/**
 * @desc    用户数据报表BO
 * @author  Tony Wang
 * @date    2017年9月1日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ReportUserRookieExcelBO extends BaseBO {
	

	@ExcelHeader("日期")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date addDate;

	/**
	 * 注册人数
	 */
	@ExcelHeader("注册用户")
    private Integer regUser;

	/**
	 * 实名认证人数
	 */
	@ExcelHeader("完善用户")
    private Integer checkUser;

	/**
	 * 首充人数
	 */
	@ExcelHeader("首充用户")
    private Integer newFillUser;

	/**
	 * 首充转化率或有效用户转化,首充用户/注册用户 * 100%
	 */
    @ExcelHeader("首充转化")
	private String newFillRatio;
	
	/**
	 * 完善转化：完善用户/注册用户 * 100%
	 */
	@ExcelHeader("完善转化")
	private String checkRatio;

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public Integer getRegUser() {
		return regUser;
	}

	public void setRegUser(Integer regUser) {
		this.regUser = regUser;
	}

	public Integer getCheckUser() {
		return checkUser;
	}

	public void setCheckUser(Integer checkUser) {
		this.checkUser = checkUser;
	}

	public Integer getNewFillUser() {
		return newFillUser;
	}

	public void setNewFillUser(Integer newFillUser) {
		this.newFillUser = newFillUser;
	}

	public String getNewFillRatio() {
		return newFillRatio;
	}

	public void setNewFillRatio(String newFillRatio) {
		this.newFillRatio = newFillRatio;
	}

	public String getCheckRatio() {
		return checkRatio;
	}

	public void setCheckRatio(String checkRatio) {
		this.checkRatio = checkRatio;
	}
}

package com.hhly.skeleton.cms.ordermgr.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;

/**
 * @desc 导出追号计划相关用户信息
 * @author huangb
 * @date 2017年1月20日
 * @company 益彩网络
 * @version v1.0
 */
@SuppressWarnings("serial")
public class OrderAddUserExcelCmsBO extends BaseBO {

	@ExcelHeader("序号")
	private String id;

	@ExcelHeader("追号编号")
	private String orderAddCode;

	@ExcelHeader("手机号码")
	private String cusMobile;

	@ExcelHeader("账号")
	private String accountName;

	@ExcelHeader("真实姓名")
	private String actualName;

	@ExcelHeader("身份证")
	private String idNum;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderAddCode() {
		return orderAddCode;
	}

	public void setOrderAddCode(String orderAddCode) {
		this.orderAddCode = orderAddCode;
	}

	public String getCusMobile() {
		return cusMobile;
	}

	public void setCusMobile(String cusMobile) {
		this.cusMobile = cusMobile;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getActualName() {
		return actualName;
	}

	public void setActualName(String actualName) {
		this.actualName = actualName;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

}

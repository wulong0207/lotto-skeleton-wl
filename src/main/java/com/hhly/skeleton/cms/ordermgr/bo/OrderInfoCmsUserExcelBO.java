package com.hhly.skeleton.cms.ordermgr.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;

/**
 * 
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2016-12-15 下午3:43:05
 * @Desc 导出订单联系人
 */
@SuppressWarnings("serial")
public class OrderInfoCmsUserExcelBO extends BaseBO {
	@ExcelHeader("序号")
	private String id;
	
    @ExcelHeader("订单编号")
	private String orderCode;
	
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


	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
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

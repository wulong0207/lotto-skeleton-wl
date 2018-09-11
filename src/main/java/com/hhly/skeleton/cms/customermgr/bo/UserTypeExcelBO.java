package com.hhly.skeleton.cms.customermgr.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;

/**
 * @desc    
 * @author  cheng chen
 * @date    2017年4月27日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class UserTypeExcelBO extends BaseBO {

	@ExcelHeader("序号")
	private String id;

	@ExcelHeader("会员ID")
	private Integer userId;

	@ExcelHeader("用户类型ID")
	private Integer typeId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
}

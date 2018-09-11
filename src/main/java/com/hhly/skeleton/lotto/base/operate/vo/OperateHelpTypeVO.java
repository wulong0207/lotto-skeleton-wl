package com.hhly.skeleton.lotto.base.operate.vo;

import com.hhly.skeleton.base.vo.BaseVO;

public class OperateHelpTypeVO extends BaseVO {

	private static final long serialVersionUID = 5950892779315684631L;

	/**
	 * 1 一级、2二级、3三级
	 */
	private Short menu;
	
	/**
	 * 是否虚拟栏目
	 */
	private Short isVirtual;
	
	/**
	 * 父栏目编码
	 */
	private String parentTypeCode;
	
	/**
	 * 需要排除的栏目编码
	 */
	private String excludeTypeCode;
	
	public Short getMenu() {
		return menu;
	}

	public void setMenu(Short menu) {
		this.menu = menu;
	}

	public Short getIsVirtual() {
		return isVirtual;
	}

	public void setIsVirtual(Short isVirtual) {
		this.isVirtual = isVirtual;
	}

	public String getParentTypeCode() {
		return parentTypeCode;
	}

	public void setParentTypeCode(String parentTypeCode) {
		this.parentTypeCode = parentTypeCode;
	}

	public String getExcludeTypeCode() {
		return excludeTypeCode;
	}

	public void setExcludeTypeCode(String excludeTypeCode) {
		this.excludeTypeCode = excludeTypeCode;
	}
	
}

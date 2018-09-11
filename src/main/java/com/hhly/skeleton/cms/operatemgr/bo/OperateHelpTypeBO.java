package com.hhly.skeleton.cms.operatemgr.bo;

import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class OperateHelpTypeBO extends BaseBO{
    /**
     * 自增长主键ID
     */
    private Long id;

    /**
     * 栏目编号
     */
    private String code;

    /**
     * 栏目名称
     */
    private String fullName;

    /**
     * 栏目简称
     */
    private String shortName;

    /**
     * -1：顶级菜单；关联主键ID
     */
    private Long parent;

    /**
     * 1：一级菜单；2：二级菜单；
     */
    private Integer menu;

    /**
     * 前端使用状态:0：隐藏；1：显示；
     */
    private Integer status;

    /**
     * 排序ID
     */
    private Integer orderId;

    /**
     * 栏目标识符
     */
    private String identifiers;

    /**
     * 栏目描述
     */
    private String descriptor;

    /**
     * 是否虚拟栏目:0：否，1：是
     */
    private Byte virtual;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public Long getParent() {
		return parent;
	}

	public void setParent(Long parent) {
		this.parent = parent;
	}

	public Integer getMenu() {
		return menu;
	}

	public void setMenu(Integer menu) {
		this.menu = menu;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getIdentifiers() {
		return identifiers;
	}

	public void setIdentifiers(String identifiers) {
		this.identifiers = identifiers;
	}

	public String getDescriptor() {
		return descriptor;
	}

	public void setDescriptor(String descriptor) {
		this.descriptor = descriptor;
	}

	public Byte getVirtual() {
		return virtual;
	}

	public void setVirtual(Byte virtual) {
		this.virtual = virtual;
	}
}
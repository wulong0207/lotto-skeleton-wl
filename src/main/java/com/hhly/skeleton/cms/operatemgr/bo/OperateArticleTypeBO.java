package com.hhly.skeleton.cms.operatemgr.bo;

import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class OperateArticleTypeBO extends BaseBO{
  /**自增长主键ID*/
  private Long id;
  /**栏目编号*/
  private String typeCode;
  /**栏目名称*/
  private String typeFullName;
  /**栏目简称*/
  private String typeShortName;
  /**-1：顶级菜单；关联OPERATE_ARTICLE表的主键ID*/
  private Long typeParent;
  /**1：一级菜单；2：二级菜单；*/
  private Byte typeLevel;
  /**前端使用状态:0：隐藏；1：显示；*/
  private Byte status;
  /**RSS文章显示状态:0不显示RSS;1显示RSS;**/
  private Byte rstatus;
  /**排序ID*/
  private Short orderId;
  /**栏目标识符*/
  private String identifiers;
  /**栏目描述*/
  private String typeDesc;
     /**是否虚拟栏目:0：否，1：是*/
  private Byte virtual;
  
	public OperateArticleTypeBO() {}
	
	public OperateArticleTypeBO(long id, long typeParent, String typeFullName) {
		this.id = id;
		this.typeParent = typeParent;
		this.typeFullName = typeFullName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	public String getTypeFullName() {
		return typeFullName;
	}
	public void setTypeFullName(String typeFullName) {
		this.typeFullName = typeFullName;
	}
	public String getTypeShortName() {
		return typeShortName;
	}
	public void setTypeShortName(String typeShortName) {
		this.typeShortName = typeShortName;
	}
	public Long getTypeParent() {
		return typeParent;
	}
	public void setTypeParent(Long typeParent) {
		this.typeParent = typeParent;
	}
	public Byte getTypeLevel() {
		return typeLevel;
	}
	public void setTypeLevel(Byte typeLevel) {
		this.typeLevel = typeLevel;
	}
	public Byte getStatus() {
		return status;
	}
	public void setStatus(Byte status) {
		this.status = status;
	}
	public Short getOrderId() {
		return orderId;
	}
	public void setOrderId(Short orderId) {
		this.orderId = orderId;
	}
	public String getIdentifiers() {
		return identifiers;
	}
	public void setIdentifiers(String identifiers) {
		this.identifiers = identifiers;
	}
	public String getTypeDesc() {
		return typeDesc;
	}
	public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
	}

	public Byte getVirtual() {
		return virtual;
	}

	public void setVirtual(Byte virtual) {
		this.virtual = virtual;
	}

	public Byte getRstatus() {
		return rstatus;
	}

	public void setRstatus(Byte rstatus) {
		this.rstatus = rstatus;
	}

	
}
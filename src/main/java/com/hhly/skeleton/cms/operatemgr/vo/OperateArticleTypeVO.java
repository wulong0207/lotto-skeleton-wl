package com.hhly.skeleton.cms.operatemgr.vo;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.vo.PageVO;

import static com.hhly.skeleton.base.valid.GroupValue.ADD;
import static com.hhly.skeleton.base.valid.GroupValue.UPD;

@SuppressWarnings("serial")
public class OperateArticleTypeVO extends PageVO {
	/** 自增长主键ID */
	@Group({ UPD })
	@NotNull
	private Long id;

	/** 栏目编号 */
	// @JsonIgnore
	private String typeCode;

	/** 栏目名称 */
	@Group({ ADD, UPD })
	@NotNull(msg = "栏目名称")
	private String typeFullName;

	/** 栏目简称 */
	@Group({ ADD, UPD })
	@NotNull(msg = "栏目简称")
	private String typeShortName;

	/** -1：顶级菜单；关联OPERATE_ARTICLE表的主键ID */
	@Group({ ADD, UPD })
	@NotNull(msg = "上级栏目")
	private Long typeParent;

	/** 1：一级菜单；2：二级菜单； */
	@Group({ ADD, UPD })
	@NotNull(msg = "菜单等级")
	private Byte typeLevel;

	/** 前端使用状态:0：隐藏；1：显示； */
	@Group({ ADD, UPD })
	@NotNull(msg = "是否显示")
	private Byte status;

	/** 排序ID */
	private Short orderId;

	/** 栏目标识符 */
	@Group({ ADD, UPD })
	@NotNull(msg = "栏目标识符")
	private String identifiers;

	/** 前端使用状态:0：隐藏；1：显示； */
	@Group({ ADD, UPD })
	@NotNull(msg = "是否虚拟栏目")
	private Byte virtual;
	
	@Group({ ADD, UPD })
	@NotNull(msg = "是否RSS提交")
	private Byte rstatus;

	/** 栏目描述 */
	private String typeDesc;

	/**
	 * 排除的id，用于sql中作 != excludedId
	 */
	private Long excludedId;

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

	public Long getExcludedId() {
		return excludedId;
	}

	public void setExcludedId(Long excludedId) {
		this.excludedId = excludedId;
	}

	public Byte getRstatus() {
		return rstatus;
	}

	public void setRstatus(Byte rstatus) {
		this.rstatus = rstatus;
	}
	
}
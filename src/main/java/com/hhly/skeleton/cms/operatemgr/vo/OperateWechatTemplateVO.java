package com.hhly.skeleton.cms.operatemgr.vo;

import static com.hhly.skeleton.base.valid.GroupValue.UPD;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.vo.BaseVO;

@SuppressWarnings("serial")
public class OperateWechatTemplateVO  extends BaseVO {
    
	@Group({UPD})
	@NotNull
	private Integer id;

	private String typeName;
	
	private Integer status = 1;
	
	private String headerColor;
	
	private String footerColor;
	
	private String title;
	
	private String color;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getHeaderColor() {
		return headerColor;
	}

	public void setHeaderColor(String headerColor) {
		this.headerColor = headerColor;
	}

	public String getFooterColor() {
		return footerColor;
	}

	public void setFooterColor(String footerColor) {
		this.footerColor = footerColor;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
    
}
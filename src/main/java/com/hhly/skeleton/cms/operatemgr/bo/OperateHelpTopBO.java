package com.hhly.skeleton.cms.operatemgr.bo;

import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class OperateHelpTopBO extends BaseBO{
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 栏目ID
     */
    private Long typeId;

    /**
     * 帮助ID
     */
    private Long helpId;

    /**
     * 置顶标题
     */
    private String title;

    /**
     * 上线时间
     */
    private Date uptime;

    /**
     * 下线时间
     */
    private Date downtime;

    /**
     * 是否置顶:0否;1是
     */
    private Byte isTop;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public Long getHelpId() {
		return helpId;
	}

	public void setHelpId(Long helpId) {
		this.helpId = helpId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getUptime() {
		return uptime;
	}

	public void setUptime(Date uptime) {
		this.uptime = uptime;
	}

	public Date getDowntime() {
		return downtime;
	}

	public void setDowntime(Date downtime) {
		this.downtime = downtime;
	}

	public Byte getIsTop() {
		return isTop;
	}

	public void setIsTop(Byte isTop) {
		this.isTop = isTop;
	}
}
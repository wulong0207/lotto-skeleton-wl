package com.hhly.skeleton.cms.report.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * 
* @Description:	渠道列表 
* @author HouXiangBao289
* @date 2017年9月19日 下午6:13:50 
* @version V1.0.0
 */
@SuppressWarnings("serial")
public class ChannelBO extends BaseBO{
	private String id;
	private String text;
	private String pid;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}

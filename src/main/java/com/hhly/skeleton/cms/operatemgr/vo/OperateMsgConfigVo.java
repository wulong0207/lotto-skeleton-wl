package com.hhly.skeleton.cms.operatemgr.vo;

import com.hhly.skeleton.base.vo.BaseVO;

@SuppressWarnings("serial")
public class OperateMsgConfigVo extends BaseVO {

	private Integer templateId;
	private Integer mob;
	private Integer site;
	private Integer app;
	private Integer wechat;
	public Integer getTemplateId() {
		return templateId;
	}
	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}
	public Integer getMob() {
		return mob;
	}
	public void setMob(Integer mob) {
		this.mob = mob;
	}
	public Integer getSite() {
		return site;
	}
	public void setSite(Integer site) {
		this.site = site;
	}
	public Integer getApp() {
		return app;
	}
	public void setApp(Integer app) {
		this.app = app;
	}
	public Integer getWechat() {
		return wechat;
	}
	public void setWechat(Integer wechat) {
		this.wechat = wechat;
	}
	
}

package com.hhly.skeleton.cms.operatemgr.vo;

import java.util.List;

import com.hhly.skeleton.base.vo.BaseVO;

@SuppressWarnings("serial")
public class OperateMsgUserConfigVo extends BaseVO {

	private Integer userId;
	private Integer msgMob;
	private Integer msgSite;
	private Integer msgApp;
	private Integer msgWechat;
	
	private String mobNotDisturb;
	private String appNotDisturb;
	
	private List<OperateMsgConfigVo> list;
	private List<OperateMsgLotteryConfigVO> lotMsgConfigList;

	public List<OperateMsgLotteryConfigVO> getLotMsgConfigList() {
		return lotMsgConfigList;
	}

	public void setLotMsgConfigList(List<OperateMsgLotteryConfigVO> lotMsgConfigList) {
		this.lotMsgConfigList = lotMsgConfigList;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getMsgMob() {
		return msgMob;
	}

	public void setMsgMob(Integer msgMob) {
		this.msgMob = msgMob;
	}

	public Integer getMsgSite() {
		return msgSite;
	}

	public void setMsgSite(Integer msgSite) {
		this.msgSite = msgSite;
	}

	public Integer getMsgApp() {
		return msgApp;
	}

	public void setMsgApp(Integer msgApp) {
		this.msgApp = msgApp;
	}

	public Integer getMsgWechat() {
		return msgWechat;
	}

	public void setMsgWechat(Integer msgWechat) {
		this.msgWechat = msgWechat;
	}

	public String getMobNotDisturb() {
		return mobNotDisturb;
	}

	public void setMobNotDisturb(String mobNotDisturb) {
		this.mobNotDisturb = mobNotDisturb;
	}

	public String getAppNotDisturb() {
		return appNotDisturb;
	}

	public void setAppNotDisturb(String appNotDisturb) {
		this.appNotDisturb = appNotDisturb;
	}

	public List<OperateMsgConfigVo> getList() {
		return list;
	}

	public void setList(List<OperateMsgConfigVo> list) {
		this.list = list;
	}

}

package com.hhly.skeleton.lotto.base.operate.bo;

import com.hhly.skeleton.base.bo.BaseBO;
/***
 * @desc 
 * @author lidecheng
 * @date 2017年5月3日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class OperateLottSoftwareVersionBO extends BaseBO{
	/**安装包文件下载地址*/
	private String downloadUrl ;
	/**安装包文件大小*/
	private String fileSize ;
	/**升级类型 0:一般升级； 1：强制升级*/
	private Short upgradeType ;
	/**当前版本号*/
	private Integer versionCode ;
	/**当前版本升级内容描述*/
	private String versionDesc ;
	/**	当前版本名称*/
	private String versionName ;
	/**	移动端访问url (H5入口)*/
	private String wapAppUrl;
	
    /**
     * APP功能隐藏板块，APP前端将不会展示
     */
    private String hide;
	/**
	 * APP功能购彩板块的隐藏区域
	 */
    private String hideArea;
	
	public String getWapAppUrl() {
		return wapAppUrl;
	}
	public void setWapAppUrl(String wapAppUrl) {
		this.wapAppUrl = wapAppUrl;
	}
	public String getDownloadUrl() {
		return downloadUrl;
	}
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	public String getFileSize() {
		return fileSize;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	public Short getUpgradeType() {
		return upgradeType;
	}
	public void setUpgradeType(Short upgradeType) {
		this.upgradeType = upgradeType;
	}
	public Integer getVersionCode() {
		return versionCode;
	}
	public void setVersionCode(Integer versionCode) {
		this.versionCode = versionCode;
	}
	public String getVersionDesc() {
		return versionDesc;
	}
	public void setVersionDesc(String versionDesc) {
		this.versionDesc = versionDesc;
	}
	public String getVersionName() {
		return versionName;
	}
	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}
	public String getHide() {
		return hide;
	}
	public void setHide(String hide) {
		this.hide = hide;
	}

	public String getHideArea() {
		return hideArea;
	}

	public void setHideArea(String hideArea) {
		this.hideArea = hideArea;
	}
}

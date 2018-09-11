package com.hhly.skeleton.cms.customermgr.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ReplaceAttribute;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.model.DicDataEnum;
@SuppressWarnings("serial")
public class LottoCustomerExcelBO extends BaseBO{
	
	@ExcelHeader("序号")
	private String id;
	
    @ExcelHeader("账户")
    private String accountName;
    
    @ExcelHeader("手机号")
    private String cusMobile;
    
    @ExcelHeader("昵称")
    private String nickName;

    @ExcelHeader("姓名")
    private String actualName;
    @ExcelHeader("省份证")
    private String idNum;

    @ExcelHeader("渠道")
    private String channelId;
    
    @ExcelHeader("平台")
    @ReplaceAttribute(DicDataEnum.OPERATE_MARKET_CHANNEL_TPF)
    private String platform;
    
    @ExcelHeader("注册时间")
    private String registTime;
    
    @ExcelHeader("最后登录时间")
    private String lastLoginTime;
    
    @ExcelHeader("账户状态")
    @ReplaceAttribute(DicDataEnum.CUST_USER_STATUS)
    private String accountStatus;
    
    @ExcelHeader("修改时间")
    private String updateTime;
    
    @ExcelHeader("创建时间")
    private String createTime;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getCusMobile() {
		return cusMobile;
	}
	public void setCusMobile(String cusMobile) {
		this.cusMobile = cusMobile;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getActualName() {
		return actualName;
	}
	public void setActualName(String actualName) {
		this.actualName = actualName;
	}
	public String getIdNum() {
		return idNum;
	}
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	
	
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getRegistTime() {
		return registTime;
	}
	public void setRegistTime(String registTime) {
		this.registTime = registTime;
	}
	public String getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
}
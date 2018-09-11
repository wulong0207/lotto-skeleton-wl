package com.hhly.skeleton.cms.ticketmgr.vo;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.LenRange;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;

import static com.hhly.skeleton.base.valid.GroupValue.ADD;
import static com.hhly.skeleton.base.valid.GroupValue.UPD;
/**
 * 
 * @desc 出票渠道
 * @author jiangwei
 * @date 2017-2-5
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class TicketChannelVO extends PageVO {
    
    @Group({UPD})
    @NotNull(msg="主键ID")
    private Integer id;
    
    @Group({ADD,UPD})
    @NotNull(msg="渠道ID")
    @LenRange(min=1,max=20,msg="渠道ID")
    private String ticketChannelId;

    @Group({ADD,UPD})
    @NotNull(msg="出票商名称")
    @LenRange(min=1,max=20,msg="出票商名称")
    private String drawerName;
    
    @Group({ADD,UPD})
    @NotNull(msg="出票账户")
    @LenRange(min=1,max=128,msg="出票账户")
    private String drawerAccount;
    
    @Group({ADD,UPD})
    @NotNull(msg="账户密码")
    @LenRange(min=1,max=128,msg="账户密码")
    private String accountPassword;
    
    @Group({ADD,UPD})
    @NotNull(msg="认证码")
    @LenRange(min=1,max=100,msg="认证码")
    private String authCode;
    
    @Group({ADD,UPD})
    @NotNull(msg="送票地址")
    @LenRange(min=1,max=100,msg="送票地址")
    private String sendUrl;
    
    @Group({ADD,UPD})
    @NotNull(msg="查询地址")
    @LenRange(min=1,max=100,msg="查询地址")
    private String searchUrl;
    
    @Group({ADD,UPD})
    @LenRange(min=1,max=100,msg="查询地址备用")
    private String searchUrlSpare;
    
    @Group({ADD,UPD})
    @NotNull(msg="通知地址")
    @LenRange(min=1,max=100,msg="通知地址")
    private String noticeUrl;
    
    @Group({ADD,UPD})
    @NotNull(msg="账户余额")
    private Integer accountBalance;

    private String modifyBy;

    private Date updateTime;

    private Date createTime;
    
    @Group({ADD,UPD})
    @LenRange(min=1,max=100,msg="备注")
    private String remark;
    
    private String createBy;
    
    @Group({ADD,UPD})
    @NotNull
    private Short channelStatus;
    
    @Group({ADD,UPD})
    @NotNull
    private Short lotteryStatus;
    
    @Group({ADD,UPD})
    @NotNull
    private Short ticketStatus;
    
    
    public Short getChannelStatus() {
		return channelStatus;
	}

	public void setChannelStatus(Short channelStatus) {
		this.channelStatus = channelStatus;
	}

	public Short getLotteryStatus() {
		return lotteryStatus;
	}

	public void setLotteryStatus(Short lotteryStatus) {
		this.lotteryStatus = lotteryStatus;
	}

	public Short getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(Short ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTicketChannelId() {
        return ticketChannelId;
    }

    public void setTicketChannelId(String ticketChannelId) {
        this.ticketChannelId = ticketChannelId;
    }

    public String getDrawerName() {
        return drawerName;
    }

    public void setDrawerName(String drawerName) {
        this.drawerName = drawerName;
    }

    public String getDrawerAccount() {
        return drawerAccount;
    }

    public void setDrawerAccount(String drawerAccount) {
        this.drawerAccount = drawerAccount;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getSendUrl() {
        return sendUrl;
    }

    public void setSendUrl(String sendUrl) {
        this.sendUrl = sendUrl;
    }

    public String getSearchUrl() {
        return searchUrl;
    }

    public void setSearchUrl(String searchUrl) {
        this.searchUrl = searchUrl;
    }

    public String getSearchUrlSpare() {
        return searchUrlSpare;
    }

    public void setSearchUrlSpare(String searchUrlSpare) {
        this.searchUrlSpare = searchUrlSpare;
    }

    public String getNoticeUrl() {
        return noticeUrl;
    }

    public void setNoticeUrl(String noticeUrl) {
        this.noticeUrl = noticeUrl;
    }

    public Integer getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Integer accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    
}
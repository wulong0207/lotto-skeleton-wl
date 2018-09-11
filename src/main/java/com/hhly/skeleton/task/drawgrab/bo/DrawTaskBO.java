package com.hhly.skeleton.task.drawgrab.bo;

/**
 * @desc 开奖定时器实体类
 * @author lidecheng
 * @date 2017年1月19日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class DrawTaskBO {
    /**
     * 出票商渠道ID
     */
    private String ticketChannelId;
    /**
     * 查询地址
     */
    private String searchUrl;
    /**
     * 备用地址
     */
    private String searchUrlSpare;

    /**
     * 出票商名称
     */
    private String drawName;
    
    /**
	 * 账号名
	 */
	private String  drawerAccount;
	/**
	 * 密码
	 */
	private String accountPassword;

    // 是否抓取成功开奖号码
    private boolean drawStatus;
    // 期号
    private String issue;
    // 开奖号码
    private String drawCode;
    //出票商是否能抓取
    private boolean canGrab = true;
    
    
    
    public boolean isDrawStatus() {
        return drawStatus;
    }

    public void setDrawStatus(boolean drawStatus) {
        this.drawStatus = drawStatus;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getDrawCode() {
        return drawCode;
    }

    public void setDrawCode(String drawCode) {
        this.drawCode = drawCode;
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

    public String getDrawName() {
        return drawName;
    }

    public void setDrawName(String drawName) {
        this.drawName = drawName;
    }

    public String getTicketChannelId() {
        return ticketChannelId;
    }

    public void setTicketChannelId(String ticketChannelId) {
        this.ticketChannelId = ticketChannelId;
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

	@Override
	public String toString() {
		return "DrawTaskBO [ticketChannelId=" + ticketChannelId + ", searchUrl=" + searchUrl + ", searchUrlSpare="
				+ searchUrlSpare + ", drawName=" + drawName + ", drawerAccount=" + drawerAccount + ", accountPassword="
				+ accountPassword + ", drawStatus=" + drawStatus + ", issue=" + issue + ", drawCode=" + drawCode + "]";
	}

	/**
	 * @return the canGrab
	 */
	public boolean isCanGrab() {
		return canGrab;
	}

	/**
	 * @param canGrab the canGrab to set
	 */
	public void setCanGrab(boolean canGrab) {
		this.canGrab = canGrab;
	}
    
    
}

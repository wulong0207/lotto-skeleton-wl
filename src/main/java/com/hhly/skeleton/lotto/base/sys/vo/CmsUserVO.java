package com.hhly.skeleton.lotto.base.sys.vo;

import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;

/**
 * Created by lgs on 2016/11/7.
 * cms用户管理
 */
public class CmsUserVO extends PageVO{
    private static final long serialVersionUID = -533416361147238540L;
	private Integer userId;
    private String userName;
    private String userMobile;
    private Integer depart;
    private Integer userStatus;
    private String userPassword;
    private String userEmail;
    private String userRealName;
    private Integer cmsRoleId;
    private Integer roleId;
    private String cmsRoleName;
    private Date lastLoginTime;
    private Date modifyTime;
    private String modifyBy;
    private String createBy;
    private Date updateTime;
    private Date createTime;
    private String remark;
    private String userCname;
    private String headUrl;
    
    private Integer monthLoginCount;
    private String lastLoginIp;
    private Date thisLoginTime;
    private String thisLoginIP;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public Integer getDepart() {
        return depart;
    }

    public void setDepart(Integer depart) {
        this.depart = depart;
    }


    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Integer getCmsRoleId() {
        return cmsRoleId;
    }

    public void setCmsRoleId(Integer cmsRoleId) {
        this.cmsRoleId = cmsRoleId;
    }

    public String getCmsRoleName() {
        return cmsRoleName;
    }

    public void setCmsRoleName(String cmsRoleName) {
        this.cmsRoleName = cmsRoleName;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
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

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

	public String getUserCname() {
		return userCname;
	}

	public void setUserCname(String userCname) {
		this.userCname = userCname;
	}

	public String getHeadUrl() {
		return headUrl;
	}

	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}

	public Integer getMonthLoginCount() {
		return monthLoginCount;
	}

	public void setMonthLoginCount(Integer monthLoginCount) {
		this.monthLoginCount = monthLoginCount;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public Date getThisLoginTime() {
		return thisLoginTime;
	}

	public void setThisLoginTime(Date thisLoginTime) {
		this.thisLoginTime = thisLoginTime;
	}

	public String getThisLoginIP() {
		return thisLoginIP;
	}

	public void setThisLoginIP(String thisLoginIP) {
		this.thisLoginIP = thisLoginIP;
	}
	
}

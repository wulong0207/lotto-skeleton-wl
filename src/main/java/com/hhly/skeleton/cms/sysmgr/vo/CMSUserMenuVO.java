package com.hhly.skeleton.cms.sysmgr.vo;

import java.util.Date;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * Created by lgs on 2016/11/22.
 */
public class CMSUserMenuVO extends BaseVO{
    private static final long serialVersionUID = 2059104021503677008L;

    private Integer userMenuId;

    private Integer userId;

    private Integer menuId;

    private String userAuth;

    private Date updateTime;

    private Date createTime;


    public Integer getUserMenuId() {
        return userMenuId;
    }

    public void setUserMenuId(Integer userMenuId) {
        this.userMenuId = userMenuId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(String userAuth) {
        this.userAuth = userAuth;
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
}

package com.hhly.skeleton.cms.sysmgr.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * Created by lgs on 2016/11/24.
 */
public class CMSUserMenuBO extends BaseBO{
    private static final long serialVersionUID = -4664865794466456049L;
    private Integer userMenuId;

    private Integer userId;

    private Integer menuId;

    private String userAuth;

    private String url;

    private String menuButton;

    private Integer parentMenuId;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMenuButton() {
        return menuButton;
    }

    public void setMenuButton(String menuButton) {
        this.menuButton = menuButton;
    }

    public Integer getParentMenuId() {
        return parentMenuId;
    }

    public void setParentMenuId(Integer parentMenuId) {
        this.parentMenuId = parentMenuId;
    }
}

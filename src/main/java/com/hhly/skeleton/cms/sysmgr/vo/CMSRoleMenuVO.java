package com.hhly.skeleton.cms.sysmgr.vo;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * Created by lgs on 2016/11/17.
 */
public class CMSRoleMenuVO extends BaseVO{
    private static final long serialVersionUID = -1712685821247085498L;

    private Integer roleMenuId;

    private Integer roleId;

    private Integer menuId;

    private String menuButton;

    public Integer getRoleMenuId() {
        return roleMenuId;
    }

    public void setRoleMenuId(Integer roleMenuId) {
        this.roleMenuId = roleMenuId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuButton() {
        return menuButton;
    }

    public void setMenuButton(String menuButton) {
        this.menuButton = menuButton;
    }
}

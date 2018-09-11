package com.hhly.skeleton.cms.sysmgr.bo;

import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * Created by lgs on 2016/11/17.
 * 角色菜单BO
 */
public class CMSRoleMenuBO extends BaseBO{
    private static final long serialVersionUID = -907704592831560638L;

    private Integer menuId;
    private String menuTitle;
    private Integer parentMenuId;
    private String menuButton;
    private Integer roleMenuId;
    private String authority;
    private Integer roleId;
    private String checked;
    private List<ButtonsBO> buttons;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuTitle() {
        return menuTitle;
    }

    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle;
    }

    public Integer getParentMenuId() {
        return parentMenuId;
    }

    public void setParentMenuId(Integer parentMenuId) {
        this.parentMenuId = parentMenuId;
    }

    public String getMenuButton() {
        return menuButton;
    }

    public void setMenuButton(String menuButton) {
        this.menuButton = menuButton;
    }

    public Integer getRoleMenuId() {
        return roleMenuId;
    }

    public void setRoleMenuId(Integer roleMenuId) {
        this.roleMenuId = roleMenuId;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }

    public List<ButtonsBO> getButtons() {
        return buttons;
    }

    public void setButtons(List<ButtonsBO> buttons) {
        this.buttons = buttons;
    }

}

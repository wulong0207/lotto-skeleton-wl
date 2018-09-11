package com.hhly.skeleton.cms.sysmgr.vo;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.hhly.skeleton.base.vo.BaseVO;
import com.hhly.skeleton.cms.sysmgr.bo.ButtonsBO;

/**
 * Created by lgs on 2016/11/17.
 */
@SuppressWarnings("serial")
public class CMSRoleMenuTreeVO extends BaseVO{

    private Integer menuId;
    private String menuTitle;
    private Integer parentMenuId;
    private String menuUrl;
    private String menuButton;
    private String menuDesc;

    @JSONField(name="_level")
    private Integer menuLevel;
    private Integer orderId;
    private String checked;
    private List<ButtonsBO> buttons;
    private List<CMSRoleMenuTreeVO> children;

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

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getMenuButton() {
        return menuButton;
    }

    public void setMenuButton(String menuButton) {
        this.menuButton = menuButton;
    }

    public String getMenuDesc() {
        return menuDesc;
    }

    public void setMenuDesc(String menuDesc) {
        this.menuDesc = menuDesc;
    }

    public Integer getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(Integer menuLevel) {
        this.menuLevel = menuLevel;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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

    public List<CMSRoleMenuTreeVO> getChildren() {
        return children;
    }

    public void setChildren(List<CMSRoleMenuTreeVO> children) {
        this.children = children;
    }
}

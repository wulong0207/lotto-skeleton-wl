package com.hhly.skeleton.cms.sysmgr.vo;

import com.hhly.skeleton.base.vo.BaseVO;
import com.hhly.skeleton.cms.sysmgr.bo.CMSMenuBO;

/**
 * Created by lgs on 2016/11/7.
 */
public class CMSMenuVO extends BaseVO{
    private static final long serialVersionUID = -578725955683277815L;
	private Integer menuId;
    private String menuTitle;
    private Integer parentMenuId;
    private String menuUrl;
    private String menuButton;
    private String menuDesc;
    private Integer menuLevel;
    private Integer orderId;


    public CMSMenuVO() {
    }

    public CMSMenuVO(CMSMenuBO bo) {
        this.menuId = bo.getMenuId();
        this.menuTitle = bo.getMenuTitle();
        this.parentMenuId = bo.getParentMenuId();
        this.menuUrl = bo.getMenuUrl();
        this.menuButton = bo.getMenuButton();
        this.menuDesc = bo.getMenuDesc();
        this.menuLevel = bo.getMenuLevel();
        this.orderId = bo.getOrderId();
    }

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
}

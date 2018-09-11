package com.hhly.skeleton.cms.sysmgr.vo;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.hhly.skeleton.base.vo.BaseVO;

/**
 * Created by lgs on 2016/11/14.
 * 菜单树结构
 */
public class CMSMenuTreeVO extends BaseVO{

    private static final long serialVersionUID = 3128580485017100149L;
    /**
     * menuId : 1
     * menuTitle : 系统设置
     * parentMenuId : 0
     * menuUrl : null
     * menuButton : null
     * menuDesc : null
     * menuLevel : 1
     * orderId : 0
     * children : [{"menuId":2,"menuTitle":"菜单管理","parentMenuId":1,"menuUrl":"sysmgr/menu","menuButton":"新增,修改,删除,查询,保存","menuDesc":"菜单管理","menuLevel":2,"orderId":1,"expanded":true,"_id":2,"_uid":2,"_pid":1,"_level":1},{"menuId":3,"menuTitle":"用户管理","parentMenuId":1,"menuUrl":"sysmgr/user","menuButton":"新增,修改,删除,查询,保存","menuDesc":"用户管理","menuLevel":2,"orderId":2,"expanded":true,"_id":3,"_uid":3,"_pid":1,"_level":1},{"menuId":4,"menuTitle":"角色管理","parentMenuId":1,"menuUrl":"sysmgr/role","menuButton":"新增,修改,删除,查询,保存","menuDesc":"角色管理","menuLevel":2,"orderId":3,"expanded":true,"_id":4,"_uid":4,"_pid":1,"_level":1}]
     * expanded : true
     * _id : 1
     * _uid : 1
     * _pid : -1
     * _level : 0
     */

    private Integer menuId;
    private String menuTitle;
    private Integer parentMenuId;
    private String menuUrl;
    private String menuButton;
    private String menuDesc;

    @JSONField(name="_level")
    private Integer menuLevel;
    private Integer orderId;

    private List<CMSMenuTreeVO> children;


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

    public List<CMSMenuTreeVO> getChildren() {
        return children;
    }

    public void setChildren(List<CMSMenuTreeVO> children) {
        this.children = children;
    }
}

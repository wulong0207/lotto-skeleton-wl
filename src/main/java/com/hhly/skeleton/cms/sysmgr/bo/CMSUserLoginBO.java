package com.hhly.skeleton.cms.sysmgr.bo;

import java.util.List;

/**
 * Created by lgs on 2016/11/24.
 */
public class CMSUserLoginBO extends CMSUserBO {
    private static final long serialVersionUID = 1605179447960730981L;

    private List<CMSUserMenuBO> userMenus;

    public List<CMSUserMenuBO> getUserMenus() {
        return userMenus;
    }

    public void setUserMenus(List<CMSUserMenuBO> userMenus) {
        this.userMenus = userMenus;
    }
}

package com.hhly.skeleton.cms.sysmgr.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * Created by lgs on 2016/11/17.
 * 角色管理按钮
 */
public class ButtonsBO extends BaseBO{

    private static final long serialVersionUID = -6041543315067786042L;

    private String name;
    private String button;
    private String checked;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }
}

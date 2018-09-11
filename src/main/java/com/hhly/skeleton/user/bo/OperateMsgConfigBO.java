package com.hhly.skeleton.user.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.math.BigDecimal;

public class OperateMsgConfigBO extends BaseBO {
    /**
     * null
     */
    private Integer id;

    /**
     * 类型ID
     */
    private BigDecimal templateid;

    /**
     * 用户ID
     */
    private BigDecimal userId;

    /**
     * 手机短信:0不接收;1接收
     */
    private Short mob;

    /**
     * 站内短信:0不接收;1接收
     */
    private Short site;

    /**
     * APP推送:0不接收;1接收
     */
    private Short app;

    /**
     * 微信推送:0不接收;1接收
     */
    private Short wechat;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getTemplateid() {
        return templateid;
    }

    public void setTemplateid(BigDecimal templateid) {
        this.templateid = templateid;
    }

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public Short getMob() {
        return mob;
    }

    public void setMob(Short mob) {
        this.mob = mob;
    }

    public Short getSite() {
        return site;
    }

    public void setSite(Short site) {
        this.site = site;
    }

    public Short getApp() {
        return app;
    }

    public void setApp(Short app) {
        this.app = app;
    }

    public Short getWechat() {
        return wechat;
    }

    public void setWechat(Short wechat) {
        this.wechat = wechat;
    }
}
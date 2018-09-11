package com.hhly.skeleton.user.vo;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * 消息中心二级开关，开奖、购彩
 */
public class OperateMsgConfigVO extends BaseVO{
    /**
     * null
     */
    private Integer id;

    /**
     * 类型ID
     */
    private Integer templateId;

    /**
     * 用户ID
     */
    private Integer userId;

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
    
    private String token;
    
    public String getToken () {
        return token;
    }
    
    public void setToken (String token) {
        this.token = token;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer gettemplateId() {
        return templateId;
    }

    public void settemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
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
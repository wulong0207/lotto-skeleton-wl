package com.hhly.skeleton.user.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @author zhouyang
 * @version 1.0
 * @desc 用户消息配置类
 * @date 2017/11/8
 * @company 益彩网络科技公司
 */
public class UserMsgConfigBO extends BaseBO {

    private Integer id;

    /**
     * 模板id
     */
    private Integer templateId;

    /**
     * 消息类型子分类名称
     */
    private String templateName;

    /**
     * 节点编码
     */
    private String typeNode;

    /**
     * 账户id
     */
    private Integer userId;

    /**
     * 手机短信：0.不接收，1.接收
     */
    private Short mobile;

    /**
     * 站内消息：0.不接收，1.接收
     */
    private Short site;

    /**
     * 手机app：0.不接收，1.接收
     */
    private Short app;

    /**
     * 微信：0.不接收，1.接收
     */
    private Short wechat;

    /**
     * 开关状态
     */
    private Short switchStatus;

    /**
     * 消息类型
     */
    private Short msgType;

    /**
     * 消息类型名称
     */
    private String msgName;

    /**
     * 开关名称
     */
    private String typeName;

    /**
     * 彩种编号
     */
    private Integer lotteryCode;

    /**
     * 彩种名称
     */
    private String lotteryName;

    /**
     * 彩种描述
     */
    private String lotteryDesc;

    /**
     * 开关类型
     */
    private Integer switchType;

    /**
     * 模型描述
     */
    private String typeDesc;

    /**
     * 是否可以设置
     */
    private Short enable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getTypeNode() {
        return typeNode;
    }

    public void setTypeNode(String typeNode) {
        this.typeNode = typeNode;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Short getMobile() {
        return mobile;
    }

    public void setMobile(Short mobile) {
        this.mobile = mobile;
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

    public Short getSwitchStatus() {
        return switchStatus;
    }

    public void setSwitchStatus(Short switchStatus) {
        this.switchStatus = switchStatus;
    }

    public Short getMsgType() {
        return msgType;
    }

    public void setMsgType(Short msgType) {
        this.msgType = msgType;
    }

    public String getMsgName() {
        return msgName;
    }

    public void setMsgName(String msgName) {
        this.msgName = msgName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(Integer lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public String getLotteryName() {
        return lotteryName;
    }

    public void setLotteryName(String lotteryName) {
        this.lotteryName = lotteryName;
    }

    public String getLotteryDesc() {
        return lotteryDesc;
    }

    public void setLotteryDesc(String lotteryDesc) {
        this.lotteryDesc = lotteryDesc;
    }

    public Integer getSwitchType() {
        return switchType;
    }

    public void setSwitchType(Integer switchType) {
        this.switchType = switchType;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public Short getEnable() {
        return enable;
    }

    public void setEnable(Short enable) {
        this.enable = enable;
    }
}

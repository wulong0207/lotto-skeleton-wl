package com.hhly.skeleton.user.vo;

import com.hhly.skeleton.base.vo.BaseVO;

import java.util.List;

/**
 * @author zhouyang
 * @version 1.0
 * @desc 消息开关设置传参类
 * @date 2017/11/14
 * @company 益彩网络科技公司
 */
public class UserMsgConfigVO extends BaseVO {

    /**
     * 平台
     */
    private Short platform;

    /**
     * 渠道id
     */
    private String channelId;

    /**
     * 主键id
     */
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
     * 缓存key
     */
    private String token;

    /**
     * 账户id
     */
    private Integer userId;

    /**
     * 开关状态：0.不接收，1.接收
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
     * 类型
     */
    private Short type;

    /**
     * 集合
     */
    private List<UserMsgConfigVO> list;


    public Short getPlatform() {
        return platform;
    }

    public void setPlatform(Short platform) {
        this.platform = platform;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public List<UserMsgConfigVO> getList() {
        return list;
    }

    public void setList(List<UserMsgConfigVO> list) {
        this.list = list;
    }
}

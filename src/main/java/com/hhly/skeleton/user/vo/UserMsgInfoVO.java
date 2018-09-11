package com.hhly.skeleton.user.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.vo.PageVO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author zhouyang
 * @version 1.0
 * @desc 消息详情实体类
 * @date 2017/11/7
 * @company 益彩网络科技公司
 */
public class UserMsgInfoVO extends PageVO {

    /**
     * 平台id
     */
    private Short platform;

    /**
     * 渠道id
     */
    private String channelId;

    /**
     * 主键
     */
    private Integer id;

    /**
     * id拼接成的字符串
     */
    private String ids;

    /**
     * 用户唯一标识
     */
    private String token;

    /**
     * 购彩会员ID
     */
    private Integer userId;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 帐户名
     */
    private String accountName;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 消息分类字段:1：系统消息；2：账户提醒；3：活动优惠；4：交易信息；5：其它
     */
    private Short msgType;

    /**
     * 模板id
     */
    private Integer templateId;

    /**
     * 模板名
     */
    private String templateName;

    /**
     * 发送方式
     */
    private String sendType;

    /**
     * 信息状态:0：发送失败，1：发送成功，3：已阅读
     */
    private Short status;

    /**
     * 发送失败原因
     */
    private String sendError;

    /**
     * 信息标题
     */
    private String msgTitle;

    /**
     * 信息内容
     */
    private String msgContent;

    /**
     * 发送批次号
     */
    private String msgBatch;

    /**
     * 发送时间
     */
    private Date sendTime;

    /**
     * 阅读时间
     */
    private Date readTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 待发送时间
     */
    private Date preSendTime;

    /**
     * 备注
     */
    private String msgDesc;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 节点类型
     */
    private String typeNode;

    /**
     * 子节点开关类型：1.开奖号码，2,.购彩提醒
     */
    private Short type;

    /**
     * 批次号list集合
     */
    private List<String> batchList;

    /**
     * 消息类型list集合
     */
    private List<Integer> msgTypeList = new ArrayList<>();


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

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Short getMsgType() {
        return msgType;
    }

    public void setMsgType(Short msgType) {
        this.msgType = msgType;
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

    public String getSendType() {
        return sendType;
    }

    public void setSendType(String sendType) {
        this.sendType = sendType;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getSendError() {
        return sendError;
    }

    public void setSendError(String sendError) {
        this.sendError = sendError;
    }

    public String getMsgTitle() {
        return msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public String getMsgBatch() {
        return msgBatch;
    }

    public void setMsgBatch(String msgBatch) {
        this.msgBatch = msgBatch;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getReadTime() {
        return readTime;
    }

    public void setReadTime(Date readTime) {
        this.readTime = readTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPreSendTime() {
        return preSendTime;
    }

    public void setPreSendTime(Date preSendTime) {
        this.preSendTime = preSendTime;
    }

    public String getMsgDesc() {
        return msgDesc;
    }

    public void setMsgDesc(String msgDesc) {
        this.msgDesc = msgDesc;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getTypeNode() {
        return typeNode;
    }

    public void setTypeNode(String typeNode) {
        this.typeNode = typeNode;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public List<String> getBatchList() {
        return batchList;
    }

    public void setBatchList(List<String> batchList) {
        this.batchList = batchList;
    }

    public List<Integer> getMsgTypeList() {
        return msgTypeList;
    }

    public void setMsgTypeList(List<Integer> msgTypeList) {
        this.msgTypeList = msgTypeList;
    }
}

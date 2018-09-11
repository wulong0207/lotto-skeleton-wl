package com.hhly.skeleton.user.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.PagingBO;

import java.util.Date;

/**
 * @author zhouyang
 * @version 1.0
 * @desc 消息详情实体类
 * @date 2017/11/7
 * @company 益彩网络科技公司
 */
public class UserMsgInfoBO extends PagingBO {

    /**
     * 主键
     */
    private Integer id;

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
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date sendTime;

    /**
     * 阅读时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date readTime;

    /**
     * 备注
     */
    private String msgDesc;

    /**
     * 创建时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;

    /**
     * 待发送时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date preSendTime;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 购彩会员ID
     */
    private Integer userId;
    
    /**
     * 专家用户id
     */
    private Integer expertUserId;

    /**
     * 消息分类字段:1：系统消息；2：账户提醒；3：活动优惠；4：交易信息；5：其它
     */
    private Short msgType;

    /**
     * 消息分类字段名
     */
    private String msgName;

    /**
     * 消息类型未阅读消息数量
     */
    private Integer msgCount;

    /**
     * 彩种编码
     */
    private Integer lotteryCode;

    /**
     * 彩种名称
     */
    private String lotteryName;

    /**
     *
     */
    private String lotteryKey;

    /**
     * 投注金额
     */
    private String betMoney;

    /**
     * 中奖金额
     */
    private String winMoney;

    /**
     * 购买类型
     */
    private Short buyType;

    /**
     * 中奖时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date betTime;

    /**
     * 订单详情链接
     */
    private String orderCode;
    
    /**
     * 抄单订单ID
     */
    private String orderId;

    /**
     * 彩种期次
     */
    private String issueCode;

    /**
     * 节点
     */
    private String typeNode;

    /**
     * 活动url
     */
    private String activityUrl;
    
    /**
     * 跳转界面
     */
    private Integer toBuyLotteryCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getMsgDesc() {
        return msgDesc;
    }

    public void setMsgDesc(String msgDesc) {
        this.msgDesc = msgDesc;
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

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
    public Integer getExpertUserId() {
		return expertUserId;
	}

	public void setExpertUserId(Integer expertUserId) {
		this.expertUserId = expertUserId;
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

    public Integer getMsgCount() {
        return msgCount;
    }

    public void setMsgCount(Integer msgCount) {
        this.msgCount = msgCount;
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

    public String getLotteryKey() {
        return lotteryKey;
    }

    public void setLotteryKey(String lotteryKey) {
        this.lotteryKey = lotteryKey;
    }

    public String getBetMoney() {
        return betMoney;
    }

    public void setBetMoney(String betMoney) {
        this.betMoney = betMoney;
    }

    public String getWinMoney() {
        return winMoney;
    }

    public void setWinMoney(String winMoney) {
        this.winMoney = winMoney;
    }

    public Short getBuyType() {
        return buyType;
    }

    public void setBuyType(Short buyType) {
        this.buyType = buyType;
    }

    public Date getBetTime() {
        return betTime;
    }

    public void setBetTime(Date betTime) {
        this.betTime = betTime;
    }
    

    public String getOrderId() {
        return orderId;
    }

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getTypeNode() {
        return typeNode;
    }

    public void setTypeNode(String typeNode) {
        this.typeNode = typeNode;
    }

    public String getActivityUrl() {
        return activityUrl;
    }

    public void setActivityUrl(String activityUrl) {
        this.activityUrl = activityUrl;
    }

    public String getIssueCode() {
        return issueCode;
    }

    public void setIssueCode(String issueCode) {
        this.issueCode = issueCode;
    }

	public Integer getToBuyLotteryCode() {
		return toBuyLotteryCode;
	}

	public void setToBuyLotteryCode(Integer toBuyLotteryCode) {
		this.toBuyLotteryCode = toBuyLotteryCode;
	}
    
}

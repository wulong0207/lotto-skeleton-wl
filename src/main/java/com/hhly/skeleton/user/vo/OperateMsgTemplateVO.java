package com.hhly.skeleton.user.vo;

import java.util.Date;

/**
 * @author chenkangning
 * @version 1.0
 * @desc 二级开关，也是消息模板
 * @date 2017.04.26
 * @company 益彩网络科技公司
 */
public class OperateMsgTemplateVO {
    /**
     * 自增长主键ID
     */
    private Integer id;
    
    /**
     * 信息类型
     */
    private String typeName;
    
    /**
     * 执行节点
     */
    private String typeNode;
    
    /**
     * 状态:0暂停;1启用
     */
    private Short status;
    
    /**
     * 手机短信:0暂停;1启用
     */
    private Short mobStatus;
    
    /**
     * 站内短信:0暂停;1启用
     */
    private Short siteStatus;
    
    /**
     * APP推送:0暂停;1启用
     */
    private Short appStatus;
    
    /**
     * 微信推送:0暂停;1启用
     */
    private Short wechatStatus;
    
    /**
     * 手机标题
     */
    private String mobTitle;
    
    /**
     * 手机内容
     */
    private String mobContent;
    
    /**
     * 站内标题
     */
    private String siteTitle;
    
    /**
     * 站内内容
     */
    private String siteContent;
    
    /**
     * APP标题
     */
    private String appTitle;
    
    /**
     * APP内容
     */
    private String appContent;
    
    /**
     * 备注
     */
    private String typeDesc;
    
    /**
     * 创建人真实姓名
     */
    private String createBy;
    
    /**
     * 修改人真实姓名
     */
    private String modifyBy;
    
    /**
     * 更新时间
     */
    private Date updateTime;
    
    /**
     * 创建时间
     */
    private Date createTime;
    
    /**
     * 微信公众号信息模板ID
     */
    private Integer wechatId;
    
    /**
     * 微信公众号标题
     */
    private String wechatTitle;
    
    /**
     * 微信公众号头部内容
     */
    private String headerCon;
    
    /**
     * 微信公众号尾部内容
     */
    private String footerCon;
    
    /**
     * 字段名称值
     */
    private String wechatCol;
    
    /**
     * 消息分类字段1：系统消息；2：账户提醒；3：活动优惠；4：交易信息；5：其它
     */
    private Short msgType;
    
    private Integer userId;
    
    public Integer getUserId () {
        return userId;
    }
    
    public void setUserId (Integer userId) {
        this.userId = userId;
    }
    
    public Integer getId () {
        return id;
    }
    
    public void setId (Integer id) {
        this.id = id;
    }
    
    public String getTypeName () {
        return typeName;
    }
    
    public void setTypeName (String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }
    
    public String getTypeNode () {
        return typeNode;
    }
    
    public void setTypeNode (String typeNode) {
        this.typeNode = typeNode == null ? null : typeNode.trim();
    }
    
    public Short getStatus () {
        return status;
    }
    
    public void setStatus (Short status) {
        this.status = status;
    }
    
    public Short getMobStatus () {
        return mobStatus;
    }
    
    public void setMobStatus (Short mobStatus) {
        this.mobStatus = mobStatus;
    }
    
    public Short getSiteStatus () {
        return siteStatus;
    }
    
    public void setSiteStatus (Short siteStatus) {
        this.siteStatus = siteStatus;
    }
    
    public Short getAppStatus () {
        return appStatus;
    }
    
    public void setAppStatus (Short appStatus) {
        this.appStatus = appStatus;
    }
    
    public Short getWechatStatus () {
        return wechatStatus;
    }
    
    public void setWechatStatus (Short wechatStatus) {
        this.wechatStatus = wechatStatus;
    }
    
    public String getMobTitle () {
        return mobTitle;
    }
    
    public void setMobTitle (String mobTitle) {
        this.mobTitle = mobTitle == null ? null : mobTitle.trim();
    }
    
    public String getMobContent () {
        return mobContent;
    }
    
    public void setMobContent (String mobContent) {
        this.mobContent = mobContent == null ? null : mobContent.trim();
    }
    
    public String getSiteTitle () {
        return siteTitle;
    }
    
    public void setSiteTitle (String siteTitle) {
        this.siteTitle = siteTitle == null ? null : siteTitle.trim();
    }
    
    public String getSiteContent () {
        return siteContent;
    }
    
    public void setSiteContent (String siteContent) {
        this.siteContent = siteContent == null ? null : siteContent.trim();
    }
    
    public String getAppTitle () {
        return appTitle;
    }
    
    public void setAppTitle (String appTitle) {
        this.appTitle = appTitle == null ? null : appTitle.trim();
    }
    
    public String getAppContent () {
        return appContent;
    }
    
    public void setAppContent (String appContent) {
        this.appContent = appContent == null ? null : appContent.trim();
    }
    
    public String getTypeDesc () {
        return typeDesc;
    }
    
    public void setTypeDesc (String typeDesc) {
        this.typeDesc = typeDesc == null ? null : typeDesc.trim();
    }
    
    public String getCreateBy () {
        return createBy;
    }
    
    public void setCreateBy (String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }
    
    public String getModifyBy () {
        return modifyBy;
    }
    
    public void setModifyBy (String modifyBy) {
        this.modifyBy = modifyBy == null ? null : modifyBy.trim();
    }
    
    public Date getUpdateTime () {
        return updateTime;
    }
    
    public void setUpdateTime (Date updateTime) {
        this.updateTime = updateTime;
    }
    
    public Date getCreateTime () {
        return createTime;
    }
    
    public void setCreateTime (Date createTime) {
        this.createTime = createTime;
    }
    
    public Integer getWechatId () {
        return wechatId;
    }
    
    public void setWechatId (Integer wechatId) {
        this.wechatId = wechatId;
    }
    
    public String getWechatTitle () {
        return wechatTitle;
    }
    
    public void setWechatTitle (String wechatTitle) {
        this.wechatTitle = wechatTitle == null ? null : wechatTitle.trim();
    }
    
    public String getHeaderCon () {
        return headerCon;
    }
    
    public void setHeaderCon (String headerCon) {
        this.headerCon = headerCon == null ? null : headerCon.trim();
    }
    
    public String getFooterCon () {
        return footerCon;
    }
    
    public void setFooterCon (String footerCon) {
        this.footerCon = footerCon == null ? null : footerCon.trim();
    }
    
    public String getWechatCol () {
        return wechatCol;
    }
    
    public void setWechatCol (String wechatCol) {
        this.wechatCol = wechatCol == null ? null : wechatCol.trim();
    }
    
    public Short getMsgType () {
        return msgType;
    }
    
    public void setMsgType (Short msgType) {
        this.msgType = msgType;
    }
}
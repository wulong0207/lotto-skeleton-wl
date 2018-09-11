package com.hhly.skeleton.cms.operatemgr.vo;

import com.hhly.skeleton.base.vo.BaseVO;
import com.hhly.skeleton.base.vo.PageVO;

/**
 * @author chenkn679
 * @version 1.0
 * @desc
 * @date 2018/1/10
 * @company 益彩网络科技公司
 */
public class OperateActivityCdkeyVO extends PageVO {


    public static OperateActivityCdkeyVO generatorVO(OperateActivityConfigVO vo, Short status) {
        OperateActivityCdkeyVO cdkeyVO = new OperateActivityCdkeyVO();
        cdkeyVO.setActivityCode(vo.getActivityCode());
        cdkeyVO.setStatus(status);
        return cdkeyVO;
    }

    /**
     * 配置主键id
     */
    private Integer activityConfigId;

    /**
     * 活动编号
     */
    private String activityCode;

    /**
     * 状态
     */
    private Short status;

    /**
     * cdk兑换码
     */
    private String cdkey;

    /**
     * token
     */
    private String token;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 帐户名
     */
    private String account;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 身份证号码
     */
    private String idNum;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 平台
     */
    private Short platform;

    /**
     * 渠道id
     */
    private String channelId;

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public String getCdkey() {
        return cdkey;
    }

    public void setCdkey(String cdkey) {
        this.cdkey = cdkey;
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

    public Integer getActivityConfigId() {
        return activityConfigId;
    }

    public void setActivityConfigId(Integer activityConfigId) {
        this.activityConfigId = activityConfigId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

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
}

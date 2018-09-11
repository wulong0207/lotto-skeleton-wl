package com.hhly.skeleton.lotto.base.recommend.vo;

import com.hhly.skeleton.base.vo.PageVO;

/**
 * @Description 推单列表查询专用 VO
 * @Author longguoyou
 * @Date 2018/8/10 9:54
 * @Since 1.8
 */

public class RcmdQueryVO extends PageVO {

    private Integer id;
    /**
     * 彩种
     */
    private Integer lotteryCode;
    /**
     * 过关方法
     */
    private Integer passway;
    /**
     * 查询：专家或分析师昵称
     */
    private String queryText;
    /**
     * 状态：销售中、已截止
     */
    private Integer status;
    /**
     * 收费类型：免费、收费
     */
    private Integer payType;
    /**
     * 优化：不中退款、实单
     */
    private Integer refund;
    /**
     * 排序：1=返奖率、2=连红数、3=近期状态、4=命中率、5=人气、6=发布时间、7=推文价格、8=自购金额
     */
    private Integer orderType;
    /**
     *
     */
    private String rcmdCode;
    /**
     * 用户登录token
     */
    private String token;
    /**
     * 账号名称
     */
    private String accountName;
    /**
     * 用户id
     */
    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRcmdCode() {
        return rcmdCode;
    }

    public void setRcmdCode(String rcmdCode) {
        this.rcmdCode = rcmdCode;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(Integer lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public Integer getPassway() {
        return passway;
    }

    public void setPassway(Integer passway) {
        this.passway = passway;
    }

    public String getQueryText() {
        return queryText;
    }

    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getRefund() {
        return refund;
    }

    public void setRefund(Integer refund) {
        this.refund = refund;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}

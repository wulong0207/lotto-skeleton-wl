package com.hhly.skeleton.lotto.base.group.vo;

import com.hhly.skeleton.base.vo.PageVO;

/**
 * @Description 合买大厅查询 专用
 * @Author longguoyou
 * @Date  2018/6/29 10:55
 * @Since 1.8
 */
public class OrderGroupQueryVO extends PageVO{
    /**
     * 搜索框：订单编号或者发起人
     */
    private String queryText;
    /**
     * 当前用户token，主要用于获取userId判断是否已经参与合买
     */
    private String token;
    /**
     * 当前用户
     */
    private Integer userId;

    /**
     * 查询是否参与合买使用
     */
    private Integer checkUserId;

    /**
     * 彩种
     */
    private Integer lotteryCode;
    /**
     * 保密类型：null=不限，1=公开，2=跟单公开，3=开奖公开
     */
    private Integer visibleType;
    /**
     * 方案金额: <br>
     *   PC端：null=不限，1=100以下，2=100-499,3=500-999,4=1000-4999,5=5000以上
     */
    private Integer orderAmount;
    /**
     * 数据库查询使用
     */
    private String orderAmountDb;

    /**
     * 进度：<br>
     *  移动端:null=不限，1=已满员，2=50%-90%，3=50%以下<br>
     *  PC端：0=未满员，1=50%-90%，2=90%以上，3=已撤单
     */
    private Integer progress;
    /**
     * 数据库查询使用
     */
    private String progressDb;
    /**
     * 保底：null=不限，1=全额保底，2=50%-90%，3=50%以下
     */
    private Integer guarantee;
    /**
     * 数据库查询使用
     */
    private String guaranteeDb;

    /**
     * 提成:<br>
     *  移动端：0=无提成，1=有提成
     *  PC端：null=不限提成，0=无提成，1: 小于1%，、、，10：小于10%
     */
    private Integer commission;
    /**
     * 数据库查询使用
     */
    private String commissionDb;

    /**
     * 合买总数，人气 0=降序 1=升序
     */
    private Integer buyCount;
    /**
     * 合买金额 0=降序 1=升序
     */
    private Integer buyAmount;
    /**
     * 合买进度 0=降序 1=升序
     */
    private Integer buyProgress;
    /**
     * 剩余金额  0=降序 1=升序
     */
    private Integer buyRemain;
    /**
     * 查询类型：0：合买大厅；1：当前合买
     */
    private Integer type;
    /**
     * 平台：用于判断PC端与移动端差异，从lotto设值，传过来
     */
    private Integer platform;

    public String getQueryText() {
        return queryText;
    }

    public void setQueryText(String queryText) {
        this.queryText = queryText;
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

    public Integer getCheckUserId() {
        return checkUserId;
    }

    public void setCheckUserId(Integer checkUserId) {
        this.checkUserId = checkUserId;
    }

    public Integer getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(Integer lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public Integer getVisibleType() {
        return visibleType;
    }

    public void setVisibleType(Integer visibleType) {
        this.visibleType = visibleType;
    }

    public Integer getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Integer orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public Integer getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(Integer guarantee) {
        this.guarantee = guarantee;
    }

    public Integer getCommission() {
        return commission;
    }

    public void setCommission(Integer commission) {
        this.commission = commission;
    }

    public Integer getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }

    public Integer getBuyAmount() {
        return buyAmount;
    }

    public void setBuyAmount(Integer buyAmount) {
        this.buyAmount = buyAmount;
    }

    public Integer getBuyProgress() {
        return buyProgress;
    }

    public void setBuyProgress(Integer buyProgress) {
        this.buyProgress = buyProgress;
    }

    public Integer getBuyRemain() {
        return buyRemain;
    }

    public void setBuyRemain(Integer buyRemain) {
        this.buyRemain = buyRemain;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public String getOrderAmountDb() {
        return orderAmountDb;
    }

    public void setOrderAmountDb(String orderAmountDb) {
        this.orderAmountDb = orderAmountDb;
    }

    public String getProgressDb() {
        return progressDb;
    }

    public void setProgressDb(String progressDb) {
        this.progressDb = progressDb;
    }

    public String getGuaranteeDb() {
        return guaranteeDb;
    }

    public void setGuaranteeDb(String guaranteeDb) {
        this.guaranteeDb = guaranteeDb;
    }

    public String getCommissionDb() {
        return commissionDb;
    }

    public void setCommissionDb(String commissionDb) {
        this.commissionDb = commissionDb;
    }
}

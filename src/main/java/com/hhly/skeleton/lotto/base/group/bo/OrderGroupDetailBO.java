package com.hhly.skeleton.lotto.base.group.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @Description 合买大厅列表数据BO
 * @Author longguoyou
 * @Date 2018/5/3 9:23
 * @Since 1.8
 */
public class OrderGroupDetailBO extends BaseBO  {
    /**
     * 参与人数
     */
    private Integer buyCount;
    /**
     * 合买截止时间
     */
    private String endTime;
    /**
     * 彩种名称
     */
    private String lotteryName;
    /**
     * 彩种编号
     */
    private String lotteryCode;
    /**
     * 方案金额
     */
    private Double orderAmount;
    /**
     * 订单编号
     */
    private String orderCode;
    /**
     * 合买进度
     */
    private String process;
    /**
     * 保底进度
     */
    private String gProcess;
    /**
     * 剩余金额
     */
    private Double remainAmount;
    /**
     * 发起人(昵称)
     */
    private String nickName;
    /**
     * 合买订单状态
     */
    private Integer gOrderStatus;
    /**
     * 是否置顶
     */
    private Integer isTop;
    /**
     * 是否推荐
     */
    private Integer isRecommend;
    /**
     * 是否参与
     */
    private Integer flag;
    /**
     * 合买标题
     */
    private String title;
    /**
     * 保密类型
     */
    private Integer visibleType;
    /**
     * 用户ID
     */
    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getLotteryName() {
        return lotteryName;
    }

    public void setLotteryName(String lotteryName) {
        this.lotteryName = lotteryName;
    }

    public String getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(String lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public String getgProcess() {
        return gProcess;
    }

    public void setgProcess(String gProcess) {
        this.gProcess = gProcess;
    }

    public Double getRemainAmount() {
        return remainAmount;
    }

    public void setRemainAmount(Double remainAmount) {
        this.remainAmount = remainAmount;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getgOrderStatus() {
        return gOrderStatus;
    }

    public void setgOrderStatus(Integer gOrderStatus) {
        this.gOrderStatus = gOrderStatus;
    }

    public Integer getIsTop() {
        return isTop;
    }

    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }

    public Integer getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Integer isRecommend) {
        this.isRecommend = isRecommend;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getVisibleType() {
        return visibleType;
    }

    public void setVisibleType(Integer visibleType) {
        this.visibleType = visibleType;
    }
}

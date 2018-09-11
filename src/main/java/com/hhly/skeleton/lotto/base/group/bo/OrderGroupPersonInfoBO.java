package com.hhly.skeleton.lotto.base.group.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.List;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc
 * @date 2018/6/30 10:39
 * @company 益彩网络科技公司
 */
public class OrderGroupPersonInfoBO extends BaseBO {

   //头部信息
    /**
     * 用户名
     */
    private String userName;

    private Integer userId;

    /**
     * 图像
     */
    private String headPic;

    /**
     * 中奖次数
     */
    private Integer winCount;

    /**
     * 中奖总额
     */
    private Double winAmount;

    /**
     * 发单次数
     */
    private Integer orderCount;


    /**
     * 发单成功率；发单成功数/发单次数
     */
    private Double orderSucRate;

    /**
     * 定制人数
     */
    private Integer customizationCount;

    //pc专有 start
    /**
     * 中奖百万以上次数
     */
    private Integer winBwCount;

    /**
     * 中奖十万以上次数
     */
    private Integer winSwCount;

    /**
     * 中奖万以上次数
     */
    private Integer winWCount;

    /**
     * 中奖千以上次数
     */
    private Integer winQCount;

    /**
     * 中奖千以下次数
     */
    private Integer winOtherCount;

    //最近获奖的三条记录
    private List<OrderGroupPersonLatelyInfoBO> latelyThreeOrderList;

    //合买排行榜十条
    private List<OrderGroupPersonLatelyInfoBO> orderGroupRankingList;

    /**
     * 历史战绩（分彩种）
     */
    private List<OrderGroupLotteryBO> orderGroupLotteryBOs;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getWinCount() {
        return winCount;
    }

    public void setWinCount(Integer winCount) {
        this.winCount = winCount;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public Integer getCustomizationCount() {
        return customizationCount;
    }

    public void setCustomizationCount(Integer customizationCount) {
        this.customizationCount = customizationCount;
    }

    public Integer getWinBwCount() {
        return winBwCount;
    }

    public void setWinBwCount(Integer winBwCount) {
        this.winBwCount = winBwCount;
    }

    public Integer getWinSwCount() {
        return winSwCount;
    }

    public void setWinSwCount(Integer winSwCount) {
        this.winSwCount = winSwCount;
    }

    public Integer getWinWCount() {
        return winWCount;
    }

    public void setWinWCount(Integer winWCount) {
        this.winWCount = winWCount;
    }

    public Integer getWinQCount() {
        return winQCount;
    }

    public void setWinQCount(Integer winQCount) {
        this.winQCount = winQCount;
    }

    public Integer getWinOtherCount() {
        return winOtherCount;
    }

    public void setWinOtherCount(Integer winOtherCount) {
        this.winOtherCount = winOtherCount;
    }

    public List<OrderGroupLotteryBO> getOrderGroupLotteryBOs() {
        return orderGroupLotteryBOs;
    }

    public void setOrderGroupLotteryBOs(List<OrderGroupLotteryBO> orderGroupLotteryBOs) {
        this.orderGroupLotteryBOs = orderGroupLotteryBOs;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public List<OrderGroupPersonLatelyInfoBO> getLatelyThreeOrderList() {
        return latelyThreeOrderList;
    }

    public void setLatelyThreeOrderList(List<OrderGroupPersonLatelyInfoBO> latelyThreeOrderList) {
        this.latelyThreeOrderList = latelyThreeOrderList;
    }

    public List<OrderGroupPersonLatelyInfoBO> getOrderGroupRankingList() {
        return orderGroupRankingList;
    }

    public void setOrderGroupRankingList(List<OrderGroupPersonLatelyInfoBO> orderGroupRankingList) {
        this.orderGroupRankingList = orderGroupRankingList;
    }

    public Double getWinAmount() {
        return winAmount;
    }

    public void setWinAmount(Double winAmount) {
        this.winAmount = winAmount;
    }

    public Double getOrderSucRate() {
        return orderSucRate;
    }

    public void setOrderSucRate(Double orderSucRate) {
        this.orderSucRate = orderSucRate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}

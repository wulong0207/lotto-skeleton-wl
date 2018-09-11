package com.hhly.skeleton.lotto.base.order.vo;

import com.hhly.skeleton.base.vo.BaseVO;

import java.util.List;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc 竟足活动订单VO
 * @date 2017/8/10 11:00
 * @company 益彩网络科技公司
 */
public class ActivityOrderQueryInfoVO extends BaseVO {

    /**
     * 竟足首单立减：
     * 1：当前用户是否下过竟足订单 2：其他账户是否下过竟足订单
     * 3:当前用户是否参与过活动 4：当前用户是否有未支付的活动订单
     * 5：其他账户是否参与过活动 6：其他账户是否有未支付的活动订单
     * 7：真实姓名是否有十个账户参与过活动
     * 8:当前用户是否有出票失败的活动订单
     * 9：其他用户是否有出票失败的活动订单
     */
    private Integer queryType;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 用户ID集合
     */
    private List<Integer> userIds;

    /**
     * 活动编号
     */
    private String activityCode;

    /**
     * 大彩种编号
     */
    private Integer lotteryCode;

    public Integer getQueryType() {
        return queryType;
    }

    public void setQueryType(Integer queryType) {
        this.queryType = queryType;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<Integer> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Integer> userIds) {
        this.userIds = userIds;
    }

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public Integer getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(Integer lotteryCode) {
        this.lotteryCode = lotteryCode;
    }
}

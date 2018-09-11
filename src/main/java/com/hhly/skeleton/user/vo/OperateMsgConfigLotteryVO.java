package com.hhly.skeleton.user.vo;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * @author chenkangning
 * @version 1.0
 * @desc 小开关VO
 * @date 2017.04.25
 * @company 益彩网络科技公司
 */
public class OperateMsgConfigLotteryVO extends BaseVO{
    private Integer id;
    /**
     * 彩种编号
     */
    private Integer lotteryCode;
    
    /**
     * 类型:1开奖号码;2购彩提醒
     */
    private Integer type;
    
    /**
     * APP推送:0不接收;1接收
     */
    private Integer app;
    
    /**
     * 用户ID
     */
    private Integer userId;
    
    private String token;
    
    public String getToken () {
        return token;
    }
    
    public void setToken (String token) {
        this.token = token;
    }
    
    public Integer getLotteryCode () {
        return lotteryCode;
    }
    
    public void setLotteryCode (Integer lotteryCode) {
        this.lotteryCode = lotteryCode;
    }
    
    public Integer getType () {
        return type;
    }
    
    public void setType (Integer type) {
        this.type = type;
    }
    
    public Integer getApp () {
        return app;
    }
    
    public void setApp (Integer app) {
        this.app = app;
    }
    
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
    
    @Override
    public String toString () {
        return "OperateMsgConfigLotteryVO{" +
                "id=" + id +
                ", lotteryCode=" + lotteryCode +
                ", type=" + type +
                ", app=" + app +
                ", userId=" + userId +
                ", token='" + token + '\'' +
                '}';
    }
}
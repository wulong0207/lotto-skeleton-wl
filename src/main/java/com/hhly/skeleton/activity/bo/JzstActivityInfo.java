package com.hhly.skeleton.activity.bo;



import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.bo.ResultBO;
import com.hhly.skeleton.base.constants.Constants;
import com.hhly.skeleton.base.constants.MessageCodeConstants;

import java.util.Date;
import java.util.List;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc 竟足/竞篮首投活动相关信息，此活动是后台配置死的
 * @date 2017/8/3 16:28
 * @company 益彩网络科技公司
 */
public class JzstActivityInfo extends BaseBO {

    /**
     * 活动编号
     */
    private String activityCode;

    /**
     * 活动名称
     */
    private String activityName;

    /**
     * 活动开始时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date activityStartTime;

    /**
     * 活动结束时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date activityEndTime;

    /**
     * 活动状态 0:不启用 1:启用
     */
    private Integer activityStatus;

    /**
     * 活动类型 先定7
     */
    @JsonIgnore
    private Integer activityType=7;

    /**
     * 竟足首投活动规则
     */
    private List<JzstActivityRule> jzstActivityRules;

    public String getActivityCode() {
        return activityCode;
    }

    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Date getActivityStartTime() {
        return activityStartTime;
    }

    public void setActivityStartTime(Date activityStartTime) {
        this.activityStartTime = activityStartTime;
    }

    public Date getActivityEndTime() {
        return activityEndTime;
    }

    public void setActivityEndTime(Date activityEndTime) {
        this.activityEndTime = activityEndTime;
    }

    public Integer getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(Integer activityStatus) {
        this.activityStatus = activityStatus;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public List<JzstActivityRule> getJzstActivityRules() {
        return jzstActivityRules;
    }

    public void setJzstActivityRules(List<JzstActivityRule> jzstActivityRules) {
        this.jzstActivityRules = jzstActivityRules;
    }

    /**
     * 校验活动信息
     * @return
     */
    @JsonIgnore
    public ResultBO<?> getVerifyActivityInfo(){
        Date date = new Date();
        if(Constants.NUM_0 == getActivityStatus()){//已停用
            return ResultBO.err(MessageCodeConstants.FOOTBALL_FIRST_DISCOUNT_OVERDUE);
        }
        if(getActivityStartTime().after(date)){//未开始
            return ResultBO.err(MessageCodeConstants.FOOTBALL_FIRST_DISCOUNT_NO_START);
        }
        if(getActivityEndTime().before(date)){//已结束
            return ResultBO.err(MessageCodeConstants.FOOTBALL_FIRST_DISCOUNT_OVERDUE);
        }
        return ResultBO.ok();
    }




}

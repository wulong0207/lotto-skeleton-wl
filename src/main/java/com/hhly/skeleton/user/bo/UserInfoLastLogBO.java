package com.hhly.skeleton.user.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;

/**
 * @author zhouyang
 * @version 1.0
 * @desc 用户操作最后一条记录
 * @date 2017/5/18
 * @company 益彩网络科技公司
 */
public class UserInfoLastLogBO extends BaseBO {

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 用户id
     */
    @JsonProperty("u_id")
    private Integer userId;

    /**
     * 注册时间
     */
    @JsonProperty("reg_tm")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date regTime;

    /**
     * 最后一次登录时间
     */
    @JsonProperty("last_log_tm")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date lastLoginTime;

    /**
     *最后一次充值时间
     */
    @JsonProperty("last_fill_tm")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date lastFillTime;

    /**
     *最后一次购彩时间
     */
    @JsonProperty("last_ord_tm")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date lastOrderTime;

    /**
     * 最后一次修改密码的时间
     */
    @JsonProperty("last_upd_pwd_tm")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date lastUpdatePwdTime;

    /**
     * ip地址
     */
    @JsonProperty("ip")
    private String ip;

    /**
     * 省份
     */
    @JsonProperty("pro")
    private String province;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getLastFillTime() {
        return lastFillTime;
    }

    public void setLastFillTime(Date lastFillTime) {
        this.lastFillTime = lastFillTime;
    }

    public Date getLastOrderTime() {
        return lastOrderTime;
    }

    public void setLastOrderTime(Date lastOrderTime) {
        this.lastOrderTime = lastOrderTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Date getLastUpdatePwdTime() {
        return lastUpdatePwdTime;
    }

    public void setLastUpdatePwdTime(Date lastUpdatePwdTime) {
        this.lastUpdatePwdTime = lastUpdatePwdTime;
    }
}

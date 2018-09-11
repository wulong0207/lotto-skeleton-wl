package com.hhly.skeleton.lotto.base.recommend.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;

public class RcmdUserPayBO extends BaseBO {
    /**
     * 
     */
    private Integer id;

    /**
     * 付费用户；
     */
    private Integer userId;

    /**
     * 付费的推单编号；
     */
    private String rcmdCode;

    /**
     * 创建时间 
     */
    private Date createTime;

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

    public String getRcmdCode() {
        return rcmdCode;
    }

    public void setRcmdCode(String rcmdCode) {
        this.rcmdCode = rcmdCode == null ? null : rcmdCode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
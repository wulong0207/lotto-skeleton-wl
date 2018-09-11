package com.hhly.skeleton.lotto.base.order.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc
 * @date 2017/6/7 15:00
 * @company 益彩网络科技公司
 */
public class OrderAddedIssueBO extends BaseBO {

    /**
     * 彩期
     */
    private String issueCode;

    /**
     * 当期状态
     */
    private Integer addStatus;

    /**
     * 追号下单完成时间
     */
    private Date addTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 创建时间
     */
    private Date createTime;

    public String getIssueCode() {
        return issueCode;
    }

    public void setIssueCode(String issueCode) {
        this.issueCode = issueCode;
    }

    public Integer getAddStatus() {
        return addStatus;
    }

    public void setAddStatus(Integer addStatus) {
        this.addStatus = addStatus;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

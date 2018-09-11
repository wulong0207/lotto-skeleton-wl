package com.hhly.skeleton.lotto.base.ordercopy.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.Date;

public class MUserIssueCountPrizeBO extends BaseBO {

    private static final long serialVersionUID = 1L;

    private Integer total;

    private String createTime;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
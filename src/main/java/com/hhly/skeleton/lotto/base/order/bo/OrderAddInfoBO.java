package com.hhly.skeleton.lotto.base.order.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.vo.BaseVO;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc
 * @date 2017/3/14 18:28
 * @company 益彩网络科技公司
 */
public class OrderAddInfoBO extends BaseBO {

    /**
     * 追号编号
     */
    private String orderAddCode;

    /**
     * 追号状态； 1：追号中；2：中奖停追；3：追号结束；4：用户撤单；5：系统撤单；
     */
    private Integer addStatus;

    /**
     * 追号：已追期数
     */
    private Integer hadIssueCount;

    /**
     * 追号：总期数
     */
    private Integer totalIssueCount;

    public String getOrderAddCode() {
        return orderAddCode;
    }

    public void setOrderAddCode(String orderAddCode) {
        this.orderAddCode = orderAddCode;
    }

    public Integer getAddStatus() {
        return addStatus;
    }

    public void setAddStatus(Integer addStatus) {
        this.addStatus = addStatus;
    }

    public Integer getHadIssueCount() {
        return hadIssueCount;
    }

    public void setHadIssueCount(Integer hadIssueCount) {
        this.hadIssueCount = hadIssueCount;
    }

    public Integer getTotalIssueCount() {
        return totalIssueCount;
    }

    public void setTotalIssueCount(Integer totalIssueCount) {
        this.totalIssueCount = totalIssueCount;
    }
}

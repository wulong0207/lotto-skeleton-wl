package com.hhly.skeleton.lotto.base.order.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @author zhouyang
 * @version 1.0
 * @desc 单式上传方案记录详情
 * @date 2017/6/26
 * @company 益彩网络科技公司
 */
public class SingleUploadDeatailBO extends BaseBO {

    /**
     * 编号
     */
    private Integer id;

    /**
     * 投注类型
     */
    private Integer contentType;

    /**
     * 投注内容
     */
    private String betContent;

    /**
     * 过关方式
     */
    private String passway;

    /**
     * 方案注数
     */
    private String betNum;

    /**
     * 方案倍数
     */
    private String multipleNum;

    /**
     * 方案金额
     */
    private Integer orderAmount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getContentType() {
        return contentType;
    }

    public void setContentType(Integer contentType) {
        this.contentType = contentType;
    }

    public String getBetContent() {
        return betContent;
    }

    public void setBetContent(String betContent) {
        this.betContent = betContent;
    }

    public String getPassway() {
        return passway;
    }

    public void setPassway(String passway) {
        this.passway = passway;
    }

    public String getBetNum() {
        return betNum;
    }

    public void setBetNum(String betNum) {
        this.betNum = betNum;
    }

    public String getMultipleNum() {
        return multipleNum;
    }

    public void setMultipleNum(String multipleNum) {
        this.multipleNum = multipleNum;
    }

    public Integer getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Integer orderAmount) {
        this.orderAmount = orderAmount;
    }
}

package com.hhly.skeleton.lotto.base.recommend.vo;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc
 * @date 2018/8/16 17:44
 * @company 益彩网络科技公司
 */
public class RcmdValidVO extends BaseVO {

    private String token;

    /**
     * 1:单关；2：二串一
     */
    private Integer passWay;

    /**
     * 最低奖金 二串一必传
     */
    private Double lowestBonus;

    /**
     * 方案金额 二串一必传
     */
    private Double planAmount;

    /**
     * 系统编号，多个以,分割 10001,10002
     */
    private String screens;

    /**
     * 单关必传 sp值多个以,分割 1.45,1.56
     */
    private String sps;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getPassWay() {
        return passWay;
    }

    public void setPassWay(Integer passWay) {
        this.passWay = passWay;
    }

    public Double getLowestBonus() {
        return lowestBonus;
    }

    public void setLowestBonus(Double lowestBonus) {
        this.lowestBonus = lowestBonus;
    }

    public Double getPlanAmount() {
        return planAmount;
    }

    public void setPlanAmount(Double planAmount) {
        this.planAmount = planAmount;
    }


    public String getScreens() {
        return screens;
    }

    public void setScreens(String screens) {
        this.screens = screens;
    }

    public String getSps() {
        return sps;
    }

    public void setSps(String sps) {
        this.sps = sps;
    }
}

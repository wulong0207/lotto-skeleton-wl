package com.hhly.skeleton.lotto.base.agent.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @Description 
 * @Author longguoyou
 * @Date  2018/3/7 10:37
 * @Since 1.8
 */

public class AgentOrderInfoBO extends BaseBO{

    private String nickName;
    private Double totalMoney;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }
}

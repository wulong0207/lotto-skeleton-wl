package com.hhly.skeleton.pay.bo;

import com.hhly.skeleton.base.bo.BaseBO;

import java.util.List;

/**
 * @version 1.0
 * @auth chenkangning
 * @date 2017/4/5
 * @desc    移动端数据bo
 * @compay 益彩网络科技有限公司
 */
public class PayBankCardH5BO extends BaseBO {
    
    
    private List<PayBankcardBO> bankCardListDatas;
   
    
    /**
     * 账户余额
     */
    private String totalCashBalance;
    /**
     * 红包余额
     */
    private String effRedBalance;
    
    /**
     * 7天内快过期红包数
     */
    private String expireCount;
    
    
    public List<PayBankcardBO> getBankCardListDatas () {
        return bankCardListDatas;
    }
    
    public void setBankCardListDatas (List<PayBankcardBO> bankCardListDatas) {
        this.bankCardListDatas = bankCardListDatas;
    }
    
    public String getTotalCashBalance () {
        return totalCashBalance;
    }
    
    public void setTotalCashBalance (String totalCashBalance) {
        this.totalCashBalance = totalCashBalance;
    }
    
    public String getEffRedBalance () {
        return effRedBalance;
    }
    
    public void setEffRedBalance (String effRedBalance) {
        this.effRedBalance = effRedBalance;
    }
    
    public String getExpireCount () {
        return expireCount;
    }
    
    public void setExpireCount (String expireCount) {
        this.expireCount = expireCount;
    }
    
}

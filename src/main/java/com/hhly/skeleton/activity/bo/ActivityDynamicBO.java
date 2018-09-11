package com.hhly.skeleton.activity.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc 活动提示内容，动态拼接内容
 * @date 2017/8/15 11:53
 * @company 益彩网络科技公司
 */
@SuppressWarnings("serial")
public class ActivityDynamicBO extends BaseBO {

    /**
     * 方案金额
     */
    private Double orderAmount;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 订单编号
     */
    private String orderCode;
    
    /**
     * 追号单号
     */
    private String orderAddCode;

    public static ActivityDynamicBO newInstanceWithAmount(Double orderAmount) {
    	ActivityDynamicBO instance = new ActivityDynamicBO();
    	instance.setOrderAmount(orderAmount);
    	return instance;
    }
    
    public static ActivityDynamicBO newInstanceWithName(String realName) {
    	ActivityDynamicBO instance = new ActivityDynamicBO();
    	instance.setRealName(realName);
    	return instance;
    }
    
    public static Object newInstanceWithOrderCode(String orderCode) {
    	ActivityDynamicBO instance = new ActivityDynamicBO();
    	instance.setOrderCode(orderCode);
    	return instance;
	}
    
    public static Object newInstanceWithOrderAddCode(String orderAddCode) {
    	ActivityDynamicBO instance = new ActivityDynamicBO();
    	instance.setOrderAddCode(orderAddCode);
    	return instance;
	}
    
	public Double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

	public String getOrderAddCode() {
		return orderAddCode;
	}

	public void setOrderAddCode(String orderAddCode) {
		this.orderAddCode = orderAddCode;
	}
}


package com.hhly.skeleton.lotto.base.order.bo;

import com.hhly.skeleton.base.bo.PagingBO;

/**
 * @desc    
 * @author  cheng chen
 * @date    2017年7月20日
 * @company 益彩网络科技公司
 * @version 1.0
 * @param <T>
 */
@SuppressWarnings("serial")
public class OrderPageBO<T> extends PagingBO<T> {
	
	/**
	 * 进行中方案总数
	 */
    private int dealOrderTotal;
    
    /**
     * 已中奖方案总数
     */
    private int winOrderTotal;

	public int getDealOrderTotal() {
		return dealOrderTotal;
	}

	public void setDealOrderTotal(int dealOrderTotal) {
		this.dealOrderTotal = dealOrderTotal;
	}

	public int getWinOrderTotal() {
		return winOrderTotal;
	}

	public void setWinOrderTotal(int winOrderTotal) {
		this.winOrderTotal = winOrderTotal;
	}
}

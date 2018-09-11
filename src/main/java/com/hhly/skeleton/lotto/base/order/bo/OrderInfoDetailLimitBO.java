package com.hhly.skeleton.lotto.base.order.bo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * 未支付订单详情信息：限制返回字段，已使用@JsonIgnore，如不合适请自行新增新类，不要在此基础上修改。
 * @author longguoyou
 * @date 2017年4月27日
 * @compay 益彩网络科技有限公司
 */
public class OrderInfoDetailLimitBO extends BaseBO {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5544208058358213204L;
	/**
	 * 订单编号
	 */
	@JsonIgnore
	private String orderCode;
    /**
     * 注数
     */
    private Integer betNum;

    /**
     * 投注内容
     */
    private String betContent;
    
    /**
     * 内容类型 1：单式；2：复式；3：胆拖；6：和值
     */
    private Integer contentType;
    
    /**
     * 子玩法名称
     */
    private String lotteryChildName;
    
	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Integer getBetNum() {
		return betNum;
	}

	public void setBetNum(Integer betNum) {
		this.betNum = betNum;
	}

	public String getBetContent() {
		return betContent;
	}

	public void setBetContent(String betContent) {
		this.betContent = betContent;
	}

	public Integer getContentType() {
		return contentType;
	}

	public void setContentType(Integer contentType) {
		this.contentType = contentType;
	}

	public String getLotteryChildName() {
		return lotteryChildName;
	}

	public void setLotteryChildName(String lotteryChildName) {
		this.lotteryChildName = lotteryChildName;
	}
}

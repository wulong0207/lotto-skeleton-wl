package com.hhly.skeleton.lotto.base.order.bo;
/**
 * 用于投注项乱序排序
 * @author longguoyou
 * @date 2017年11月14日
 * @compay 益彩网络科技有限公司
 */
public class BetContentInfoBO {
	private String value;
	private String sp;
	private Integer order;
	
	public BetContentInfoBO(){}
	public BetContentInfoBO(String value, String sp){
		this.value = value;
		this.sp = sp;
	}
	public BetContentInfoBO(String value, String sp, Integer order){
		this(value,sp);
		this.order = order;
	}
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getSp() {
		return sp;
	}

	public void setSp(String sp) {
		this.sp = sp;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

}

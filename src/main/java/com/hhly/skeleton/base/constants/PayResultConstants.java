package com.hhly.skeleton.base.constants;

public class PayResultConstants {
	/**
	 * 支付宝交易支付成功
	 */
	public static String ALIPAY_RESULT_TRADE_SUCCESS = "TRADE_SUCCESS";
	/**
	 * 	支付宝交易结束，不可退款
	 */
	public static String ALIPAY_RESULT_TRADE_FINISHED = "TRADE_FINISHED";
	/**
	 * 支付宝交易创建，等待买家付款
	 */
	public static String ALIPAY_RESULT_WAIT_BUYER_PAY = "WAIT_BUYER_PAY";
	/**
	 * 支付宝未付款交易超时关闭，或支付完成后全额退款
	 */
	public static String ALIPAY_RESULT_TRADE_CLOSED = "TRADE_CLOSED";
	
	/**
	 * LL 微信通用 交易支付成功
	 */
	public static String COMMON_RESULT_SUCCESS = "SUCCESS";
}

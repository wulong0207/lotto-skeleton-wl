package com.hhly.skeleton.base.constants;

/**
 * @desc 消息队列相关常量
 * @author huangb
 * @date 2017年5月29日
 * @company 益彩网络
 * @version v1.0
 */
public class MQConstants extends Constants {

	/**
	 * 订单撤单退款队列名称
	 */
	public static final String ORDER_CANCEL_QUEUENAME = "order_cancel_queue";
	/**
	 * 订单未支付过期比赛时间点的队列名称(主要用户竞技彩对阵比赛时间变化的监听)
	 */
	public static final String ORDER_OVERDUE_TIME_QUEUENAME = "order_overdue_time_queue";
	/**
	 * 订单拆票队列名称(如代购订单、追号订单拆票)
	 */
	public static final String SPLIT_QUEUENAME = "split_queue";
	/**
	 * 追号订单创建的队列名称(主要用于追号下单支付完成后，对当前期的追号生成订单)
	 */
	public static final String CHASE_ORDER_CREATE_QUEUENAME = "chase_order_create_queue";

	/**
	 * 竞篮SP值推送队列
	 */
	public static final String BASKETBALL_SP_RABBITMQ_NAME = "basketball_sp";
	/**
	 * 竞足SP值推送队列
	 */
	public static final String FOOTBALL_SP_RABBITMQ_NAME = "football_sp";
	
	/**
	 * 追号订单生成的队列名称(用于开奖完成后，对当前期的追号生成订单)
	 */
	public static final String CHASE_ORDER_CREATE_AFTERDRAW_QUEUENAME = "chase_order_create_afterdraw_queue";
	
	/**
	 * 合买满员给发起人退款的队列名称
	 */
	public static final String ORDER_GROUP_FULL_GUARANTEE_REFUND_QUEUENAME = "order_group_full_guarantee_refund_queue";
	
	/**
	 * 合买订单战绩统计队列名称
	 */
	public static final String ORDER_GROUP_RESULT_STATIS_QUEUENAME = "order_group_result_statis_queue";
	
	/**
	 * 中奖统计队列名称
	 */
	public static final String WIN_CONUTNAME = "win_conut";
	
	
	public static final String RECOMMEND_ORDER_STATIS_QUEUENAME = "recommend_order_statis_queue";
}

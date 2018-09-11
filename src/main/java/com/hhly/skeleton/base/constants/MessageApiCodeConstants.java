package com.hhly.skeleton.base.constants;

/**
 * 对外（第三方）接口提示消息编码
 *
 * @author huangchengfang1219
 * @date 2018年3月8日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class MessageApiCodeConstants {

	/********************************** 系统错误编码 *********************************************/
	/**
	 * 成功
	 */
	public static final String SYS_SUCCESS = "1";
	/**
	 * 验签失败
	 */
	public static final String SYS_VALID_SIGN_ERROR = "10000";

	/**
	 * 解密错误
	 */
	public static final String SYS_DECRYPT_ERROR = "10001";
	/**
	 * 无效参数
	 */
	public static final String SYS_INVALID_PARAM = "10002";
	/**
	 * 参数:{0},不能为空
	 */
	public static final String SYS_PARAM_NULL = "10003";

	/********************************** 积分兑换系统 *********************************************/
	/**
	 * 渠道不存在
	 */
	public static final String COOPERATE_CHANNEL_NOT_FOUND = "21000";
	/**
	 * 合作未开始
	 */
	public static final String COOPERATE_CHANNEL_NOT_BEGIN = "21001";
	/**
	 * 合作已结束
	 */
	public static final String COOPERATE_CHANNEL_IS_END = "21002";
	/**
	 * 渠道未启动
	 */
	public static final String COOPERATE_CHANNEL_NOT_START = "21003";
	/**
	 * 彩种不存在或渠道未配置该彩种
	 */
	public static final String COOPERATE_CHANNEL_LOTTERY_NOT_FOUND = "21004";
	/**
	 * 账户余额不足
	 */
	public static final String COOPERATE_CHANNEL_BALANCE_NOT_ENOUGH = "21005";
	/**
	 * 兑换码不足
	 */
	public static final String COOPERATE_CHANNEL_CDKEY_NOT_ENOUGH = "21006";
	/**
	 * 兑换码数量不能大于1000，小于0
	 */
	public static final String COOPERATE_CDKEY_NUM_ERROR = "21007";
	/**
	 * 商户结算类型不支持接口
	 */
	public static final String COOPERATE_CHANNEL_NOT_SUPPORT = "21008";
	
	/**
	 * 充值单笔额度超限, 请不要充值超过
	 */
	public static final String COOPERATE_CHANNEL_PAY_RECHARGE_SINGLE_CEIL = "21009";	
	
	/**
	 * 充值失败,请联系系统管理员
	 */
	public static final String COOPERATE_CHANNEL_PAY_RECHARGE_FAIL = "21010";	
}

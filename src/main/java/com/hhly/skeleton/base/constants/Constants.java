package com.hhly.skeleton.base.constants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hhly.skeleton.base.common.LotteryChildEnum.LotteryChild;
import com.hhly.skeleton.base.common.LotteryEnum;
import com.hhly.skeleton.base.common.OrderEnum.DltAdd;
import com.hhly.skeleton.base.util.DateUtil;
import com.hhly.skeleton.base.util.MathUtil;
import com.hhly.skeleton.base.util.ObjectUtil;
import com.hhly.skeleton.pay.vo.PayOrderBaseInfoVO;
import com.hhly.skeleton.pay.vo.PayResultVO;

/**
 * @author huangb
 *
 * @date 2016年11月15日
 *
 * @desc 公共常量 
 */
public class Constants {

	/** 数字常量定义 */
	public static final int NUM_F_1 = -1;
	public static final int NUM_0 = 0;
	public static final int NUM_1 = 1;
	public static final int NUM_2 = 2;
	public static final int NUM_3 = 3;
	public static final int NUM_4 = 4;
	public static final int NUM_5 = 5;
	public static final int NUM_6 = 6;
	public static final int NUM_7 = 7;
	public static final int NUM_8 = 8;
	public static final int NUM_9 = 9;
	public static final int NUM_10 = 10;
	public static final int NUM_11 = 11;
	public static final int NUM_12 = 12;
	public static final int NUM_13 = 13;
	public static final int NUM_14 = 14;
	public static final int NUM_15 = 15;
	public static final int NUM_16 = 16;
	public static final int NUM_17 = 17;
	public static final int NUM_18 = 18;
	public static final int NUM_19 = 19;
	public static final int NUM_20 = 20;
	public static final int NUM_21 = 21;
	public static final int NUM_22 = 22;
	public static final int NUM_23 = 23;
	public static final int NUM_24 = 24;
	public static final int NUM_25 = 25;
	public static final int NUM_26 = 26;
	public static final int NUM_27 = 27;
	public static final int NUM_28 = 28;
	public static final int NUM_29 = 29;
	public static final int NUM_30 = 30;
	public static final int NUM_31 = 31;
	public static final int NUM_32 = 32;
	public static final int NUM_33 = 33;
	public static final int NUM_34 = 34;
	public static final int NUM_35 = 35;
	public static final int NUM_36 = 36;
	public static final int NUM_37 = 37;
	public static final int NUM_38 = 38;
	public static final int NUM_39 = 39;
	public static final int NUM_40 = 40;
	public static final int NUM_43 = 43;
	public static final int NUM_45 = 45;
	public static final int NUM_50 = 50;
	public static final int NUM_55 = 55;
	public static final int NUM_59 = 59;
	public static final int NUM_60 = 60;
	public static final int NUM_63 = 63;
	public static final int NUM_69 = 69;
	public static final int NUM_73 = 73;
	public static final int NUM_75 = 75;
	public static final int NUM_90 = 90;
	public static final int NUM_99 = 99;
	public static final int NUM_100 = 100;
	public static final int NUM_120 = 120;
	public static final int NUM_200 = 200;
	public static final int NUM_1000 = 1000;
	public static final int NUM_1BIL = 1000000000;
	public static final int NUM_600 = 600;
	public static final int NUM_300 = 300;
	public static final int NUM_10000 = 10000;
	public static final int NUM_20000 = 20000;
	public static final int DAY_1 = 86400;
	public static final double DOUBLE_1 = 1.00;
	/** 数字 2500 **/
	public static final int NUM_FOUR_THOUSAND = 2500;
	/** 开关常量 */
	public static final String SWITCH_ON = "ON";
	public static final String SWITCH_OFF = "OFF";
	/**征税起点*/
	public static final int GET_BONUS_START = 10000;
	/**征税后实得百分比*/
	public static final double AFT_BONUS = 0.8;
	/** 判断常量 是/否 */
	public static final short YES = 1;
	public static final short NO = 0;
	/** 成功失败标识*/
	public static final String SUCCESS = "success";
	public static final String FAIL = "fail";

	/** 单注金额  2元*/
	public static final Double SINGLE_AMOUNT_TWO = 2d;
	/** 单注金额  3元*/
	public static final Double SINGLE_AMOUNT_THREE = 3d;

	/** 乐选3单注金额 **/
	public static final double SINGLE_AMOUNT_LX_THREE = 6d;
	/** 乐选4单注金额 **/
	public static final double SINGLE_AMOUNT_LX_FOUR = 10d;
	/** 乐选5单注金额 **/
	public static final double SINGLE_AMOUNT_LX_FIVE = 14d;

	/**一等奖*/
	public static final String FIRST_PRIZE = "一等奖";
	/**一等奖*/
	public static final String RX9_PRIZE = "任选九";
	/**
	 * 是大乐透追加
	 */
	public static final short IS_DLT_ADD = DltAdd.YES.getValue();

	/** 投注篮中最多的方案个数，即投注篮投注列表中最多的行数*/
	public static final int MAX_BET_PLAN = 1000;

	public static final Short SALE = 1; // 正常销售标识值

	public static final Short STOP_SALE = 4; // 暂停销售标识值

	public static final Short BJ_SALE = 1; // 北京单场正常销售标识值

	public static final Short BJ_STOP_SALE = 2; // 北京单场暂停销售标识值

	public static final String WDF = "0";// 胜平负

	public static final String LET_WDF = "1";// 让分胜平负

	public static final String SCORE = "2";// 全场比分

	public static final String GOAL = "3";// 总进球

	public static final String HF_WDF = "4";// 半全场胜平负

	// public static final String BJ_WDF = "0";//胜平负

	public static final String BJ_LET_WDF = "0";// 让分胜平负

	public static final String BJ_GOAL = "1";// 总进球

	public static final String BJ_HF_WDF = "2";// 半全场胜平负

	public static final String BJ_UDSD = "3";// 上下盘单双

	public static final String BJ_SCORE = "4";// 单场比分

	public static final String OVER_SINGLE = "1"; // 上单
	public static final String OVER_DOUBLE = "2"; // 上双
	public static final String UNDER_SINGLE = "3"; // 上单
	public static final String UNDER_DOUBLE = "4"; // 上双
	/**
	 * 根据投注内容解析注数Map key
	 */
	public static final String BET_NUM_KEY = "betNum";// 根据投注内容解析注数
	public static final String BET_MULTIPLE_KEY = "betMultiple";// 根据投注内容解析倍数
	/**
	 * 单注金额 Map key
	 */
	public static final String SINGL_AMOUNT_KEY = "singleAmount";// 单注金额

	public static final String BB_WF = "1";// 竞彩篮球胜负
	public static final String BB_LET_WF = "2";// 竞彩篮球让分胜负
	public static final String BB_BIG_SMALL = "3";// 竞彩篮球大小分
	public static final String BB_SCORE_WF = "4";// 竞彩篮球胜分差

	public static final String SMALL_CN = "小";
	public static final String BIG_CN = "大";

	public static final Integer MAX_UPLOAD_SIZE = 5120000;// 最大上传大小5m

	public static final String HTML_SUFFIX = ".html";

	/*******************用户中心相关常量**************************/
	/**
	 * 支付充值类型名称
	 */
	public static final String PAY_CHANNEL_TYPE_NAME = "channelTypeName";
	/**
	 * 第三方支付返回的文件流，转成String后的key值
	 */
	public static final String PAY_RESPONSE_KEY_NAME = "responseParam";
	/**
	 * 阿里公用回传参数
	 */
	public static final String PAY_EXTRA_COMMON_PARAM = "extra_common_param";
	/**
	 * 支付宝、微信支付订单号
	 */
	public static final String PAY_OUT_TRADE_NO = "out_trade_no";
	/**
	 * 连连支付订单号
	 */
	public static final String PAY_NO_ORDER = "no_order";
	/**
	 * 订单拆单队列名
	 */
	public static final String QUEUE_NAME_FOR_ORDER = "split_queue";

	/**
	 * 订单流程队列名
	 */
	public static final String QUEUE_NAME_FOR_ORDER_FLOW = "orderflow_queue";
	/**
	 * 充值消息队列名
	 */
	public static final String QUEUE_NAME_MSG_QUEUE = "msg_queue";
	/**
	 * 追号订单创建队列
	 */
	public static final String CHASE_ORDER_CREATE_QUEUE = "chase_order_create_queue";
	/**
	 * 单式上传日志队列名
	 */
	public static final String QUEUE_NAME_FOR_SINGLE_UPLOAD_LOG = "single_upload_log_queue";
	/**
	 * 抄单队列列名
	 */
	public static final String QUEUE_NAME_FOR_ORDER_COPY = "copy_order_queue";
	/**
	 * 合买消息队列名
	 */
	public static final String ORDER_GROUP_RESULT_STATIS_QUEUE  = "order_group_result_statis_queue";
	/**
	 * 报警队列名
	 */
	public static final String QUEUE_NAME_ALERM_INFO = "alarm_info";
	/**
	 * 充值活动MQ队列
	 */
	public static final String QUEUE_ACTIVITY_CHANNEL_QUEUENAME = "activity_channel_queue";

	/**
	 * 用户钱包20%部分
	 */
	public static final Double USER_WALLET_TWENTY_PERCENT = 0.2;
	/**
	 * 用户钱包80%部分
	 */
	public static final Double USER_WALLET_EIGHTY_PERCENT = 0.8;
	/**
	 * 每页显示的最多记录数量（50条）
	 */
	public static final int MAX_SHOW_NUM = 50;
	/**
	 * 银行卡最短长度（14位）
	 */
	public static final int MIN_BANKNUM_LENGTH = 14;
	/**
	 * 银行卡最长长度（19位）
	 */
	public static final int MAX_BANKNUM_LENGTH = 19;
	/**
	 * 充值最低金额 10元
	 */
	public static final int RECHARGE_LOWEST_AMOUNT = 10;
	/**
	 * 批量支付最大订单数
	 */
	public static final int BATCH_PAY_LARGEST_ORDER_NUM = 16;
	/**
	 * 最低提款金额 1元，因为低于10元都要收1元手续费
	 */
	public static final int TOKEN_LOWEST_ONE_AMOUNT = 1;
	/**
	 * 提款最低金额 10元一个阶段，小于10元收1元手续费
	 */
	public static final int TOKEN_LOWEST_TEN_AMOUNT = 10;
	/**
	 * 提款最低金额 10元一个阶段，小于10元收1元手续费
	 */
	public static final int TOKEN_LOWEST_TEN_SERVICE_FEE = 1;
	/**
	 * 验证身份证或者银行卡号后8位
	 */
	public static final int VALIDATE_IDCARD_BANCARD_END_LENGTH = 8;
	/**
	 * 生成红包的有效天数
	 */
	public static final int RED_COLOR_EFFECTIVE_DAYS = 7;
	/**
	 * 支付有效时间 120分钟
	 */
	public static final int PAY_EFFECTIVE_TIME = 120;
	/**
	 * 充值有效时间 30分钟
	 */
	public static final int RECHARGE_EFFECTIVE_TIME = 60;
	/**
	 * 订单超过2万，发送警报信息
	 */
	public static final int ORDER_ALERM_AMOUNT = 20000;
	/**
	 * 彩金红包有效天数（20年）
	 */
	public static final int RED_COLOR_OVERDUE_TIME = 20;
	/**
	 * 彩金红包有效天数（30天）
	 */
	public static final int RED_COLOR_OVERDUE_TIME_30_DAYS = 30;
	/**
	 * 客服电话数据字典
	 */
	public static final String DIC_CUS_TEL = "9999";
	/**
	 * 默认渠道
	 */
	public static final int BASE_CHINAL = 4;

	/**
	 *  11x5号码数组
	 */
	public static final String[] ALL_11X5 = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11" };
	/**
	 * 红包有效期
	 */
	// public static final String RED_OVERDUE_TIME_TIPS ="有效期至{0}";
	public static final String RED_USER_TIPS = "此订单还差{0}元可用";
	public static final String RED_USER_EXPIRED_TIPS = "已过期";
	public static final String RED_USER_LOTTERY_TIPS = "此彩种不可用";
	public static final String CREDIT_EXPIRED_TIPS = "此信用卡已过期";

	public static final int TAKEN_TIMES_FOR_ONE_DAY = 3; // 一天的提款次数最多3次
	public static final String TAKEN_FREE_SERVICE_AMOUNT_TIPS = "本次提款免手续费，如没有问题确认提交申请。";
	public static final String TAKEN_SERVICE_AMOUNT_TIPS = "本次提款分{0}笔到，手续费{1}元，如没有问题确认提交申请。";
	/**
	 *提款到达时间
	 */
	public static final String TAKEN_ARRIVAL_TIME = "预计{0}前{1}到账";
	public static final String TAKEN_NORMAL_APPLICATION = "正常申请";
	public static final String TAKEN_EXCEPTION_APPLICATION = "第{0}笔原路返回申请";
	public static final String TAKEN_CAN_NOT_APPLICATION = "异常申请";
	public static final String TAKEN_FREE_CHARGE_TIPS = "免手续费";
	public static final String TAKEN_NOT_ALLOW_TIPS = "不可提取：余额不足以扣手续费";
	public static final String TAKEN_NEED_CHARGE_TIPS = "手续费：{0}元";
	public static final String TAKEN_EXCEPTION_TIPS = "{0}充值{1}元，未达最低消费";
	public static final String TAKEN_EXCEPTION_REMARK = "异常提款说明：为了防止少数用户利用信用卡套现和洗钱的行为，保护正常用户的资金安全，所有充值金额未达最低消费的申请将原路返还，预计15个工作日内到账，并收取充值金额{0}%的手续费。";
	public static final String TAKEN_APPLY_AMOUNT_TIPS = "提款金额包含{0}笔 （{1}元） 未达最低消费金额,将原卡返还。原卡返还预计15个工作日内到账。未达最低消费提款内收取{2}%的手续费。";
	public static final String TAKEN_NOT_ALLOW_AMOUNT_TIPS = "提款金额包含{0}笔不可提取：余额不足以扣手续费。";

	public static final String APP_TRANS_USER_LIST_TITLE = "本月";
	public static final String APP_TRANS_USER_LIST_TODAY = "今天";
	public static final String APP_TRANS_USER_LIST_YESTEDAY = "昨天";
	public static final String APP_TRANS_USER_LIST_BEFORE_YESTEDAY = "前天";

	public static final String PAY_WALLET_NAME = "账户余额";
	public static final String PAY_MERGE_NAME = "合并支付";
	public static final String PAY_CHANNEL_STOP_USE = "运营商维护，暂停使用。维护结束时间：{0}";
	public static final String PAY_SINGLE_LIMIT_PRICE = "银行对该卡单笔限额{0}元";
	public static final String PAY_CHANNEL_STOP_USE_TIP = "支付渠道暂停使用";

	public static final String PAY_TIME_PASS = "已过支付截止时间，支付失败";

	public static final String RECHARGE_REMARK = "充{0}元送{1}元";// 充值红包描述
	public static final String FULL_CUT_REMARK = "满{0}元减{1}元";// 满减红包描述

	// 红包记录的orderInfo
	public static final String RED_REMARK_RECHARGE_INFO = "充值赠送";
	public static final String RED_REMARK_RECHARGE_USE = "充值消费";
	public static final String RED_REMARK_CMS_SEND = "后台发放";
	public static final String ACTIVITY_SEND = "活动赠送";
	public static final String RED_REMARK_SYSTEM_SEND = "系统生成";
	public static final String RED_REMARK_CMS_CANCEL = "后台作废";
	public static final String RED_OVERDUE_CANCEL = "红包过期";
	public static final String TRANS_USER_ORDER_CANCEL = "撤单";
	public static final String TRANS_USER_ORDER_WIN = "派奖";
	public static final String RED_REMARK_ORDER_INFO = "红包";
	public static final String OFFICIAL_AWARD = "官方加奖";
	public static final String WEBSITE_AWARD = "本站加奖";
	public static final String RED_REMARK_CANCEL_SEND = "撤单生成";
	public static final String AGENT_RECHARGE = "代理充值";
	public static final String RED_AGENT_RECHARGE = "代理系统充值生成";
	public static final String CHANNEL_RECHARGE = "渠道充值";
	public static final String RECHARGE_REMARK_INFO = "人工充值";
	public static final String RECHARGE_BUY_RED_REMARK_INFO = "购买红包";
	public static final String SYSTEM_OPERATE = "系统操作";
	public static final String ACCOUNT_TAKEN = "账户提款";
	public static final String SEND_PRIZE_ERROR_INFO = "派奖错误扣款";
	public static final String REBATE_USER_RED_NAME = "返佣";
	public static final String FOLLEW_COMMISSIONAMOUNT_INFO = "抄单中奖佣金";
	public static final String ISSUE_PUSH_PAY = "方案推荐查看";
	public static final String ISSUE_PUSH_INCOME = "方案推荐收入";
	public static final String ORDER_GROUP_GUARANTEE = "合买保底";
	public static final String ORDER_GROUP_GUARANTEE_BUY = "保底认购";
	public static final String ORDER_GROUP_BUY = "认购支付";
	public static final String ORDER_GROUP_COMMISSON_AMOUNT = "合买抽成";
	public static final String REBATE_USER_ACTIVITY_CODE="DKHFY20180615001";

	/*******************用户中心相关常量**************************/

	/**
	 * 得到单注单价
	 * @param addType
	 * @return
	 */
	public static double getPrice(Short addType) {
		if (IS_DLT_ADD == addType) {
			return SINGLE_AMOUNT_THREE;
		}
		return SINGLE_AMOUNT_TWO;
	}

	/**
	 * @desc 按彩种子玩法获取单注金额
	 * @author huangb
	 * @date 2017年10月21日
	 * @param lotChildCode
	 *            子玩法编号
	 * @param defValue
	 *            默认值
	 * @return 按彩种子玩法获取单注金额
	 */
	public static double getPriceByLotChild(Integer lotChildCode, double defValue) {
		LotteryChild target = LotteryChild.valueOf(lotChildCode);
		switch (target) {
		case SD11X5_L3:
		case XJ11X5_L3:
			return SINGLE_AMOUNT_LX_THREE;
		case SD11X5_L4:
		case XJ11X5_L4:
			return SINGLE_AMOUNT_LX_FOUR;
		case SD11X5_L5:
		case XJ11X5_L5:
			return SINGLE_AMOUNT_LX_FIVE;
		default:
			return defValue;
		}
	}

	/**
	 * 订单截止时间和支付时间的时间戳
	 */
	public static final long END_TIME_TWELVE = 120000;// 毫秒

	public static final long END_TIME_THIRTY = 300000;// 毫秒

	public static final long END_TIME_SIXTY = 600000;// 毫秒

	public static final int PAY_END_TIME_THIRTY = 30;// 秒

	public static final int PAY_END_TIME_SIXTY = 60;// 秒

	public static final int PAY_END_TIME_TWELVE = 120;// 秒

	/**
	 * 获取订单的支付截至时间 （暂不建议使用）
	 * @param lotteryCode
	 * @param d
	 * @param endSysTime
	 * @return
	 */
	@Deprecated
	public static Date getOrderPayEndTime(Integer lotteryChildCode, long d, Date endSysTime) {
		Date orderPayEndTime = null;
		LotteryEnum.LotteryPr lott = LotteryEnum.getLottery(lotteryChildCode);
		switch (lott) {
		case GPC:// 高频彩
			if (d >= Constants.END_TIME_TWELVE && d < Constants.END_TIME_THIRTY) {
				orderPayEndTime = DateUtil.addSecond(endSysTime, Constants.PAY_END_TIME_THIRTY);
			}
			break;
		case SZC:// 数字彩
			if (d >= Constants.END_TIME_SIXTY) {
				orderPayEndTime = DateUtil.addSecond(endSysTime, Constants.PAY_END_TIME_TWELVE);
			}
			break;
		case BJDC:// 北单
		case JJC:// 竞技彩
			if (d >= Constants.END_TIME_THIRTY && d < Constants.END_TIME_SIXTY) {
				orderPayEndTime = DateUtil.addSecond(endSysTime, Constants.PAY_END_TIME_SIXTY);
			} else if (d >= Constants.END_TIME_SIXTY) {
				orderPayEndTime = DateUtil.addSecond(endSysTime, Constants.PAY_END_TIME_TWELVE);
			}
			break;
		default:// 足彩
			if (d >= Constants.END_TIME_THIRTY && d < Constants.END_TIME_SIXTY) {
				orderPayEndTime = DateUtil.addSecond(endSysTime, Constants.PAY_END_TIME_SIXTY);
			} else if (d >= Constants.END_TIME_SIXTY) {
				orderPayEndTime = DateUtil.addSecond(endSysTime, Constants.PAY_END_TIME_TWELVE);
			}
			break;
		}
		if (orderPayEndTime == null) {
			orderPayEndTime = endSysTime;
		}
		return orderPayEndTime;
	}

	/**  
	* 方法说明: 根据彩种和结束时间，判断是否过了可以支付的时间，返回true可以支付，false不能使用
	* @auth: xiongJinGang
	* @param lotteryCode
	* @param endSysTime
	* @time: 2017年6月8日 上午11:19:48
	* @return: boolean 
	*/
	public static PayResultVO validateOrderPayEndTime(List<PayOrderBaseInfoVO> orderTotalList) {
		// 先按时间排序
		/*Collections.sort(orderTotalList, new Comparator<PayOrderBaseInfoVO>() { // 按照sortNum排序 升序
			public int compare(PayOrderBaseInfoVO arg0, PayOrderBaseInfoVO arg1) {
				return arg0.getEndSysTime().compareTo(arg1.getEndSysTime());
			}
		});*/
		PayResultVO payResultVO = new PayResultVO();
		List<PayOrderBaseInfoVO> successList = new ArrayList<PayOrderBaseInfoVO>();
		List<PayOrderBaseInfoVO> failList = new ArrayList<PayOrderBaseInfoVO>();
		List<PayOrderBaseInfoVO> passList = new ArrayList<PayOrderBaseInfoVO>();
		// 大额订单，需要警报
		List<PayOrderBaseInfoVO> alarmList = new ArrayList<PayOrderBaseInfoVO>();

		Double orderAmount = 0d;
		for (PayOrderBaseInfoVO payOrderBaseInfo : orderTotalList) {
			if (payOrderBaseInfo.getBuyType().equals(PayConstants.BuyTypeEnum.JOINT_PURCHASE.getKey())) {
				break;// 目前，合买订单不支持批量支付；只要有一个合买订单，就跳出循环
			}
			// 订单金额大于等于2万，需要发送报警信息
			if (MathUtil.compareTo(payOrderBaseInfo.getOrderAmount(), ORDER_ALERM_AMOUNT) >= 0) {
				alarmList.add(payOrderBaseInfo);
			}
			// 已过支付时间的
			boolean flag = validateTime(payOrderBaseInfo.getLotteryCode(), payOrderBaseInfo.getEndSysTime());
			if (!flag) {
				passList.add(payOrderBaseInfo);
				continue;
			}
			// 等待支付及支付中的订单
			if (payOrderBaseInfo.getPayStatus().equals(PayConstants.PayStatusEnum.WAITTING_PAYMENT.getKey()) || payOrderBaseInfo.getPayStatus().equals(PayConstants.PayStatusEnum.BEING_PAID.getKey())) {
				orderAmount = MathUtil.add(orderAmount, payOrderBaseInfo.getOrderAmount());// 需要支付的订单总金额
				payOrderBaseInfo.setPayStatus(PayConstants.PayStatusEnum.PAYMENT_SUCCESS.getKey());// 设置成支付成功
				successList.add(payOrderBaseInfo);
			} else {
				// 已支付订单
				failList.add(payOrderBaseInfo);
			}
		}
		payResultVO.setOrderSuccessList(successList);// 需要支付的订单
		payResultVO.setOrderFailList(failList);// 已支付的订单
		payResultVO.setOrderPassList(passList);// 已过支付时间的订单
		payResultVO.setAlarmList(alarmList);// 单个订单超过2万的
		payResultVO.setOrderAmount(orderAmount);// 订单总金额
		return payResultVO;
	}

	public static boolean validateTime(Integer lotteryCode, Date endSysTime) {
		// 筛选出过了支付截止时间的
		Date orderPayEndTime = null;
		String lottoCode = String.valueOf(lotteryCode);
		if (lottoCode.length() > 3) {
			lottoCode = lottoCode.substring(0, 3);
			lotteryCode = Integer.parseInt(lottoCode);
		}
		LotteryEnum.LotteryPr lott = LotteryEnum.getLottery(lotteryCode);
		switch (lott) {
		case GPC:// 高频彩
			orderPayEndTime = DateUtil.addSecond(endSysTime, Constants.PAY_END_TIME_THIRTY);
			break;
		case SZC:// 数字彩
			orderPayEndTime = DateUtil.addSecond(endSysTime, Constants.PAY_END_TIME_TWELVE);
			break;
		case BJDC:// 北单
		case JJC:// 竞技彩
			orderPayEndTime = DateUtil.addSecond(endSysTime, Constants.PAY_END_TIME_TWELVE);
			break;
		default:// 足彩
			orderPayEndTime = DateUtil.addSecond(endSysTime, Constants.PAY_END_TIME_TWELVE);
			break;
		}
		Date nowDate = DateUtil.getNowDate();
		if (ObjectUtil.isBlank(orderPayEndTime)) {
			orderPayEndTime = nowDate;
		}
		int checkNum = DateUtil.compare(nowDate, orderPayEndTime);
		return checkNum < 0;
	}

	/**
	 * 获取彩种类型
	 * @param lotteryCode
	 * @return 1.数字彩(低频彩，高频彩) 2.竞技彩（竟足，竟篮，北京单场，胜负过关） 3.老足彩4.冠亚军
	 */
	public static Integer getLotteryType(Integer lotteryCode) {
		LotteryEnum.Lottery lottery = LotteryEnum.Lottery.getLottery(lotteryCode);
		switch (lottery) {
		case SSQ:// 双色球
		case QLC:// 七乐彩
		case DLT:// 大乐透
		case PL5:// 排列5
		case PL3:// 排列3
		case F3D:// 福彩3D
		case LHC:// 六合彩
		case QXC:// 七星彩
			return Constants.NUM_1;
		case FB:// 竞技彩足彩
		case BB:// 竞技彩篮彩
		case BJDC:// 北京单场
		case SFGG:// 胜负过关
			return Constants.NUM_2;
		case JQ4:// 四场进球彩
		case SFC:// 十四场胜负彩
		case ZC_NINE:// 九场胜负彩
		case ZC6:// 六场半全场
			return Constants.NUM_3;
		case CHP:// 冠军游戏
		case FNL:// 冠亚军游戏
			return Constants.NUM_4;
		default:
			return Constants.NUM_1;
		}
	}


	/**
	 * 获取彩种类型
	 * @param lotteryCode
	 * @return 1.数字彩(低频彩，高频彩) 2.竞技彩（竟足，竟篮，北京单场，胜负过关 老足彩 冠亚军
	 */
	public static Integer getLotteryType1(Integer lotteryCode) {
		LotteryEnum.Lottery lottery = LotteryEnum.Lottery.getLottery(lotteryCode);
		switch (lottery) {
			case SSQ:// 双色球
			case QLC:// 七乐彩
			case DLT:// 大乐透
			case PL5:// 排列5
			case PL3:// 排列3
			case F3D:// 福彩3D
			case LHC:// 六合彩
			case QXC:// 七星彩
				return Constants.NUM_1;
			case FB:// 竞技彩足彩
			case BB:// 竞技彩篮彩
			case BJDC:// 北京单场
			case SFGG:// 胜负过关
			case JQ4:// 四场进球彩
			case SFC:// 十四场胜负彩
			case ZC_NINE:// 九场胜负彩
			case ZC6:// 六场半全场
			case CHP:// 冠军游戏
			case FNL:// 冠亚军游戏
				return Constants.NUM_2;
			default:
				return Constants.NUM_1;
		}
	}

	/**
	 * 获取系统编号截取长度<br>
	 * 官网抓取数据：系统编号默认长度10位，除北单特殊，长度为11位
	 * @author longguoyou
	 * @date 2017年8月8日
	 * @param lotteryCode
	 * @return
	 */
	public static Integer getLengthOfSystemCode(Integer lotteryCode) {
		Integer lot = Integer.valueOf(String.valueOf(lotteryCode).substring(0, 3));
		LotteryEnum.Lottery lottery = LotteryEnum.Lottery.getLottery(lot);
		switch (lottery) {
		case SFGG:// 胜负过关
		case BJDC:// 北京单场
			return Constants.NUM_11;
		default:
			return Constants.NUM_10;
		}
	}

	public static String getActivityLotteryId() {
		return LotteryEnum.Lottery.FB.getName() + "," + LotteryEnum.Lottery.SSQ.getName();
	}

	/**
	 *  发送用户名单上传类型
	 */
	public static final String UPLOAD_USER = "uploadUser";
	/**
	 * 消息批次发送
	 */
	public static final String MSG_BATCH_SEND = "msgBatchSend";
	/**
	 * 信息重新发送
	 */
	public static final String MSG_RESEND = "msgReSend";

	/**
	 * 节点通知信息发送
	 */
	public static final String MSG_NODE_RESEND = "nodeMsgSend";
	/**
	 * 第一次上传文件map KEY
	 */
	public static final String FIRST_TIME_UPLOAD_FILE_NAME = "FIRST_FILE_NAME";

	/**
	 * 文件解析字符编码
	 */
	public static final String FILE_ENCODING = "fileEncoding";
	/**
	 * 解析txt文件的内容，存放Map key
	 */
	public static final String TXT_CONTENT = "TXT_CONTENT";

	/** 消息节点来源 */
	public static final String MSG_NODE_FROM_CORE = "lotto_core";
	public static final String MSG_NODE_FROM_TASK = "lotto_task";
	public static final String MSG_NODE_FROM_CMS = "lotto_cms";

	// 竟足首投活动规则 start
	public static final Integer MULTIPLE_5 = 5;// 5倍
	public static final Integer MULTIPLE_20 = 20;// 20倍
	public static final Integer MULTIPLE_GREATER_50 = 50;// 大于50倍
	public static final Double AMOUNT_2 = 2.0;// 5倍优惠2元
	public static final Double AMOUNT_10 = 10.0;// 20倍优惠10元
	public static final Double AMOUNT_20 = 20.0;// 大于50倍优惠20元

	public static final Map<Integer, Double> JZST_ACTIVITY_RULE = new HashMap<Integer, Double>();
	static {
		JZST_ACTIVITY_RULE.put(MULTIPLE_5, AMOUNT_2);
		JZST_ACTIVITY_RULE.put(MULTIPLE_20, AMOUNT_10);
		JZST_ACTIVITY_RULE.put(MULTIPLE_GREATER_50, AMOUNT_20);
	}
	// 竟足首投活动规则 end

	/** 一分钱购彩活动规则 */
	private static final Map<Integer, Double> GPC_YFGC_ACTIVITY_RULE_REAL = new HashMap<>();
	static {
		GPC_YFGC_ACTIVITY_RULE_REAL.put(1, 1.99);
		GPC_YFGC_ACTIVITY_RULE_REAL.put(2, 3d);
		GPC_YFGC_ACTIVITY_RULE_REAL.put(3, 4d);
	}
	public static final Map<Integer, Double> GPC_YFGC_ACTIVITY_RULE = Collections.unmodifiableMap(GPC_YFGC_ACTIVITY_RULE_REAL);

	// -----抄单相关
	public static final String ONE_TEN[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
	// 连红（七场以内）
	public static final String LIAN_RED[] = { "1111111", "111111", "11111", "1111", "111", "11" };
	// 等待追号，对应的订单状态
	public static final Short[] WAITTING_ADD = { 2, 3, 4, 5, 7, 9 };

	// 抄单三期
	// 一比分商户ID
	public static final int YI_BI_FEN_MASTER_ID = 100001;
	// 一比分渠道ID
	public static final String YI_BI_FEN_CHANNEL = "124";

	public static final String TOKEN_NO_LOGIN = "@_#$%^&&*";
	
	public static final String CREATE_BY_ACTIVITY ="LOTTO_ACTIVITY";

	//推文
	public static final List<Integer> WEEK1_5 = new ArrayList<Integer>();
	static {
		WEEK1_5.add(1);
		WEEK1_5.add(2);
		WEEK1_5.add(3);
		WEEK1_5.add(4);
		WEEK1_5.add(5);
	}


	public static final List<Integer> WEEK6_7 = new ArrayList<Integer>();
	static {
		WEEK1_5.add(6);
		WEEK1_5.add(7);
	}

}

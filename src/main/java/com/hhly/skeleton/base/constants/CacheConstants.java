package com.hhly.skeleton.base.constants;

import com.hhly.skeleton.base.util.DateUtil;

import java.util.Date;
import java.util.List;

/**
 * @auth lgs on
 * @date 2017/2/9.
 * @desc 保存缓存key常量类
 * @compay 益彩网络科技有限公司
 * @vsersion 1.0 1.数字彩 缓存key 前缀以 "n" 开头 2.竞技彩 缓存key 前缀以"s" 开头 3.支撑组 缓存key 前缀以"p"
 *           开头 4.公共组 缓存key 前缀以"c" 开头 key统一小写
 */
public class CacheConstants {

	/**
	 * 5秒
	 */
	public static final long FIVE_SECONDS = 5;

	/**
	 * 1 秒
	 */

	public static final long ONE_SECONDS = 1;
	/**
	 * 30s
	 */
	public static final long THIRTY_SECONDS = 30;

	/**
	 * 1分钟
	 */
	public static final long ONE_MINUTES = 60;

	/**
	 * 90秒
	 */
	public static final long NINETY_SECONDS = 90;

	/**
	 * 永久 - 100年
	 */
	public static final long ONE_YEAR = 1 * 365 * 24 * 60 * 60;

	/**
	 * 2分钟
	 */
	public static final long TWO_MINUTES = 2 * 60;

	/**
	 * 5分钟
	 */
	public static final long FIVE_MINUTES = 5 * 60;

	/**
	 * 10分钟
	 */
	public static final long TEN_MINUTES_TO_MILLISECOND = 10 * 60 * 1000;

	/**
	 * 三个月
	 */
	public static final long THREE_MONTH = 3 * 30 * 24 * 60 * 60 * 1000l;

	/**
	 * 10分钟
	 */
	public static final long TEN_MINUTES = 10 * 60;
	/**
	 * 30分钟
	 */
	public static final long THIRTY_MINUTES = 30 * 60;

	/**
	 * 验证码有效时间(ms)
	 */
	public static final long FIFTEEN_MINUTES = 15 * 60;

	/**
	 * 1个小时
	 */
	public static final long ONE_HOURS = 1 * 60 * 60;

	/**
	 * 12小时
	 */
	public static final long TWELVE_HOURS = 12 * 60 * 60;

	/**
	 * 2个小时
	 */
	public static final long TWO_HOURS = 2 * 60 * 60;

	/**
	 * 4个小时
	 */
	public static final long FOUR_HOURS = 4 * 60 * 60;

	/**
	 * 6个小时
	 */
	public static final long SIX_HOURS = 6 * 60 * 60;
	/**
	 * 一天
	 */
	public static final long ONE_DAY = 24 * ONE_HOURS;
	/**
	 * 二天
	 */
	public static final long TWO_DAYS = 2 * 24 * ONE_HOURS;
	/**
	 * 四天
	 */
	public static final long FOUR_DAYS = 4 * 24 * ONE_HOURS;

	/**
	 * 一周
	 */
	public static final long ONE_WEEK = 7 * ONE_DAY;
	/**
	 * 一个月
	 */
	public static final long ONE_MONTH = 30 * ONE_DAY;

	/**
	 * 字典详情
	 */
	public static final String DICTIONARY_SIMPLE = "p_dictionary_simple";
	/**
	 * 彩期信息 List
	 */
	public static final String TICKET_CONFIG_MONITOR = "p_ticket_config_monitor_lotto_c";
	/**
	 * 赛事信息缓存
	 */
	/*
	 * public static final String MATCH_LIST_DATA_TASK = "MATCH_LIST_DATA_TASK";
	 * 
	 *//**
		 * 球队信息缓存
		 */
	/*
	 * public static final String TEAM_LIST_DATA_TASK = "TEAM_LIST_DATA_TASK";
	 *//**
		 * 彩种：key规则LOTTERY_TYPE_LOTTO_C_彩种ID , 获取的是彩种对象实体
		 */
	/*
	 * public static final String LOTTERY_TYPE = "LOTTERY_TYPE_LOTTO_C_";
	 *//**
		 * 子玩法：key规则LOTTERY_CHILD_LOTTO_C_彩种ID , 获取的是子玩法对象实体
		 */
	/*
	 * public static final String LOTTERY_CHILD = "LOTTERY_CHILD_LOTTO_C_";
	 *//**
		 * 子玩法：key规则LOTTERY_CHILD_LOTTO_C_彩种ID , 获取的是子玩法集合
		 */
	/*
	 * public static final String LOTTERY_CHILD_LIST =
	 * "LOTTERY_CHILD_LIST_LOTTO_C_";
	 * 
	 *//**
		 * 对阵信息
		 */
	/*
	 * public static final String AGAINSTINFO_MAP = "MAP_AGAINSTINFO_LOTTO_C";
	 * 
	 *//**
		 * 投注注数，倍数截止时间信息表加缓存, 返回结果 List&lt;LotBettingMulBO&gt;
		 */
	/*
	 * public static final String LOTTERY_BETTING_MUL_MAP =
	 * "LIST_LOTTERY_BETTING_LOTTO_C";
	 * 
	 *//**
		 * 投注注数，倍数和时间关系 ： key规则LOTTERY_BETTING_MUL_LOTTO_C_彩种ID， 获取的对象实体集合
		 */
	/*
	 * public static final String LOTTERY_BETTING_MUL =
	 * "LOTTERY_BETTING_MUL_LOTTO_C_";
	 *//**
		 * 彩期信息 ： key规则LOTTERY_ISSUE_LOTTO_C_彩种ID_彩期, 获取的彩期对象实体
		 */
	/*
	 * public static final String LOTTERY_ISSUE = "LOTTERY_ISSUE_LOTTO_C_";
	 *//**
		 * 彩种限号：key规则LOTTERY_LIMIT_LOTTO_C_彩种ID, 获取的限号对象实体
		 */
	/*
	 * public static final String LOTTERY_LIMIT = "LOTTERY_LIMIT_LOTTO_C_";
	 * 
	 * 
	 * 
	 * 
	 *//**
		 * 出票监控
		 *//*
		 * public static final String TICKET_MONITOR = "TICKET_MONITOR";
		 */

	/********** 支付相关开始 ***********/

	/**
	 * 用户支付结果缓存
	 */
	public static final String P_CORE_PAY_STATUS_RESULT = "p_core_pay_status_result_";
	/**
	 * 用户支付结果对象缓存
	 */
	public static final String P_CORE_PAY_STATUS_OBJ_RESULT = "p_core_pay_status_obj_result_";
	/**
	 * 银行卡附加信息
	 */
	public static final String P_CORE_PAY_BANK_CARD_SEGMENT_LIST = "p_core_pay_bank_card_segment_list";
	/**
	 * 单个银行支付限额缓存（后面跟具体的银行ID）
	 * 
	 */
	public static final String P_CORE_PAY_BANK_LIMIT_SINGLE = "p_core_pay_bank_limit_single_";
	/**
	 * 支付渠道限额列表
	 */
	public static final String P_CORE_PAY_CHANNEL_LIMIT_LIST = "p_core_pay_channel_limit_list";
	/**
	 * 支付渠道管理列表
	 */
	public static final String P_CORE_PAY_CHANNEL_MGR_LIST = "p_core_pay_channel_mgr_list";
	/**
	 * 单个银行的支付渠道（PAY_BANK_CHANNEL_SINGLE_133332）
	 */
	public static final String P_CORE_PAY_BANK_CHANNEL_SINGLE = "p_core_pay_bank_channel_single_";
	/**
	 * 用户支付渠道列表缓存（后面跟用户ID+平台）
	 */
	public static final String P_CORE_USER_PAY_CHANNEL = "p_core_user_pay_channel_";
	/**
	 * 用户提款验证列表USER_TAKEN_VALIDATE_TYPE_LIST_+ userId
	 */
	public static final String P_CORE_USER_TAKEN_VALIDATE_TYPE_LIST = "p_core_user_taken_validate_type_list_";
	/**
	 * 用户银行卡列表USER_BANK_CARD_LIST_+userId
	 */
	public static final String P_CORE_USER_BANK_CARD_LIST = "p_core_user_bank_card_list_";
	/**
	 * 银行列表PAY_BANK_LIST
	 */
	public static final String P_CORE_PAY_BANK_LIST = "p_core_pay_bank_list";
	/**
	 * 银行类型列表PAY_BANK_LIST_BY_TYPE
	 */
	public static final String P_CORE_PAY_BANK_LIST_BY_TYPE = "p_core_pay_bank_list_";
	/**
	 * 用户提款token
	 */
	public static final String P_CORE_USER_TAKEN_TOKEN = "p_core_user_taken_token_";
	/**
	 * 充值订单
	 */
	public static final String P_CORE_RECHARGE_ORDER = "p_core_recharge_order_";
	/**
	 * 充值订单来源页面
	 */
	public static final String P_CORE_RECHARGE_ORDER_PAGE = "P_CORE_RECHARGE_ORDER_PAGE_";
	/**
	 * 单个用户信息
	 */
	public static final String SINGLE_USER_INFO = "p_core_single_user_info_";
	/**
	 * 所有银行的支付限额
	 */
	public static final String P_CORE_PAY_BANK_LIMIT_LIST = "p_core_pay_bank_limit_list";

	/**
	 * 渠道限额统计（按每个渠道，每天，每月进行统计）
	 */
	public static final String P_CORE_LOCK = "p_core_lock_";
	/**
	 * 支付渠道当日限额统计
	 */
	public static final String P_CORE_CHANNEL_LOCK = "p_core_channel_lock_";
	/**
	 * 市场渠道列表
	 */
	public static final String P_CORE_OPERATE_MARKET_CHANNEL_LIST = "p_core_operate_market_channel_list_";
	/**
	 * 合买订单详情
	 */
	public static final String P_CORE_ORDER_GROUP_CONTENT = "p_core_order_group_content_";

	/********** 支付相关结束 ***********/

	public static final String PAY_BANK_SEGMENTBO_LIST_KEY = "p_pay_bank_segmentbo_list_key";

	/************************ 版本信息缓存end *****************************************/

	/************************
	 * 当前期+最新期彩期缓存start
	 *****************************************/
	/**
	 * 当前期+最新期彩期信息
	 */
	public static final String C_COMM_LOTTERY_ISSUE_CURRENT_AND_LAST = "c_comm_lottery_issue_current_and_last";
	/**
	 * 所有彩种当前期+最新期彩期信息
	 */
	public static final String C_COMM_LOTTERY_ISSUE_ALL_CURRENT_AND_LAST = "c_comm_lottery_issue_all_current_and_last";
	/**
	 * 所有彩种当前期+最新期彩期信息
	 */
	public static final String C_COMM_LOTTERY_ISSUE_FIND_ISSUE_BY_CODE = "c_comm_lottery_issue_find_issue_by_code";

	/************************
	 * 当前期+最新期彩期缓存end
	 *****************************************/

	/************************************ 竞彩组begin ********************************************/

	/**
	 * 竞足赛程缓存key(受注赛程)1.
	 */
	public static final String S_COMM_SPORT_FB_MATCH_LIST = "s_comm_sport_fb_match_list_";
	/**
	 * 竞足赛程缓存key(单关致胜)2.
	 */
	public static final String S_COMM_FB_MATCH_DCZS_INFO = CacheConstants.S_COMM_SPORT_FB_MATCH_LIST + "dczs_info";
	/**
	 * 竞足赛程缓存key(推荐赛事)3.
	 */
	public static final String S_COMM_MATCH_FB_SP_INFO = CacheConstants.S_COMM_SPORT_FB_MATCH_LIST + "sp_info";
	/**
	 * 竞足赛程缓存key(销售截止)4.
	 */
	public static final String S_COMM_SPORT_FB_MATCH_LIST_SALE_END = "s_comm_sport_fb_match_list_sale_end";
	/**
	 * 竞足赛程缓存key(受注赛程官方编号map)5.
	 */
	public static final String S_COMM_SPORT_FB_MATCH_LIST_OFFICIAL_CODE_MAP = S_COMM_SPORT_FB_MATCH_LIST + "official_code_map";
	/**
	 * 竞竞足赛程缓存key(单式上传)6.
	 */
	public static final String S_COMM_SPORT_FB_MATCH_LIST_SINGLE_UP_MATCH_DATA = S_COMM_SPORT_FB_MATCH_LIST + "single_up_match_data";
	/**
	 * 竞足赛程缓存key(系统编号)7. 会在末尾加上对阵系统编号组成
	 */
	public static final String S_CORE_SPORT_FB_SYSTEM_CODE_MATCH_LIST = "s_core_sport_fb_system_code_match_list_";
	/**
	 * 竞足赛程缓存key(胜平负/让球胜平负sp值变化)8.
	 */
	public static final String S_COMM_SPORT_FB_TREND_SP = "s_comm_sport_fb_trend_sp";
	/**
	 * 竞足赛程缓存key(历史SP值)9 会在末尾加上对阵id
	 */
	public static final String S_COMM_SPORT_FB_MATCH_HISTORY_SP = "s_comm_sport_fb_match_history_sp_";

	/**
	 * 老足彩对阵缓存key10. 末尾会加上老足彩彩期
	 */
	public static final String S_COMM_SPORT_OLD_MATCH_LIST = "s_comm_sport_old_match_list_";

	/**
	 * 竞篮赛程缓存key(受注赛程)11.
	 */
	public static final String S_COMM_SPORT_BB_MATCH_LIST = "s_comm_sport_bb_match_list_";
	/**
	 * 竞篮赛程缓存key(推荐赛事)12.
	 */
	public static final String S_COMM_MATCH_BB_SP_INFO = CacheConstants.S_COMM_SPORT_BB_MATCH_LIST + "sp_info";
	/**
	 * 竞篮赛程缓存key(系统编号)13. 末尾会加上竞蓝系统编号
	 */
	public static final String S_CORE_SPORT_BB_SYSTEM_CODE_MATCH_LIST = "s_core_sport_bb_system_code_match_list_";
	/**
	 * 竞篮赛程缓存key(胜负SP值)14. 末尾会加上对阵id
	 */
	public static final String S_COMM_SPORT_BB_WF_HISTORY_SP = "s_comm_sport_bb_wf_history_sp_";
	/**
	 * 竞篮赛程缓存key(分差SP值)15. 末尾会加上对阵id
	 */
	public static final String S_COMM_SPORT_BB_WS_HISTORY_SP = "s_comm_sport_bb_ws_history_sp_";
	/**
	 * 竞篮赛程缓存key(大小分SP值)16. 末尾会加上对阵id.
	 */
	public static final String S_COMM_SPORT_BB_SSS_HISTORY_SP = "s_comm_sport_bb_sss_history_sp_";
	/**
	 * 竞篮赛程缓存key(胜负/让分胜负sp值变化)17.
	 */
	public static final String S_COMM_SPORT_BB_TREND_SP = "s_comm_sport_bb_trend_sp";
	/**
	 * 竞足平均欧赔对阵缓存key18.
	 */
	public static final String S_COMM_SPORT_AVG_ODDS_MATCH_LIST = "s_comm_sport_fb_avg_odds_match_list";

	/**
	 * 单式上传文件缓存key19.
	 */
	public static final String S_CORE_SINGLE_LIST_C = "s_core_single_list_c_";
	/**
	 * 用户第二次上传生成文件名20.
	 */
	private static final String S_CORE_SINGLE_UPLOAD_SECOND = "s_core_single_upload_second_lotto_c_";

	/**
	 * 投注内容缓存前缀(重复验证使用).21
	 */
	private static final String S_COMM_BET_CONTENT_LOTTO_C = "s_comm_bet_content_lotto_c_";
	/**
	 * 当前用户当前彩种当前彩期/当前时间未支付订单数.22 key规则：ORDER_NO_PAY_COUNT_C_token_彩种ID
	 */
	public static final String S_COMM_ORDER_NO_PAY_COUNT = "s_comm_order_no_pay_count_c_";
	/**
	 * 当前用户当前彩种当前时间未支付合买订单数
	 */
	public static final String S_COMM_ORDER_GROUP_NO_PAY_COUNT = "s_comm_order_group_no_pay_count_c_";

	/**
	 * 北单销售对阵(历史SP值)23 会在末尾加上对阵id
	 */
	public static final String S_COMM_SPORT_BJ_MATCH = "s_comm_sport_bj_match_";

	/**
	 * 北单单式上传(历史SP值)24 会在末尾加上对阵id
	 */
	public static final String S_COMM_SPORT_BJ_MATCH_SINGLE_ = "s_comm_sport_bj_match_single_";

	/**
	 * 得到未支付订单缓存key
	 * 
	 * @param code
	 *            彩种
	 * @return
	 */
	public static String getNoPayOrderCacheKey(Integer userId, Integer code) {
		return S_COMM_ORDER_NO_PAY_COUNT + userId + SymbolConstants.UNDERLINE + code;
	}

	/**
	 * 得到未支付合买订单缓存key, 限制到每天
	 * @param userId 用户ID
	 * @param code 彩种编号
	 * @return
	 */
	public static String getNoPayOrderGroupCacheKey(Integer userId, Integer code){
        return S_COMM_ORDER_GROUP_NO_PAY_COUNT + userId + SymbolConstants.UNDERLINE + code + SymbolConstants.UNDERLINE + DateUtil.getNow(DateUtil.DATE_FORMAT_NO_LINE);
	}

	/**
	 * 获取用户单式上传，第二次上传生成的文件名key
	 * 
	 * @author longguoyou
	 * @date 2017年6月23日
	 * @param userId
	 * @return
	 */
	public static String getSingleUploadCacheKey(Integer userId) {
		return S_CORE_SINGLE_UPLOAD_SECOND + userId;
	}

	/**
	 * 得到组装后竟足单式上传内容缓存key
	 *
	 * @param orderCode
	 * @return
	 */
	public static String getOrderSingleCacheKey(String orderCode) {
		return S_CORE_SINGLE_LIST_C + orderCode;
	}

	/**
	 * 竞彩足球受注赛程缓存+彩期
	 *
	 * @param issueCode
	 *            彩期
	 * @return cacheKey
	 */
	public static String getSportFbMatchListByIssueCodeCacheKey(String issueCode) {
		return S_COMM_SPORT_FB_MATCH_LIST + issueCode;
	}

	/**
	 * 系统编号重置竞彩足球对阵缓存key
	 *
	 * @param systemCode
	 *            系统编号
	 * @return cacheKey
	 */
	public static String getSportFbSystemCodeMatchListCacheKey(String systemCode) {
		return S_CORE_SPORT_FB_SYSTEM_CODE_MATCH_LIST + systemCode;
	}

	/**
	 * 每一条对阵历史SP值缓存key
	 *
	 * @param id
	 *            对阵id
	 * @return cacheKey
	 */
	public static String getSportFbMatchHistorySpCacheKey(Long id, Short type) {
		return S_COMM_SPORT_FB_MATCH_HISTORY_SP + id + "_" + type;
	}

	/**
	 * 系统编号重置竞彩篮球对阵缓存key
	 *
	 * @param systemCode
	 *            系统编号
	 * @return cacheKey
	 */
	public static String getSportBbSystemCodeMatchListCacheKey(String systemCode) {
		return S_CORE_SPORT_BB_SYSTEM_CODE_MATCH_LIST + systemCode;
	}

	/**
	 * 彩期重置竞彩篮球对阵缓存key
	 *
	 * @param issueCode
	 *            系统编号
	 * @return cacheKey
	 */
	public static String getSportBbIssueCodeMatchListCacheKey(String issueCode) {
		return S_COMM_SPORT_BB_MATCH_LIST + issueCode;
	}

	/**
	 * 竞彩篮球对阵胜负历史SP缓存key
	 *
	 * @param id
	 *            系统编号
	 * @return cacheKey
	 */
	public static String getSportBbWfHistorySpCacheKey(Long id, Short type) {
		return S_COMM_SPORT_BB_WF_HISTORY_SP + id + "_" + type;
	}

	/**
	 * 竞彩篮球对阵胜分差SP缓存key
	 *
	 * @param id
	 *            系统编号
	 * @return cacheKey
	 */
	public static String getSportBbWsHistorySpCacheKey(Long id) {
		return S_COMM_SPORT_BB_WS_HISTORY_SP + id;
	}

	/**
	 * 竞彩篮球对阵大小分SP缓存key
	 *
	 * @param id
	 *            系统编号
	 * @return cacheKey
	 */
	public static String getSportBBBSWsHistorySpCacheKey(Long id) {
		return S_COMM_SPORT_BB_SSS_HISTORY_SP + id;
	}

	/**
	 * 老足彩对阵缓存key
	 *
	 * @param lotteryCode
	 * @param issueCode
	 * @return cacheKey
	 */
	public static String getSportOldMatchListCacheKey(Integer lotteryCode, String issueCode) {
		return CacheConstants.S_COMM_SPORT_OLD_MATCH_LIST + issueCode + "_" + lotteryCode;
	}

	/**
	 * 得到用户投注内容缓存key(重复验证使用)
	 *
	 * @return
	 */
	public static String getBetContentCacheKey(String token) {
		return S_COMM_BET_CONTENT_LOTTO_C + token;
	}

	/**
	 * 得到篮球对阵缓存key
	 * 
	 * @param lotteryCode
	 * @param queryDate
	 * @return
	 */
	public static String getBBMatchSpCacheKey(int lotteryCode, String queryDate) {
		return S_COMM_MATCH_BB_SP_INFO + lotteryCode + queryDate;
	}

	/**
	 * 得到篮球对阵缓存key
	 * 
	 * @param lotteryCode
	 * @param queryDate
	 * @param saleStatus
	 * @return
	 */
	public static String getBBMatchSpCacheKeyBySaleStatus(int lotteryCode, String queryDate, Integer saleStatus) {
		return S_COMM_MATCH_BB_SP_INFO + lotteryCode + queryDate + saleStatus;
	}

	/**
	 * 得到快投单场致胜key
	 * 
	 * @param lotteryCode
	 * @param systemCode
	 * @param saleEndTime
	 * @return
	 */
	public static String getFBMatchSpCacheKey(int lotteryCode, String systemCode, Date saleEndTime) {
		return S_COMM_FB_MATCH_DCZS_INFO + lotteryCode + systemCode + saleEndTime.getTime();
	}

	/**
	 * 得到竞彩足球对阵信息key
	 * 
	 * @param lotteryCode
	 * @param queryDate
	 * @return
	 */
	public static String getFBMatchSpCacheKey(int lotteryCode, String queryDate) {
		return S_COMM_MATCH_FB_SP_INFO + lotteryCode + queryDate;
	}

	/************************************ 竞彩组end ********************************************/

	/**
	 * 一比分即时比分
	 */
	public static final String C_COMM_SPORT_YBF_JISHI_BIFEN = "c_comm_sport_ybf_jishi_bifen";

	/**
	 * 一比分竞彩篮球即时比分
	 */
	public static final String C_COMM_SPORT_YBF_BASKETBALL_JISHI_BIFEN = "c_comm_sport_ybf_basketball_jishi_bifen";

	/**
	 * 一比分对阵分析
	 */
	// public static final String SPORT_YBF_MATCH_ANALYSIS =
	// "SPORT_YBF_MATCH_ANALYSIS";

	// 公共平台的静态变量和方法 start

	/**
	 * crawl项目 老足彩彩期缓存
	 */
	public static final String C_CRAWL_OLDFB_NEXT_ISSUE = "c_crawl_oldfb_next_issue_";

	/**
	 * crawl项目 500网竞足 彩期赛事集合
	 */
	public static final String C_CRAWL_500_FB_ISSUE = "c_crawl_500_fb_issue_";

	/**
	 * crawl项目 500网竞足 彩期赛事集合
	 */
	public static final String C_CRAWL_500_BB_ISSUE = "c_crawl_500_bb_issue_";

	/**
	 * crawl项目 500网竞足 彩期赛事集合
	 */
	public static final String C_CRAWL_500_BB_HASH_FLAG = "c_crawl_500_bb_hash_flag";

	/**
	 * crawl项目 动态代理ip缓存
	 */
	public static final String C_CRAWL_PROXY_IP = "c_crawl_proxy_ip";

	/**
	 * 代理ip的前缀编码
	 */
	public static final String C_PULGIN_PROXY_IP = "c_pulgin_proxy_ip_";

	public static String getPulginProxyIpKey(String ip, Integer port) {
		return C_PULGIN_PROXY_IP + ip + SymbolConstants.UNDERLINE + port;
	}

	/**
	 * 代理ip的前缀编码
	 */
	public static final String C_COMM_USER_WIN = "c_comm_user_win";
	/************************
	 * 资讯信息缓存 start
	 *****************************************/
	/**
	 * 查询pc首页新闻资讯信息接口缓存
	 */
	public static final String C_PC_ARTICLE_FIND_HOME = "c_pc_article_find_home";
	/**
	 * 查询手机首页新闻资讯信息
	 */
	public static final String C_COMM_ARTICLE_FIND_HOME = "c_comm_article_find_home";
	/**
	 * 查询pc首页新闻资讯信息接口缓存
	 */
	public static final String C_PC_ARTICLE_FIND_BY_TYPE_LIST = "c_pc_article_find_by_type_list";

	/**
	 * 查询某个栏目的资讯信息
	 */
	public static final String C_COMM_ARTICLE_FIND_BY_TOP = "c_comm_article_find_by_top";

	/**
	 * 查询某个资讯详细信息
	 */
	public static final String C_COMM_ARTICLE_FIND_BY_CENTENT = "c_comm_article_find_by_centent";

	/**
	 * 查询专栏信息
	 */
	public static final String C_PC_ARTICLE_FIND_BY_CODE = "c_pc_article_find_by_code";

	/**
	 * 查询标签相似的信息
	 */
	public static final String C_COMM_ARTICLE_FIND_BY_LABLE = "c_comm_article_find_by_lable";

	/**
	 * 查询资讯所有栏目信息
	 */
	public static final String C_COMM_ARTICLE_FIND_LIST = "c_comm_article_find_list";

	/**
	 * 根据父节点查询子节点信息
	 */
	public static final String C_PC_ARTICLE_FIND_BY_FATYPE = "c_pc_article_find_by_fatype";
	/**
	 * 查询资讯栏目关系
	 */
	public static final String C_COMM_ARTICLE_FIND_RELA_LIST = "c_comm_article_find_rela_list";
	/**
	 * 查询侧边栏资讯头条信息 ，查询规则查当前节点和子节点下创建的信息
	 */
	public static final String C_PC_ARTICLE_FIND_SIDEBAR_NEWS = "c_pc_article_find_sidebar_news";
	/**
	 * 查询点击信息
	 */
	public static final String C_COMM_ARTICLE_UPDATE_CLICK = "c_comm_article_update_click";
	/************************ 资讯信息缓存end *****************************************/

	/************************ 广告信息缓存start *****************************************/
	public static final String C_COMM_AD_FIND_HOME_OPER_AD = "c_comm_ad_find_home_oper_ad";
	/************************ 广告信息缓存end *****************************************/
	/************************ 版本信息缓存start *****************************************/
	public static final String C_COMM_VERSION_FIND_NEW_VERSION = "c_comm_version_find_new_version";

	/************************ 彩种信息缓存start *****************************************/
	/**
	 * 查询所有彩种信息
	 */
	public static final String C_COMM_LOTTERY_FIND_ALL_TYPE = "c_comm_lottery_find_all_type";
	/**
	 * 查询高频彩最大截止销售时间信息
	 */
	public static final String C_COMM_LOTTERY_FIND_HIGH_MAX_ENDDRAWTIME = "c_comm_lottery_find_high_max_enddrawtime";
	/************************ 彩种信息缓存end *****************************************/
	/************************ 快投信息缓存start *****************************************/
	/**
	 * 查询快投信息
	 */
	public static final String C_COMM_FAST_FIND_FAST_INFO = "c_comm_fast_find_fast_info";
	/************************ 快投信息缓存end *****************************************/
	/************************ 彩种运营信息缓存start *****************************************/
	/**
	 * 查询彩种运营信息
	 */
	public static final String C_COMM_LOTTERY_FIND_HOME_OPER = "c_comm_lottery_find_home_oper";

	/************************ 彩种运营信息缓存end *****************************************/

	/************************ 帮助中心缓存start *****************************************/
	/**
	 * 帮助中心热搜词: c_comm_help_hotword_{num}
	 */
	public static final String C_COMM_HELP_HOTWORD = "c_comm_help_hotword";

	/**
	 * 帮助中心关键字: c_comm_help_keyword_{platform}_{keyword}
	 */
	public static final String C_COMM_HELP_KEYWORD = "c_comm_help_keyword";

	/**
	 * 帮助中心栏目树
	 */
	public static final String C_COMM_HELP_TYPE_TREE = "c_comm_help_type_tree";

	/**
	 * 帮助中心栏目列表
	 */
	public static final String C_COMM_HELP_TYPE_LIST = "c_comm_help_type_list";

	/**
	 * 帮助中心栏目和栏目下的文章信息: c_core_help_type_article_{参数md5}
	 */
	public static final String C_COMM_HELP_TYPE_ARTICLE = "c_comm_help_type_article";

	/**
	 * 帮助中心文章详情: c_comm_help_article_{platform}_{id}
	 */
	public static final String C_COMM_HELP_DETAIL = "c_comm_help_detail";

	/**
	 * 帮助中心栏目下热搜词
	 */
	public static final String C_COMM_HELP_RELATEDWORD = "c_comm_help_relatedword";

	/**
	 * 帮助中心彩种介绍列表
	 */
	public static final String C_COMM_HELP_LOTTERY_LIST = "c_comm_help_lottery_list";

	/**
	 * 帮助中心子栏目
	 */
	public static final String C_COMM_HELP_TYPE_CHILD = "c_comm_help_type_child";

	/**
	 * 用于清除帮助中心缓存的key
	 */
	public static final String C_COMM_HELP_CLEAR = "c_comm_help_*";

	/************************ 帮助中心缓存end *****************************************/
	/************************ 开奖公告缓存start *****************************************/
	public static final String C_CORE_DRAW_LOTTERY = "c_core_draw_lottery";
	/************************ 开奖公告缓存end *****************************************/
	/************************ 活动缓存start *****************************************/

	/**
	 * 活动详细信息
	 */
	public static final String C_CORE_ACTIVITY_MAIN = "c_core_activity_main";
	/**
	 * 活动详细信息
	 */
	public static final String C_ACTIVITY_TICKETED_MQ_KEY = "c_activity_ticketed_mq_key";
	/**
	 * 活动详细信息
	 */
	public static final String C_ACTIVITY_TICKETED_MQ_SET = "c_activity_ticketed_mq_set";

	/**
	 * 提供前端的活动基础信息
	 */
	public static final String C_COMMON_ACTIVITY_BASE = "c_common_activity_base";

	/**
	 * 字典数据
	 */
	public static final String C_CORE_DIC_DATA = "c_core_dic_data";
	
	/**
	 * 活动缓存(查询活动信息)
	 */
	public static final String C_ACTIVITY_RULE_INFO = "c_activity_rule_info";
	/**
	 * 活动缓存(查询活动信息)
	 */
	public static final String C_ACTIVITY_SPORT_RULE_INFO = "c_activity_sport_rule_info";
	/************************ 活动缓存end *****************************************/

	/************************************** 会员中心相关缓存 ***************************************/

	/**
	 * 敏感词汇信息缓存
	 */
	public static final String C_CORE_ACCOUNT_KEYWORD = "c_core_account_key_word";

	/**
	 * 手机号码段
	 */
	public static final String C_CORE_MEMBER_MOBILE_NUM_SEGMENT = "c_core_member_mobile_num_segment";

	public static final String C_CORE_VERIFY_CODE_ERR_COUNT = "c_core_verify_code_err_count";

	/**
	 * 查询钱包信息统计 c_comm_user_winning、c_comm_user_winning_{lotteryCode}
	 */
	public static final String C_COMM_USER_WINNING = "c_comm_user_winning";

	/**
	 * 用户信息缓存 key前缀(TOKEN_MEMBER_USER_C+token)，已过期，不再使用此方式存储用户信息
	 */
	@Deprecated
	private static final String C_CORE_MEMBER_INFO = "c_core_member_info";

	/**
	 * 用户Token缓存，缓存内容为用户ID
	 */
	public static final String C_CORE_MEMBER_INFO_TOKEN = "c_core_member_info_token_";

	/**
	 * 用户信息缓存，缓存key为用户ID，缓存内容为用户信息对象
	 */
	public static final String C_CORE_MEMBER_INFO_ID = "c_core_member_info_id_";

	/**
	 * 普通验证码缓存key前缀 v1.0
	 */
	private static final String C_CORE_COMMON_CODE = "c_core_common_code";

	/**
	 * 普通验证码缓存key前缀
	 */
	public static final String C_CORE_MEMBER_RETRIEVE = "c_core_member_retrieve";

	/**
	 * 验证码一分钟有效期 v1.0
	 */
	public static final String C_CORE_ONE_MINUTE = "c_core_one_minute";

	/**
	 * h5端微信公众号账号权限管理
	 */
	public static final String C_H5_WX_ACCOUNT = "c_h5_wx_account";
	/**
	 * 缓存年会活动用户id
	 */
	public static final String C_ACTIVITY_ANNUAL_MEET = "c_activity_annual_meet";

	/**
	 * 积分兑换兑换码库存分布式锁
	 */
	public static final String C_CORE_COOPERATE_CDKEY_LOCK = "c_core_cooperate_cdkey_lock";

	/**
	 * 积分兑换码兑换分布式锁
	 */
	public static final String C_CORE_COOPERATE_CDKEY_EXCHANGE_LOCK = "c_core_cooperate_cdkey_exchange_lock_";

	/**
	 * 积分兑换渠道登录错误次数缓存
	 */
	public static final String C_CORE_COOPERATE_CHANNEL_ERROR = "c_core_cooperate_channel_error_";

	/**
	 * 渠道登录token，存渠道ID
	 */
	public static final String C_CORE_COOPERATE_CHANNEL_INFO_TOKEN = "c_core_cooperate_channel_info_token_";

	/**
	 * 渠道ID，存渠道信息
	 */
	public static final String C_CORE_COOPERATE_CHANNEL_INFO_ID = "c_core_cooperate_channel_info_id_";

	/**
	 * 中介商户可见渠道列表
	 */
	public static final String C_CORE_COOPERATE_AGENCY_CHANNEL_LIST = "c_core_cooperate_agency_channel_list_";

	/**
	 * 积分兑换码队列
	 */
	public static final String C_CORE_COOPERATE_CDKEY_QUEUE = "c_core_cooperate_cdkey_queue";

	/**
	 * 记录用户Token
	 */
	public static final String C_CORE_COOPERATE_USER_TOKEN = "c_core_cooperate_user_token_";

	/**
	 * 微信openid加锁缓存
	 */
	public static final String C_CORE_WECHAT_OPEN_ID_LOCK = "c_core_wechat_open_id_lock_";
	
	/**
	 * lotto-common-core 查询推荐赛事
	 */
	public static final String C_COMM_MATCH_FB_RECOMMEND_LIST = "c_comm_match_fb_recommend_list";

	public static String getMinuteKey(String userName, Short sendType) {
		String oneMinutekey = userName + sendType.toString() + C_CORE_ONE_MINUTE;
		return oneMinutekey;
	}

	public static String getCommonCodeCacheKey(String token) {
		return C_CORE_COMMON_CODE + token;
	}

	public static String getMemberRetrieveKey(String userName, Short status) {
		return C_CORE_MEMBER_RETRIEVE + userName + status.toString();
	}

	// 公共平台的静态变量和方法 end

	/************************
	 * 数字彩组缓存定义 begin
	 ************************************/
	/**
	 * 查询遗漏前缀+彩种id+遗漏类别+方法名(主要用于各彩种首页接口的缓存，如遗漏冷热概率数据，近期开奖信息等)
	 */
	public static final String N_CORE_LOTTO_OMIT = "n_core_lotto_omit_";

	/**
	 * 
	 * @desc 遗漏前缀+彩种id+遗漏类别+查询期数+方法名
	 * @create 2017年12月21日
	 * @param lotteryCode
	 * @param omitTypes
	 * @param methodName
	 * @return String
	 */
	public static final String getLotteryOmitKey(Integer lotteryCode, List<Integer> omitTypes, Integer qryCount, List<Integer> subPlays,
			String methodName) {
		StringBuffer key = new StringBuffer(N_CORE_LOTTO_OMIT + lotteryCode);
		if (omitTypes != null) {
			key.append(SymbolConstants.UNDERLINE + "omitTypes");
			for (Integer type : omitTypes) {
				key.append(SymbolConstants.UNDERLINE + type);
			}
		}
		if (qryCount == null) {
			qryCount = 10;
		}
		key.append(SymbolConstants.UNDERLINE + "qryCount" + SymbolConstants.UNDERLINE + qryCount);
		if (subPlays != null) {
			key.append(SymbolConstants.UNDERLINE + "subPlays");
			for (Integer subPlay : subPlays) {
				key.append(SymbolConstants.UNDERLINE + subPlay);
			}
		}
		key.append(SymbolConstants.UNDERLINE + methodName);
		return key.toString();
	}

	/** 彩种走势前缀 前缀+彩种id+彩期+类别(主要用于走势图相关的接口) */
	public static final String N_CORE_LOTTO_TREND = "n_core_lotto_trend_";

	/**
	 * @desc 前缀+彩种id+彩期+类别
	 * @create 2017年11月17日
	 * @return String
	 */
	public static String getLotteryTrendKey(Integer lotteryCode, String startIssue, String endIssue, int qryCount, String trendCategory) {
		return N_CORE_LOTTO_TREND + lotteryCode + SymbolConstants.UNDERLINE + startIssue + SymbolConstants.UNDERLINE + endIssue
				+ SymbolConstants.UNDERLINE + qryCount + SymbolConstants.UNDERLINE + trendCategory;
	}

	/** 查询某个彩种头部的彩期信息前缀+彩种id(目前仅用在各彩种首页的基础数据查询接口) */
	public static final String N_CORE_LOTTO_ISSUE_TYPE_TOP = "n_core_lotto_issue_type_top_";

	/**
	 * @desc 各彩种首页信息的缓存key
	 * @author huangb
	 * @date 2017年12月20日
	 * @param lotteryCode
	 *            彩种
	 * @param platform
	 *            平台
	 * @return 缓存key
	 */
	public static String getLotteryTopKey(Integer lotteryCode, Short platform) {
		return N_CORE_LOTTO_ISSUE_TYPE_TOP + lotteryCode + SymbolConstants.UNDERLINE + platform;
	}

	/************************
	 * 数字彩组缓存定义 end
	 **************************************/

	/**************** 代理系统缓存key ******************/
	// 代理提款记录缓存
	public static final String P_CORE_AGENT_TAKEN_RECORD = "p_core_agent_taken_record";
	// 更新代理钱包上锁的键
	public static final String P_CORE_AGENT_WALLET_LOCK = "p_core_agent_wallet_lock_";



}

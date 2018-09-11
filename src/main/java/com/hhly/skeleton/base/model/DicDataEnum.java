package com.hhly.skeleton.base.model;


/**
 * @author Bruce
 *
 * @date 2016年12月6日
 *
 * @desc 数据字典表编码定义
 */
public enum DicDataEnum {
	
	/**
	 * 规则定义：按照模块划分，例如：0103,01：系统管理;03：部门(下拉名称)。
	 */
	
	/**
	 * 公用
	 */
	WEEK("0001","星期（星期一：1，星期二：2）"),
	/**
	 * 是否显示，0：否；1：是；
	 */
	DISPLAY("0002", "是否显示"),
	
	USE("0003", "禁用启用"),
	
	TRIGGER_STATE("0004", "定时器运行状态"),
	/**
	 * 系统管理-菜单管理
	 */
	 SYS_MENU_OPER("0101","操作"),

     SYS_MENU_LEVEL("0102","菜单等级"),
	 
	/**
	 * 系统管理-角色管理
	 */
	 SYS_ROLE_DEPART("0103","部门"),
	

	 SYS_ROLE_STATUS("0104","角色状态"),
	
	/**
	 * 会员管理
	 */
	 CUST_USER_SEX("0201","性别"),
	
	 CUST_HEAD_STATUS("0202","头像状态"),
	 
	 CUST_USER_STATUS("0203","用户状态"),
	 
	 CUST_USER_CHECKED("0204","是否认证"),
	 
	 CUST_USER_MODIFY("0205","是否修改"),
	 
	 CUST_USER_WALLET("0206","会员钱包状态"),
	 
	 CUST_USER_SERECH_TYPE("0207","会员查询类型"),
	 
	 CUST_USER_SERECH_TIME("0208","会员查询时间类型"),
	 
	 CUST_USER_OPEN_PHONE("0209","是否开启手机登录"),
	 
	 CUST_USER_OPEN_EMAIL("0210","是否开启邮箱登录"),
	 //会员类型 0211
	 // 推单用户标识 0：用户,1:专家
	 CUST_USER_ISSUE_LEVEL("0212","推单用户标识"),
	 // 推单用户状态 0:禁用; 1:启用
	 CUST_USER_ISSUE_STATUS("0213","推单用户状态"),
	
	 /**
	 * 彩种管理-彩种管理
	 */
	 LOTTERY_ISSUE_ADDED("0301","停止添加彩期"),
	 
	 LOTTERY_ADMIN_CATEGORY("0302","行政类别"),
	 
	 LOTTERY_CATEGORY("0303","彩种类型"),
	 
	 LOTTERY_SALE_STATUS("0304","销售状态"),
	 
	 LOTTERY_AREA("0305","所属省份"),
	 
	 LOTTERY_AUTO_TYPE("0306","开派奖类型"),
	 
	 LOTTERY_SYN_ISSUE("0307","同步第三方彩期"),
	 /**
	  * 彩种-限号管理
	  */
	 LOTTERY_LIMIT_STATUS("0308", "彩种限号状态"),
	 LOTTERY_LIMIT_TYPE("0309", "彩种限号类型"),
	 LOTTERY_LIMIT_INFO_STATUS("0310", "彩种限号内容状态"),
	 
	 /**
	 * 彩种管理-彩期管理
	 */
	 
	 ISSUE_CURRENT_ISSUE("0401","是否当前期"),
	 
	 ISSUE_SALE_STATUS("0402","销售状态"),
	 
	 ISSUE_SSQ_GRADE("0403","中奖级别"),
	
	 /**
	 *  4场进球
	 */
	 ISSUE_JQ4_GRADE("0404","中奖级别"),
	
	 /**
	 *  6场半全场
	 */
	 ISSUE_HF6_GRADE("0405","中奖级别"),
	 
	 /**
	 * 14场胜负彩
	 */
	 ISSUE_SF14_GRADE("0406","中奖级别"),
	 
	 /**
	 * 任选9
	 */
	ISSUE_SF9_GRADE("0407","中奖级别"),
	
	 
	 /**
	  * 彩种管理-竞技彩管理
	  */
	 SPORT_MATCH_TYPE("0501","赛事分类"),
	 
	 SPORT_IS_RECOMMEND("0502","推荐赛事"),
	 
	 SPORT_IS_NEUTRAL("0503","中立场"),
	 
	 /**
	  * 彩种管理-竞技彩管理-竞彩足球，竞彩篮球销售状态
	  */
	 SPORT_SALE_STATUS1("0504","销售状态"),
	 
	 /**
	  * 彩种管理-竞技彩管理-北京单场，胜负过关销售状态
	  */
	 SPORT_SALE_STATUS2("0505","销售状态"),
	 
	 SPORT_AGAINST_OLD("0506","赛事状态"),
	 
	 SPORT_AGAINST_OTHER("0507","赛事状态"),


	/**
	 * 赛事结果。胜平负
	 */
	 SPORT_MATCH_RESULT("0508","赛事结果"),
	/**
	 * 赛事结果。6场胜平负
	 */
	SPORT_SIX_RESULT("0509","6场胜平负"),
	/**
	 * 竞技彩足彩子玩法
	 */
	SPORT_FB_BB_CHILD_PAY("0510","竞技彩足彩子玩法"),
	/**
	 * 竞技彩足彩和篮球子玩法状态
	 */
	SPORT_FB_CHILD_PAY_STATUS("0511","竞技彩足彩和篮球子玩法状态"),

	/**
	 * 北京单场子玩法状态
	 */
	SPORT_BJ_CHILD_PAY_STATUS("0512","北京单场子玩法状态"),

	/**
	 * 北京单场上下盘单双
	 */
	SPORT_OVER_UNDER_SINGLE_OR_DOUBLE("0513","北京单场上下盘单双"),

	/**
	 * 北京单场子玩法
	 */
	SPORT_BJ_CHILD_PAY("0514","北京单场子玩法"),

	/**
	 * 竞彩篮球子玩法
	 */
	SPORT_BB_CHILD_PAY("0515","竞彩篮球子玩法"),


	/**
	  * 方案管理
	  */
	 ORDER_ORDER_CODE("0601","编号"),
	 ORDER_ORDER_USER_TYPE("0602","查询用户类型"),
	 ORDER_ORDER_SOURCE("0603","订单来源"),
	 ORDER_ORDER_TIME("0604","订单时间类型"),
	 ORDER_ORDER_WAY("0605","选号方式"),  
	 ORDER_ORDER_CONTENT_TYPE("0606","类容类型"), 
	 ORDER_ORDER_BUY_TYPE("0607","购买类型"), 
	 ORDER_ORDER_PAY_STATUS("0608","支付状态"),
	 ORDER_ORDER_STATUS("0609","方案状态"),
	 ORDER_ORDER_WIN_STATUS("0610","中奖状态"),
	 ORDER_ORDER_WIN_GRADE("0611","中奖等级"),
	 ORDER_ORDER_SIS("0612","统计方式"),
	 ORDER_CATHECTIC_TYPE("1512","投注类型"),
	 
	 ORDER_CHASE_TIME("0613","追号时间类型"),
	 ORDER_CHASE_TYPE("0614","追号类型"),
	 ORDER_CHASE_STATUS("0615","追号状态"),
	 ORDER_CHASE_STOP_TYPE("0616","停追类型"),
	 ORDER_CHASE_ISSUE_STATUS("0617","追号彩期状态"),
	 
	 ORDER_DLT_ADD("0618","是否大乐透追加"),
	 ORDER_UPDATE_STATUS("0619","订单可修改状态"),
	 ORDER_CHECK_TICKET("0620","是否允许检票"),
	 ORDER_OPERATE("0621","订单操作"),
	 ORDER_CANCEL_TYPE("0622", "订单撤单原因"),
	 
	 /**
	  * 市场渠道管理
	  */
	 OPERATE_MARKET_CHANNEL_GRAGE("0701","级别"),
	 OPERATE_MARKET_CHANNEL_TPF("0702","终端平台"),
	 OPERATE_MARKET_CHANNEL_ST("0703","结算类型"),
	 OPERATE_MARKET_CHANNEL_TIME("0704","时间类型"),
	 OPERATE_MARKET_CHANNEL_STATUS("0705","状态"),
	 
	 /**
	  * 调度管理
	  */
	 TASK_JOB_STATUS("0801", "任务状态"),
	 TASK_JOB_AUTO_RUN("0802", "是否自动运行"),
	 TASK_JOB_GROUP("0803", "任务分组"),
	 TASK_JOB_RUN_WAY("0804", "任务运行方式"),
	 TASK_JOB_RUN_RESULT("0805", "任务运行结果"),
	 /**
	  * 活动管理
	  */
	 OPERATE_ACTIVITY_TYPE("1001","活动类型"),
	 OPERATE_ACTIVITY_STATUS("1002","活动状态"),
	 OPERATE_ACTIVITY_TIME("1003","活动时间类型"),
	 
		/**
		 * 财务管理
		 */
		TRANS_TYPE("0901","交易分类"),
		TRANS_STATUS("0902","交易状态"),
		// 用户充值及用户流水查询可用
		TRANS_TIME_TYPE("0903","流水时间类型"),
		TRANS_RED_TIME_TYPE("0904","红包流水时间类型"),
		TRANS_RECHARGE_CHANNEL("0905","充值渠道"),
		TRANS_BANK_CARD_TYPE("0906","银行卡分类"),
		TRANS_BANK_NAME("0907","银行名称"),
		TRANS_RECHARGE_STATUS("0908","充值交易状态"),
		TRANS_PAY_TYPE("0909","支付方式分类"),
		TRANS_TAKEN_STATUS("0910","提款交易状态"),
		TRANS_BATCH_STATUS("0911","批次状态"),
		TRANS_SETTLE_STATUS("0912","结算状态"),
		TRANS_SETTLE_TYPE("0913","结算类型"),
		TRANS_SETTLE_TIME_TYPE("0914","结算时间类型"),
		TRANS_RED_TYPE("0915","红包流水类型"),
		TRANS_MONEY_TYPE("0916","资金类型"),
		TRANS_TAKEN_EXCEL_BANK("0917","用户提款导出Excel银行"),
		TRANS_REMITTING_BANK("0918","用户汇款银行"),

		//优惠券管理
		OPERATE_COUPON_CATEGORY("1101","红包种类"),
		OPERATE_COUPON_TYPE("1102","红包类型"),
		OPERATE_COUPON_STATUS("1103","红包状态"),
		OPERATE_COUPON_TIME("1104","时间类型"),
		OPERATE_COUPON_PLATFORM("1105","限制平台"),
		OPERATE_COUPON_SOURCE("1106","来源类型"),
		OPERATE_COUPON_RANDOM_TYPE("1107", "随机红包类型"),
		//出票渠道配置
		TICKET_CONFIG_STATUS("1201","状态"),
		TICKET_CONFIG_AUTO("1202","是否主动查票"),
		//票报警信息
		TICKET_ALARM_TYPE("1401","报警类型"),
		TICKET_ALARM_STATUS("1402","报警信息状态"),
		TICKET_ALARM_LEVEL("1403","报警等级"),
		TICKET_ALARM_TIME("1404","时间类型"),
		TICKET_ALARM_CHILD_SERVICE("1405","报警业务子类型"),
		TICKET_ALARM_CHILD_SYSTEM("1406","报警系统子类型"),
		TICKET_ALARM_CONFIG_STATUS("1407","报警开关"),
		//票监控
		TICKET_MONITOR_CONFIG_STATUS("1408","是否显示"),
		/**
		 * 票管理：票时间类型
		 */
		TICKET_INFO_TIME_TYPE("1409","票时间类型"),
		TICKET_INFO_STATUS("1410","票状态"),
		TICKET_UPDATE_STATUS("1411","修改票状态"),
		TICKET_OPERATE("1412","票执行操作"),
		TICKET_UPLOAD_TYPE("1413","票上传"),
		/**
		 * 运营管理
		 */
		OPERATE_RELEASE_PLATFORM("1501","发布平台"),
		OPERATE_RELEASE_STATUS("1502","发布状态"),
		OPERATE_AD_MENU("1503","广告图页面"),
		OPERATE_AD_POSITION("1504","广告图位置"),
		OPERATE_TIME("1505","时间类型"),
		OPERATE_AD_DISPLAY("1506","广告可见次数"),
		OPERATE_AD_CUSTOMER("1507","广告对象"),
		OPERATE_TARGET("1508","打开方式"),
		OPERATE_LOTTERY_DISPLAY("1509","是否显示"),
		OPERATE_ICON("1510","运营图标"),
		OPERATE_ARTICLE_STATUS("1513","文章状态"),
		OPERATE_IMAGE_GROUP("1522","图片分组"),
		OPERATE_ARTICLE_TIME("1514","文章时间类型"),
		OPERATE_ARTICLE_DISPLAY("1515","文章显示"),
		OPERATE_ARTICLE_DIR_VIRTUAL("1523","虚拟栏目"),
		// 是否为默认广告  0：否，1：是
		OPERATE_AD_DEFAULT("1524","是否默认"),
		
		/*
		 * 敏感词
		 */
		
		KEYWORD_GRADE("2001","敏感级别"),
		KEYWORD_STATUS("2002","敏感状态"),
		
		/**
		 * 意见箱来源
		 */
		OPEARTE_HELP_CORRECT_SOURECE("2201", "意见来源"),
		OPEARTE_HELP_CORRECT_STATUS("2202", "意见处理状态"),
		OPEARTE_HELP_CORRECT_TYPE("2203", "意见类型"),
		
		/**
		 * 埋点
		 */
		BP_FUNNEL_CRITERIA("2701", "漏斗查询条件"),
		BP_FUNNEL_CRITERIA_OPT("2702", "漏斗查询条件操作符"),
		
		H5_WX_ACC_PRIVILEG("9994", "微信公众号管理"),
		LOTTO_DRAW_MERGE("9995", "彩种彩期信息合并管理"),
		ACTIVITY_WIN_USER("9996", "中奖用户显示管理"),
		MOBILE_SEGMENT("9997", "手机段管理"),
		OPEN_STATUS("9998","更新开关"),
    CUSTOMER_TELEPHONE("9999", "客服电话"),

    /*** 积分兑换 *****/
    PAY_ClASS("1601", "交易类型"),
    CDKEY_STATUS("1603", "交易类型"),
    /***** 投注彩种限制渠道 **********/
    LOTTO_LIMIT_CHANNEL("0320", "投注彩种限制渠道"),
    ;
    /**
	 * 数据编码
	 */
	private String dicCode;
	/**
	 * 数据名称
	 */
	private String dicName;

	DicDataEnum(String dicCode, String dicName) {
		this.dicCode = dicCode;
		this.dicName = dicName;
	}

	public String getDicCode() {
		return dicCode;
	}

	public void setDicCode(String dicCode) {
		this.dicCode = dicCode;
	}

	public String getDicName() {
		return dicName;
	}

	public void setDicName(String dicName) {
		this.dicName = dicName;
	}

}

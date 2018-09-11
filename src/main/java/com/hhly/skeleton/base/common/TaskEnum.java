package com.hhly.skeleton.base.common;

/**
 * @desc 调度管理相关枚举
 * @author huangb
 * @date 2017年2月23日
 * @company 益彩网络
 * @version v1.0
 */
public class TaskEnum {
	/**
	 * @author huangb
	 *
	 * @Date 2017年1月6日
	 *
	 * @Desc 调度任务是否自动运行
	 */
	public enum JobAutoRun {

		NO("否", (short) 0), YES("是", (short) 1);

		/**
		 * 描述
		 */
		private String desc;
		/**
		 * 值
		 */
		private short value;

		JobAutoRun(String desc, short value) {
			this.desc = desc;
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public short getValue() {
			return value;
		}

		public void setValue(short value) {
			this.value = value;
		}

		/**
		 * @param value
		 * @return
		 * @Desc 是否包含指定值
		 */
		public static boolean contain(short value) {
			for (JobAutoRun temp : JobAutoRun.values()) {
				if (temp.getValue() == value) {
					return true;
				}
			}
			return false;
		}
	}

	/**
	 * @author huangb
	 *
	 * @Date 2017年1月6日
	 *
	 * @Desc 调度任务运行方式
	 */
	public enum JobRunWay {

		MANUAL("手动执行", (short) 1), AUTO("自动执行", (short) 2);

		/**
		 * 描述
		 */
		private String desc;
		/**
		 * 值
		 */
		private short value;

		JobRunWay(String desc, short value) {
			this.desc = desc;
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public short getValue() {
			return value;
		}

		public void setValue(short value) {
			this.value = value;
		}

		/**
		 * @param value
		 * @return
		 * @Desc 是否包含指定值
		 */
		public static boolean contain(short value) {
			for (JobRunWay temp : JobRunWay.values()) {
				if (temp.getValue() == value) {
					return true;
				}
			}
			return false;
		}
	}

	/**
	 * @author huangb
	 *
	 * @Date 2017年1月6日
	 *
	 * @Desc 调度任务状态
	 */
	public enum JobStatus {

		INVALID("无效", (short) 0), VALID("有效", (short) 1), DELETED("已删除", (short) 2);

		/**
		 * 描述
		 */
		private String desc;
		/**
		 * 值
		 */
		private short value;

		JobStatus(String desc, short value) {
			this.desc = desc;
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public short getValue() {
			return value;
		}

		public void setValue(short value) {
			this.value = value;
		}

		/**
		 * @param value
		 * @return
		 * @Desc 是否包含指定状态
		 */
		public static boolean contain(short value) {
			for (JobStatus temp : JobStatus.values()) {
				if (temp.getValue() == value) {
					return true;
				}
			}
			return false;
		}
	}

	/**
	 * @author huangb
	 *
	 * @Date 2017年1月6日
	 *
	 * @Desc 失败与成功标识(公用，可标识状态或结果等)
	 */
	public enum FailSucFlag {

		FAIL("失败", (short) 0), SUCCESS("成功", (short) 1);

		/**
		 * 描述
		 */
		private String desc;
		/**
		 * 值
		 */
		private short value;

		FailSucFlag(String desc, short value) {
			this.desc = desc;
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public short getValue() {
			return value;
		}

		public void setValue(short value) {
			this.value = value;
		}

		/**
		 * @param value
		 * @return
		 * @Desc 是否包含指定值
		 */
		public static boolean contain(short value) {
			for (FailSucFlag temp : FailSucFlag.values()) {
				if (temp.getValue() == value) {
					return true;
				}
			}
			return false;
		}
	}
	/**
	 * @desc 任务编号枚举(编号为6位数字的字符串，前3位表示彩种编号，后3位表示任务递增数，000开头表示不区分彩种的任务)
	 * @author jiangwei
	 * @date 2017年5月3日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum TaskId{
		/**
		 * 送票
		 */
		SEND_TICKET("000001"),
		/**
		 * 彩期切换
		 */
		ISSUE_CHANGE("000002"),
		
		/**
		 * 出票渠道-同步余额
		 */
		TICKET_CHANNEL_MONEY_SYN("000003"),
		
		/**
		 * 红包过期作废任务
		 */
		RED_COUPON_STATUS_CANCEL("000004"),

		/** 追号相关编号 000010~000019 */
		/**
		 * 手动追号
		 */
		MANUAL_CHASE("000010"),
		/**
		 * 手动追号撤单
		 */
		MANUAL_CHASE_CANCEL("000011"),
		/**
		 * 手动追号撤单(批量)
		 */
		MANUAL_CHASE_BATCH_CANCEL("000012"),
		/**
		 * 手动追号撤单-目标计划所有剩余期撤单
		 */
		MANUAL_CHASE_CANCEL_REMAIN("000013"),
		/**
		 * 手动操作：撤单中追号计划退款
		 */
		MANUAL_CHASE_REFUND("000014"),
		
		/** 开奖/派奖 相关编号 000020~000029 */
		/**
		 * 手动开奖
		 */
		MANUAL_DRAW_CODE("000020"),
		/**
		 * 重置开奖
		 */
		RESET_DRAW("000021"),
		
		/**
		 * 手动派奖
		 */
		MANUAL_PAYOUT_AWARD("000024"),
		
		/** 竞技彩种按钮任务  000030~000039*/
		/**
		 * 老足彩获取比赛按钮
		 */
		SPORT_OLDFB_MATCH_SYN("000030"),
		/**
		 * 竞技足球获取比赛按钮
		 */
		SPORT_FB_MATCH_SYN("000031"),
		/**
		 * 竞技篮球获取比赛按钮
		 */
		SPORT_BB_MATCH_SYN("000032"),	
		/**
		 * 同步分析数据按钮(一比分同步)
		 */
		SPORT_ANALYZE_SYN("000033"),
		/**
		 * 同步过关统计按钮
		 */
		SPORT_PASS_STAT_SYN("000034"),
		/**
		 * 同步抓取比分按钮
		 */
		SPORT_GRAB_SCORE_SYN("000035"),	
		/**
		 * 开奖按钮
		 */
		SPORT_RUN_LOTTERY("000036"),
		/**
		 * 竞彩赛事状态变更
		 */
		SPORT_MATCH_STAUTS_UPD("000037"),
		/** 财务管理 相关编号 000040~000049 */
		/**
		 * 手动充值补单
		 */
		MANUAL_TRANS_RESUPLY("000040"),
		/**
		 * 自动充值补单
		 */
		AUTO_TRANS_RESUPLY("000041"),
		/**
		 * 手动执行的人工充值
		 */
		MANUAL_TRANS_RECHARGE("000042"),
		
		/** 订单操作相关编号 000050~000069 */
		/**
		 * 手动订单撤单
		 */
		MANUAL_ORDER_CANCEL("000050"),
		
		/**
		 * 手动订单撤单(批量)
		 */
		MANUAL_ORDER_BATCH_CANCEL("000051"),
		/**
		 * 手动订单退款（撤单中退款）
		 */
		MANUAL_ORDER_REFUND("000052"),
		/**
		 * 手动流产
		 */
		MANUAL_ORDER_ABORT("000053"),
		
		/**
		 * 双色球彩期切换
		 */
		SSQ_ISSUE_CHANGE("100001"),
		/**
		 * 双色球彩期生成
		 */
		SSQ_ISSUE_CREATE("100002"),
		/**
		 * 大乐透彩期切换
		 */
		DLT_ISSUE_CHANGE("102001"),
		/**
		 * 大乐透彩期生成
		 */
		DLT_ISSUE_CREATE("102002"),
		/**
		 * 重庆时时彩彩期切换
		 */
		CQSSC_ISSUE_CHANGE("201001"),
		/**
		 * 重庆时时彩彩期生成
		 */
		CQSSC_ISSUE_CREATE("201002"),
		/**
		 * 重庆时时彩开奖号码抓取
		 */
		CQSSC_ISSUE_CODE("201003"),
		/**
		 * 山东11选5彩期切换
		 */
		XD11X5_ISSUE_CHANGE("215001"),
		/**
		 * 山东11选5彩期生成
		 */
		XD11X5_ISSUE_CREATE("215002"),
		/**
		 * 山东11选5开奖号码抓取
		 */
		XD11X5_ISSUE_CODE("215003"),
		/**
		 * 江苏快3彩期切换
		 */
		JSK3_ISSUE_CHANGE("233001"),
		/**
		 * 江苏快3彩期生成
		 */
		JSK3_ISSUE_CREATE("233002"),
		/**
		 * 江苏快3开奖号码抓取
		 */
		JSK3_ISSUE_CODE("233003"),
		/**
		 * 竞彩足球彩期切换
		 */
		FB_ISSUE_CHANGE("300001"),
		/**
		 * 竞彩足球彩期生成
		 */
		FB_ISSUE_CREATE("300002"),
		/**
		 * 竞彩篮球彩期切换
		 */
		BB_ISSUE_CHANGE("301001"),
		/**
		 * 竞彩篮球彩期生成
		 */
		BB_ISSUE_CREATE("301002"),
		;
		TaskId(String value) {
			this.value = value;
		}
		private String value;

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

}

package com.hhly.skeleton.base.constants;

import com.hhly.skeleton.base.common.SportEnum;

public class SportConstants {

	public static final String SCORE_WIN_OTHER = "胜其它";
	public static final String SCORE_DRAW_OTHER = "平其它";
	public static final String SCORE_FAIL_OTHER = "负其它";

	public static final String HOME_WIN = "主胜";
	public static final String GUEST_WIN = "客胜";
	public static final String LET_HOME_WIN = "让分主胜";
	public static final String LET_HOME_FAIL = "让分主负";
	public static final String LET_GUEST_WIN = "让分客胜";

	public static final String HOME = "主";
	public static final String GUEST = "客";

	public static final String BIG = "大";
	public static final String SMALL = "小";

	public static final String LET_HOME = "让分主";
	public static final String LET_GUEST = "让分客";
	
	// 串关
	public static final String DAN_GUAN = "1_1";
	public static final String CHUAN_GUAN_2_1 = "2_1";

	/**
	 * 比赛状态：已开奖，已派奖
	 */
	public static final Integer[] SPORT_DRAW_STATUS = new Integer[] { SportEnum.JcMatchStatusEnum.RUN_LOTTERY.getCode(),
			SportEnum.JcMatchStatusEnum.ALLOT_LOTTERY.getCode() };

	/**
	 * 比赛状态：已开奖，已派奖，取消
	 */
	public static final Integer[] SPORT_DRAW_CANCEL_STATUS = new Integer[] { SportEnum.JcMatchStatusEnum.CANCEL.getCode(),
			SportEnum.JcMatchStatusEnum.RUN_LOTTERY.getCode(), SportEnum.JcMatchStatusEnum.ALLOT_LOTTERY.getCode() };
}

package com.hhly.skeleton.base.util;

import com.hhly.skeleton.base.constants.SportConstants;

/**
 * @desc 赛事工具类
 * @author huangchengfang1219
 * @date 2017年9月25日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class SportUtil {

	/**
	 * 比分玩法结果转换, 90表示胜其它，99表示平其它，09表示负其它；其它时候如12表示1:2，24表示2:4
	 * 
	 * @return
	 */
	public static String getScoreText(String score) {
		if (ObjectUtil.isBlank(score)) {
			return null;
		} else if ("90".equals(score)) {
			return SportConstants.SCORE_WIN_OTHER;
		} else if ("99".equals(score)) {
			return SportConstants.SCORE_DRAW_OTHER;
		} else if ("09".equals(score)) {
			return SportConstants.SCORE_FAIL_OTHER;
		} else if (score.length() == 2) {
			return score.substring(0, 1) + ":" + score.substring(1);
		}
		return score;
	}
	
	/**
	 * 比赛状态归类<br/>
	 * 未开赛：1、6、7、8、9、10、11<br/>
	       比赛中：2、12<br/>
	      半全场赛果：3、15、16、17<br/>
	      取消：5、14<br/>
	      延期：4、13<br/>
	 * @author longguoyou
	 * @date 2017年11月24日
	 * @param matchStatus
	 * @return
	 */
	public static Short getMatchStatus(Short matchStatus){
		if(ObjectUtil.isBlank(matchStatus)){
			return null;
		}
		switch(matchStatus){
		/**
		 * 赛事状态：1：等待比赛（未开赛）；2：比赛中；3：已完场（显示半全场赛果）；4：延期；5：取消
		 */
		case 1:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
			return 1;
		case 2:
		case 12:
			return 2;
		case 3:
		case 15:
		case 16:
		case 17:
			return 3;
		case 4:
		case 13:
			return 4;
		case 5:
		case 14:
			return 5;
		default:
		    break;
		}
		return null;
	}
}

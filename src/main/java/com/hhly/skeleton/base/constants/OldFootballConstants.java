package com.hhly.skeleton.base.constants;

import com.hhly.skeleton.base.util.ObjectUtil;

/**
 * 老足彩常量
 * @author longguoyou
 * @date 2017年4月19日
 * @compay 益彩网络科技有限公司
 */
public class OldFootballConstants {
	/**
	 * 投注最高注数
	 */
	public static final int BET_NUM_LIMIT = 200000;
	/**
	 * 六场半全场
	 */
	public static final int ID_HALF_OF_SIX = 302;
	/**
	 * 四场进球
	 */
	public static final int ID_FOUR_GOAL   = 303;
	/**
	 * 十四场
	 */
	public static final int ID_FOURTEEN    = 304;
	/**
	 * 九场胜负彩
	 */
	public static final int ID_NINE_SF     = 305;
	
	/**十四场/九场/六场半全场 投注内容*/
    private static final String[] FOURTEEN_BET_CONTENT = {"3", "1", "0"};
    /**四场进球 投注内容*/
    private static final String[] FOUR_GOAL_BET_CONTENT = {"3", "2", "1", "0"};  
    
	/**
	 * 老足彩检查投注内容合法性
	 * @param lotteryId 子玩法
	 * @param content 投注内容
	 * @return
	 * true:正常
	 * false:不正常(无效内容)
	 */
	public static boolean checkBetContentGame(int lotteryId,String content){
		switch (lotteryId) {
		case ID_NINE_SF: return findBetContent(content, FOURTEEN_BET_CONTENT) ;
		case ID_HALF_OF_SIX: return findBetContent(content, FOURTEEN_BET_CONTENT) ;
		case ID_FOURTEEN: return findBetContent(content, FOURTEEN_BET_CONTENT) ;
		case ID_FOUR_GOAL: return findBetContent(content, FOUR_GOAL_BET_CONTENT);
		default:
			return false;
		}
	}

	public static boolean checkLootteryId(Integer lotteryId){
		switch (lotteryId) {
			case ID_NINE_SF:
			case ID_HALF_OF_SIX:
			case ID_FOURTEEN:
			case ID_FOUR_GOAL:
				return true;
			default:
				return false;
		}
	}
	
	/**
	 * 查询玩法格式
	 * @param content 投注内容
	 * @param contents
	 * @return
	 */
	protected static boolean findBetContent(String content,String[] contents ){
		if(ObjectUtil.isBlank(content))
			return false;
		for(String temp:contents){
			if(temp.equals(content)){
				return true;
			}
		}
		return false;
	}
    
	public static String getShortName(Integer lotteryCode) {
		switch(lotteryCode){
			case ID_HALF_OF_SIX:
			case ID_FOUR_GOAL:
			case ID_FOURTEEN:
			case ID_NINE_SF:
				return  "S";
			default: return null;
		}
	}
}

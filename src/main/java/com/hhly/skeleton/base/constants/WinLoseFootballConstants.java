package com.hhly.skeleton.base.constants;

import com.hhly.skeleton.base.util.ObjectUtil;

/**
 * 胜负过关常量
 * @author longguoyou
 * @date 2017年5月9日
 * @compay 益彩网络科技有限公司
 */
public class WinLoseFootballConstants {
	/**
	 * 胜负投注内容 胜(3) 负(0)
	 */
	private static final String[] SF_BET_CONTENT = {"3", "0"};
       
	/**
     * 胜平过关 正则表匹配投注内容
     */
    private static final String REGEXP_SFGG = "[30]";
    
    /**
     * 获取正则表达式内容
     * @author longguoyou
     * @date 2017年5月9日
     * @return
     */
    public static String getLotteryCodeBySimpleCode(){
    	return REGEXP_SFGG;
    }
    
    /**
     * 检查投注内容合法性
     * @author longguoyou
     * @date 2017年5月9日
     * @param content
     * @return
     */
    public static boolean checkWinLoseBetContentGame(String content){
    	if(ObjectUtil.isBlank(content))
			return false;
		for(String temp:SF_BET_CONTENT){
			if(temp.equals(content)){
				return true;
			}
		}
		return false;
    }
}

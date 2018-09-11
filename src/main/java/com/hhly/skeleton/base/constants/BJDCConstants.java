package com.hhly.skeleton.base.constants;

import java.util.HashMap;
import java.util.Map;

import com.hhly.skeleton.base.util.ObjectUtil;

/**
 * 北京单场常量
 * @author longguoyou
 * @date 2017年3月10日
 * @compay 益彩网络科技有限公司
 */
public class BJDCConstants {
	

	/**字典*/
	private static final Map<Integer,String> map = new HashMap<Integer,String>();
	
	private static final Map<Integer,String> twoMap = new HashMap<Integer,String>();
	
	static{
		map.put(3, "胜");
		map.put(1, "平");
		map.put(0, "负");
		
		twoMap.put(1, "上单");
		twoMap.put(2, "上双");
		twoMap.put(3, "下单");
		twoMap.put(4, "下双");
	}

	
	/**  北京单场  大彩种*/
    public static final int ID_BJDC_B = 306;
	/**   让球胜平负*/
	public static final int ID_RQS = 30601;
	/**   上下单双 */
	public static final int ID_SXDX = 30602;
	/**   总进球 */
	public static final int ID_FZJQ = 30603;
	/**   比分 */
	public static final int ID_FBF = 30604 ;
	/**   半全场 */
	public static final int ID_FBCQ = 30605;
	
	/** 胜负过关  大彩种*/
    public static final int ID_SFGG_B = 307;	
	/**
	 * 胜负彩子玩法普通投注
	 */
	public static final int ID_SFC = 30701;
	
	 /**
     * 北京单场所有子玩法简称
     */
    public static final String CHILD_CODE_SIMPLE_NAME = "RSQZB";
	
	/**
	 * 北京单场彩种ID集，包含胜负彩
	 */
	public static final int[] PK_SPORT_FOOTBAL_LOTTERYS = {ID_RQS, ID_SXDX, ID_FZJQ, ID_FBF, ID_FBCQ, ID_SFC};
       
	/**
	 * 让胜平负投注内容 胜(3) 平(1) 负(0)
	 */
	private static final String[] RSPF_BET_CONTENT = {"3", "1", "0"};
	/**
	 * 上下单双
	 */
	private static final String[] SXDX_BET_CONTENT = {"1","2","3","4"};
	/**
	 * 总进球投注内容 0(0) 1(1) 2(2) 3(3) 4(4) 5(5) 6(6) 7+(7)
	 */
	private static final String[] ZJQ_BET_CONTENT = {"0", "1", "2", "3", "4", "5", "6", "7"};
	/**
	 * 单场比分全部投注内容
	 */
	private static final String[] DCBF_ALL_BET_CONTENT = {"90", "10", "20", "21", "30", "31", "32", "40", "41", "42", 
														  "99", "00", "11", "22", "33",
														  "09", "01", "02", "12", "03", "13", "23", "04", "14", "24"};
	/**
	 * 半全场胜负投注内容  胜胜(33) 胜平(31) 胜负(30) 平胜(13) 平平(11) 平负(10) 负胜(03) 负平(01) 负负(00)
	 */
	private static final String[] BQCSF_BET_CONTENT = {"33", "31", "30", "03", "13", "11", "10", "01", "00"};
	
	/**
	 * 胜负彩投注内容 胜(3) 负(0)
	 */
	private static final String[] SFC_BET_CONTENT = {"3","0"};
	
	 /**
     * 让胜平负 正则表匹配投注内容
     */
    private static final String REGEXP_SPF = "[310]";
    /**
     * 上下单双 正则表匹配投注内容
     */
    private static final String REGEXP_SXDX = "[1-4]";
    /**
     * 总进球 正则表匹配投注内容
     */
    private static final String REGEXP_FZJQ = "[0-7]";
    /**
     * 比分 正则表匹配投注内容
     */
    private static final String REGEXP_FBF = "[0123459][0123459]";
    /**
     * 半全场 正则表匹配投注内容
     */
    private static final String REGEXP_FBCQ = "[013][013]";
    
    /**
     * 胜负彩 正则表匹配投注内容
     */
    private static final String REGEXP_SFC = "[3,0]";
    
    /**
	 * 单式上传场次投注基本验证
	 */
	public static final String BETTING_UPLOAD_REGEXN = "^([0-9]{1,4}(\\:|\\→)\\[?([0-9a-zA-Z]*)\\]?)$";
	
	/**
	 * 单式上传验证过关串传入的格式是否正确
	 */
	public static final String PASSWAY_UPLOAD_REGEXN = "^([1-9][0-5]{0,1}\\_[1]{1})$";

    /**
     * 允许最高串关数 3
     */
    public static final Integer PASSWAY_LIMIT_THREE = 3;
    /**
     * 允许最高串关数 6
     */
    public static final Integer PASSWAY_LIMIT_SIX = 6;
    /**
     * 允许最高串关数 15
     */
    public static final Integer PASSWAY_LIMIT_FIFTEEN = 15;
	
    /**
     * 根据缩写获取子玩法对应正则表达式内容
     * @author longguoyou
     * @date 2017年8月17日
     * @param way 子玩法简称代号
     * @return
     */
	public static String getLotteryCodeBySimpleCode(String way){
		switch(way){
			case "R":return REGEXP_SPF;
			case "S":return REGEXP_SXDX;
			case "Z":return REGEXP_FZJQ;
			case "Q":return REGEXP_FBF;
			case "B":return REGEXP_FBCQ;
			case "W":return REGEXP_SFC;
		}
		return null;
	}
	
	/**
	 * 根据缩写获取子玩法对应的编码
	 * @author longguoyou
	 * @date 2017年6月15日
	 * @param playCode 子玩法简称代号
	 * @return 
	 */
	public static Integer getLotteryChildCode(String playCode){
		switch(playCode){
			case "B":
				return  ID_FBCQ;
			case "Q":
				return  ID_FBF;
			case "Z":
				return  ID_FZJQ;
			case "D":
				return  ID_SXDX;
			case "R":
				return  ID_RQS;
			case "W":   
				return ID_SFC;
			default: return null;
		}
	}
	
	/**
	 * 检查投注内容 合法性
	 * @param lotterId 子玩法编号
	 * @param content 投注内容
	 * @return true:正常   false:不正常(无效内容)
	 */
	public static boolean checkJCZQBetContentGame(int lotterId,String content){
		switch (lotterId) {
		case ID_RQS: return findBetContent(content, RSPF_BET_CONTENT) ; 
		case ID_SXDX: return findBetContent(content, SXDX_BET_CONTENT) ;
		case ID_FZJQ: return findBetContent(content, ZJQ_BET_CONTENT) ;
		case ID_FBF: return findBetContent(content, DCBF_ALL_BET_CONTENT) ;
		case ID_FBCQ: return findBetContent(content, BQCSF_BET_CONTENT) ;
		case ID_SFC: return findBetContent(content, SFC_BET_CONTENT);
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
		if(content == null || content.length()==0)
			return false;
		for(String  cont : contents){
			if(cont.equals(content)){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 判断彩种ID是否为北京单场
	 * @author longguoyou
	 * @date 2017年8月17日
	 * @param lotteryId 子玩法编号
	 * @return
	 */
	public static boolean checkLotteryId(int lotteryId) {
		for(int tempI : PK_SPORT_FOOTBAL_LOTTERYS){
			if(tempI == lotteryId)
				return true;
		}
		return false;
	}
	
	/**
	 * 获取子玩法对应的缩写符号
	 * @author longguoyou
	 * @date 2017年6月15日
	 * @param lotteryChildCode
	 * @return
	 */
	public static String getShortName(Integer lotteryChildCode){
		switch(lotteryChildCode){
			case ID_FBF:
				return  "Q";
			case ID_FBCQ:
				return  "B";
			case ID_FZJQ:
				return  "Z";
			case ID_SFC://胜负过关
				return  "W";//自己定义，为了处理方便
			case ID_SXDX://上下单双
				return  "D";//自己定义，为了处理方便
			case ID_RQS:
				return "R";
			default: return null;
		}
	}
     
	/**
	 * 验证最高过关方式合法性
	 * @author longguoyou
	 * @date 2017年8月14日
	 * @param passway
	 * @param childCode
	 * @return
	 */
	public static boolean verifyLimitPassway(String passway, Integer childCode) {
		switch(childCode){
		case ID_RQS:
			return BJDCConstants.PASSWAY_LIMIT_FIFTEEN < Integer.valueOf(passway.substring(0, passway.indexOf(SymbolConstants.UNDERLINE)));
		case ID_FZJQ:
			return BJDCConstants.PASSWAY_LIMIT_SIX < Integer.valueOf(passway.substring(0, passway.indexOf(SymbolConstants.UNDERLINE)));
		case ID_SXDX:
			return BJDCConstants.PASSWAY_LIMIT_SIX < Integer.valueOf(passway.substring(0, passway.indexOf(SymbolConstants.UNDERLINE)));
		case ID_FBCQ:
			return BJDCConstants.PASSWAY_LIMIT_SIX < Integer.valueOf(passway.substring(0, passway.indexOf(SymbolConstants.UNDERLINE)));
		case ID_FBF:
			return BJDCConstants.PASSWAY_LIMIT_THREE < Integer.valueOf(passway.substring(0, passway.indexOf(SymbolConstants.UNDERLINE)));
		case ID_SFC:
			return (BJDCConstants.PASSWAY_LIMIT_THREE > Integer.valueOf(passway.substring(0, passway.indexOf(SymbolConstants.UNDERLINE))) || 
					BJDCConstants.PASSWAY_LIMIT_FIFTEEN < Integer.valueOf(passway.substring(0, passway.indexOf(SymbolConstants.UNDERLINE))));
	    default:return false;
	    }
	}
	
	/**
	 * 翻译投注项为对应中文 如：3->胜
	 * @author longguoyou
	 * @date 2017年11月4日
	 * @param lotteryChildCode
	 * @param betContent
	 * @return
	 */
	public static String translate(Integer lotteryChildCode, String betContent, String initContent){
		switch(lotteryChildCode){
		case ID_FBCQ://半全场
		case ID_RQS://让分胜负
		case ID_SFC://胜负过关
			return translateThreeOneZero(betContent);
		case ID_FBF://比分
			return translateBf(betContent);
		case ID_FZJQ://总进球
			return translateScore(betContent);
		case ID_SXDX://上下单双
			return translateSxdx(betContent);
		}
		return null;
	}
	
	private static String translateSxdx(String betContent) {
		if(ObjectUtil.isBlank(betContent)){return SymbolConstants.ENPTY_STRING;}
		//上单(1) 上双(2) 下单(3) 下双(4)
		return twoMap.get(Integer.valueOf(betContent));
	}

	/**
	 * 处理：3、1、0
	 * @author longguoyou
	 * @date 2017年11月4日
	 * @param betContent
	 * @return
	 */
	private static String translateThreeOneZero(String betContent){
		if(ObjectUtil.isBlank(betContent)){return SymbolConstants.ENPTY_STRING;}
		if(betContent.length() == Constants.NUM_1){
		    return map.get(Integer.valueOf(betContent));
		}
		if(betContent.length() == Constants.NUM_2){
			return map.get(Integer.valueOf(betContent.substring(0, 1))) + "-" + map.get(Integer.valueOf(betContent.substring(1, 2)));
		}
		return null;
	}
	/**
	 * 处理比分
	 * @author longguoyou
	 * @date 2017年11月4日
	 * @param betContent
	 * @return
	 */
	private static String translateBf(String betContent){
		if(ObjectUtil.isBlank(betContent)){return SymbolConstants.ENPTY_STRING;}
		//90胜其它 、99平其它、09负其它
		if(betContent.equals("99")){
			return "平其它";
		}
		if(betContent.equals("90")){
			return "胜其它";
		}
        if(betContent.equals("09")){
			return "负其它";
		}
		return betContent.substring(0, 1) + SymbolConstants.COLON + betContent.substring(1, 2);
	}
	/**
	 * 处理总进球
	 * @author longguoyou
	 * @date 2017年11月4日
	 * @param betContent
	 * @return
	 */
	private static String translateScore(String betContent){
		if(ObjectUtil.isBlank(betContent)){return SymbolConstants.ENPTY_STRING;}
		if(Integer.valueOf(betContent) == Constants.NUM_7){
			return betContent + "+球";  
		}
		return betContent + "球";
	}
}

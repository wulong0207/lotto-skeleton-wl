package com.hhly.skeleton.base.constants;

import java.util.HashMap;
import java.util.Map;

import com.hhly.skeleton.base.util.ObjectUtil;
import com.hhly.skeleton.lotto.base.sport.bo.JclqOrderBO;

/**
 * 
 * @desc 竞彩篮球常量
 * @author zhanglei
 * @date 2017-2-4
 * @company 益彩网络科技公司
 * @version 1.0
 */


public class JCLQConstants extends JCConstants{
	
	/**字典*/
	private static final Map<String,String> oneMap = new HashMap<String,String>();
	private static final Map<String,String> twoMap = new HashMap<String,String>();
	
	static{
		/**胜负/让分胜负*/
		oneMap.put("3", "胜");
		oneMap.put("0", "负");
		/**大小分*/
		twoMap.put("99", "大");
		twoMap.put("00", "小");
		/**胜分差*/
		twoMap.put("01", "主胜1-5");
		twoMap.put("02", "主胜6-10");
		twoMap.put("03", "主胜11-15");
		twoMap.put("04", "主胜16-20");
		twoMap.put("05", "主胜21-25");
		twoMap.put("06", "主胜26+");
		twoMap.put("11", "客胜1-5");
		twoMap.put("12", "客胜6-10");
		twoMap.put("13", "客胜11-15");
		twoMap.put("14", "客胜16-20");
		twoMap.put("15", "客胜21-25");
		twoMap.put("16", "客胜26+");
	}

	/**竞彩篮球  大彩种*/
    public static final int ID_JCLQ_B = 301;
    /**竞彩篮球胜负*/
    public static final int ID_JCLQ_SF = 30101;
    /**竞彩篮球让分*/
    public static final int ID_JCLQ_RF = 30102;
    /**竞彩篮球大小分*/
    public static final int ID_JCLQ_DXF = 30103;
    /**竞彩篮球胜分差*/
    public static final int ID_JCLQ_SFC = 30104;
    /**竞彩篮球混合过关*/
    public static final int ID_JCLQ_HHGG = 30105;


    public static final String CODE_JCLQ = "BB";
    /**竞彩篮球胜负*/
    public static final String CODE_JCLQ_SF = "BBSF";
    /**竞彩篮球让分*/
    public static final String CODE_JCLQ_RF = "BBRF";
    /**竞彩篮球大小分*/
    public static final String CODE_JCLQ_DXF = "BBDXF";
    /**竞彩篮球胜分差*/
    public static final String CODE_JCLQ_SFC = "BBSFC";
    /**竞彩篮球混合过关*/
    public static final String CODE_JCLQ_HHGG = "BBHHGG";

    /**
     * 竞彩篮球所有子玩法简称(除混投没有简称)
     */
    public static final String CHILD_CODE_SIMPLE_NAME = "SRCD";

    /**
     * 竞彩篮球胜负和让分胜负格式 3 胜， 0 负
     */
    public static final String[] WIN_FAIL_FORMAT={"3","0"};
    /**
     * 竞彩篮球胜分差格式
     * 主胜多少分客胜多少分
     * 0:表示主胜;1表示客胜;
     * 1:1-5,2:6-10,3:11-15,4:16-20,5:21-25,6:大于25分
     * 例如05表示 主队胜客队21-25分
     */
    public static final String[] WIN_SCORE_FORMAT = {"01","02","03","04","05","06","11","12","13","14","15","16"};
    /**
     * 竞彩篮球大分格式
     * 99大，00小
     */
    public static final String[] BIG_SMALL_SCORE_FORMAT = {"99","00"};

    /** 最高倍数 */
    public static final Integer MULTIPLE_LIMIT = 1000;
    /** 单期单方案限额2万元*/
    public static final Double SINGLE_ISSUE_ACCOUNT_LIMIT = 20000.0;
    /**  单方案最高场数 */
    public static final Integer GAME_COUNT_LIMIT = 15;

    /** 页面传递json转java对象后，方到map的key */
    public static final String PAGE_JSON_TO_OBJECT_KEY = "JSON";


    /**
     * 过关方式 多串1
     */
    public static final String ONE_PASSWAY = "1";
    /**
     * 过关方式 多串多
     */
    public static final String MANY_PASSWAY = "2";
    
    /**
	 * 竞彩篮球彩种ID集
	 */
    public static final int[] SPORT_BASKETBAL_LOTTERYS = {ID_JCLQ_SF, ID_JCLQ_RF, ID_JCLQ_DXF, ID_JCLQ_SFC, ID_JCLQ_HHGG};
    /**
     * 验证过关串传入的格式是否正确
     */
    public static final String PASSWAY_REGEXN = "^([1-8]{1}\\_[1-2][0-47]{0,2},)*([1-8]{1}\\_[1-2][0-47]{0,2})";

    /**
     * 胜平负/让胜平负 正则表匹配投注内容
     */
    private static final String REGEXP_SPF = "[30]";
    /**
     * 胜分差 正则表匹配投注内容
     */
    private static final String REGEXP_SFC = "[0-1][1-6]";
    /**
     * 大小分 正则表匹配投注内容
     */
    private static final String REGEXP_DCBF = "(9(9)|0(0))";

    /**
     * 检查过关方式格式 合法性
     */
    public static boolean checkFormatJCLQPassWay(String passWayStr){
        return passWayStr.matches(PASSWAY_REGEXN);

    }

    /**
     * 竞技篮球检查子玩法 (不包含混投)格式合法性
     * @param lotterId 彩种ID
     * @param content 投注内容
     * @return
     * true:正常
     * false:不正常(无效内容)
     */
    public static boolean checkJCLQBetContentGame(int lotterId,String content){
        switch (lotterId) {
            case ID_JCLQ_SF: return findBetContent(content, WIN_FAIL_FORMAT) ;
            case ID_JCLQ_RF: return findBetContent(content, WIN_FAIL_FORMAT) ;
            case ID_JCLQ_DXF: return findBetContent(content, BIG_SMALL_SCORE_FORMAT) ;
            case ID_JCLQ_SFC: return findBetContent(content, WIN_SCORE_FORMAT) ;
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

    /**
	 * 判断彩种ID是否为竞彩篮球
	 * @param lotteryId
	 * @return
	 * true:是
	 * false:否
	 *
	 */
	public static boolean checkLotteryId(int lotteryId) {
		for(int tempI : SPORT_BASKETBAL_LOTTERYS){
			if(tempI == lotteryId)
				return true;
		}
		return false;
	}
	
	/**
	 * 通过子玩法简称代号得到正则表达式
	 * @author longguoyou
	 * @date 2017年4月13日
	 * @param code 子玩法简称代号
	 * @return 正则表达式 字符串
	 */
	public static String getLotteryCodeBySimpleCode(String code){
		switch(code){
		case "R":return REGEXP_SPF;
		case "S":return REGEXP_SPF;
		case "C":return REGEXP_SFC;
		case "D":return REGEXP_DCBF;
		}
		return null;
	}
	
	/**
	 * 翻译投注项为对应中文 如：3->胜
	 * @author longguoyou
	 * @date 2017年11月4日
	 * @param lotteryChildCode 子玩法
	 * @param betContent 彩果 8.5|3,9.5|3
	 * @param initContent 票内容
	 * @param pankou 票盘口
	 * @return
	 */
	public static String translate(Integer lotteryChildCode, String betContent, String initContent, String pankou){
		switch(lotteryChildCode){
		case ID_JCLQ_RF://让分胜负
		case ID_JCLQ_SF://胜负
		case ID_JCLQ_DXF://大小分
		case ID_JCLQ_SFC://胜分差
			return translate(betContent,lotteryChildCode,pankou);
		case ID_JCLQ_HHGG://混合过关
			return translateMix(betContent, initContent, pankou);
		}
		return null;
	}

	/**
	 *
	 * @param betContent 没翻译的彩果 如：8.5|3,9.5|3
	 * @param initContent 票内容
	 * @param pankou 盘口 如：[+8.5]
	 * @return
	 */
	private static String translateMix(String betContent, String initContent, String pankou) {
		if(initContent.contains("R")){
			return translate(ID_JCLQ_RF, betContent,initContent,pankou);
		}
		if(initContent.contains("S")){
			return translate(ID_JCLQ_SF, betContent,initContent,pankou);
		}
		if(initContent.contains("C")){
			return translate(ID_JCLQ_SFC, betContent,initContent,pankou);
		}
		if(initContent.contains("D")){
			return translate(ID_JCLQ_DXF, betContent, initContent,pankou);
		}
		return null;
	}

	/**
	 * 竞彩篮球通过子玩法获取赛果
	 * @author longguoyou
	 * @date 2017年11月3日
	 * @param lotteryChildCode
	 * @return
	 */
	public static String getCaiguoByLotteryChildCode(Integer lotteryChildCode, JclqOrderBO jclqOrderBO, String initContent) {
		switch(lotteryChildCode){
			case JCLQConstants.ID_JCLQ_DXF:
				return jclqOrderBO.getSizeScore();//157.5|99,157.5|99
			case JCLQConstants.ID_JCLQ_RF:
				return jclqOrderBO.getLetWf();//-4.5|0,-5.5|0
			case JCLQConstants.ID_JCLQ_SF:
				return jclqOrderBO.getFullWf();
			case JCLQConstants.ID_JCLQ_SFC:
				return jclqOrderBO.getWinScore();
			case JCLQConstants.ID_JCLQ_HHGG:
				return getCaiguoByLotteryChildCodeMix(lotteryChildCode,jclqOrderBO,initContent);
		}
		return null;
	}
	/**
	 * 混投过关
	 * @author longguoyou
	 * @date 2017年11月7日
	 * @param lotteryChildCode
	 * @param jclqOrderBO
	 * @param initContent
	 * @return
	 */
	public static String getCaiguoByLotteryChildCodeMix(Integer lotteryChildCode, JclqOrderBO jclqOrderBO, String initContent){
		if(initContent.contains("R")){
			return getCaiguoByLotteryChildCode(JCLQConstants.ID_JCLQ_RF,jclqOrderBO,null);
		}
		if(initContent.contains("D")){
			return getCaiguoByLotteryChildCode(JCLQConstants.ID_JCLQ_DXF,jclqOrderBO,null);
		}
		if(initContent.contains("S")){
			return getCaiguoByLotteryChildCode(JCLQConstants.ID_JCLQ_SF,jclqOrderBO,null);
		}
		if(initContent.contains("C")){
			return getCaiguoByLotteryChildCode(JCLQConstants.ID_JCLQ_SFC,jclqOrderBO,null);
		}
		return null;
	}

	/**
	 *  单一玩法，获取翻译后的彩果
	 * @param betContent 没翻译的彩果 如：8.5|3,9.5|3 或 3、00...
	 * @param lotteryChildCode
	 * @param pankou  票盘口 盘口 如：[+8.5]
	 * @return
	 */
	private static String translate(String betContent, Integer lotteryChildCode, String pankou) {
		if(ObjectUtil.isBlank(betContent)){return SymbolConstants.ENPTY_STRING;}
		//让分、大小分
		if(lotteryChildCode == JCLQConstants.ID_JCLQ_DXF || lotteryChildCode == JCLQConstants.ID_JCLQ_RF){
			String[] caiguos = betContent.split(SymbolConstants.COMMA);
			for(String caiguo : caiguos){
				String[] pankouAndCaiguos = caiguo.split(SymbolConstants.DOUBLE_SLASH_VERTICAL_BAR);
				if(ObjectUtil.isBlank(pankou)){
					return null;
				}
				if(pankou.indexOf(pankouAndCaiguos[0]) > -1){
					if(lotteryChildCode == JCLQConstants.ID_JCLQ_RF){
						if(betContent.length() == Constants.NUM_1){
							return oneMap.get(betContent);
						}
						return oneMap.get(pankouAndCaiguos[1]);
					}
					if(lotteryChildCode == JCLQConstants.ID_JCLQ_DXF){
						if(betContent.length() == Constants.NUM_2){
							return twoMap.get(betContent);
						}
						return twoMap.get(pankouAndCaiguos[1]);
					}
				}
				if(betContent.length() == Constants.NUM_1){
					return oneMap.get(betContent);
				}
				if(betContent.length() == Constants.NUM_2){
					return twoMap.get(betContent);
				}
			}
		}else{
			if(betContent.length() == Constants.NUM_1){
				return oneMap.get(betContent);
			}
			if(betContent.length() == Constants.NUM_2){
				return twoMap.get(betContent);
			}
		}
		return null;
	}

	public static void main(String[] args) {
//		String a = "5_1,3_2,8_200,8_1";
//		a = "";
//		System.out.println(a.matches(PASSWAY_REGEXN));
		
//		String par = "9(9)|0(0)";
//		System.out.println("00".matches(REGEXP_SFC));
//		System.out.println(map);
	}
    
}

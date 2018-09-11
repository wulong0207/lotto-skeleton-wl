package com.hhly.skeleton.base.constants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hhly.skeleton.base.util.FormatConversionJCUtil;
import com.hhly.skeleton.base.util.ObjectUtil;
import com.hhly.skeleton.lotto.base.order.bo.BetContentInfoBO;
import com.hhly.skeleton.lotto.base.sport.bo.JczqOrderBO;

/**
 * @author zhanglei
 * @version 1.0
 * @desc 竞彩足球常量
 * @date 2017-2-4
 * @company 益彩网络科技公司
 */
public class JCZQConstants extends JCConstants {
	
	/**字典*/
	private static final Map<Integer,String> map = new HashMap<Integer,String>();
	
	static{
		map.put(3, "胜");
		map.put(1, "平");
		map.put(0, "负");
	}

	/** 竞彩足球 大彩种 */
	public static final int ID_JCZQ_B = 300;
	// ---竞彩足球 -------
	/** 竞彩足球混投 */
	public static final int ID_FHT = 30001;// 混投
	/** 竞彩足球胜平负 */
	public static final int ID_JCZQ = 30002;// 胜平负
	/** 竞彩足球让球胜平负 */
	public static final int ID_RQS = 30003;// 让球胜平负
	/** 竞彩足球比分 */
	public static final int ID_FBF = 30004;// 比分
	/** 竞彩足球总进球 */
	public static final int ID_FZJQ = 30005;// 总进球
	/** 竞彩足球半全场 */
	public static final int ID_FBCQ = 30006;// 半全场

	/** 竞彩足球胜平负 */
	public static final String CODE_JCZQ = "FSPF";
	/** 竞彩足球让球胜平负 */
	public static final String CODE_RQS = "FRQS";
	/** 竞彩足球比分 */
	public static final String CODE_FBF = "FBF";
	/** 竞彩足球总进球 */
	public static final String CODE_FZJQ = "FZJQ";
	/** 竞彩足球半全场 */
	public static final String CODE_FBCQ = "FBQC";
	/** 竞彩足球混投 */
	public static final String CODE_FHT = "FHT";

	/**
	 * 竞彩足球所有子玩法简称(除混投没有简称)
	 */
	public static final String CHILD_CODE_SIMPLE_NAME = "RSQZB";

	/** 单方案最高场数 */
	public static final Integer GAME_COUNT_LIMIT = 15;
	/** 最高倍数 */
	public static final Integer MULTIPLE_LIMIT = 1000;
	/** 单期单方案限额2万元 */
	public static final Integer SINGLE_ISSUE_ACCOUNT_LIMIT = 20000;
	/** 最高注数 */
	public static final Integer BET_NUM_LIMIT = 1000;
	/** 最大优化注数为800注 */
	public static final Integer MAX_BONUS_OF_BUY_NUMBER = 800;
	/** 拆票的总数量最高数 */
	public static final Integer SPLIT_COUNT_LIMIT = 0;
	/** 页面传递json转java对象后，方到map的key */
	public static final String PAGE_JSON_TO_OBJECT_KEY = "JSON";

	// 竞彩足球
	public static final Map<Integer, String> JCFootBallLottery = new HashMap<Integer, String>();
	/**
	 * 竞彩足球彩种ID集
	 */
	public static final int[] SPORT_FOOTBAL_LOTTERYS = { ID_FHT, ID_RQS, ID_JCZQ, ID_FBF, ID_FZJQ, ID_FBCQ };
	/**
	 * 胜平负投注内容 胜(3) 平(1) 负(0)
	 */
	private static final String[] SPF_BET_CONTENT = { "3", "1", "0" };
	/**
	 * 总进球投注内容 0(0) 1(1) 2(2) 3(3) 4(4) 5(5) 6(6) 7+(7)
	 */
	private static final String[] ZJQ_BET_CONTENT = { "0", "1", "2", "3", "4", "5", "6", "7" };
	/**
	 * 单场比分全部投注内容
	 */
	private static final String[] DCBF_ALL_BET_CONTENT = { "10", "20", "21", "30", "31", "32", "01", "02", "12", "03",
			"13", "23", "00", "11", "40", "41", "42", "43", "50", "51", "52", "90", "04", "14", "24", "34", "05", "15",
			"25", "09", "22", "33", "99" };
	/**
	 * 半全场胜负投注内容 胜-胜(33) 胜-平(31) 胜-负(30) 平-胜(13) 平-平(11) 平-负(10) 负-胜(03)
	 * 负-平(01)负-负(00)
	 */
	private static final String[] BQCSF_BET_CONTENT = { "33", "31", "30", "03", "13", "11", "10","01", "00" };
	/**
	 * 单式上传-单场比分全部投注内容
	 */
//	private static final String[] SINGLE_UPLOAD_DCBF_ALL_BET_CONTENT = { "10", "20", "21", "30", "31", "32", "01", "02",
//			"12", "03", "13", "23", "00", "11", "40", "41", "42", "43", "50", "51", "52", "3A", "04", "14", "24", "34",
//			"05", "15", "25", "0A", "22", "33", "1A" };
	/**
	 * 单场比分胜投注内容 胜其它(90) 1:0(10) 2:0(20) 2:1(21) 3:0(30) 3:1(31) 3:2(32) 4:0(40)
	 * 4:1(41) 4:2(42) 5:0(50) 5:1(51) 5:2(52)
	 */
	// private static final String[] DCBF_WIN_BET_CONTENT =
	// {"10","20","21","30","31","32","40","41","42","43","50","51","52","90"};
	/**
	 * 单场比分平投注内容 平其它(99) 0:0(00) 1:1(11) 2:2(22) 3:3(33)
	 */
	// private static final String[] DCBF_DRAW_BET_CONTENT =
	// {"00","11","22","33","99"};

	/**
	 * 单场比分负球投注内容 负其它(09) 0:1(01) 0:2(02) 1:2(12) 0:3(03) 1:3(13) 2:3(23)
	 * 0:4(04) 1:4(14) 2:4(24) 0:5(05) 1:5(15) 2:5 (25)
	 */
	// private static final String[] DCBF_LOSE_BET_CONTENT =
	// {"01","02","12","03","13","23","04","14","24","34","05","15","25","09"};
	/**
	 * 老足彩14场、任9
	 */
	private static final String[] OLD_FOOTBALL_14_DAN_9 = { "3", "2", "1", "0" };// "3,1","3,0","1,0","3,1,0"

	/**
	 * 验证过关串传入的格式是否正确
	 */
	public static final String PASSWAY_REGEXN = "^([1-8]{1}\\_[1-2][0-47]{0,2},)*([1-8]{1}\\_[1-2][0-47]{0,2})";

	/**
	 * 胜平负/让胜平负 正则表匹配投注内容
	 */
	private static final String REGEXP_SPF = "[310]";
	/**
	 * 总进球 正则表匹配投注内容
	 */
	private static final String REGEXP_ZJQ = "[0-7]";
	/**
	 * 比分 正则表匹配投注内容
	 */
	private static final String REGEXP_DCBF = "[9543210][9543210]";
	/**
	 * 半全场胜负 正则表匹配投注内容
	 */
	private static final String REGEXP_BQCSF = "[310][310]";
	/**
	 * 单式上传场次投注基本验证
	 */
	public static final String BETTING_UPLOAD_REGEXN = "^(R?[1-7][0-9]{3}(\\:|\\→)\\[?([0-9a-zA-Z]*)\\]?)$";
	/**
	 * 单式上传验证过关串传入的格式是否正确
	 */
	public static final String PASSWAY_UPLOAD_REGEXN = "^([2-8]{1}\\_[1]{1})$";

	static {
		JCFootBallLottery.put(ID_JCZQ, CODE_JCZQ);
		JCFootBallLottery.put(ID_FBCQ, CODE_FBCQ);
		JCFootBallLottery.put(ID_FBF, CODE_FBF);
		JCFootBallLottery.put(ID_FZJQ, CODE_FZJQ);
		JCFootBallLottery.put(ID_FHT, CODE_FHT);
		JCFootBallLottery.put(ID_RQS, CODE_RQS);
		JCFootBallLottery.put(ID_JCZQ_B, "竞彩足球");
		JCLottery.putAll(JCFootBallLottery);
	}

	/**
	 * 检查过关方式格式 合法性
	 */
	public static boolean checkFormatJCZQPassWay(String passWayStr) {
		return passWayStr.matches(PASSWAY_REGEXN);

	}

	/**
	 * 根据彩种ID得到对应CODE
	 * 
	 * @param Id
	 * @return
	 */
	public static String getLotteryCodeById(Integer lotteryId) {
		if (JCFootBallLottery.containsKey(lotteryId))
			return JCFootBallLottery.get(lotteryId);
		return null;
	}

	/**
	 * 判断彩种ID是否为竞彩足球
	 * 
	 * @param Id
	 * @return true:是 false:否
	 *
	 */
	public static boolean checkLotteryId(int lotteryId) {
		for (int tempI : SPORT_FOOTBAL_LOTTERYS) {
			if (tempI == lotteryId)
				return true;
		}
		return false;
	}

	/**
	 * 竞技足球检查投注内容合法性，不包含(混投)
	 * 
	 * @param gameStr
	 *            玩法
	 * @param content
	 *            投注内容
	 * @return true:正常 false:不正常(无效内容)
	 */
	public static boolean checkJCZQBetContentGame(int lotterId, String content) {
		switch (lotterId) {
		// case ID_FHT: return findBetContent(content, SPF_BET_CONTENT) ;
		case ID_JCZQ:
			return findBetContent(content, SPF_BET_CONTENT);
		case ID_RQS:
			return findBetContent(content, SPF_BET_CONTENT);
		case ID_FBF:
			return findBetContent(content, DCBF_ALL_BET_CONTENT);
		case ID_FZJQ:
			return findBetContent(content, ZJQ_BET_CONTENT);
		case ID_FBCQ:
			return findBetContent(content, BQCSF_BET_CONTENT);
		default:
			return false;
		}
	}

	/**
	 * 竞技足球检查投注内容合法性，不包含 混投 单式上传用
	 * 
	 * @param gameStr
	 *            玩法
	 * @param content
	 *            投注内容
	 * @return true:正常 false:不正常(无效内容)
	 */
	public static boolean checkJCZQGameForSingleUpload(String code, String content) {
		switch (code) {
		case "R":
		case "S":
		case "M":
			return findBetContent(content, SPF_BET_CONTENT);
		case "Z":
			return findBetContent(content, ZJQ_BET_CONTENT);
		case "Q":
			return findBetContent(content, DCBF_ALL_BET_CONTENT);
		case "B":
			return findBetContent(content, BQCSF_BET_CONTENT);
		default:
			return false;
		}
	}

	/**
	 * 通过子玩法简称代号得到正则表达式
	 * 
	 * @author longguoyou
	 * @date 2017年4月13日
	 * @param code
	 *            子玩法简称代号
	 * @return 正则表达式 字符串
	 */
	public static String getLotteryCodeBySimpleCode(String code) {
		switch (code) {
		case "R":
			return REGEXP_SPF;
		case "S":
			return REGEXP_SPF;
		case "Z":
			return REGEXP_ZJQ;
		case "Q":
			return REGEXP_DCBF;
		case "B":
			return REGEXP_BQCSF;
		}
		return null;
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
			case JCZQConstants.ID_FBCQ:
				return  "B";
			case JCZQConstants.ID_FBF:
				return  "Q";
			case JCZQConstants.ID_FZJQ:
				return  "Z";
			case JCZQConstants.ID_JCZQ:
				return  "S";
			case JCZQConstants.ID_RQS:
				return  "R";
			case JCZQConstants.ID_FHT:
				return "M";
			default: return null;
		}
	}
	
	/**
	 * 翻译投注项为对应中文 如：3->胜
	 * @author longguoyou
	 * @date 2017年11月4日
	 * @param lotteryChildCode
	 * @param betContent
	 * @param
	 * @return
	 */
	public static String translate(Integer lotteryChildCode, String betContent, String initContent){
		switch(lotteryChildCode){
		case ID_RQS:
		case ID_JCZQ:
		case ID_FBCQ:
			return translateThreeOneZero(betContent);
		case ID_FBF:
			//比分 90胜其它 、99平其它、09负其它
			return translateBf(betContent);
		case ID_FZJQ:
			//7则 7+
			return translateScore(betContent);
		case ID_FHT:
			return translateMix(betContent, initContent);
		}
		return SymbolConstants.ENPTY_STRING;
	}

	/**
	 * 竞彩足球通过子玩法获取赛果
	 * @author longguoyou
	 * @date 2017年11月3日
	 * @param lotteryChildCode
	 * @return
	 */
	public static String getCaiguoByLotteryChildCode(Integer lotteryChildCode, JczqOrderBO jczqOrderBO, String initContent) {
		switch(lotteryChildCode){
			case JCZQConstants.ID_FBCQ:
				return jczqOrderBO.getHfWdf();
			case JCZQConstants.ID_FBF:
				return jczqOrderBO.getScore();
			case JCZQConstants.ID_FZJQ:
				return jczqOrderBO.getGoalNum();
			case JCZQConstants.ID_JCZQ:
				return jczqOrderBO.getFullSpf();
			case JCZQConstants.ID_RQS:
				return jczqOrderBO.getLetSpf();
			case JCZQConstants.ID_FHT:
				return getCaiguoByLotteryChildCodeMix(lotteryChildCode,jczqOrderBO,initContent);
		}
		return null;
	}

	public static String getCaiguoByLotteryChildCodeMix(Integer lotteryChildCode, JczqOrderBO jczqOrderBO, String initContent) {
		if(initContent.contains("R")){
			return getCaiguoByLotteryChildCode(JCZQConstants.ID_RQS,jczqOrderBO,null);
		}
		if(initContent.contains("S")){
			return getCaiguoByLotteryChildCode(JCZQConstants.ID_JCZQ,jczqOrderBO,null);
		}
		if(initContent.contains("Q")){
			return getCaiguoByLotteryChildCode(JCZQConstants.ID_FBF,jczqOrderBO,null);
		}
		if(initContent.contains("B")){
			return getCaiguoByLotteryChildCode(JCZQConstants.ID_FBCQ,jczqOrderBO,null);
		}
		if(initContent.contains("Z")){
			return getCaiguoByLotteryChildCode(JCZQConstants.ID_FZJQ,jczqOrderBO,null);
		}
		return null;
	}


	/**
	 * 获取附加信息：让分[+10]<br>
	 * 1)1711024024[-1](1@3.35)<br>
	 * 2)1711024024_R[+10](3@1.33)<br>
	 * @author longguoyou
	 * @date 2017年11月4日
	 * @param content
	 * @param lotteryChildCode
	 * @return 如：[+10]
	 */
	public static String getInfoFromSingleBetContent(String content, Integer lotteryChildCode) {
		//让胜平负玩法 :1711024024[-1](1@3.35)
		if(JCZQConstants.ID_RQS == lotteryChildCode){
			return content.substring(content.indexOf(SymbolConstants.MIDDLE_PARENTHESES_LEFT), content.indexOf(SymbolConstants.MIDDLE_PARENTHESES_RIGHT)+1);
		}
		//混投：1711024024_R[+10](3@1.33)
		if(JCZQConstants.ID_FHT == lotteryChildCode && content.contains("R")){
			return content.substring(content.indexOf(SymbolConstants.MIDDLE_PARENTHESES_LEFT), content.indexOf(SymbolConstants.MIDDLE_PARENTHESES_RIGHT)+1);
		}
		return SymbolConstants.ENPTY_STRING;
	}


	/**
	 * 翻译投注项为对应子彩种 如：3->胜
	 * @author longguoyou
	 * @date 2017年11月4日
	 * @param lotteryChildCode
	 * @param betContent
	 * @param
	 * @return
	 */
	public static String translateChildCoe(Integer lotteryChildCode, String betContent, String initContent){
		switch(lotteryChildCode){
			case ID_RQS:
				return String.valueOf(ID_RQS);
			case ID_JCZQ:
				return String.valueOf(ID_JCZQ);
			case ID_FBCQ:
				return String.valueOf(ID_FBCQ);
			case ID_FBF:
				return String.valueOf(ID_FBF);
			case ID_FZJQ:
				//7则 7+
				return String.valueOf(ID_FZJQ);
			case ID_FHT:
				return translateBuffer(betContent, initContent);
		}
		return SymbolConstants.ENPTY_STRING;
	}

	private static String translateBuffer(String betContent, String initContent){
		if(initContent.contains("R")){
			return String.valueOf(ID_RQS);
		}
		if(initContent.contains("S")){
			return String.valueOf(ID_JCZQ);
		}
		if(initContent.contains("B")){
			return String.valueOf(ID_FBCQ);
		}
		if(initContent.contains("Z")){
			return String.valueOf(ID_FZJQ);
		}
		if(initContent.contains("Q")){
			return String.valueOf(ID_FBF);
		}
		return SymbolConstants.ENPTY_STRING;
	}


	private static String translateMix(String betContent, String initContent){
		if(initContent.contains("R")){
			return translate(ID_RQS, betContent,initContent);
		}
		if(initContent.contains("S")){
			return translate(ID_JCZQ, betContent,initContent);
		}
		if(initContent.contains("B")){
			return translate(ID_FBCQ, betContent,initContent);
		}
		if(initContent.contains("Z")){
			return translate(ID_FZJQ, betContent, initContent);
		}
		if(initContent.contains("Q")){
			return translate(ID_FBF, betContent, initContent);
		}
		return SymbolConstants.ENPTY_STRING;
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
			return "平其他";
		}
		if(betContent.equals("90")){
			return "胜其他";
		}
        if(betContent.equals("09")){
			return "负其他";
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
	
	/**
	 * 根据缩写获取子玩法对应的编码
	 * @author longguoyou
	 * @date 2017年6月15日
	 * @param lotteryChildCode
	 * @return
	 */
	public static Integer getLotteryChildCode(String playCode){
		switch(playCode){
			case "B":
				return  JCZQConstants.ID_FBCQ;
			case "Q":
				return  JCZQConstants.ID_FBF;
			case "Z":
				return  JCZQConstants.ID_FZJQ;
			case "S":
				return  JCZQConstants.ID_JCZQ;
			case "R":
				return  JCZQConstants.ID_RQS;
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
	public static boolean verifyLimitPassway(String passway, Integer childCode){
		switch (childCode) { 
		case JCZQConstants.ID_FBF://足球比分
			return JCZQConstants.PASSWAY_LIMIT_FOUR < Integer.parseInt(passway.substring(0,passway.indexOf(SymbolConstants.UNDERLINE)));
		case JCZQConstants.ID_FBCQ://足球半全场
			return JCZQConstants.PASSWAY_LIMIT_FOUR < Integer.parseInt(passway.substring(0,passway.indexOf(SymbolConstants.UNDERLINE)));
		case JCZQConstants.ID_RQS://足球让胜平负
			return JCZQConstants.PASSWAY_LIMIT_EIGHT < Integer.parseInt(passway.substring(0,passway.indexOf(SymbolConstants.UNDERLINE)));
		case JCZQConstants.ID_JCZQ://足球胜平负
			return JCZQConstants.PASSWAY_LIMIT_EIGHT < Integer.parseInt(passway.substring(0,passway.indexOf(SymbolConstants.UNDERLINE)));
		case JCZQConstants.ID_FZJQ://足球总进球
			return JCZQConstants.PASSWAY_LIMIT_SIX < Integer.parseInt(passway.substring(0,passway.indexOf(SymbolConstants.UNDERLINE)));
		case JCZQConstants.ID_FHT://足球混合
			return false;//直接通过，混投在验证过关方式处处理
		default:
			return false;
		}
	}
	/**
	 * 处理投注项顺序乱
	 * @author longguoyou
	 * @date 2017年11月11日
	 * @param betContent
	 * @param lotteryChildCode
	 * @return
	 */
	public static String processRightOrder(String betContent, final Integer lotteryChildCode){
		int danIndex = 0;//胆位置
		StringBuffer sBuffer = new StringBuffer();
		if(betContent.contains(SymbolConstants.NUMBER_SIGN)){//有胆
			String[] danPrefix = betContent.split(SymbolConstants.NUMBER_SIGN);
			String[] betContentPrefix  = danPrefix[0].split(SymbolConstants.DOUBLE_SLASH_VERTICAL_BAR);
			danIndex = betContentPrefix.length;
			System.out.println("包含井号位置：" + danIndex);
	
			for(int i=0;i<betContentPrefix.length;i++){
				if(i+1 == danIndex){
					if(lotteryChildCode == ID_FHT){
						sBuffer.append(getFinalMixBetContent(betContentPrefix[i], lotteryChildCode, true, true));
					}else{
						sBuffer.append(getFinalBetContent(betContentPrefix[i], lotteryChildCode, true, true));
					}
				}else{
					if(lotteryChildCode == ID_FHT){
						sBuffer.append(getFinalMixBetContent(betContentPrefix[i], lotteryChildCode, false, true));
					}else{
						sBuffer.append(getFinalBetContent(betContentPrefix[i], lotteryChildCode, false, true));
					}
				}
			}
			
			if(lotteryChildCode == ID_FHT){
				sBuffer.append(getFinalMixBetContent(danPrefix[1], lotteryChildCode, false, false));
			}else{
				sBuffer.append(getFinalBetContent(danPrefix[1], lotteryChildCode, false, false));
			}
	
			return sBuffer.toString();
		}else{
			if(lotteryChildCode == ID_FHT){
				return getFinalMixBetContent(betContent, lotteryChildCode, false, false);
			}
			return getFinalBetContent(betContent, lotteryChildCode, false, false);
		}
	}
	/***
	 * 拼装混投最终内容
	 * @author longguoyou
	 * @date 2017年11月11日
	 * @param betContent 161128001_S(1@1.89,0@4.21)_R[+1](3@1.57,0@2.27)_Q(11@1.78,23@5.21)_Z(2@3.45,3@2.34)_B(33@2.31,31@4.00)
	 * @param lotteryChildCode
	 * @param flag
	 * @param includeLastIndex
	 * @return
	 */
	private static String getFinalMixBetContent(String betContent, final Integer lotteryChildCode, boolean flag, boolean includeLastIndex){
		//投注内容处理完毕，拼回去
		StringBuffer strBuffer = new StringBuffer();
		//对阵、过关、倍数
		String[]  betContents = FormatConversionJCUtil.singleBetContentAnalysis(betContent);
		//对阵数组
		String[]  contents = FormatConversionJCUtil.betContentDetailsAnalysis(betContents[0]);
		//混投内容拼装
		StringBuffer mixStringBuffer = new StringBuffer();
		for(String matchs : contents){
			//混投玩法
			String[]  mixContents = matchs.split(SymbolConstants.UNDERLINE);//[161128001, S(1@1.89,0@4.21), R[+1](3@1.57,0@2.27), Q(11@1.78,23@5.21), Z(2@3.45,3@2.34), B(33@2.31,31@4.00)]
			mixStringBuffer.append(mixContents[0]);
			for(int i = 0; i < mixContents.length; i++){
				if(i > 0){//从第二为开始,拼装包含的子玩法
					if(mixContents[i].contains("S")){
						//0@2.13,3@1.57
						String matchBetContent = FormatConversionJCUtil.singleGameBetContentSubstring(mixContents[i]);
						//[1@1.89,0@4.21,3@4.21]
						String[] matchBetContents = FormatConversionJCUtil.optionBetContentAnalysis(matchBetContent);
						if(matchBetContents.length == 1){
							mixStringBuffer.append(SymbolConstants.UNDERLINE);
							mixStringBuffer.append(mixContents[i]);
						}else{
							mixStringBuffer.append(SymbolConstants.UNDERLINE);
							mixStringBuffer.append("S");
							mixStringBuffer.append(getStringBuffer(SymbolConstants.ENPTY_STRING,matchBetContents,getLotteryChildCode("S"),flag,true));
						}
					}else if(mixContents[i].contains("R")){
						String prefixContent = mixContents[i].substring(mixContents[i].indexOf(SymbolConstants.UNDERLINE)+1, mixContents[i].indexOf(SymbolConstants.PARENTHESES_LEFT));
						//0@2.13,3@1.57
						String matchBetContent = FormatConversionJCUtil.singleGameBetContentSubstring(mixContents[i]);
						//[1@1.89,0@4.21,3@4.21]
						String[] matchBetContents = FormatConversionJCUtil.optionBetContentAnalysis(matchBetContent);
						if(matchBetContents.length == 1){
							mixStringBuffer.append(SymbolConstants.UNDERLINE);
							mixStringBuffer.append(mixContents[i]);
						}else{
							mixStringBuffer.append(SymbolConstants.UNDERLINE);
							mixStringBuffer.append(prefixContent);
							mixStringBuffer.append(getStringBuffer(SymbolConstants.ENPTY_STRING,matchBetContents,getLotteryChildCode("R"),flag,true));
						}
					}else if(mixContents[i].contains("Q")){
						//0@2.13,3@1.57
						String matchBetContent = FormatConversionJCUtil.singleGameBetContentSubstring(mixContents[i]);
						//[1@1.89,0@4.21,3@4.21]
						String[] matchBetContents = FormatConversionJCUtil.optionBetContentAnalysis(matchBetContent);
						if(matchBetContents.length == 1){
							mixStringBuffer.append(SymbolConstants.UNDERLINE);
							mixStringBuffer.append(mixContents[i]);
						}else{
							mixStringBuffer.append(SymbolConstants.UNDERLINE);
							mixStringBuffer.append("Q");
							mixStringBuffer.append(getStringBuffer(SymbolConstants.ENPTY_STRING,matchBetContents,getLotteryChildCode("Q"),flag,true));
						}
					}else if(mixContents[i].contains("Z")){
						//0@2.13,3@1.57
						String matchBetContent = FormatConversionJCUtil.singleGameBetContentSubstring(mixContents[i]);
						//[1@1.89,0@4.21,3@4.21]
						String[] matchBetContents = FormatConversionJCUtil.optionBetContentAnalysis(matchBetContent);
						if(matchBetContents.length == 1){
							mixStringBuffer.append(SymbolConstants.UNDERLINE);
							mixStringBuffer.append(mixContents[i]);
						}else{
							mixStringBuffer.append(SymbolConstants.UNDERLINE);
							mixStringBuffer.append("Z");
							mixStringBuffer.append(getStringBuffer(SymbolConstants.ENPTY_STRING,matchBetContents,getLotteryChildCode("Z"),flag,true));
						}
					}else if(mixContents[i].contains("B")){
						//0@2.13,3@1.57
						String matchBetContent = FormatConversionJCUtil.singleGameBetContentSubstring(mixContents[i]);
						//[1@1.89,0@4.21,3@4.21]
						String[] matchBetContents = FormatConversionJCUtil.optionBetContentAnalysis(matchBetContent);
						if(matchBetContents.length == 1){
							mixStringBuffer.append(SymbolConstants.UNDERLINE);
							mixStringBuffer.append(mixContents[i]);
						}else{
							mixStringBuffer.append(SymbolConstants.UNDERLINE);
							mixStringBuffer.append("B");
							mixStringBuffer.append(getStringBuffer(SymbolConstants.ENPTY_STRING,matchBetContents,getLotteryChildCode("B"),flag,true));
						}
					}
				}
			}
			//一场对阵所有子玩法循环完后的分隔符
			mixStringBuffer.append(flag?SymbolConstants.NUMBER_SIGN:SymbolConstants.VERTICAL_BAR);
		}
		
		if(includeLastIndex){
			strBuffer.append(mixStringBuffer.toString());
		}else{
			strBuffer.append(mixStringBuffer.toString().substring(0, mixStringBuffer.toString().length()-1));
		}
		if(betContents.length > 1){
			strBuffer.append(SymbolConstants.UP_CAP);
			strBuffer.append(betContents[1]);//过关
			if(betContents.length == 3){
				strBuffer.append(SymbolConstants.UP_CAP);
				strBuffer.append(betContents[2]);//倍数
			}
		}
		System.out.println("拼装后内容："+strBuffer.toString());
		return strBuffer.toString();
	}
	/**
	 * 拼装单一玩法最终内容
	 * @author longguoyou
	 * @date 2017年11月11日
	 * @param betContent
	 * @param lotteryChildCode
	 * @param flag 是否包含井号
	 * @param includeLastIndex 是包含最后一位字符
	 * @return
	 */
	private static String getFinalBetContent(String betContent, final Integer lotteryChildCode, boolean flag, boolean includeLastIndex){
		//投注内容处理完毕，拼回去
		StringBuffer strBuffer = new StringBuffer();
		//对阵、过关、倍数
		String[]  betContents = FormatConversionJCUtil.singleBetContentAnalysis(betContent);
		//对阵数组
		String[]  contents = FormatConversionJCUtil.betContentDetailsAnalysis(betContents[0]);
		StringBuffer sBuffer = new StringBuffer();
		for(String content : contents){
			String prefixContent = content.substring(0, content.indexOf(SymbolConstants.PARENTHESES_LEFT));//左括号前的投注内容如：161128001[+1](0@2.13,3@1.57) ，即：161128001[+1]
			//0@2.13,3@1.57
			String matchBetContent = FormatConversionJCUtil.singleGameBetContentSubstring(content);
			//[0@2.13,3@1.57]
			String[] matchBetContents = FormatConversionJCUtil.optionBetContentAnalysis(matchBetContent);
			if(matchBetContents.length == 1){
				sBuffer.append(content);
			    sBuffer.append(flag?SymbolConstants.NUMBER_SIGN:SymbolConstants.VERTICAL_BAR);
			}else{
				sBuffer.append(getStringBuffer(prefixContent,matchBetContents,lotteryChildCode,flag,false));
			}
		}
		if(includeLastIndex){
			strBuffer.append(sBuffer.toString());
		}else{
			strBuffer.append(sBuffer.toString().substring(0, sBuffer.toString().length()-1));
		}
		if(betContents.length > 1){
			strBuffer.append(SymbolConstants.UP_CAP);
			strBuffer.append(betContents[1]);//过关
			if(betContents.length == 3){
				strBuffer.append(SymbolConstants.UP_CAP);
				strBuffer.append(betContents[2]);//倍数
			}
		}
		return strBuffer.toString();
	}
	/**
	 * 循环体
	 * @author longguoyou
	 * @date 2017年11月11日
	 * @param prefixContent
	 * @param content
	 * @param lotteryChildCode
	 * @param flag 是否包含井
	 * @return
	 */
	private static String getStringBuffer(String prefixContent, String[] matchBetContents, final Integer lotteryChildCode, boolean flag, boolean isMix) {
		StringBuffer sBuffer = new StringBuffer();
		//存放解析后的投注对象，用于排序
		List<BetContentInfoBO> list = new ArrayList<BetContentInfoBO>();
		for(String matchBet : matchBetContents){
			//[3,1.57]
			String[] sps = FormatConversionJCUtil.singleOptionBetContentAnalysis(matchBet);
			if(lotteryChildCode == ID_FBF){
				Integer order = -1;
				for(int i=0; i < DCBF_ALL_BET_CONTENT.length;i++){
					if(sps[0].equals(DCBF_ALL_BET_CONTENT[i])){
						order = i;
						break;
					}
				}
				list.add(new BetContentInfoBO(sps[0],sps[1],order));
			}else{
				list.add(new BetContentInfoBO(sps[0],sps[1]));
			}
		}
		/** 排序控制 */
		Collections.sort(list, new Comparator<BetContentInfoBO>() {
			@Override
			public int compare(BetContentInfoBO o1, BetContentInfoBO o2) {
				switch(lotteryChildCode){
				case ID_FBF://比分
					return o1.getOrder() - o2.getOrder();
				case ID_FZJQ://总进球
					return Integer.valueOf(o1.getValue()) - Integer.valueOf(o2.getValue());
				case ID_FBCQ://半全胜平负
				case ID_JCZQ://胜平负
				case ID_RQS://让球胜平负
					return Integer.valueOf(o2.getValue()) - Integer.valueOf(o1.getValue());
				case ID_FHT://混合
					break;
				}
				return -1;
			}
		});
		sBuffer.append(prefixContent);
		sBuffer.append(SymbolConstants.PARENTHESES_LEFT);
		StringBuffer infoBuffer = new StringBuffer();
		for(BetContentInfoBO info : list){
			infoBuffer.append(info.getValue());
			infoBuffer.append(SymbolConstants.AT);
			infoBuffer.append(info.getSp());
			infoBuffer.append(SymbolConstants.COMMA);
		}
		sBuffer.append(infoBuffer.toString().substring(0, infoBuffer.toString().length()-1));
		sBuffer.append(SymbolConstants.PARENTHESES_RIGHT);
		if(!isMix){
			sBuffer.append(flag?SymbolConstants.NUMBER_SIGN:SymbolConstants.VERTICAL_BAR);
		}
		return sBuffer.toString();
	}

	public static void main(String[] args) {
//		System.out.println(translateThreeOneZero("3"));
//		System.out.println(translateThreeOneZero("30"));
//		System.out.println(translateScore("7"));
//		System.out.println(translateBf("23"));
//		System.out.println(translateBf("99"));
		String dg = "161128001(0@1.89,1@4.21)^1_1^10";
		String sigle = "161128001[+1](0@2.13,3@2.23,1@3.26)|161128002[+1](0@4.21,3@2.56)#161128003[+1](0@4.21)^3_1,2_1^10";
		String betConent = "161128001[+1](20@2.13,10@1.57,90@2.13)|161128002[+1](33@4.21,22@2.56,99@2.56)#161128003[+1](24@4.21,14@5.26,09@5.26)^3_1,2_1^100";
		String mix_bak = "161128001_S(1@1.89,0@4.21)_R[+1](3@1.57,0@2.27)_Q(11@1.78,23@5.21)_Z(2@3.45,3@2.34)_B(33@2.31,31@4.00)#161128002_S(1@1.89,0@4.21)|161128003_Z(0@4.21)|161128004_R[-2](3@3.33)_Z(0@4.21)^2_1,3_1";
		String score = "161128001(2@2.13,1@1.57,0@2.13)|161128002(3@4.21,2@2.56,1@2.56)#161128003(4@4.21,1@5.26,0@5.26)^3_1,2_1^100";
		String spf = "161128001(0@2.13,1@1.57,3@2.13)|161128002(3@4.21,0@2.56,1@2.56)#161128003(1@4.21,0@5.26,3@5.26)^3_1,2_1^100";
		String bqc = "161128001(31@2.13,33@1.57,30@2.13)#161128002(11@4.21,13@2.56,10@2.56)|161128003(01@4.21,03@5.26,00@5.26)^3_1,2_1^100";
		String mix = "161128001_R[+1](1@1.89,3@4.21)_B(20@2.13,10@1.57,90@2.13)|161128002_S(1@1.11,3@4.44)#161128003_S(0@4.21)_B(33@4.21,22@2.56,99@2.56)|161128004_S(3@3.33)^2_1,3_1^100";
		
		
		String mix_c_1 = "1707204018_R[-1](3@1.90)|1707204019_S(3@1.56)^2_1^1";
		String mix_c_2 = "1706106005_S(0@2.07)|1706106006_S(0@1.37)|1706106008_R[-5](3@1.40)^3_1,2_1^1";
		String mix_c_3 = "1706121001_S(3@1.75)|1706121002_R[-1](1@3.05)|1706121003_R[-1](1@3.25)^3_1^1";
		String mix_c_4 = "1706132003_S(3@5.20)_B(33@9.50)_Z(2@3.40)_Q(11@7.00)#1706132004_R[+1](0@2.16)|1706132005_Q(11@8.25,01@5.40)|1706132006_S(3@3.15)_Q(10@6.50,11@6.00,12@8.25)^3_1^1";
		String mix_c_5 = "1705206047_S(3@2.20)|1705206050_S(3@1.46)|1705206055_S(3@1.25)|1705276001_S(3@4.45)|1705265005_S(3@2.33)_R[-1](3@5.86)^2_1,3_1,4_1,5_1^1";
		String mix_c_6 = "1706132004_S(1@4.10)#1706132005_R[+1](3@3.02)|1706132011_R[-1](1@3.20)|1706132010_R[+1](0@3.50,3@1.87)|1706132006_S(3@3.15)_R[+1](1@3.55)^2_1^1";
		long begin = System.currentTimeMillis();
		
		System.out.println(processRightOrder(mix_c_1, 30001));
		System.out.println(processRightOrder(mix_c_2, 30001));
		System.out.println(processRightOrder(mix_c_3, 30001));
		System.out.println(processRightOrder(mix_c_4, 30001));
		System.out.println(processRightOrder(mix_c_5, 30001));
		System.out.println(processRightOrder(mix_c_6, 30001));
//		System.out.println(processRightOrder(dg, 30003));
//		System.out.println(processRightOrder(bqc, 30006));
//		System.out.println(processRightOrder(score,30005));
//		System.out.println(processRightOrder(betConent,30004));
//		System.out.println(processRightOrder(sigle, 30003));
//		System.out.println(processRightOrder(spf, 30002));
//		System.out.println(processRightOrder(mix, 30001));
//		System.out.println(processRightOrder(mix_bak, 30001));
		System.out.println((System.currentTimeMillis() - begin)/1000 + "秒");
	}
}


package com.hhly.skeleton.base.util.sportsutil;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSONArray;
import com.hhly.skeleton.base.common.LotteryEnum.Lottery;
import com.hhly.skeleton.base.common.SportEnum.SportBBSubWay;
import com.hhly.skeleton.base.common.SportEnum.SportBJDCSubWay;
import com.hhly.skeleton.base.common.SportEnum.SportFbSubWay;
import com.hhly.skeleton.base.constants.SymbolConstants;
import com.hhly.skeleton.base.exception.ServiceRuntimeException;
import com.hhly.skeleton.base.util.FormatConversionJCUtil;
import com.hhly.skeleton.base.util.ObjectUtil;
import com.hhly.skeleton.cms.ordermgr.bo.OrderMatchBuyWayBO;
import com.hhly.skeleton.cms.ordermgr.bo.OrderMatchChildPlayBO;
import com.hhly.skeleton.cms.ordermgr.bo.OrderMatchContentBO;
import com.hhly.skeleton.cms.ordermgr.bo.OrderOldMatchContentBO;

/**
 * @desc    
 * @author  cheng chen
 * @date    2017年10月18日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class BetContentConverUtil {
	
   private final static Logger log = Logger.getLogger(BetContentConverUtil.class);
	
	public static List<?> OrderContentConver(Integer lotteryCode, Integer lotteryChildCode, String content) {
		if (ObjectUtil.isBlank(lotteryCode))
			throw new ServiceRuntimeException("订单投注彩种为null: " + lotteryCode);
		if (ObjectUtil.isBlank(content))
			throw new ServiceRuntimeException("订单投注内容为null: " + content);
		Lottery lot = Lottery.getLottery(lotteryCode);
		switch (lot) {
		case SFC:
		case ZC_NINE:
			return oldFbBetContentConverObj(oldBetContentConverArr(content));
		case FB:
			return fbBetContentConverObj(BetContentConverArr(content), SportFbSubWay.getSportFBSubWay(lotteryChildCode));
		case BB:
			return bbBetContentConverObj(BetContentConverArr(content), SportBBSubWay.getSportBBSubWay(lotteryChildCode));
		case BJDC:
		case SFGG:
			return bjBetContentConverObj(BetContentConverArr(content), SportBJDCSubWay.getSportBJDCSubWay(lotteryChildCode));
		}
		return null;
	}
	
	public static List<OrderMatchContentBO> fbBetContentConverObj(String[] arr, SportFbSubWay sportFbSubWay){
		if(ObjectUtil.isBlank(arr))
			throw new ServiceRuntimeException("竞足转换的投注内容集合为 null : " + arr);
		List<OrderMatchContentBO> list = new LinkedList<>();
		for (int i = 0; i < arr.length - 2; i++) {
			OrderMatchContentBO bo = new OrderMatchContentBO();
			String fbStr = arr[i];
			if(fbStr.indexOf(SymbolConstants.NUMBER_SIGN) > -1){
				bo.setIsDan(1);
				fbStr = fbStr.substring(0, fbStr.length() - 1);
			}
			String[] singleMatchBC = null;
			if(SportFbSubWay.JCZQ_M.equals(sportFbSubWay)){
				singleMatchBC = FormatConversionJCUtil.singleMatchBetContentAnalysis(fbStr);
			}else if(SportFbSubWay.JCZQ_R.equals(sportFbSubWay)){
				singleMatchBC = new String[2];
				singleMatchBC[0] = fbStr.substring(0, fbStr.indexOf(SymbolConstants.MIDDLE_PARENTHESES_LEFT));
				singleMatchBC[1] = fbStr.substring(fbStr.indexOf(SymbolConstants.MIDDLE_PARENTHESES_LEFT),fbStr.length());				
			}else{
				singleMatchBC = new String[2];
				singleMatchBC[0] = fbStr.substring(0, fbStr.indexOf(SymbolConstants.PARENTHESES_LEFT));
				singleMatchBC[1] = fbStr.substring(fbStr.indexOf(SymbolConstants.PARENTHESES_LEFT),fbStr.length());
			}
			if(ObjectUtil.isBlank(singleMatchBC))
				throw new ServiceRuntimeException("竞足赛事的投注内容集合为 null : " + singleMatchBC);
			List<OrderMatchChildPlayBO> childList = new LinkedList<>();
			for (int j = 1; j < singleMatchBC.length; j++) {
				OrderMatchChildPlayBO childBO = new OrderMatchChildPlayBO();
				String bet = singleMatchBC[j];
				//处理子彩种玩法
				String playWay = "";
				if(SportFbSubWay.JCZQ_M.equals(sportFbSubWay)){
					playWay = bet.substring(0, 1);
				}else{
					playWay = sportFbSubWay.getValue();
				}
				childBO.setPlayWay(playWay);
				childBO.setPlayWayName(SportFbSubWay.getSportFbSubWay(playWay).getName());
				Map<String, String> winParam = FuShiBetsContent.fbPlayWay.get(playWay);
				if(playWay.equals(SportFbSubWay.JCZQ_R.getValue())){
					childBO.setLetNum(Float.valueOf(FormatConversionJCUtil.letNumBetContentSubstring(bet)));
					bo.setLetNum(childBO.getLetNum());
				}
				String palyBC = FormatConversionJCUtil.singleGameBetContentSubstring(bet);
				String[] optionBC = FormatConversionJCUtil.optionBetContentAnalysis(palyBC);
				List<OrderMatchBuyWayBO> buyWayList = new LinkedList<>();
				for (String optionBCStr : optionBC) {
					OrderMatchBuyWayBO buyWayBO = new OrderMatchBuyWayBO();
					String[] singleOBC = FormatConversionJCUtil.singleOptionBetContentAnalysis(optionBCStr);
					String buyWay = singleOBC[0];
					buyWayBO.setBuyWay(buyWay);
					buyWayBO.setBuyWayName(winParam == null ? buyWay : winParam.get(buyWay));
					buyWayBO.setBuySp(Float.valueOf(singleOBC[1]));
					buyWayList.add(buyWayBO);
				}
				childBO.setMatchBuyWayList(buyWayList);
				childList.add(childBO);
			}
			bo.setMatchChildPlayList(childList);
			bo.setSystemCode(singleMatchBC[0]);
			list.add(bo);
		}
		return list;
	}
	
	public static List<OrderMatchContentBO> bbBetContentConverObj(String[] arr, SportBBSubWay sportBbSubWay){
		if(ObjectUtil.isBlank(arr))
			throw new ServiceRuntimeException("竞篮转换的投注内容集合为 null : " + arr);
		List<OrderMatchContentBO> list = new LinkedList<>();
		for (int i = 0; i < arr.length - 2; i++) {
			OrderMatchContentBO bo = new OrderMatchContentBO();
			String fbStr = arr[i];
			if(fbStr.indexOf(SymbolConstants.NUMBER_SIGN) > -1){
				bo.setIsDan(1);
				fbStr = fbStr.substring(0, fbStr.length() - 1);
			}
			String[] singleMatchBC = null;
			if(SportBBSubWay.JCLQ_M.equals(sportBbSubWay)){
				singleMatchBC = FormatConversionJCUtil.singleMatchBetContentAnalysis(fbStr);
			}else if(SportBBSubWay.JCLQ_S.equals(sportBbSubWay) || SportBBSubWay.JCLQ_C.equals(sportBbSubWay)){
				singleMatchBC = new String[2];
				singleMatchBC[0] = fbStr.substring(0, fbStr.indexOf(SymbolConstants.PARENTHESES_LEFT));
				singleMatchBC[1] = fbStr.substring(fbStr.indexOf(SymbolConstants.PARENTHESES_LEFT),fbStr.length());
			}else if(SportBBSubWay.JCLQ_R.equals(sportBbSubWay) || SportBBSubWay.JCLQ_D.equals(sportBbSubWay)){
				singleMatchBC = new String[2];
				singleMatchBC[0] = fbStr.substring(0, fbStr.indexOf(SymbolConstants.MIDDLE_PARENTHESES_LEFT));
				singleMatchBC[1] = fbStr.substring(fbStr.indexOf(SymbolConstants.MIDDLE_PARENTHESES_LEFT),fbStr.length());				
			}
			if(ObjectUtil.isBlank(singleMatchBC))
				throw new ServiceRuntimeException("竞篮赛事的投注内容集合为 null : " + singleMatchBC);
			List<OrderMatchChildPlayBO> childList = new LinkedList<>();
			for (int j = 1; j < singleMatchBC.length; j++) {
				OrderMatchChildPlayBO childBO = new OrderMatchChildPlayBO();
				String bet = singleMatchBC[j];
				//处理子彩种玩法
				String playWay = "";
				if(SportBBSubWay.JCLQ_M.equals(sportBbSubWay)){
					playWay = bet.substring(0, 1);
				}else{
					playWay = sportBbSubWay.getValue();
				}
				childBO.setPlayWay(playWay);
				childBO.setPlayWayName(SportBBSubWay.getSportBBSubWay(playWay).getName());
				Map<String, String> winParam = FuShiBetsContent.bbPlayWay.get(playWay);
				if(playWay.equals(SportBBSubWay.JCLQ_R.getValue())){
					childBO.setLetNum(Float.valueOf(FormatConversionJCUtil.letNumBetContentSubstring(bet)));
					bo.setLetNum(childBO.getLetNum());
				}
				if(playWay.equals(SportBBSubWay.JCLQ_D.getValue())){
					childBO.setSizeScore(Float.valueOf(FormatConversionJCUtil.letNumBetContentSubstring(bet)));
					bo.setSizeScore(childBO.getSizeScore());
				}
				String palyBC = FormatConversionJCUtil.singleGameBetContentSubstring(bet);
				String[] optionBC = FormatConversionJCUtil.optionBetContentAnalysis(palyBC);
				List<OrderMatchBuyWayBO> buyWayList = new LinkedList<>();
				for (String optionBCStr : optionBC) {
					OrderMatchBuyWayBO buyWayBO = new OrderMatchBuyWayBO();
					String[] singleOBC = FormatConversionJCUtil.singleOptionBetContentAnalysis(optionBCStr);
					String buyWay = singleOBC[0];
					buyWayBO.setBuyWay(buyWay);
					buyWayBO.setBuyWayName(winParam == null ? buyWay : winParam.get(buyWay));
					buyWayBO.setBuySp(Float.valueOf(singleOBC[1]));
					buyWayList.add(buyWayBO);
				}
				childBO.setMatchBuyWayList(buyWayList);
				childList.add(childBO);
			}
			bo.setMatchChildPlayList(childList);
			bo.setSystemCode(singleMatchBC[0]);
			list.add(bo);
		}
		return list;
	}
	
	public static List<OrderMatchContentBO> bjBetContentConverObj(String[] arr, SportBJDCSubWay sportBjdcSubWay){
		if(ObjectUtil.isBlank(arr))
			throw new ServiceRuntimeException("北单转换的投注内容集合为 null : " + arr);
		List<OrderMatchContentBO> list = new LinkedList<>();
		for (int i = 0; i < arr.length - 2; i++) {
			OrderMatchContentBO bo = new OrderMatchContentBO();
			String fbStr = arr[i];
			if(fbStr.indexOf(SymbolConstants.NUMBER_SIGN) > -1){
				bo.setIsDan(1);
				fbStr = fbStr.substring(0, fbStr.length() - 1);
			}
			String[] singleMatchBC = null;
			 if(sportBjdcSubWay.BJDC_R.equals(sportBjdcSubWay) || sportBjdcSubWay.BJDC_W.equals(sportBjdcSubWay)){
				singleMatchBC = new String[2];
				singleMatchBC[0] = fbStr.substring(0, fbStr.indexOf(SymbolConstants.MIDDLE_PARENTHESES_LEFT));
				singleMatchBC[1] = fbStr.substring(fbStr.indexOf(SymbolConstants.MIDDLE_PARENTHESES_LEFT),fbStr.length());				
			}else{
				singleMatchBC = new String[2];
				singleMatchBC[0] = fbStr.substring(0, fbStr.indexOf(SymbolConstants.PARENTHESES_LEFT));
				singleMatchBC[1] = fbStr.substring(fbStr.indexOf(SymbolConstants.PARENTHESES_LEFT),fbStr.length());
			}
			if(ObjectUtil.isBlank(singleMatchBC))
				throw new ServiceRuntimeException("北单赛事的投注内容集合为 null : " + singleMatchBC);
			List<OrderMatchChildPlayBO> childList = new LinkedList<>();
			for (int j = 1; j < singleMatchBC.length; j++) {
				OrderMatchChildPlayBO childBO = new OrderMatchChildPlayBO();
				String bet = singleMatchBC[j];
				//处理子彩种玩法
				String playWay = "";
				playWay = sportBjdcSubWay.getValue();
				childBO.setPlayWay(playWay);
				childBO.setPlayWayName(SportBJDCSubWay.getSportBJDCSubWay(playWay).getName());
				Map<String, String> winParam = FuShiBetsContent.fbPlayWay.get(playWay);
				if(playWay.equals(sportBjdcSubWay.BJDC_R.getValue()) || playWay.equals(sportBjdcSubWay.BJDC_W.getValue())){
					childBO.setLetNum(Float.valueOf(FormatConversionJCUtil.letNumBetContentSubstring(bet)));
					bo.setLetNum(childBO.getLetNum());
				}
				String palyBC = FormatConversionJCUtil.singleGameBetContentSubstring(bet);
				String[] optionBC = FormatConversionJCUtil.optionBetContentAnalysis(palyBC);
				List<OrderMatchBuyWayBO> buyWayList = new LinkedList<>();
				for (String optionBCStr : optionBC) {
					OrderMatchBuyWayBO buyWayBO = new OrderMatchBuyWayBO();
					String[] singleOBC = FormatConversionJCUtil.singleOptionBetContentAnalysis(optionBCStr);
					String buyWay = singleOBC[0];
					buyWayBO.setBuyWay(buyWay);
					buyWayBO.setBuyWayName(winParam == null ? buyWay : winParam.get(buyWay));
					buyWayBO.setBuySp(Float.valueOf(singleOBC[1]));
					buyWayList.add(buyWayBO);
				}
				childBO.setMatchBuyWayList(buyWayList);
				childList.add(childBO);
			}
			bo.setMatchChildPlayList(childList);
			bo.setSystemCode(singleMatchBC[0]);
			list.add(bo);
		}
		return list;
	}	
	
	public static List<OrderOldMatchContentBO> oldFbBetContentConverObj(String[] arr){
		if(ObjectUtil.isBlank(arr))
			throw new ServiceRuntimeException("老足彩转换的投注内容集合为 null : " + arr);
		List<OrderOldMatchContentBO> list = new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			OrderOldMatchContentBO bo = new OrderOldMatchContentBO();
			String oldFbStr = arr[i];
			if(oldFbStr.indexOf(SymbolConstants.UNDERLINE) > -1){
				bo.setBuy(false);
				list.add(bo);
				continue;
			}			
			if(oldFbStr.indexOf(SymbolConstants.NUMBER_SIGN) > -1){
				bo.setIsDan(1);
				oldFbStr = oldFbStr.substring(0, oldFbStr.length() - 1);
			}
			List<OrderMatchBuyWayBO> buyWayList = new LinkedList<>();
			String[] singleMatchBC =FormatConversionJCUtil.optionBetContentAnalysis(oldFbStr);
			for (int j = 0; j < singleMatchBC.length; j++) {
				OrderMatchBuyWayBO buyWayBO = new OrderMatchBuyWayBO();
				String buyWay = singleMatchBC[j];
				buyWayBO.setBuyWay(buyWay);
				buyWayBO.setBuyWayName(FuShiBetsContent.spfMap.get(buyWay));
				buyWayList.add(buyWayBO);
			}
			bo.setMatchBuyWayList(buyWayList);
			list.add(bo);
		}
		return list;
	}
	
	/**
	 * 竞彩订单投注记录转数组对象
	 * @param content
	 * @return
	 * @date 2017年10月20日下午12:16:48
	 * @author cheng.chen
	 */
	public static String[] BetContentConverArr(String content){
		if(ObjectUtil.isBlank(content))
			throw new ServiceRuntimeException("订单投注内容为null: " + content);
		String[] str = null;
		String regEx = SymbolConstants.SING_CAP_BAR;   
		if(content.indexOf(SymbolConstants.NUMBER_SIGN) > -1){
			String[] signStr = content.split(SymbolConstants.NUMBER_SIGN);
			String[] danStr = signStr[0].split(SymbolConstants.DOUBLE_SLASH_VERTICAL_BAR);
			content = "";
			for (int i = 0; i < danStr.length; i++) {
				danStr[i] += SymbolConstants.NUMBER_SIGN;
				content += danStr[i];
			}
			content += signStr[1];
		}
		Pattern p =Pattern.compile(regEx);  
		Matcher m = p.matcher(content);  
		str = p.split(content);
		if(!ObjectUtil.isBlank(str)){
			for (int i = 0; i < str.length; i++) {
				if (m.find()) {
					if(m.group().equals(SymbolConstants.NUMBER_SIGN))
					str[i] += m.group();
					log.debug(str[i]);
				}
			}
		}		
		return str;
	}
	
	public static String[] oldBetContentConverArr(String content){
		if(ObjectUtil.isBlank(content))
			throw new ServiceRuntimeException("订单投注内容为null: " + content);
		String[] str = null;
		String regEx = SymbolConstants.SING_BAR;   
		Pattern p =Pattern.compile(regEx);  
		Matcher m = p.matcher(content);  
		str = p.split(content);
		if(!ObjectUtil.isBlank(str)){
			for (int i = 0; i < str.length; i++) {
				if (m.find()) {
					if(m.group().equals(SymbolConstants.NUMBER_SIGN))
					str[i] += m.group();
					log.debug(str[i]);
				}
			}
		}
		return str;
	}
	
	public static void main(String[] args) {
//		OrderContentConver(300, "1706132004_S(1@4.10)#1706132005_R[+1](3@3.02)|1706132011_R[-1](1@3.20)|1706132010_R[+1](0@3.50,3@1.87)|1706132006_S(3@3.15)_R[+1](1@3.55)^2_1^1");
//		String[] arr = oldBetContentConverArr("3#3|1#1|1|1|1|0#_|0|0|0|0|1,0");
		String[] arr = BetContentConverArr("1807297005_S(0@1.91)|1807297009_S(0@2.06)|1807297012_S(0@1.36)#1807297014_S(3@1.73)|1807297003_S(0@2.13)|1807297006_R[-1](1@3.60)|1807297007_S(3@1.88)|1807297010_S(3@1.47)|1807297013_R[-1](0@1.53)^8_1^1");
		
		List<OrderMatchContentBO> list = fbBetContentConverObj(arr, SportFbSubWay.JCZQ_M);
		
//		List<OrderMatchContentBO> list = bbBetContentConverObj(arr, SportBBSubWay.JCLQ_D);
		
//		List<OrderMatchContentBO> list = bjBetContentConverObj(arr, SportBJDCSubWay.BJDC_W);
		
//		List<OrderOldMatchContentBO> list = oldFbBetContentConverObj(arr);
		
		System.out.println(JSONArray.toJSONString(list));
	}
}

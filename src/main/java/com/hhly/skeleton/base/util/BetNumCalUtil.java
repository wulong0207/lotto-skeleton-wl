package com.hhly.skeleton.base.util;

import java.util.ArrayList;
import java.util.List;

import com.hhly.skeleton.base.constants.Constants;
import com.hhly.skeleton.base.constants.OldFootballConstants;
import com.hhly.skeleton.base.constants.SymbolConstants;
import com.hhly.skeleton.base.util.sportsutil.Combine;

/**
 * 
 * @author longguoyou
 * @date 2017年3月8日 下午3:43:02
 * @desc 投注注数计算
 */
public class BetNumCalUtil {
    
	 /**
	  * 14胜平负 解析投注内容注数
	  * @author longguoyou
	  * @date 2017年3月8日 下午3:46:19
	  * @param content 投注内容  e.g. 复式：3,1|1,0|3,0|_|_|3,1|3,1|3|3|3|3,0|1|3,0|3
	  * @return 注数
	  */
     public static Integer sfc(String content){
    	 Integer total = 1;
    	 String[] splitStr = content.split(SymbolConstants.DOUBLE_SLASH + SymbolConstants.VERTICAL_BAR);
    	 for(int i = 0; i < splitStr.length; i++){
    		 if(!splitStr[i].equals(SymbolConstants.UNDERLINE) && !splitStr[i].equals(SymbolConstants.STAR) && OldFootballConstants.checkBetContentGame(OldFootballConstants.ID_FOURTEEN, splitStr[i])){
    			 total *= splitStr[i].split(SymbolConstants.COMMA).length;
    		 }
    	 }
    	 return total;
     }
     
     /**
      * 任9胆拖 解析投注内容注数
      * @author longguoyou
      * @date 2017年3月8日 下午3:47:29
      * @param content 投注内容 e.g. 任九胆拖：3,1#1,0|3,0|_|_|3,1|3,1|3,1#3|3|3,0|1|3,0|3  <br>说明：不能低于9场，最大14场全选
      * @return 注数
      */
     public static Integer sfcNine(String content){
    	 //胆码投注集合
    	 List<String> danList = new ArrayList<String>();
    	 //普通投注集合
    	 List<String> list    = new ArrayList<String>();
    	 String[] splitStr = content.split(SymbolConstants.DOUBLE_SLASH + SymbolConstants.VERTICAL_BAR);
    	 for(int i = 0; i < splitStr.length; i++){
    		 if(splitStr[i].contains(SymbolConstants.NUMBER_SIGN)){
    			 String[] danTuo = splitStr[i].split(SymbolConstants.NUMBER_SIGN);
    			 danList.add(danTuo[0]);
    			 list.add(danTuo[1]);
    		 }else{
    			 list.add(splitStr[i]);
    		 }
    	 }
    	 Integer danCount = 1;//胆码组合注数
    	 for(int i = 0; i < danList.size(); i++){
    		 danCount *= danList.get(i).split(SymbolConstants.COMMA).length;
    	 }
    	 Combine combine = new Combine();
    	 Integer total = 0;
    	 String[] array = new String[list.size()];
    	 List<String> listCombine = combine.mn(list.toArray(array), Constants.NUM_9 - danList.size());//普通投注中，减去胆码数后，无胆码组合
    	 for(int i = 0; i < listCombine.size(); i++){
    		 Integer eachCombine = danCount;//因为每个无胆码组合，必须与胆码组合注数相乘，故初始化为胆码注数
    		 for(String str : listCombine.get(i).split(SymbolConstants.OBLIQUE_LINE)){
    			 eachCombine *=  str.split(SymbolConstants.COMMA).length;
    		 }
    		 total += eachCombine;
    	 }
    	 return total;
     }
     
     public static void main(String[] args) {
    	 
//    	 Combine combine = new Combine();
//    	 String[] array = {"3,1","2,1_a","2,1_b","2,1_c","2,1_d","2,1_e","2,1_f"};
//    	 List<String>  list = combine.mn(array, 3);
//    	 for(String str: list){
//    		 System.out.println(str);
//    	 }
    	 System.out.println(sfcNine("3,1#3|3|3|3|3|3|3|3|3|3|3|3|3"));
//		System.out.println(sfc("3,1|1,0|3,0|_|_|3,1|3,1|3|3|3|3,0|1|3,0|3"));
//    	 System.out.println(sfcNine("3,1#1,0|3,0|_|_|3,1|3,1|3,1#3|3|3,0|1|3,0|3"));
	}
}

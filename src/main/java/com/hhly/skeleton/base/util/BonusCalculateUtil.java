package com.hhly.skeleton.base.util;

import com.hhly.skeleton.base.constants.SymbolConstants;

import java.math.BigDecimal;
import java.util.*;

/**
 * 竞彩奖金计算工具类
 * @author yuanshangbing
 *
 */
public class BonusCalculateUtil {

    /**
     * 161128301[+11.5](3@4.2,0@1.1)|161128302[+1.5](3@1.39,0@2.35)|161128303[+6.5](3@2.6,0@1.32)^2_1,3_1
     * 单一玩法奖金范围值
     * @param betContent 投注内容
     * @param betNum 注数
     * @param multiple 倍数
     */
    public static void getSingleMaxMinBonus(String betContent, Integer betNum, Integer multiple){
        Double maxBonus = 0.00;//最大奖金,默认值为0方便计算
        Double minBonus = 2.00;//最小奖金 默认值2方便计算
        //2_1串数组
        Integer minBunch=0;//最小串
        String[] betContents = FormatConversionJCUtil.singleBetContentAnalysis(betContent);
        Map<String,Set<Double>> gameSpMap = getSingleSpMap(betContent);
        Set<Integer> bunchSet = new TreeSet<Integer>();
        String bunchStrs[] = FormatConversionJCUtil.optionBetContentAnalysis(betContents[1]);
        for(String bunchStr : bunchStrs){
            bunchSet.add(Integer.valueOf(bunchStr.split(SymbolConstants.UNDERLINE)[0]));
        }
        List<Integer> bunchList = new ArrayList<Integer>(bunchSet);
        minBunch = bunchList.get(0);
        Set<Double> maxValueSet = new TreeSet<Double>();
        Set<Double> minValueSet = new TreeSet<Double>();

        Iterator<String> iterator = gameSpMap.keySet().iterator();
        while(iterator.hasNext()){
            TreeSet<Double> spsSet = (TreeSet<Double>)gameSpMap.get(iterator.next());
            List<Double> list = new ArrayList<Double>(spsSet);
            Double minValue = list.get(0);
            Double maxValue = list.get(list.size()-1);
            maxValueSet.add(maxValue);
            minValueSet.add(minValue);
        }
        for(int i=0;i<bunchList.size();i++){
            maxBonus = NumberUtil.sum(maxBonus,sum(maxValueSet.toArray(),bunchList.get(i)));
        }
        List<Double> minValueList = new ArrayList<Double>(minValueSet);
        for(int i=0;i<minBunch;i++){
            minBonus = NumberUtil.mul(minBonus,minValueList.get(i));
        }
        maxBonus = maxBonus * multiple*2;
        minBonus = minBonus * multiple;
        System.out.println("最大值："+NumberUtil.round(maxBonus,2, BigDecimal.ROUND_HALF_UP)+"最小值："+NumberUtil.round(minBonus,2,BigDecimal.ROUND_HALF_UP));
    }


    /**
     * 161128301[+11.5](3@4.2,0@1.1)|161128302[+1.5](3@1.39,0@2.35)|161128303[+6.5](3@2.6,0@1.32)^2_1,3_1
     * 混合玩法奖金范围值
     * @param betContent 投注内容
     * @param betNum 注数
     * @param multiple 倍数
     */
    public static void getMingleMaxMinBonus(String betContent, Integer betNum, Integer multiple){
        Double maxBonus = 0.00;//最大奖金,默认值为0方便计算
        Double minBonus = 2.00;//最小奖金 默认值2方便计算
        //2_1串数组
        Integer minBunch=0;//最小串
        String[] betContents = FormatConversionJCUtil.singleBetContentAnalysis(betContent);
        Map<String,Set<Double>> gameSpMap = getMingleSpMap(betContent);
        Set<Integer> bunchSet = new TreeSet<Integer>();
        String bunchStrs[] = FormatConversionJCUtil.optionBetContentAnalysis(betContents[1]);
        for(String bunchStr : bunchStrs){
            bunchSet.add(Integer.valueOf(bunchStr.split(SymbolConstants.UNDERLINE)[0]));
        }
        List<Integer> bunchList = new ArrayList<Integer>(bunchSet);
        minBunch = bunchList.get(0);
        Set<Double> maxValueSet = new TreeSet<Double>();
        Set<Double> minValueSet = new TreeSet<Double>();

        Iterator<String> iterator = gameSpMap.keySet().iterator();
        while(iterator.hasNext()){
            TreeSet<Double> spsSet = (TreeSet<Double>)gameSpMap.get(iterator.next());
            List<Double> list = new ArrayList<Double>(spsSet);
            Double minValue = list.get(0);
            Double maxValue = list.get(list.size()-1);
            maxValueSet.add(maxValue);
            minValueSet.add(minValue);
        }
        for(int i=0;i<bunchList.size();i++){
            maxBonus = NumberUtil.sum(maxBonus,sum(maxValueSet.toArray(),bunchList.get(i)));
        }
        List<Double> minValueList = new ArrayList<Double>(minValueSet);
        for(int i=0;i<minBunch;i++){
            minBonus = NumberUtil.mul(minBonus,minValueList.get(i));
        }
        maxBonus = maxBonus * multiple*2;
        minBonus = minBonus * multiple;
        System.out.println("最大值："+NumberUtil.round(maxBonus,2, BigDecimal.ROUND_HALF_UP)+"最小值："+NumberUtil.round(minBonus,2,BigDecimal.ROUND_HALF_UP));
    }

    /**
     * 单一玩法：获取SPmap,机构为，key:systemCode，value为SP集合
     * @param betContent
     * @return
     */
    private static Map<String,Set<Double>> getSingleSpMap(String betContent){
        //取出
        //[0]投注的详细内容.包括 系统编号,玩法代号,让分数,投注选项,SP值(多组)
        //[1]过关方式(多个)
        //[2]倍数(单个)
        String[] betContents = FormatConversionJCUtil.singleBetContentAnalysis(betContent);
        //对阵数组 161128301[+11.5](3@1.57,0@2.27)|161128302[+1.5](3@1.89,0@4.21)
        String[] gameContents = FormatConversionJCUtil.betContentDetailsAnalysis(betContents[0]);
        Map<String,Set<Double>> gameSpMap = new HashMap<String,Set<Double>>();
        for(String gameContent : gameContents){
            //赛事编号
            String systemCodestr[] = gameContent.split(SymbolConstants.DOUBLE_SLASH+SymbolConstants.MIDDLE_PARENTHESES_LEFT);
            String systemCode="";
            if(systemCodestr.length>=2){//是让分胜负或者大小分
                systemCode = gameContent.split(SymbolConstants.DOUBLE_SLASH+SymbolConstants.MIDDLE_PARENTHESES_LEFT)[0];
            }else{//其他玩法
                systemCode = gameContent.split(SymbolConstants.DOUBLE_SLASH+SymbolConstants.PARENTHESES_LEFT)[0];
            }
            //3@1.57,0@2.27
            String spContent = FormatConversionJCUtil.singleGameBetContentSubstring(gameContent);
            String singleSps[] =FormatConversionJCUtil.optionBetContentAnalysis(spContent);
            Set<Double> spSet = new TreeSet<>();
            for(String sp : singleSps){
                String sps[] = FormatConversionJCUtil.singleOptionBetContentAnalysis(sp);
                spSet.add(Double.valueOf(sps[1]));
            }
            gameSpMap.put(systemCode,spSet);
        }
        return gameSpMap;
    }

    /**
     * 混合玩法：获取SPmap,机构为，key:systemCode，value为SP集合
     * @param betContent
     * @return
     */
    public static Map<String,Set<Double>> getMingleSpMap(String betContent){
        //取出
        //[0]投注的详细内容.包括 系统编号,玩法代号,让分数,投注选项,SP值(多组)
        //[1]过关方式(多个)
        //[2]倍数(单个)
        String[] betContents = FormatConversionJCUtil.singleBetContentAnalysis(betContent);
        //对阵数组 161128301[+11.5](3@1.57,0@2.27)|161128302[+1.5](3@1.89,0@4.21)
        String[] gameContents = FormatConversionJCUtil.betContentDetailsAnalysis(betContents[0]);
        Map<String,Set<Double>> gameSpMap = new HashMap<String,Set<Double>>();
        for(String gameContent : gameContents){
            //赛事编号
            String systemCode = gameContent.split(SymbolConstants.DOUBLE_SLASH+SymbolConstants.UNDERLINE)[0];
            //3@1.57,0@2.27
            String spContent = FormatConversionJCUtil.singleGameBetContentSubstring(gameContent);
            String singleSps[] =FormatConversionJCUtil.optionBetContentAnalysis(spContent);
            Set<Double> spSet = new TreeSet<>();
            for(String sp : singleSps){
                String sps[] = FormatConversionJCUtil.singleOptionBetContentAnalysis(sp);
                spSet.add(Double.valueOf(sps[1]));
            }
            gameSpMap.put(systemCode,spSet);
        }
        return gameSpMap;
    }

    /**
     * 求数组内的乘积和
     * @param arry
     * @param count
     * @return
     */
    private static double sum(Object[] arry, int count) {
        double sum = 0;
        // 整体依然循环两次，外循环
        for (int i = 0; i < arry.length; i++) {
            // 内循环
            for (int j = i + 1; j <= arry.length - count + 1; j++) {
                // tmp：count个数的乘积
                double tmp = (double)arry[i];
                // 用于输出计算过程
                System.out.print(arry[i]);
                for (int k = 0; k < count - 1; k++) {
                    System.out.println(" * " + arry[j + k]);
                    tmp = NumberUtil.mul(tmp,(double)arry[j + k]);
                }
                // 计算总和
                sum =NumberUtil.sum(sum,tmp);
            }
        }
        System.out.println(sum);
        return sum;
    }


    public static void main(String[] args) {
        //单一玩法
        /*String content = "161128301[+11.5](3@4.2,0@1.1)|161128302[+1.5](3@1.39,0@2.35)|161128303[+6.5](3@2.6,0@1.32)^2_1,3_1";
        getSingleMaxMinBonus(content, 1, 1);*/

        //混合玩法
        String content = "161128301_R[+11.5](3@1.57,0@2.27)_S(3@1.89,0@4.21)_C(11@1.78,23@5.21)" +
                "|161128304_R[-2](3@3.33)_C[18.5](12@4.21)^2_1,3_1";
        //getMingleMaxMinBonus(content,1,1);

        String a []= content.split("_");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }





    }


}

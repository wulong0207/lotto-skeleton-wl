package com.hhly.skeleton.base.constants;

import com.hhly.skeleton.base.bo.ResultBO;
import com.hhly.skeleton.base.common.LotteryEnum;
import com.hhly.skeleton.base.common.SportEnum;
import com.hhly.skeleton.base.util.FormatConversionJCUtil;
import com.hhly.skeleton.base.util.ObjectUtil;
import com.hhly.skeleton.lotto.base.sport.vo.JcParamVO;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhanglei
 * @version 1.0
 * @desc 竞彩常量
 * @date 2017-2-4
 * @company 益彩网络科技公司
 */
public class JCConstants {


    /**
     * 周几map
     */
    public static final HashMap<String, String> weekTxtMap = new HashMap<>(7);
    /**
     * 过关方式 多串1
     */
    public static final String ONE_PASSWAY = "1";
    /**
     * 过关方式 多串多
     */
    public static final String MANY_PASSWAY = "2";
    /**
     * 单式
     */
    public static final String DS = "DS";
    /**
     * 复式
     */
    public static final String FS = "FS";
    /**
     * 胆拖
     */
    public static final String DT = "DT";
    /**
     * 胜平负
     */
    public static final String S = "S";
    /**
     * 让球胜平负
     */
    public static final String R = "R";
    /**
     * 允许最高串关数 4
     */
    public static final Integer PASSWAY_LIMIT_FOUR = 4;
    /**
     * 允许最高串关数 6
     */
    public static final Integer PASSWAY_LIMIT_SIX = 6;
    /**
     * 允许最高串关数 8
     */
    public static final Integer PASSWAY_LIMIT_EIGHT = 8;

    /**
     * 单式上传和竞彩最大倍数五万倍。order_info 和 order_detail
     */
    public static final Integer MAX_LIMIT_MULTIPLE = 50000;
    /**
     * 最低返奖率须大于145%
     */
    public static final Double ORDER_MIN_PRIZE_MULTIPLE = 1.45;
    
    /**
     * 双选时2个推荐项的赔率必须都大于2.45
     */
    public static final Double BET_MORE_MIN_RATE = 2.45;
    /**
     * 请选择赔率大于1.45的选项
     */
    public static final Double BET_ONE_MIN_RATE = 1.45;
    /**
     * 让分胜平负投注内容匹配正则表达式
     */
    public static final String RF_SPF_CONTENT_REGEX = "\\d{10}\\[[+-][1-9]\\d*\\]\\([013]@[1-9]\\d*\\.\\d{2}(,[013]@[1-9]\\d*\\.\\d{2})*\\)";
    
    /**
     * 混投让球胜平负
     */
    public static final String FHT_RF_CONTENT_REGEX = "R\\[[+-][1-9]\\d*\\]\\([013]@[1-9]\\d*\\.\\d{2}(,[013]@[1-9]\\d*\\.\\d{2})*\\)";
    
    /**
     * 混投胜平负
     */
    public static final String FHT_CONTENT_REGEX = "S\\([013]@[1-9]\\d*\\.\\d{2}(,[013]@[1-9]\\d*\\.\\d{2})*\\)";
    /**
     * 胜平负投注内容匹配正则表达式
     */
    public static final String SPF_CONTENT_REGEX = "\\d{10}\\([013]@[1-9]\\d*\\.\\d{2}(,[013]@[1-9]\\d*\\.\\d{2})*\\)";
    
    /**
     * 竞彩
     */
    public static final Map<Integer, String> JCLottery = new HashMap<Integer, String>();
    /**
     * 过关方式 . 多串1
     */
    private static final String[] ONE_PASSWAY_CONTENT = {"2" + SymbolConstants.UNDERLINE + "1", "3" + SymbolConstants.UNDERLINE + "1", "4" + SymbolConstants.UNDERLINE + "1", "5" + SymbolConstants.UNDERLINE + "1", "6" + SymbolConstants.UNDERLINE + "1", "7" + SymbolConstants.UNDERLINE + "1", "8" + SymbolConstants.UNDERLINE + "1"};
    /**
     * 过关方式. N串N
     */
    private static final String[] MANY_PASSWAY_CONTENT = {"3" + SymbolConstants.UNDERLINE + "3", "3" + SymbolConstants.UNDERLINE + "4",
            "4" + SymbolConstants.UNDERLINE + "4", "4" + SymbolConstants.UNDERLINE + "5",
            "4" + SymbolConstants.UNDERLINE + "6", "4" + SymbolConstants.UNDERLINE + "11",
            "5" + SymbolConstants.UNDERLINE + "5", "5" + SymbolConstants.UNDERLINE + "6",
            "5" + SymbolConstants.UNDERLINE + "10", "5" + SymbolConstants.UNDERLINE + "16",
            "5" + SymbolConstants.UNDERLINE + "20", "5" + SymbolConstants.UNDERLINE + "26",
            "6" + SymbolConstants.UNDERLINE + "6", "6" + SymbolConstants.UNDERLINE + "7",
            "6" + SymbolConstants.UNDERLINE + "15", "6" + SymbolConstants.UNDERLINE + "20",
            "6" + SymbolConstants.UNDERLINE + "22", "6" + SymbolConstants.UNDERLINE + "35",
            "6" + SymbolConstants.UNDERLINE + "42", "6" + SymbolConstants.UNDERLINE + "50",
            "6" + SymbolConstants.UNDERLINE + "57", "7" + SymbolConstants.UNDERLINE + "7",
            "7" + SymbolConstants.UNDERLINE + "8", "7" + SymbolConstants.UNDERLINE + "21",
            "7" + SymbolConstants.UNDERLINE + "35", "7" + SymbolConstants.UNDERLINE + "120",
            "8" + SymbolConstants.UNDERLINE + "8", "8" + SymbolConstants.UNDERLINE + "9",
            "8" + SymbolConstants.UNDERLINE + "28", "8" + SymbolConstants.UNDERLINE + "56",
            "8" + SymbolConstants.UNDERLINE + "70", "8" + SymbolConstants.UNDERLINE + "247"};
    /**
     * 胜平负、让球胜平负、胜负、让分胜负、大小分最高串为8串
     */
    private static final String EIGHT_ONE_REGEXN = "^[1-8].*";
    /**
     * 半全场、比分、竞彩篮球胜分差最高串为4串
     */
    private static final String FOUR_ONE_REGEXN = "^[1-4].*";
    /**
     * 总进球最高串6串
     */
    private static final String SIX_ONE_REGEXN = "^[1-6].*";
    /**
     * 尾数是-1(串1)
     */
    private static final String LAST_REGEXN = ".*\\_1";
    /**
     * n串m的正则表达式
     */
    private static final String N_M_REGEXN = "^(4_(4|5|6|11))|(3_(3|4))|(5_(5|6|10|16|20|26))|(6_(6|7|15|20|22|35|42|50|57))|(7_(7|8|21|35|120))|(8_(8|9|28|56|70|247))";
    /**
     * 判断内容是否包含 半全场、比分、竞彩篮球胜分差的玩法内容
     */
    private static final String Q_B_C_REGEXN = ".*(Q|B|C).*";
    /**
     * 判断内容是否包含 总进球的玩法内容
     */
    private static final String Z_REGEXN = ".*Z.*";

    static {
        weekTxtMap.put("1", "周一");
        weekTxtMap.put("2", "周二");
        weekTxtMap.put("3", "周三");
        weekTxtMap.put("4", "周四");
        weekTxtMap.put("5", "周五");
        weekTxtMap.put("6", "周六");
        weekTxtMap.put("7", "周日");
    }


    /**
     * 查询玩法格式
     *
     * @param content  投注内容
     * @param contents
     * @return
     */
    protected static boolean findBetContent(String content, String[] contents) {
        if (ObjectUtil.isBlank(content))
            return false;
        for (String temp : contents) {
            if (temp.equals(content)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 检查过关方式内容 合法性 和 过关串一起是否合规
     *
     * @param passWayStr     过关串
     * @param content        竞彩投注内容
     * @param lotterChilCode 子彩种id
     * @return
     */
    public static boolean checkContentJCPassWay(String passWayStr, String content, Integer lotterChilCode) {
        //胜平负、让球胜平负、胜负、让分胜负、大小分最高串为8串
        String regexn = EIGHT_ONE_REGEXN;
        if (JCZQConstants.ID_FBCQ == lotterChilCode ||
                JCZQConstants.ID_FBF == lotterChilCode ||
                JCLQConstants.ID_JCLQ_SFC == lotterChilCode || content.matches(Q_B_C_REGEXN)) {
            //半全场、比分、竞彩篮球胜分差最高串为4串
            regexn = FOUR_ONE_REGEXN;
        } else if (JCZQConstants.ID_FZJQ == lotterChilCode || content.matches(Z_REGEXN)) {
            regexn = SIX_ONE_REGEXN;
        }

        if (!passWayStr.matches(regexn)) {
            return false;
        } else if (!passWayStr.matches(LAST_REGEXN) && !passWayStr.matches(N_M_REGEXN)) {
            return false;
        }
        return true;
    }

    /**
     * @param content         方案内容
     * @param lotteryChidCode 子彩种ID
     * @return int
     * @Description:返回当前方案的允许的最高串
     * @author wuLong
     * @date 2017年4月8日 上午10:16:08
     */
    public static int getHitPassWay(String content, Integer lotteryChidCode) {
        int hitPassWay = 8;
        if (JCZQConstants.ID_FBCQ == lotteryChidCode ||
                JCZQConstants.ID_FBF == lotteryChidCode ||
                JCLQConstants.ID_JCLQ_SFC == lotteryChidCode || content.matches(Q_B_C_REGEXN)) {
            //半全场、比分、竞彩篮球胜分差最高串为4串
            hitPassWay = 4;
        } else if (JCZQConstants.ID_FZJQ == lotteryChidCode || content.matches(Z_REGEXN)) {
            hitPassWay = 6;
        }
        return hitPassWay;
    }

    /**
     * 检查过关方式格式 合法性
     */
    public static boolean checkFormatJCPassWay(String passWayStr) {
        return !ObjectUtil.isBlank(passWayStr) && passWayStr.indexOf(SymbolConstants.UNDERLINE) != -1;

    }


    /**
     * 获取过关方式
     *
     * @param status 销售状态
     * @return
     */
    public static Integer getSingle(Integer status) {
        if (ObjectUtil.isBlank(status)) {
            return null;
        }
        if (status.equals(SportEnum.SportSaleStatusEnum.PASS_SALE.getValue()) || status.equals(SportEnum.SportSaleStatusEnum.NORMAL_SALE.getValue())) {
            return SportEnum.SportPassTypeEnum.PASS.getValue();
        } else if (status.equals(SportEnum.SportSaleStatusEnum.SINGLE_SALE.getValue())) {
            return SportEnum.SportPassTypeEnum.SINGLE.getValue();
        }
        return null;
    }

    /**
     * 获取是否有着状态
     *
     * @param vo
     * @return
     */
    public static boolean getPlayFlag(JcParamVO vo, String value) {
        if (ObjectUtil.isBlank(vo) || ObjectUtil.isBlank(vo.getPlayFlag())) {
            return false;
        }

        //获取是否有这个标识
        for (String str : vo.getPlayFlag()) {
            if (str.toLowerCase().equals(value)) {
                return true;
            }
        }

        return false;
    }

    /**
     * 对阵赛事名称和主客队名称处理
     * @param name1
     * @param name2
     * @return
     */
    public static String getName(String name1,String name2){
       String name = ObjectUtil.isBlank(name1)?name2:name1;
       if(ObjectUtil.isBlank(name)){
           return "-";
       }
       return name;
    }

    public static boolean gyjCheckLotteryId(Integer lotteryCode) {
        LotteryEnum.LotteryPr lott = LotteryEnum.getLottery(lotteryCode);
        if(lott.name().equals(LotteryEnum.LotteryPr.GYJ.name())){
            return true;
        }
        return false;
    }

    /**
     * 获取赛事systemCode
     * @param gameDetail
     * @param lotteryChildCode
     * @return
     */
    public static String getSystemCode(String gameDetail, Integer lotteryChildCode){
        String systemCode = SymbolConstants.ENPTY_STRING;
        if(!ObjectUtil.isBlank(lotteryChildCode)){
            if(lotteryChildCode == JCZQConstants.ID_FHT || lotteryChildCode == JCLQConstants.ID_JCLQ_HHGG){//竞彩混合
                systemCode = FormatConversionJCUtil.stringSplitArray(gameDetail, SymbolConstants.UNDERLINE, true)[0];
            }else {
                //让分胜平负和大小分
                String systemCodestr[] = FormatConversionJCUtil.stringSplitArray(gameDetail, SymbolConstants.MIDDLE_PARENTHESES_LEFT, true);
                if(systemCodestr.length >= 2){//是让分胜负或者大小分
                    systemCode = FormatConversionJCUtil.stringSplitArray(gameDetail, SymbolConstants.MIDDLE_PARENTHESES_LEFT, true)[0];
                }else{//其他玩法
                    systemCode = FormatConversionJCUtil.stringSplitArray(gameDetail, SymbolConstants.PARENTHESES_LEFT, true)[0];
                }
            }
        }
        return systemCode;
    }

    public static void main(String[] args) {
        //(4_(4|5|6|11))|(3_(3|4))|(5_(5|6|10|16|20|26))|(6_(6|7|15|20|22|35|42|50|57))|(7_(7|8|21|35|120))|(8_(8|9|28|56|70|247))
        //^(4_(4|5|6|11))
//		String passWayStr = "4_4,4_5,4_6,4_11,3_3,3_4,5_5,5_6,5_10,5_16,5_20,5_26,6_6,6_7,6_15,6_20,6_22,6_35,6_42,6_50,6_57,7_7,7_8,7_21,7_35,7_120,8_8,8_9,8_28,8_56,8_70,8_247";
//		String[] s = passWayStr.split(",");
//		for(String a : s){
//			System.out.println(a+","+a.matches(N_M_REGEXN));
//		}
        String childCodeFB = "RSQZB";//竞足
        String childCodeBB = "SRCD";//竞篮球
        String a = "161128001R[+1](3@1.57,0@2.27)_S(1@1.89,0@4.21)_Q(11@1.78,23@5.21)_Z(2@3.45,3@2.34)_B(33@2.31,31@4.00)";
        String parex = "^[" + childCodeFB + "]\\[[+-]\\d{1}\\]\\(([310])@[1-9][0-9]*(\\.[0-9]{1,2})\\)";//,*([310]|[0-9][0-9])@[1-9][0-9]*(\\.[0-9]{1,2})
//		a = "R[+1](3@1.57,1@2.27)";
//		String parex = "^[RSQZB]\\[[+-]\\d{1}\\]\\(([0-9][0-9])@[1-9][0-9]*(\\.[0-9]{1,2}),*([0-9][0-9])@[1-9][0-9]*(\\.[0-9]{1,2})\\)";
//		parex = "^\\d{9}\\_[RSQZB]\\[([+-]\\d{1})\\*]";
        a = "R[+1](3@1.57)";
        if (a.matches(parex)) {
            System.out.println("abc");
        } else {
            System.out.println("def");
        }


//		            officialCode = JCConstants.weekTxtMap.get(weekNum) + weekCode;String content = "161128001_R[+1](3@1.57,0@2.27)_S(1@1.89,0@4.21)_Q(11@1.78,23@5.21)_Z(2@3.45,3@2.34)_B(33@2.31,31@4.00)#161128002_S(1@1.89,0@4.21)|161128003_Z(0@4.21)|161128004_R[-2](3@3.33)_Z(0@4.21)";
//		System.out.println(passWayStr.matches(N_M_REGEXN));
//		System.out.println(checkContentJCPassWay("8_1", content,JCZQConstants.ID_FHT));
    }
}

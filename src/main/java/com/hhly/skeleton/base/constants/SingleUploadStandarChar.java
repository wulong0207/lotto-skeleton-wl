package com.hhly.skeleton.base.constants;
/**
 * 单式上传标准转换字符对照字符常量
 * 
 * @author longguoyou
 * @date 2017年6月14日
 * @compay 益彩网络科技有限公司
 */
public class SingleUploadStandarChar {
	/**
	 * 让胜平负/胜平负 标准转换字符
	 */
	private static final String[] SPF_STANDAR_CONTENT = { "3", "1", "0", "#"};
	/**
	 * 总进球 标准转换字符
	 */
	private static final String[] ZJQ_STANDAR_CONTENT = { "0", "1", "2", "3", "4", "5", "6", "7", "#"};
	/**
	 * 半全场胜平负
	 */
	private static final String[] BQCSF_BET_CONTENT = { "33", "30", "31", "13", "10", "11", "03", "00", "01", "##"};
	
	/**
	 * 竞足比分  标准转换字符串
	 */
	private static final String[] DCBF_STANDAR_CONTENT = { "10", "20", "21", "30", "31", "32", "01", "02",
            "12", "03", "13", "23", "00", "11", "40", "41", "42", "50", "51", "52", "90", "##", "04", "14", "24",
            "05", "15", "25", "09", "22", "33", "99" };
	
	/**
	 * 北京单场比分  标准转换字符串
	 */
	private static final String[] BJDC_BF_STANDAR_CONTENT = { "10","20","21","30","31","32","40","41","42","90","##",
			"00","11","22","33","99","01","02","12","03","13","23","04","14","24","09" };
	
	/** 
	 * 混投 让胜平负/胜平负 标准转换字符
	 */
	private static final String[] FHT_SPF_STANDAR_CONTENT = { "R", "3", "1", "0", "#"};
	
	/**
	 * 上下单双
	 */
	private static final String[] SXDX_BET_CONTENT = {"1","2","3","4","#"};
	
	/**
	 * 胜负彩投注内容 胜(3) 负(0)
	 */
	private static final String[] SFC_BET_CONTENT = {"3","0","#"};
	
	/**
	 * 获取标准转换字符数组
	 * @author longguoyou
	 * @date 2017年6月14日
	 * @param playCode 子玩法简称R\S\Z\Q\B
	 * @return
	 */
	public static String[] getStandarChar(String playCode){
		switch(playCode){
		case "S":
		case "R":
			return SPF_STANDAR_CONTENT;
		case "Z":
			return ZJQ_STANDAR_CONTENT;
		case "Q":
			return DCBF_STANDAR_CONTENT;
		case "BQ"://北京单场
			return BJDC_BF_STANDAR_CONTENT;
		case "B":
			return BQCSF_BET_CONTENT;
		case "M":
			return FHT_SPF_STANDAR_CONTENT;
		case "W":
			return SFC_BET_CONTENT;
		case "D":
			return SXDX_BET_CONTENT;
		default:
			return null;
		}
	}
}

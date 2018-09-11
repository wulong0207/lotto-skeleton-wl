package com.hhly.skeleton.base.util;

/**
 * 彩票工具类
 * 
 * @author wytong
 * @Version 1.0
 * @CreatDate 2016年12月26日 下午4:09:23
 */
public abstract class LotUtil {

	/**
	 * 拆分开奖号码
	 * 
	 * @param drawCode
	 * @return
	 */
	public static String[] split(String drawCode) {
		if (ObjectUtil.isBlank(drawCode)) {
			return null;
		}
		if (drawCode.indexOf("|_") >= 0) {
			return drawCode.split("[\\|,]");
		}
		return drawCode.split("[\\|,_]");
	}

	/**
	 * 将篮球和红球拆分成多维数组
	 * 
	 * @param drawCode
	 * @return
	 */
	public static String[][] split2(String drawCode) {
		if (ObjectUtil.isBlank(drawCode)) {
			return null;
		}
		// 普通红蓝球 1,2,3|4
		if (drawCode.indexOf("|") >= 0 && drawCode.indexOf(",") >= 0) {
			String[] drawCodeArr = drawCode.split("\\|");
			String[][] arr = new String[drawCodeArr.length][];
			for (int i = 0; i < drawCodeArr.length; i++) {
				arr[i] = drawCodeArr[i].split(",");
			}
			return arr;
		}
		// 老足彩 |_
		if (drawCode.indexOf("|_") >= 0) {
			return new String[][] { drawCode.split("\\|") };
		}
		// 快乐扑克 1_1|2_1|A_1
		if (drawCode.indexOf("|") >= 0 && drawCode.indexOf("_") > 0) {
			String[] drawCodeArr = drawCode.split("\\|");
			String[][] arr = new String[drawCodeArr.length][];
			for (int i = 0; i < drawCodeArr.length; i++) {
				arr[i] = drawCodeArr[i].split("_");
			}
			return arr;
		}
		return new String[][] { drawCode.split("[\\|,]") };
	}

}

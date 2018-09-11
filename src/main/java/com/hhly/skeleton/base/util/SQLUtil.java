package com.hhly.skeleton.base.util;

/**
 * 数据库相关工具类
 *
 * @author huangchengfang1219
 * @date 2017年11月8日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class SQLUtil {

	/**
	 * 对前端传入的字符使用like查询时，转义特殊字符%_\
	 * 
	 * @return
	 */
	public static String escape(String query) {
		if (ObjectUtil.isBlank(query)) {
			return query;
		}
		return query.replaceAll("[\\\\%_]", "\\\\$0");
	}

}

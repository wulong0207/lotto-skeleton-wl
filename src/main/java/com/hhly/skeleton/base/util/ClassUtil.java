package com.hhly.skeleton.base.util;

import java.lang.reflect.Method;

/**
 * @desc 类处理工具(对象反射处理等)
 * @author huangb
 * @date 2017年6月27日
 * @company 益彩网络
 * @version v1.0
 */
public class ClassUtil {

	/**
	 * @desc 获取目标对象对应字段的get值
	 * @author huangb
	 * @date 2017年3月9日
	 * @param target
	 *            目标对象
	 * @param field
	 *            目标字段
	 * @param cls
	 *            返回的字段类型
	 * @return 获取目标对象对应字段的get值
	 */
	@SuppressWarnings("unchecked")
	public static <T, B> B getField(T target, String fieldName, Class<B> cls) {
		try {
			if (target == null || ObjectUtil.isBlank(fieldName)) {
				return null;
			}
			Method m = target.getClass().getMethod("get" + getMethodName(fieldName));
			return (B) m.invoke(target);
		} catch (Exception e) {
			return null;
		}
	}
	
	/**
	 * @desc 获取字段对应的方法名
	 * @author huangb
	 * @date 2017年3月9日
	 * @param fildeName
	 *            字段名
	 * @return 获取字段对应的方法名
	 */
	public static String getMethodName(String fildeName) {
		byte[] items = fildeName.getBytes();
		items[0] = (byte) ((char) items[0] - 'a' + 'A');
		return new String(items);
	}


	public static <T, B> void setField(T target, String fieldName, B args) {
		try {
			if (target == null || ObjectUtil.isBlank(fieldName)) {
				return;
			}
			Method m = target.getClass().getMethod("set" + getMethodName(fieldName));
			m.invoke(target,args);
		} catch (Exception e) {
			
		}
	}
}

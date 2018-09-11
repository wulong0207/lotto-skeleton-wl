package com.hhly.skeleton.base.excel;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.hhly.skeleton.base.exception.ServiceRuntimeException;

/**
 * 
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2017-1-11 下午2:09:10
 * @Desc 属性替换 ，只能替换String类型的属性
 */
public abstract class ReplaceService {
	/**
	 * 获取替换属性的字典信息
	 * @param attrDicCode key 属性名，value 字典编码
	 * @return
	 */
	protected abstract Map<String, Map<String,String>> getDictionary(Map<String, String> attrDicCode);
	/**
	 * 通过注解(ReplaceAttribute)对pojo的属性进行标示，通过实现getDictionary接口获取到的字典进行属性替换
	 * @param data 原始数据
	 */
	public <T> void dataReplace(List<T> data){
		dataReplace(data, null);
	}
	/**
	 * 通过注解(ReplaceAttribute)对pojo的属性进行标示，通过实现getDictionary接口获取到的字典进行属性替换
	 * 
	 * @param data 原始数据
	 * @param otherDic  其它字典值
	 */
	public <T> void dataReplace(List<T> data, Map<String,Map<String,String>> otherDic) {
		if (data==null || data.size() ==0) {
			return;
		}
		Map<String, Map<String,String>> allDic = new HashMap<String, Map<String,String>>();
		//处理注解属性的字典值
		Map<String, Map<String,String>> dic = analysisDataDictionary(data.get(0).getClass());
		if(dic!=null){
			allDic.putAll(dic);
		}
		if(otherDic!=null){
			allDic.putAll(otherDic);
		}
		//处理属性
		dataValue(data,allDic);
	}

    /**
	 * 处理自定义属性，对注解ExcelAttributeReplace 进行解析，并且对值用指定的字典值替换
	 * 
	 * @param data
	 */
	private <T> Map<String, Map<String,String>> analysisDataDictionary(Class<?> cla) {
		Field[] fields = cla.getDeclaredFields();
		Map<String, String> attrDicCode  = new HashMap<String, String>();
		// 获取有注解的属性
		for (Field field : fields) {
			ReplaceAttribute ear = field
					.getAnnotation(ReplaceAttribute.class);
			if (ear != null) {
				attrDicCode.put(field.getName(), ear.value().getDicCode());
			}
		}
		return  getDictionary(attrDicCode);
	}
	/**
	 * 替换数字值
	 * 
	 * @param data
	 *            数据
	 * @param field
	 *            属性
	 * @param dicList
	 *            字典
	 */
	private <T> void doDataValue(List<T> data, Field field,
			Map<String,String> dicList) {
		if (dicList ==null || dicList.size() ==0) {
			return;
		}
		field.setAccessible(true);
		if(!field.getType().isAssignableFrom(String.class)){
			throw new ServiceRuntimeException("需要替换的类必须是String");
		}
		for (T t : data) {
			try {
				Object value = field.get(t);
				if (value == null || StringUtils.EMPTY.equals(value.toString())) {
					continue;
				}
				String dicValue = dicList.get(value.toString());
				if(dicValue !=null){
					// 替换属性
					field.set(t,dicValue);
				}
			} catch (IllegalArgumentException | IllegalAccessException e) {
				e.printStackTrace();
				throw new ServiceRuntimeException(StringUtils.EMPTY,
						"数据转换失败");
			}
		}
		field.setAccessible(false);
	}

	/**
	 * 处理自定义属性
	 * 
	 * @param data
	 *            数据
	 * @param otherDic
	 *            字典
	 */
	private <T> void dataValue(List<T> data,
			Map<String, Map<String,String>> dictionary) {
		if (dictionary==null || dictionary.size()==0) {
			return;
		}
		Class<?> cla = data.get(0).getClass();
		for (Map.Entry<String, Map<String,String>> entry : dictionary.entrySet()) {
			Field field = null;
			try {
				field = cla.getDeclaredField(entry.getKey());
			} catch (NoSuchFieldException | SecurityException e) {
				e.printStackTrace();
				throw new ServiceRuntimeException(StringUtils.EMPTY,
						"导出excel数据转换失败");
			}
			// 替换属性
			doDataValue(data, field, entry.getValue());
		}
	}
}

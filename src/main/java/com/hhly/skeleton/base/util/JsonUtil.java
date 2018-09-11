package com.hhly.skeleton.base.util;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import net.sf.ezmorph.object.DateMorpher;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;
import net.sf.json.util.CycleDetectionStrategy;
import net.sf.json.util.JSONUtils;

/**
 * Created by lgs on 2017/1/5. jsonUtil处理类
 */
public class JsonUtil {

	private final static ObjectMapper objectMapper = new ObjectMapper();

    static {
//        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		//设置日期转换yyyy-MM-dd HH:mm:ss
//        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
		objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

	public static ObjectMapper getInstance() {
		return objectMapper;
	}

	/*********************** fastjson ******************************/


	/**
	 * Java Object转换json字符串
	 *
	 * @param obj Object对象
	 * @return json字符串
	 */
	public static String objectToJson(Object obj) {
		return JSON.toJSONString(obj);
	}

	/**
	 * json字符串转Java Object
	 *
	 * @param json  json字符串
	 * @param clazz java Object
	 * @param <T>   Object.class
	 * @return Object
	 */
	public static <T> T jsonToObject(String json, Class<T> clazz) {
		return JSON.parseObject(json, clazz);
	}

	/**
	 * json字符串转Java Array
	 *
	 * @param json  json字符串
	 * @param clazz java Object
	 * @param <T>   Object.class
	 * @return List<Object>对象
	 */
	public static <T> List<T> jsonToArray(String json, Class<T> clazz) {
		return JSON.parseArray(json, clazz);
	}


	/*********************** jackson ******************************/
	/**
	 * Java Object转换json字符串
	 *
	 * @param obj
	 *            Object对象
	 * @return json字符串
	 */
	public static String objectToJcakJson(Object obj) {
		try {
			return objectMapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * json字符串转Java Object
	 *
	 * @param json
	 *            json字符串
	 * @param clazz
	 *            java Object
	 * @param <T>
	 *            Object.class
	 * @return Object
	 */
	public static <T> T jsonToJcakObject(String json, Class<T> clazz) {
		try {
			return objectMapper.readValue(json, clazz);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}
	
	/**
	 * json字符串转Java Object，支持泛型
	 * @param json
	 * @param type
	 * @return
	 */
	public static <T> T jsonToJackObject(String json, TypeReference<T> type) {
		try {
			return objectMapper.readValue(json, type);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * json字符串转Java Array
	 *
	 * @param json
	 *            json字符串
	 * @param clazz
	 *            java Object
	 * @param <T>
	 *            Object.class
	 * @return List<Object>对象
	 */
	public static <T> List<T> jsonToJcakArray(String json, Class<T> clazz) {
		try {
			TypeFactory typeFactory = TypeFactory.defaultInstance();
			return objectMapper.readValue(json, typeFactory.constructCollectionType(ArrayList.class, clazz));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}


	/*********************** simple json ******************************/
	/**
	 * JSON 转 java对象
	 * 
	 * @param <T>
	 * @param jsonString
	 * @param cls
	 * @return
	 */
	public static <T> Object json2Object(String jsonString, Class<T> cls) {
		JSONObject jsonObject = JSONObject.fromObject(jsonString);
		JSONUtils.getMorpherRegistry().registerMorpher(new DateMorpher(new String[]{DateUtil.DEFAULT_FORMAT, DateUtil.DATE_FORMAT}));
		return JSONObject.toBean(jsonObject, cls);
	}

	/**
	 * JSON 转 java对象 对象中有变量属于Class
	 * 
	 * @param <T>
	 * @param jsonString
	 * @param cls
	 * @return
	 */
	public static <T> Object json2Object(String jsonString, Class<T> cls, Map<String, Class<T>> classMap) {
		JSONObject jsonObject = JSONObject.fromObject(jsonString);
		return JSONObject.toBean(jsonObject, cls, classMap);
	}

	/**
	 * json 转 java对象数组
	 * 
	 * @param jsonString
	 * @return
	 */
	public static Object[] json2ObjectArray(String jsonString) {
		JSONArray jsonArray = JSONArray.fromObject(jsonString);
		return jsonArray.toArray();
	}

	/**
	 * json 转 java对象列表
	 * 
	 * @param <T>
	 * 
	 * @param jsonString
	 * @param pojoClass
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> List<T> json2ObjectList(String jsonString, Class<T> cls) {

		JSONArray jsonArray = JSONArray.fromObject(jsonString);
		JSONObject jsonObject;
		T obj;

		List<T> list = new ArrayList<>();
		for (int i = 0; i < jsonArray.size(); i++) {

			jsonObject = jsonArray.getJSONObject(i);
			obj = (T) JSONObject.toBean(jsonObject, cls);
			list.add(obj);
		}
		return list;
	}

	/**
	 * json字符串转map集合
	 * 
	 * @author ducc
	 * @param jsonStr
	 *            json字符串
	 * @param map
	 *            接收的map
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, Object> json2Map(String jsonStr) {
		return JSONObject.fromObject(jsonStr);
	}

	/**
	 * java对象 转 json
	 * 
	 * @param obj
	 * @return
	 */
	public static String object2Json(Object obj) {
		JSONObject json;
		json = JSONObject.fromObject(obj);
		return json.toString();
	}

	/**
	 * java对象列表 转 json
	 * 
	 * @param obj
	 * @return
	 */
	public static String objectList2Json(Object obj) {
		JSONArray json;
		json = JSONArray.fromObject(obj);
		return json.toString();
	}

	/**
	 * java对象 转 json, 并设定日期格式
	 * 
	 * @param obj
	 * @param dataFormat
	 * @return
	 */
	public static String object2Json(Object obj, String dataFormat) {

		if (dataFormat == null) {
			dataFormat = "yyyy-MM-dd HH:mm:ss";
		}
		JSONObject json;
		JsonConfig jsonConfig = configJson(dataFormat);
		json = JSONObject.fromObject(obj, jsonConfig);
		return json.toString();
	}

	/**
	 * java对象列表 转 json, 并设定日期格式
	 * 
	 * @param obj
	 * @param dataFormat
	 * @return
	 */
	public static String object2ListJson(Object obj, String dataFormat) {

		JSONArray json;
		JsonConfig jsonConfig = configJson(dataFormat);
		json = JSONArray.fromObject(obj, jsonConfig);
		return json.toString();
	}

	/**
	 * JSON 时间解析器具
	 * 
	 * @param datePattern
	 * @return
	 */
	public static JsonConfig configJson(String datePattern) {
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setExcludes(new String[] { "" });
		jsonConfig.setIgnoreDefaultExcludes(false);
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		jsonConfig.registerJsonValueProcessor(Date.class, new DateJsonValueProcessor(datePattern));
		return jsonConfig;
	}

	/**
	 * @param excludes
	 * @param datePattern
	 * @return
	 */
	public static JsonConfig configJson(String[] excludes, String datePattern) {
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setExcludes(excludes);
		jsonConfig.setIgnoreDefaultExcludes(false);
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		jsonConfig.registerJsonValueProcessor(Date.class, new DateJsonValueProcessor(datePattern));

		return jsonConfig;
	}

	public static String getValue(String json, String key) {
		if (StringUtil.isBlank(json))
			return null;

		JSONObject temp = (JSONObject) JSON.parse(json);
		if (temp.containsKey(key))
			return temp.get(key).toString();

		return null;
	}

	public static <T> T getValue(String json, String key, Class<T> clazz) {
		String jsonValue = getValue(json, key);
		return jsonToObject(jsonValue, clazz);
	}

	public static <T> List<T> getListValue(String json, String key, Class<T> clazz) {
		String jsonValue = getValue(json, key);
		return json2ObjectList(jsonValue, clazz);
	}
}

class DateJsonValueProcessor implements JsonValueProcessor {

	public static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";
	private DateFormat dateFormat;

	/*
	 * 构造方法.
	 * 
	 * @param datePattern 日期格式
	 */
	public DateJsonValueProcessor(String datePattern) {

		if (null == datePattern)
			dateFormat = new SimpleDateFormat(DEFAULT_DATE_PATTERN);
		else
			dateFormat = new SimpleDateFormat(datePattern);
	}

	public Object processArrayValue(Object arg0, JsonConfig arg1) {
		return process(arg0);
	}

	public Object processObjectValue(String arg0, Object arg1, JsonConfig arg2) {
		return process(arg1);
	}

	private Object process(Object value) {
		if (value == null) {
			return "";
		}
		return dateFormat.format((Date) value);
	}
}

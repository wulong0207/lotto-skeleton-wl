package com.hhly.skeleton.base.exception;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.util.CollectionUtils;

import com.hhly.skeleton.base.bo.ResultBO;
import com.hhly.skeleton.base.constants.MessageCodeConstants;
import com.hhly.skeleton.base.util.ObjectUtil;
import com.hhly.skeleton.base.util.StringUtil;

/**
 * @desc 自定义断言，用于自定义异常的断言扩展
 * @author huangb
 * @date 2017年3月31日
 * @company 益彩网络
 * @version v1.0
 */
public class Assert{

	private static final String DEFAULT_ERROR_CODE = MessageCodeConstants.ASSERT_NOT_PASS;
	/**
	 * @desc 断言参数合法
	 * @author huangb
	 * @date 2017年3月31日
	 * @param isLegal
	 *            是否合法的表达式
	 * @param paramName
	 *            参数名
	 */
	public static void paramLegal(boolean isLegal, String paramName) {
		if (!isLegal) {
			throw new ResultJsonException(ResultBO.err("40002", paramName));
		}
	}

	/**
	 * @desc 断言参数不为空
	 * @author huangb
	 * @date 2017年3月31日
	 * @param param
	 *            参数值
	 * @param paramName
	 *            参数名
	 */
	public static void paramNotNull(String param, String paramName) {
		if (StringUtil.isBlank(param)) {
			throw new ResultJsonException(ResultBO.err("40001", paramName));
		}
	}
	
	public static void paramNotNull(Object param) {
		boolean isNull = false;
		if(param instanceof Collection){
			isNull = param == null || ((Collection<?>)param).isEmpty();
		}else if(param instanceof String) {
			isNull = ObjectUtil.isBlank((String)param);
		}else{
			isNull = param == null;
		}
		if(isNull) {
			throw new ResultJsonException(ResultBO.err("40000"));
		}
	}

	/**
	 * @desc 断言参数不为空
	 * @author huangb
	 * @date 2017年3月31日
	 * @param param
	 *            参数值
	 * @param paramName
	 *            参数名
	 */
	public static void paramNotNull(Object param, String paramName) {
		if (param == null) {
			throw new ResultJsonException(ResultBO.err("40001", paramName));
		}
	}

	/**
	 * @desc 断言数据存在
	 * @author huangb
	 * @date 2017年3月31日
	 * @param data
	 *            数据对象
	 */
	public static void dataExist(Object data) {
		if (data == null) {
			throw new ResultJsonException(ResultBO.err("40003"));
		}
	}

	/**
	 * @desc 断言数据存在
	 * @author huangb
	 * @date 2017年3月31日
	 * @param data
	 *            数据对象
	 */
	public static void dataExist(List<?> data) {
		if (ObjectUtil.isBlank(data)) {
			throw new ResultJsonException(ResultBO.err("40003"));
		}
	}
	
	public static void isTrue(boolean expression, String errorCode, Object... arguments) {
		if (!expression) {
			throw new ResultJsonException(ResultBO.err(errorCode, arguments));
		}
	}
	
	public static void isTrue(boolean expression, String errorCode, Object data, Object[] arguments) {
		if (!expression) {
			throw new ResultJsonException(ResultBO.err(errorCode, data, arguments));
		}
	}
	
	public static void isTrue(boolean expression, String errorCode) {
		if (!expression) {
			throw new ResultJsonException(ResultBO.err(errorCode));
		}
	}
	
	public static void isTrue(boolean expression) {
		isTrue(expression, DEFAULT_ERROR_CODE);
	}
	
	public static void isFalse(boolean expression, String errorCode, Object... arguments) {
		if (expression) {
			throw new ResultJsonException(ResultBO.err(errorCode, arguments));
		}
	}
	
	public static void isFalse(boolean expression, String errorCode) {
		if (expression) {
			throw new ResultJsonException(ResultBO.err(errorCode));
		}
	}
	
	public static void isFalse(boolean expression) {
		isFalse(expression, DEFAULT_ERROR_CODE);
	}
	
	public static void isNull(Object object, String code, Object... arguments) {
		if (object != null) {
			throw new ResultJsonException(ResultBO.err(code, arguments));
		}
	}

	public static void isNull(Object object, String errorCode) {
		if (object != null) {
			throw new ResultJsonException(ResultBO.err(errorCode));
		}
	}
	
	public static void isNull(Object object) {
		isNull(object, DEFAULT_ERROR_CODE);
	}

	public static void notNull(Object object, String errorCode, Object... arguments) {
		if (object == null) {
			throw new ResultJsonException(ResultBO.err(errorCode, arguments));
		}
	}

	public static void notNull(Object object, String errorCode) {
		if (object == null) {
			throw new ResultJsonException(ResultBO.err(errorCode));
		}
	}
	
	public static void notNull(Object object) {
		notNull(object, DEFAULT_ERROR_CODE);
	}
	
	public static void notEmpty(Collection<?> collection, String errorCode, Object... arguments) {
		if (CollectionUtils.isEmpty(collection)) {
			throw new ResultJsonException(ResultBO.err(errorCode, arguments));
		}
	}

	public static void notEmpty(Collection<?> collection, String errorCode) {
		if (CollectionUtils.isEmpty(collection)) {
			throw new ResultJsonException(ResultBO.err(errorCode));
		}
	}
	
	public static void notEmpty(Collection<?> collection) {
		notEmpty(collection, DEFAULT_ERROR_CODE);
	}

	public static void notEmpty(Map<?, ?> map, String errorCode, Object... arguments) {
		if (CollectionUtils.isEmpty(map)) {
			throw new ResultJsonException(ResultBO.err(errorCode, arguments));
		}
	}

	public static void notEmpty(Map<?, ?> map, String errorCode) {
		if (CollectionUtils.isEmpty(map)) {
			throw new ResultJsonException(ResultBO.err(errorCode));
		}
	}
	
	/**
	 * @desc 断言字符串不为空
	 * @author huangb
	 * @date 2017年4月14日
	 * @param text
	 * @param errorCode
	 * @param arguments
	 */
	public static void hasText(String text, String errorCode, Object... arguments) {
		if (!StringUtil.hasText(text)) {
			throw new ResultJsonException(ResultBO.err(errorCode, arguments));
		}
	}

	public static void hasText(String text, String errorCode) {
		if (!StringUtil.hasText(text)) {
			throw new ResultJsonException(ResultBO.err(errorCode));
		}
	}
	
}

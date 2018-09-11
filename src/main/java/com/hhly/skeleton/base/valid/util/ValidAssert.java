package com.hhly.skeleton.base.valid.util;

import com.hhly.skeleton.base.exception.ValidException;

/**
 * @desc    验证断言工具
 * @author  Tony Wang
 * @date    2017年1月22日
 * @company 益彩网络科技公司
 * @version 1.0
 */

public abstract class ValidAssert {

	public static final String ERR = "0";
	
	public static void isTrue(boolean expression, String code, String message) {
		if (!expression) {
			throw new ValidException(code, message);
		}
	}
	
	public static void isTrue(boolean expression, String message) {
		isTrue(expression, "0", message);
	}
	
	public static void isFalse(boolean expression, String code, String message) {
		if (expression) {
			throw new ValidException(code, message);
		}
	}
	
	public static void isFalse(boolean expression, String message) {
		isFalse(expression, ERR, message);
	}

	public static void isNull(Object object, String code, String message) {
		if (object != null) {
			throw new ValidException(code, message);
		}
	}

	public static void isNull(Object object, String message) {
		isNull(object, ERR, message);
	}

	public static void notNull(Object object, String code, String message) {
		if (object == null) {
			throw new ValidException(code, message);
		}
	}

	public static void notNull(Object object, String message) {
		notNull(object, ERR	, message);
	}
}

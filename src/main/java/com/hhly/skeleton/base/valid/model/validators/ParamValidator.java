package com.hhly.skeleton.base.valid.model.validators;

import java.lang.annotation.Annotation;

import com.hhly.skeleton.base.valid.Param;
import com.hhly.skeleton.base.valid.context.ConstraintValidatorContext;
import com.hhly.skeleton.base.valid.model.AbstractValidator;

/**
 * @desc 参数验证注解解析器
 * @author jiangwei
 * @date 2017年3月17日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class ParamValidator extends AbstractValidator {
	/**
	 * 最大最小默认值
	 */
	public static final double VALUE = 0.123456;

	@Override
	public boolean isValid(Annotation ann, ConstraintValidatorContext context) {
		Param filed = (Param) ann;
		Object value = context.getValue();
		// 空验证
		if (filed.notNull() && (value == null || "".equals(value.toString()))) {
			return false;
		} else if (value == null) {
			return true;
		}
		// 最小值验证
		try {
			if (filed.min() != VALUE && filed.min() > Double.parseDouble(value.toString())) {
				return false;
			}
			// 最大值验证
			if (filed.max() != VALUE && filed.max() < Double.parseDouble(value.toString())) {
				return false;
			}
		} catch (NumberFormatException nfe) {
			return false;
		}
		// 最小长度验证
		if (filed.minLen() > 0 && filed.minLen() > value.toString().length()) {
			return false;
		}
		// 最大长队验证
		if (filed.maxLen() > 0 && filed.maxLen() < value.toString().length()) {
			return false;
		}
		// 正则表达式验证
        return !(!"".equals(filed.regStr()) && !value.toString().matches(filed.regStr()));
    }

	@Override
	public String getMsg(Annotation ann) {
		Param filed = (Param) ann;
		return "属性（" + filed.msg() + "）格式不正确";
	}

}

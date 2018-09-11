package com.hhly.skeleton.base.valid.model.validators;

import java.lang.annotation.Annotation;

import com.hhly.skeleton.base.valid.Max;
import com.hhly.skeleton.base.valid.context.ConstraintValidatorContext;
import com.hhly.skeleton.base.valid.model.AbstractValidator;

/**
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2017-1-14 下午3:45:45
 * @Desc 验证最大值
 */
public class MaxValidator  extends AbstractValidator{
	
	@Override
	public boolean isValid(Annotation ann, ConstraintValidatorContext context) {
		Object value = context.getValue();
		Max max = (Max) ann;
		if ( value == null ) {
			return true;
		}
		try {
			return Long.parseLong(value.toString()) <= max.value();
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	@Override
	public String getMsg(Annotation ann) {
		Max max = (Max) ann;
		return max.msg()+"值不能大于"+max.value();
	}
}

package com.hhly.skeleton.base.valid.model.validators;

import java.lang.annotation.Annotation;

import com.hhly.skeleton.base.valid.Min;
import com.hhly.skeleton.base.valid.context.ConstraintValidatorContext;
import com.hhly.skeleton.base.valid.model.AbstractValidator;

/**
 * 
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2017-1-15 下午2:25:35
 * @Desc 验证最小值
 */
public class MinValidator  extends AbstractValidator{
	
	@Override
	public boolean isValid(Annotation ann, ConstraintValidatorContext context) {
		Object value = context.getValue();
		Min min = (Min) ann;
		if ( value == null ) {
			return true;
		}
		try {
	    if ( value instanceof Double )
	    {
	    	return ((Double)value).longValue() >= min.value();
	    }
	    else
	    {
				return Long.parseLong(value.toString()) >= min.value();
	    }
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	@Override
	public String getMsg(Annotation ann) {
		Min min = (Min) ann;
		return min.msg()+"值不能小于"+min.value();
	}
}

package com.hhly.skeleton.base.valid.model.validators;

import java.lang.annotation.Annotation;

import com.hhly.skeleton.base.valid.LenRange;
import com.hhly.skeleton.base.valid.context.ConstraintValidatorContext;
import com.hhly.skeleton.base.valid.model.AbstractValidator;

/**
 * 
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2017-1-15 下午2:25:15
 * @Desc 验证长度范围
 */
public class LenRangeValidator extends AbstractValidator{
	
	@Override
	public boolean isValid(Annotation ann, ConstraintValidatorContext context) {
		Object value = context.getValue();
		LenRange lenRange = (LenRange) ann;
		if ( value == null || "".equals(value.toString())) {
			return true;
		}
		int len =  value.toString().length();
		return  len >= lenRange.min() && len <= lenRange.max();
	}

	@Override
	public String getMsg(Annotation ann) {
		LenRange lenRange = (LenRange) ann;
		String msg =lenRange.msg() + "长度在"+lenRange.min()+"与"+lenRange.max()+"之间" ;
		return msg;
	}
}

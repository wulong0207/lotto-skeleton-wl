package com.hhly.skeleton.base.valid.model.validators;

import java.lang.annotation.Annotation;

import com.hhly.skeleton.base.valid.Pattern;
import com.hhly.skeleton.base.valid.context.ConstraintValidatorContext;
import com.hhly.skeleton.base.valid.model.AbstractValidator;

/**
 * 
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2017-1-15 下午2:26:01
 * @Desc 正则表达式 验证
 */
public class PatternValidator  extends AbstractValidator{
	
	@Override
	public boolean isValid(Annotation ann, ConstraintValidatorContext context) {
		Object value = context.getValue();
		Pattern pat = (Pattern) ann;
		if ( value == null || "".equals(value.toString())) {
			return true;
		}
		return value.toString().matches(pat.value());
	}

	@Override
	public String getMsg(Annotation ann) {
		Pattern pat = (Pattern) ann;
		return pat.msg()+ "格式不对";
	}
}

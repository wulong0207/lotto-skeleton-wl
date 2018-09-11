package com.hhly.skeleton.base.valid.model.validators;

import java.lang.annotation.Annotation;

import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.valid.context.ConstraintValidatorContext;
import com.hhly.skeleton.base.valid.model.AbstractValidator;

/**
 * 
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2017-1-15 下午2:25:47
 * @Desc 验证是否为空
 */
public class NotNullValidator  extends AbstractValidator{
	
	@Override
	public boolean isValid(Annotation ann, ConstraintValidatorContext context) {
		Object value = context.getValue();
		return !(value == null || "".equals(value.toString()));
	}

	@Override
	public String getMsg(Annotation ann) {
		NotNull notNull = (NotNull) ann;
		return "属性("+notNull.msg() + ")不能为空";
	}
}

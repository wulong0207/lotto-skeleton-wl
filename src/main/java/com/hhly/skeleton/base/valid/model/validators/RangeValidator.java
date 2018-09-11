package com.hhly.skeleton.base.valid.model.validators;

import java.lang.annotation.Annotation;

import com.hhly.skeleton.base.valid.Range;
import com.hhly.skeleton.base.valid.context.ConstraintValidatorContext;
import com.hhly.skeleton.base.valid.model.AbstractValidator;

/**
 * 
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2017-1-15 下午2:26:39
 * @Desc 范围验证
 */
public class RangeValidator extends AbstractValidator{
	@Override
	public boolean isValid(Annotation ann, ConstraintValidatorContext context) {
		Object value = context.getValue();
		Range range = (Range) ann;
		if ( value == null ) {
			return true;
		}
		try {
			double v =  Double.parseDouble(value.toString()) ;
			return v >= range.min() && v <= range.max();
		} catch (NumberFormatException e) {
			return false;
		}
		
	}

	@Override
	public String getMsg(Annotation ann) {
		Range range = (Range) ann;
		String msg =range.msg()+ "值在"+range.min()+"与"+range.max()+"之间";
		return msg;
	}
}

package com.hhly.skeleton.base.valid.model.validators;

import java.lang.annotation.Annotation;
import java.text.MessageFormat;
import java.util.Collection;

import com.hhly.skeleton.base.valid.Size;
import com.hhly.skeleton.base.valid.context.ConstraintValidatorContext;
import com.hhly.skeleton.base.valid.model.AbstractValidator;

/**
 * @desc    验证集合或数组的长度是否在有效范围内
 * @author  Tony Wang
 * @date    2017年1月21日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class SizeValidator extends AbstractValidator {

	@Override
	public boolean isValid(Annotation ann, ConstraintValidatorContext context) {
		Object value = context.getValue();
		if( value == null) return true;
		Size size = (Size)ann;
		int min = size.min();
		int max = size.max();
		validateParameters(min, max, value);
		int sizeOfTarget = Collection.class.isAssignableFrom(value.getClass()) ? 
				((Collection<?>)value).size() : ((Object[])value).length;
		return sizeOfTarget >= min && sizeOfTarget <= max;
	}

	private void validateParameters(int min, int max, Object value) {
		if ( min < 0 ) {
			throw new IllegalArgumentException("最小值必须>=0");
		}
		if ( max < 0 ) {
			throw new IllegalArgumentException("最大值必须>0");
		}
		if ( max < min ) {
			throw new IllegalArgumentException("最小值不能>最大值");
		}
		// 只能验证验证集合或数组的长度
		if( !Collection.class.isAssignableFrom(value.getClass()) &&
				!(value instanceof Object[])) {
			throw new IllegalArgumentException("只能验证验证集合或数组的长度");
		}
	}

	@Override
	public String getMsg(Annotation ann) {
		Size size = (Size)ann;
		return MessageFormat.format(size.msg(), size.min(), size.max());
	}
}

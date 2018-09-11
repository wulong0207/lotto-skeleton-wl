package com.hhly.skeleton.base.valid.model.validators;

import java.lang.annotation.Annotation;
import java.util.Collection;

import com.hhly.skeleton.base.valid.context.ConstraintValidatorContext;
import com.hhly.skeleton.base.valid.model.AbstractValidator;
import com.hhly.skeleton.base.valid.util.ParamUtil;
/**
 * 验证Valid 标识属性
 * @author jiangwei
 * @date 2017-1-18
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class ValidValidator extends AbstractValidator{
	
	@Override
	public  boolean isValid(Annotation ann, ConstraintValidatorContext context) {
		Object value = context.getValue();
		if(value==null){
			return true;
		}
		if(Collection.class.isAssignableFrom(value.getClass())){
			Collection<?> collections = (Collection<?>) value;
			for (Object object : collections) {
				 ParamUtil.validation(object, context.getType());
			}
		}else if(value instanceof Object[]){
			 Object[] object =  (Object[]) value;
			 for (Object obj : object) {
				 ParamUtil.validation(obj, context.getType());
			 }
		}else{
			ParamUtil.validation(value, context.getType());
		}
		return true;
	}
}

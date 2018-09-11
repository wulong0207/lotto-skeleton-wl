package com.hhly.skeleton.base.valid.model;

import java.lang.annotation.Annotation;

import com.hhly.skeleton.base.valid.context.ConstraintValidatorContext;
/**
 * 
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2017-1-15 下午2:23:48
 * @Desc 参数类型验证接口
 */ 
public interface IValidator{
	/**
	 *  验证函数
	 * @param ann 注解
	 * @param value 值
	 * @return 成功返回true 失败false
	 */
	 boolean isValid(Annotation ann,ConstraintValidatorContext context);
	/**
	 * 获取提示消息
	 * @param ann 注解
	 * @return message
	 */
	String getMsg(Annotation ann);
}

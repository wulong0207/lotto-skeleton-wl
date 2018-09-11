package com.hhly.skeleton.base.valid;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2016-12-6 下午4:10:45
 * @Desc 1.标识需要验证的参数类和验证分组
 * 2.对参数类中的对象注解，表示该属性对象需要校验
 */
@Target({PARAMETER,FIELD,TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Valid {
	String value() default "";
}

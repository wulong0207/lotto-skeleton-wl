package com.hhly.skeleton.base.valid;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2016-12-1 下午2:56:50
 * @Desc 最小值
 */
@Retention(RetentionPolicy.RUNTIME) 
@Target({ ElementType.FIELD }) 
public @interface Min {
	long  value();
	String msg() default "";
}

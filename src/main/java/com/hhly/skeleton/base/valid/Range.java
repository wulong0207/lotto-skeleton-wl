package com.hhly.skeleton.base.valid;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 
 * @author jiangwei
 * @Version 1.2
 * @CreatDate 2016-12-1 下午2:55:04
 * @Desc 参数在自定范围
 */
@Retention(RetentionPolicy.RUNTIME) 
@Target({ ElementType.FIELD })  
public @interface Range {
	double min();
	double max();
	String msg() default "";
}

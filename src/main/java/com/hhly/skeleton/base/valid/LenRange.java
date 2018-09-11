package com.hhly.skeleton.base.valid;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2016-12-1 下午3:58:18
 * @Desc 长度范围
 */
@Retention(RetentionPolicy.RUNTIME) 
@Target({ ElementType.FIELD }) 
public @interface LenRange {
	int min();
	int max();
	String msg() default "";
}

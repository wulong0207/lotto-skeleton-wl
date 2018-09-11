package com.hhly.skeleton.base.valid;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 验证最大值
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2017-1-14 下午4:20:57
 * @Desc
 */
@Retention(RetentionPolicy.RUNTIME) 
@Target({ ElementType.FIELD }) 
public @interface Max {
	long  value();
	String msg() default "";
}

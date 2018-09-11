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
 * @Desc 正则表达式
 */
@Retention(RetentionPolicy.RUNTIME) 
@Target({ ElementType.FIELD }) 
public @interface Pattern {
   String value();
   String msg() default "";
}

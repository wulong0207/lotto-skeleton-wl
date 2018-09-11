package com.hhly.skeleton.base.filter;

import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * @desc 方法避免重复调用注解
 * @author jiangwei
 * @date 2017年7月25日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@Target({METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface NotDuplicate {
}

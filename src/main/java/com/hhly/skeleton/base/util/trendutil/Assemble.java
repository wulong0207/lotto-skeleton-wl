package com.hhly.skeleton.base.util.trendutil;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @desc    把对象的某些属性收集到list中，只能标记在集合中
 * @author  Tony Wang
 * @date    2017年7月5日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Assemble {
	
	/**
	 * 以正则匹配要包含的字段
	 */
	String[] regex() default {};
	/**
	 * 列举要包含的字段
	 */
	String[] include() default {};
	/**
	 * 不包含的字段
	 */
	String[] exclude() default {};
	/**
	 * 收集字段后，原字段是否置为空
	 */
	boolean setNull() default true;
	/**
	 * 字段是否可重复出现
	 */
	boolean repeat() default false;
}

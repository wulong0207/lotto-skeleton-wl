package com.hhly.skeleton.base.valid;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @desc    验证集合或数组的长度是否在有效范围内
 * @author  Tony Wang
 * @date    2017年1月21日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@Retention(RetentionPolicy.RUNTIME) 
@Target({ ElementType.FIELD }) 
public @interface Size {
	int min() default 0;
	int max() default Integer.MAX_VALUE;
	String msg() default "集合或数组的长度必须在{0}和{1}之间";
}

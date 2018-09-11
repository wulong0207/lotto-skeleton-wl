package com.hhly.skeleton.base.valid;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.hhly.skeleton.base.valid.model.validators.ParamValidator;

/**
 * @desc 参数验证
 * @author jiangwei
 * @date 2017年3月17日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@Retention(RetentionPolicy.RUNTIME) 
public @interface Param {
	
	/**
	 * 表示第几位参数，从0开始
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年3月17日 上午10:07:12
	 * @return
	 */
	int index();
	
	/**
	 * 是否能为空
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年3月17日 上午10:07:32
	 * @return
	 */
	boolean notNull() default false;
    /**
     * 最小值
     * @author jiangwei
     * @Version 1.0
     * @CreatDate 2017年3月17日 上午10:07:51
     * @return
     */
    double min() default ParamValidator.VALUE;
    /**
     * 最大值
     * @author jiangwei
     * @Version 1.0
     * @CreatDate 2017年3月17日 上午10:07:59
     * @return
     */
    double max() default ParamValidator.VALUE;
    /**
     * 最小长度
     * @author jiangwei
     * @Version 1.0
     * @CreatDate 2017年3月17日 上午10:08:09
     * @return
     */
    int minLen() default 0;
    /**
     * 最大程度
     * @author jiangwei
     * @Version 1.0
     * @CreatDate 2017年3月17日 上午10:08:24
     * @return
     */
    int maxLen() default 0;
    /**
     * 正则表达式
     * @author jiangwei
     * @Version 1.0
     * @CreatDate 2017年3月17日 上午10:08:34
     * @return
     */
    String regStr() default "";
    /**
     * 提示消息
     * @author jiangwei
     * @Version 1.0
     * @CreatDate 2017年3月17日 上午10:08:49
     * @return
     */
    String msg() default "";
}

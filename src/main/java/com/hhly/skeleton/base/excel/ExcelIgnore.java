package com.hhly.skeleton.base.excel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @desc    不导出到Excel中
 * @author  Tony Wang
 * @date    2017年8月8日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExcelIgnore {

}

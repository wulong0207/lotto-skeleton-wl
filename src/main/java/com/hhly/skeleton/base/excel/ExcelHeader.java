package com.hhly.skeleton.base.excel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2016-11-22 下午2:08:46
 * @Desc 导出excel 属性注解，用于转换为表格的第一行
*/
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
public @interface ExcelHeader {
   String value() default "";
}

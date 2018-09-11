package com.hhly.skeleton.base.excel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.hhly.skeleton.base.model.DicDataEnum;

/**
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2017-1-9 上午11:08:18
 * @Desc 用于excel 属性替换（比如把状态值为‘1’替换为‘启用’）
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
public @interface ReplaceAttribute {
	DicDataEnum value();
}

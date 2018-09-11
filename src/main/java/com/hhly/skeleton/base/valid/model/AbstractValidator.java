package com.hhly.skeleton.base.valid.model;

import java.lang.annotation.Annotation;

/**
 * @desc 抽象实现验证类
 * @author jiangwei
 * @date 2017-1-19
 * @company 益彩网络科技公司
 * @version 1.0
 */
public abstract  class AbstractValidator implements IValidator{
	@Override
	public String getMsg(Annotation ann) {
		return "";
	}
}

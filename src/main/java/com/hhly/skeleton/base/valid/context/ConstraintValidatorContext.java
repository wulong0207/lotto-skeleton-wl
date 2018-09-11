package com.hhly.skeleton.base.valid.context;
/**
 * @desc 用于保存验证上下文信息
 * @author jiangwei
 * @date 2017-1-18
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class ConstraintValidatorContext{
	//保存属性值
	private Object value;
	//保存类型
	private String type;
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
}

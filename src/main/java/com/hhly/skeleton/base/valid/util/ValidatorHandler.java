package com.hhly.skeleton.base.valid.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import com.hhly.skeleton.base.valid.Param;
import com.hhly.skeleton.base.valid.LenRange;
import com.hhly.skeleton.base.valid.Max;
import com.hhly.skeleton.base.valid.Min;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.valid.Pattern;
import com.hhly.skeleton.base.valid.Range;
import com.hhly.skeleton.base.valid.Size;
import com.hhly.skeleton.base.valid.Valid;
import com.hhly.skeleton.base.valid.model.IValidator;
import com.hhly.skeleton.base.valid.model.validators.ParamValidator;
import com.hhly.skeleton.base.valid.model.validators.LenRangeValidator;
import com.hhly.skeleton.base.valid.model.validators.MaxValidator;
import com.hhly.skeleton.base.valid.model.validators.MinValidator;
import com.hhly.skeleton.base.valid.model.validators.NotNullValidator;
import com.hhly.skeleton.base.valid.model.validators.PatternValidator;
import com.hhly.skeleton.base.valid.model.validators.RangeValidator;
import com.hhly.skeleton.base.valid.model.validators.SizeValidator;
import com.hhly.skeleton.base.valid.model.validators.ValidValidator;

/**
 * @desc 通过注解类型获取改注解验证规则
 * 该类为用单例模式设计
 * @author jiangwei
 * @date 2017-1-22
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class ValidatorHandler {
	private  final  Map<Type,IValidator> validtorMap;
	
	private  static volatile  ValidatorHandler handler;
	
	/**
	 * 获取注解验证处理器
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017-1-20 下午2:26:08
	 * @param type 注解类型
	 * @return
	 */
	public static IValidator getValidator(Type type){
		if(handler == null){
			synchronized (ValidatorHandler.class) {
				if(handler == null){
					handler = new ValidatorHandler();
				}
			}
		}
		return handler.validtorMap.get(type);
	}
	/**
	 * 新增一个参数验证规则需要在这里添加
	 * 新增验证规则需要定义一个注解，再为改注解实现一个验证规则接口ConstraintValidator
	 */
	private ValidatorHandler(){
		validtorMap = new HashMap<Type, IValidator>();
		setValidator(Max.class, new MaxValidator());
		setValidator(LenRange.class, new LenRangeValidator());
		setValidator(Min.class, new MinValidator());
		setValidator(NotNull.class, new NotNullValidator());
		setValidator(Pattern.class, new PatternValidator());
		setValidator(Range.class, new RangeValidator());
		setValidator(Valid.class, new ValidValidator());
		setValidator(Size.class, new SizeValidator());
		setValidator(Param.class, new ParamValidator());
	}
	
	/**
	 * 注册注解验证解析类
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017-1-19 下午4:16:32
	 * @param cla
	 * @param iValidator
	 */
	public void setValidator(Class<? extends Annotation> cla,IValidator iValidator){
		if(iValidator==null){
			throw new NullPointerException("注入验证类和注解不能为空");
		}
		this.validtorMap.put(cla, iValidator);
	}
}

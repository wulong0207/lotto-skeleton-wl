package com.hhly.skeleton.base.valid.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.hhly.skeleton.base.exception.ValidException;
import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.Valid;
import com.hhly.skeleton.base.valid.context.ConstraintValidatorContext;
import com.hhly.skeleton.base.valid.model.IValidator;
import com.hhly.skeleton.base.vo.DemoVO;
import com.hhly.skeleton.cms.dicmgr.vo.DicDataVO;
/**
 * 
 * @author jiangwei
 * @Version 1.4
 * @CreatDate 2016-11-25 上午11:23:29
 * @Desc 用于参数验证工具类
 */
/**
 * @desc
 * @author jiangwei
 * @date 2017-1-19
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class ParamUtil{
	
	/**
	 * 验证对象
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年3月16日 下午6:00:46
	 * @param vo
	 */
	public static void validation(Object vo){
		 validation(vo, null);
	}
    /**
     * 参数验证工具类（当参数为空 会抛出NullPointerException，当参数不合法抛出IllegalArgumentException）
     * 包括对普通属性的验证和对象属性的验证
     * 注意：验证对象属性时只能是不为空才会去验证，如果该对象不能为空需要加上NotNull注解
     * @param vo 参数
     * @param type 验证指定分组的参数(为null获""表示所有注解都验证)
     */
	public static void validation(Object vo, String type) {
		if(vo==null){
			throw new NullPointerException("参数对象不能为空");
		}
		ConstraintValidatorContext context = new ConstraintValidatorContext();
		context.setType(type);
		
		List<Field> fields = getSuperField(vo.getClass());
		fields.addAll(Arrays.asList(vo.getClass().getDeclaredFields()));
		for (Field field : fields) {
			field.setAccessible(true);
			validate(field, vo,context);
			field.setAccessible(false);
		}
	}
	
	/**
	 * 验证用指定的注解验证对象
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年3月16日 下午6:01:04
	 * @param value
	 * @param annotation
	 */
	public static  void validFiled(Object value,Annotation annotation){
		if(annotation == null){
			throw new ValidException("验证注解不能为空");
		}
		ConstraintValidatorContext context = new ConstraintValidatorContext();
		context.setValue(value);
		doValidate(annotation, context);
	}
	/**
	 * 获取父类需要验证属性
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017-1-19 上午9:29:49
	 * @param cla
	 * @return
	 */
	private static List<Field> getSuperField(Class<?> cla) {
		List<Field> fields = new ArrayList<Field>();
		Valid  valid = cla.getAnnotation(Valid.class);
		if(valid==null){
			return  fields;
		}
		Class<?> supperClass = cla.getSuperclass();
		while (supperClass != Object.class) {
			fields.addAll(Arrays.asList(supperClass.getDeclaredFields()));
			supperClass=supperClass.getSuperclass();
		}
		return fields;
	}
	/**
	 * 验证参数
	 * 首先对需要验证的对象属性验证
	 * 然后对普通属性验证
	 * @param field 属性
	 * @param obj  对象
	 * @param type 类型
	 */
	private static void validate(Field field, Object obj,ConstraintValidatorContext context) {
		try {
			Object value = field.get(obj);
			context.setValue(value);
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalStateException("参数验证异常");
		}
		//判断是否需要验证
		if(!needCheck(field, context.getType())){
			return;
	    }
		Annotation anns[] =  field.getAnnotations();
		for (int i = 0; i < anns.length; i++) {
			Annotation annotation = anns[i];
			if(annotation instanceof Group){
				continue;
			}
			doValidate(annotation,context);
		}
	}
	/**
	 * 判断是否需要验证参数
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017-1-18 下午6:57:43
	 * @param field 属性
	 * @param type 分组类型
	 * @return
	 */
	private static boolean needCheck(Field field, String type) {
		Group group = field.getAnnotation(Group.class);
		boolean isCheck =false;
		//如果没有分组标记需要验证参数
		if(group==null || isEmpty(type)){
			isCheck = true;
		}else{
			String [] gvs = group.value();
			for(int i=0;i<gvs.length;i++){
				if(gvs[i].equals(type)){
					isCheck = true;
					break;
				}
			}
		}
		return isCheck;
	}
	/**
	 * 处理验证注解 
	 * @param field 属性
	 * @param obj 对象
	 */
	private static void doValidate(Annotation annotation, ConstraintValidatorContext context) {
		Class<?> validClass = annotation.getClass().getInterfaces()[0];
		IValidator cv = ValidatorHandler.getValidator(validClass);
		if (cv == null) {
			throw new ValidException("不存在该注解的解析器"+validClass);
		}
		if (!cv.isValid(annotation, context)) {
			throw new ValidException(cv.getMsg(annotation));
		}
	}
	
	
	private static boolean isEmpty(Object value){
		if(value == null){
			return true;
		}
        return "".equals(value.toString());
    }
	public static void main(String[] args) {
		
		DemoVO vo = new DemoVO();
		vo.setUserName("dafdd12@qq.com");
		vo.setAge(6);
		DicDataVO dicDataVO = new DicDataVO();
		vo.setDicDataVO(dicDataVO);
		vo.setNumbers(Arrays.asList(1,2,3));
	    
		dicDataVO.setDicName("");
		List<DicDataVO> dics = new ArrayList<>();
		dics.add(new DicDataVO());
		vo.setDics(dics);
		validation(vo);
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			validation(vo,"upd");
		}
		System.out.println(System.currentTimeMillis()-start);
	}
}

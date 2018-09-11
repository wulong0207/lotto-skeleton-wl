package com.hhly.skeleton.base.valid.aop;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.hhly.skeleton.base.valid.Param;
import com.hhly.skeleton.base.valid.ParameterValid;
import com.hhly.skeleton.base.valid.Valid;
import com.hhly.skeleton.base.valid.util.ParamUtil;

/**
 * 
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2017-2-22
 * @Desc 参数验证拦截器
 */
@Aspect
@Component
public class ParameterVaildAop {
	
	@Pointcut("@annotation(com.hhly.skeleton.base.valid.ParameterValid)")
	public void parameterValid() {
	}

	/**
	 * 对方法拦截后进行参数验证
	 * @param pjp
	 * @return
	 * @throws Throwable
	 */
	@Around("parameterValid()")
	public Object doValid(ProceedingJoinPoint pjp) throws Throwable {
		MethodSignature msig = (MethodSignature) pjp.getSignature();
		Method currentMethod = pjp.getTarget().getClass().getMethod(msig.getName(), msig.getParameterTypes());
		Object[] args = pjp.getArgs();
		//验证加了Valid注解的参数
		Annotation[][] an = currentMethod.getParameterAnnotations();
		for (int i = 0; i < an.length; i++) {
			for (int j = 0; j < an[i].length; j++) {
				if (an[i][j] instanceof Valid) {
					Valid va = (Valid) an[i][j];
					ParamUtil.validation(args[i], va.value());
				}
			}
		}
		//根据ParameterValid值进行验证
		ParameterValid valid = currentMethod.getAnnotation(ParameterValid.class);
		Param [] fields = valid.value();
		for (Param filed : fields) {
			Object value = args[filed.index()];
			ParamUtil.validFiled(value, filed);
		}
		Object object = pjp.proceed();
		return object;
	}
}

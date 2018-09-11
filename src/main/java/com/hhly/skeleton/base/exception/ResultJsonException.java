package com.hhly.skeleton.base.exception;

import com.hhly.skeleton.base.bo.ResultBO;

/**
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2017-1-13 下午2:29:04
 * @Desc 发生此异常，结果返回处理成json格式
 */
@SuppressWarnings("serial")
public class ResultJsonException extends ServiceRuntimeException {

	public ResultJsonException(String msg) {
		super(msg);
	}

	public ResultJsonException(String msg, Throwable t) {
		super(msg, t);
	}

	/**
	 * @param result
	 *            异常结果
	 */
	public ResultJsonException(ResultBO<?> result) {
		super(result);
	}
}

package com.hhly.skeleton.base.exception;

@SuppressWarnings("serial")
public class ValidException extends ServiceRuntimeException {
  //输出状态 1(正常)/0(异常)
	private int status;
	
	public ValidException(int status,String code,String msg) {
		super(code, msg);
		this.status = status;
	}
	public ValidException(String code,String msg) {
		super(code, msg);
	}
	
	public ValidException(String msg) {
		super(msg);
	}
  
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	
}

package com.hhly.skeleton.activity.vo;

/**
 * @desc    消息Model
 * @author  scott
 * @company 益彩科技
 * @version 1.0
 * 
 */


import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class MessageModel {
    
	/** 消息来源所属系统名称     **/
	private String messageSource ;
	
	/** 消息key **/
	private String key ;
	
	/** 消息内容   **/
	private Object message ;

	/**
	 * @return the messageSource
	 */
	public String getMessageSource() {
		return messageSource;
	}

	/**
	 * @param messageSource the messageSource to set
	 */
	public void setMessageSource(String messageSource) {
		this.messageSource = messageSource;
	}

	

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @return the message
	 */
	public Object getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(Object message) {
		this.message = message;
	}
	
	@Override  
    public String toString() {  
        return ToStringBuilder.reflectionToString(this,  
               ToStringStyle.DEFAULT_STYLE);  
    }  
	
}

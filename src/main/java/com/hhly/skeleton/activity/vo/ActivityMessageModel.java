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

import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class ActivityMessageModel extends BaseBO{
    
	/** 消息来源所属系统名称     **/
	private String messageSource ;
	
	/** 消息key **/
	private Integer type ;
	
	/** 消息内容   **/
	private MsgVO message ;

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

	


	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * @return the message
	 */
	public MsgVO getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(MsgVO message) {
		this.message = message;
	}
	
	@Override  
    public String toString() {  
        return ToStringBuilder.reflectionToString(this,  
               ToStringStyle.DEFAULT_STYLE);  
    }  
}

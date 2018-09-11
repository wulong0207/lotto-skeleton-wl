package com.hhly.skeleton.lotto.base.ordercopy.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;
/**
 * 关注列表 BO
 * @author longguoyou
 * @date 2017年10月13日
 * @compay 益彩网络科技有限公司
 */
public class QueryUserIssueLinkBO extends BaseBO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 主键
	 */
	@JsonIgnore
	private Integer id;
	/**
	 * 用户
	 */
	private String nickName;
	/**
	 * 关注时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date focusTime;
	/**
	 * 描述：1、已跟单 2、--， 只要跟过一个单，就为已跟单
	 */
	private String remark;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Date getFocusTime() {
		return focusTime;
	}
	public void setFocusTime(Date focusTime) {
		this.focusTime = focusTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}

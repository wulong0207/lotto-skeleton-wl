package com.hhly.skeleton.activity.bo;

import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;

/***
 *	充值BO
 * @desc
 * @author lidecheng
 * @date 2017年7月20日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class TransRechargeBO extends BaseBO{
	/**订单编号*/
	private String transRechargeCode; 
	/**用户id*/
	private String userId;
	/**充值金额*/
	private Double rechargeAmount; 	
	/**用户真实名称*/
	private String actualName;
	/**用户身份证号*/
	private String idNum;
	private String mobile;
	/**渠道号*/
	private String channelId;
	/**创建时间*/
	private Date createTime;
	private String redCode;
	public String getTransRechargeCode() {
		return transRechargeCode;
	}
	public void setTransRechargeCode(String transRechargeCode) {
		this.transRechargeCode = transRechargeCode;
	}
	public String getUserId() {
		return userId;
	}	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Double getRechargeAmount() {
		return rechargeAmount;
	}
	public void setRechargeAmount(Double rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}
	public String getActualName() {
		return actualName;
	}
	public void setActualName(String actualName) {
		this.actualName = actualName;
	}
	public String getIdNum() {
		return idNum;
	}
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getRedCode() {
		return redCode;
	}
	public void setRedCode(String redCode) {
		this.redCode = redCode;
	}
	
}

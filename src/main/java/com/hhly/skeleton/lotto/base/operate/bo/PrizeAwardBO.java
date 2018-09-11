package com.hhly.skeleton.lotto.base.operate.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.cms.operatemgr.bo.OperateActivityAwardBO;

/**
 * @desc 抽奖活动返回BO类
 * @author lidecheng
 * @date 2017年10月19日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class PrizeAwardBO extends BaseBO{
	private Integer id;
	/**
	 * 提示信息
	 */
	private String msg;
	/**
	 * 活动类型
	 */
	private Short type;
	/**
	 * 活动文本
	 */
	private String awardText;
	public PrizeAwardBO(OperateActivityAwardBO bo,String msg){
		this.msg= msg;
		this.id = bo.getId();
		this.type =bo.getType();
		this.awardText = bo.getAwardText();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Short getType() {
		return type;
	}
	public void setType(Short type) {
		this.type = type;
	}
	public String getAwardText() {
		return awardText;
	}
	public void setAwardText(String awardText) {
		this.awardText = awardText;
	}
	
}

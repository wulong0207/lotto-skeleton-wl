package com.hhly.skeleton.activity.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * 彩票规则
 *
 * @author huangchengfang1219
 * @date 2018年1月11日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OperateActivityLottoBO extends BaseBO {

	private static final long serialVersionUID = 5596926115524554364L;

	/**
	 * 主键ID
	 */
	private Integer id;

	/**
	 * 活动配置表id
	 */
	private Integer activityConfigId;

	/**
	 * 彩种编码
	 */
	private Integer lotteryCode;

	/**
	 * 子玩法
	 */
	private Integer lotteryChildCode;

	/**
	 * 子玩法名称
	 */
	private String lotteryChildName;

	/**
	 * 选号方式
	 */
	private Short pickType;

	/**
	 * 购买类型
	 */
	private Short buyType;

	/**
	 * 内容类型
	 */
	private Short contentType;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getActivityConfigId() {
		return activityConfigId;
	}

	public void setActivityConfigId(Integer activityConfigId) {
		this.activityConfigId = activityConfigId;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public Integer getLotteryChildCode() {
		return lotteryChildCode;
	}

	public void setLotteryChildCode(Integer lotteryChildCode) {
		this.lotteryChildCode = lotteryChildCode;
	}

	public String getLotteryChildName() {
		return lotteryChildName;
	}

	public void setLotteryChildName(String lotteryChildName) {
		this.lotteryChildName = lotteryChildName;
	}

	public Short getPickType() {
		return pickType;
	}

	public void setPickType(Short pickType) {
		this.pickType = pickType;
	}

	public Short getBuyType() {
		return buyType;
	}

	public void setBuyType(Short buyType) {
		this.buyType = buyType;
	}

	public Short getContentType() {
		return contentType;
	}

	public void setContentType(Short contentType) {
		this.contentType = contentType;
	}

}

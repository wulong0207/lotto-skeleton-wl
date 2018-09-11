package com.hhly.skeleton.cms.operatemgr.vo;

import java.util.Date;

import com.hhly.skeleton.base.vo.PageVO;

/**
 * 活动送彩票配置
 *
 * @author huangchengfang1219
 * @date 2018年1月9日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OperateActivityLottoVO extends PageVO {

	private static final long serialVersionUID = 1803881664293148521L;

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
	 * 选号方式
	 */
	private Integer pickType;

	/**
	 * 购买类型
	 */
	private Integer buyType;

	/**
	 * 内容类型
	 */
	private Integer contentType;

	private Date createTime;

	private String createBy;

	private Date modifyTime;

	private String modifyBy;

	private Date updateTime;

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

	public Integer getPickType() {
		return pickType;
	}

	public void setPickType(Integer pickType) {
		this.pickType = pickType;
	}

	public Integer getBuyType() {
		return buyType;
	}

	public void setBuyType(Integer buyType) {
		this.buyType = buyType;
	}

	public Integer getContentType() {
		return contentType;
	}

	public void setContentType(Integer contentType) {
		this.contentType = contentType;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
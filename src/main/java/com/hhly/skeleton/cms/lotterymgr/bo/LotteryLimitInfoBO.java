package com.hhly.skeleton.cms.lotterymgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 彩种限号内容
 * @author huangb
 * @date 2017年2月14日
 * @company 益彩网络
 * @version v1.0
 */
public class LotteryLimitInfoBO extends BaseBO {
	private static final long serialVersionUID = -5904478235555873316L;
	/**
	 * 增长ID
	 */
	private Integer id;
	/**
	 * 限号表关联id
	 */
	private Integer limitId;
	/**
	 * 限号内容
	 */
	private String limitContent;
	/**
	 * 状态；；0：禁用；1：启用
	 */
	private Short status;
	/**
	 * 彩种子玩法关联id
	 */
	private Integer lotteryChildCode;
	/**
	 * 彩种子玩法关联对象
	 */
	private LotteryChildBO lotteryChild;
	/**
	 * 修改时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date updateTime;
	/**
	 * 创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLimitId() {
		return limitId;
	}

	public void setLimitId(Integer limitId) {
		this.limitId = limitId;
	}

	public String getLimitContent() {
		return limitContent;
	}

	public void setLimitContent(String limitContent) {
		this.limitContent = limitContent;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Integer getLotteryChildCode() {
		return lotteryChildCode;
	}

	public void setLotteryChildCode(Integer lotteryChildCode) {
		this.lotteryChildCode = lotteryChildCode;
	}

	public LotteryChildBO getLotteryChild() {
		return lotteryChild;
	}

	public void setLotteryChild(LotteryChildBO lotteryChild) {
		this.lotteryChild = lotteryChild;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}

package com.hhly.skeleton.cms.lotterymgr.bo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 彩种限号
 * @author huangb
 * @date 2017年2月14日
 * @company 益彩网络
 * @version v1.0
 */
public class LotteryLimitBO extends BaseBO {

	private static final long serialVersionUID = -8047697723813582434L;
	/**
	 * 增长id
	 */
	private Integer id;
	/**
	 * 彩种编码
	 */
	private Integer lotteryCode;
	/**
	 * 状态；；1：启用；2：禁用；3：过期
	 */
	private Short status;
	/**
	 * 限号类型;;1：所有类型；2：全匹配内容限制；3：部分匹配该内容限制
	 */
	private Short limitType;
	/**
	 * 限号彩期开始
	 */
	private String issueStart;
	/**
	 * 限号彩期结束
	 */
	private String issueEnd;
	/**
	 * 限号时间开始
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date timeStart;
	/**
	 * 限号时间结束
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date timeEnd;
	/**
	 * 1：限号彩期；2：限号时间
	 */
	private Short limitWay;
	/**
	 * 创建人姓名
	 */
	private String createBy;
	/**
	 * 修改人姓名
	 */
	private String modifyBy;
	/**
	 * 修改时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date modifyTime;
	/**
	 * 更新时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date updateTime;
	/**
	 * 创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 限号内容列表
	 */
	private List<LotteryLimitInfoBO> limitInfoList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Short getLimitType() {
		return limitType;
	}

	public void setLimitType(Short limitType) {
		this.limitType = limitType;
	}

	public String getIssueStart() {
		return issueStart;
	}

	public void setIssueStart(String issueStart) {
		this.issueStart = issueStart;
	}

	public String getIssueEnd() {
		return issueEnd;
	}

	public void setIssueEnd(String issueEnd) {
		this.issueEnd = issueEnd;
	}

	public Date getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(Date timeStart) {
		this.timeStart = timeStart;
	}

	public Date getTimeEnd() {
		return timeEnd;
	}

	public void setTimeEnd(Date timeEnd) {
		this.timeEnd = timeEnd;
	}

	public Short getLimitWay() {
		return limitWay;
	}

	public void setLimitWay(Short limitWay) {
		this.limitWay = limitWay;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<LotteryLimitInfoBO> getLimitInfoList() {
		return limitInfoList;
	}

	public void setLimitInfoList(List<LotteryLimitInfoBO> limitInfoList) {
		this.limitInfoList = limitInfoList;
	}

}

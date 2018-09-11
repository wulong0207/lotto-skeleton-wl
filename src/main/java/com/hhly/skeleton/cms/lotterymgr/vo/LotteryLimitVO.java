package com.hhly.skeleton.cms.lotterymgr.vo;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;

/**
 * @desc 彩种限号
 * @author huangb
 * @date 2017年2月14日
 * @company 益彩网络
 * @version v1.0
 */
public class LotteryLimitVO extends PageVO {

	private static final long serialVersionUID = 6981424717073231514L;

	/**
	 * 增长id
	 */
	private Integer id;
	/**
	 * 彩种编码
	 */
	@Group({ "add", "upd" })
	@NotNull(msg = "彩种编码")
	private Integer lotteryCode;
	/**
	 * 状态；；1：启用；2：禁用；3：过期
	 */
	@Group({ "add", "upd" })
	@NotNull(msg = "状态")
	private Short status;
	/**
	 * 限号类型;;1：所有类型；2：全匹配内容限制；3：部分匹配该内容限制
	 */
	@Group({ "add", "upd" })
	@NotNull(msg = "限号类型")
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
	private Date timeStart;
	/**
	 * 限号时间结束
	 */
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
	private Date modifyTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 备注
	 */
	private String remark;

	/**
	 * 查询开始时间
	 */
	private Date qryStartTime;
	/**
	 * 查询结束时间
	 */
	private Date qryEndTime;

	public LotteryLimitVO() {
	}

	/**
	 * 构造方法
	 * 
	 * @param id
	 *            编号
	 */
	public LotteryLimitVO(Integer id) {
		this.id = id;
	}

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

	public Date getQryStartTime() {
		return qryStartTime;
	}

	public void setQryStartTime(Date qryStartTime) {
		this.qryStartTime = qryStartTime;
	}

	public Date getQryEndTime() {
		return qryEndTime;
	}

	public void setQryEndTime(Date qryEndTime) {
		this.qryEndTime = qryEndTime;
	}

}

package com.hhly.skeleton.cms.taskmgr.vo;

import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;

/**
 * @author huangb
 *
 * @Date 2017年1月10日
 *
 * @Desc 任务执行信息
 */
@SuppressWarnings("serial")
public class TaskInfoVO extends PageVO {
	/**
	 * 编号
	 */
	private Long id;
	/**
	 * 定时任务ID
	 */
	private Integer timedTaskId;
	/**
	 * 关联任务对象
	 */
	private TaskVO task;
	/**
	 * 任务触发时间
	 */
	private Date runTime;
	/**
	 * 1：手动执行；2：自动运行
	 */
	private Short runWay;
	/**
	 * 0：失败；1：成功
	 */
	private Short status;
	/**
	 * 任务开始时间
	 */
	private Date startTime;
	/**
	 * 任务结束时间
	 */
	private Date endTime;
	/**
	 * 任务耗时；单位：秒
	 */
	private Integer spendTime;
	/**
	 * 0：失败；1：成功
	 */
	private Short result;
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

	public TaskInfoVO() {
	}

	public TaskInfoVO(Long id, Short status, String remark) {
		this.id = id;
		this.status = status;
		this.remark = remark;
	}

	public TaskInfoVO(Integer timedTaskId, Short runWay) {
		this.timedTaskId = timedTaskId;
		this.runWay = runWay;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getTimedTaskId() {
		return timedTaskId;
	}

	public void setTimedTaskId(Integer timedTaskId) {
		this.timedTaskId = timedTaskId;
	}

	public TaskVO getTask() {
		return task;
	}

	public void setTask(TaskVO task) {
		this.task = task;
	}

	public Date getRunTime() {
		return runTime;
	}

	public void setRunTime(Date runTime) {
		this.runTime = runTime;
	}

	public Short getRunWay() {
		return runWay;
	}

	public void setRunWay(Short runWay) {
		this.runWay = runWay;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Integer getSpendTime() {
		return spendTime;
	}

	public void setSpendTime(Integer spendTime) {
		this.spendTime = spendTime;
	}

	public Short getResult() {
		return result;
	}

	public void setResult(Short result) {
		this.result = result;
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

}

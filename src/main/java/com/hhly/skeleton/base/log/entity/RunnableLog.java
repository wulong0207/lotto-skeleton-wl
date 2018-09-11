package com.hhly.skeleton.base.log.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.log.visit.IVisitor;

/**
 * @desc 线程池任务日志
 * @author jiangwei
 * @date 2017年3月2日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class RunnableLog implements ILog {

	/**
	 * 编号
	 */
	private Long id;
	/**
	 * 定时任务ID
	 */
	private Integer timedTaskId;
	/**
	 * 任务触发时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date runTime;
	/**
	 * 1：手动执行；2：自动运行
	 */
	private Integer runWay;
	/**
	 * 0：失败；1：成功
	 */
	private Integer status;
	/**
	 * 任务开始时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date startTime;
	/**
	 * 任务结束时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date endTime;
	/**
	 * 任务耗时；单位：秒
	 */
	private Integer spendTime;
	/**
	 * 0：失败；1：成功
	 */
	private Integer result;
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

	public RunnableLog(Integer timedTaskId,String remark) {
		this.timedTaskId = timedTaskId;
		this.remark = remark;
		this.runWay = 2 ;
		this.status = 1;
		this.result = 1;
	}
	/**
	 * 记录开始
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年4月1日 下午6:13:24
	 */
	public void start(){
		Date start = new Date();
		this.startTime = start;
		this.runTime = start;
	}
	/**
	 * 记录结束
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年4月1日 下午6:13:37
	 */
	public void end(){
		Date end = new Date();
		long spendTime = end.getTime() - this.startTime.getTime();
		this.endTime = end;
		this.spendTime = (int) spendTime;
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

	public Date getRunTime() {
		return runTime;
	}

	public void setRunTime(Date runTime) {
		this.runTime = runTime;
	}

	public Integer getRunWay() {
		return runWay;
	}

	public void setRunWay(Integer runWay) {
		this.runWay = runWay;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
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

	public Integer getResult() {
		return result;
	}

	public void setResult(Integer result) {
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
	
	@Override
	public boolean visit(IVisitor visitor) {
		return visitor.visit(this);
	}

	@Override
	public String toString() {
		return "RunnableLog [id=" + id + ", timedTaskId=" + timedTaskId + ", runTime=" + runTime + ", runWay=" + runWay
				+ ", status=" + status + ", startTime=" + startTime + ", endTime=" + endTime + ", spendTime="
				+ spendTime + ", result=" + result + ", updateTime=" + updateTime + ", createTime=" + createTime
				+ ", remark=" + remark + "]";
	}
	
}

package com.hhly.skeleton.base.log.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.log.visit.IVisitor;

/**
 * 
 * @desc 线程池运行时参数
 * @author jiangwei
 * @date 2017年2月27日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class ThreadPoolLog implements ILog{
	//名称
	private String name;
	// 核心线程数
	private int corePoolSize;
	// 当前线程数
	private int poolSize;
	// 最大线程数
	private int maximumPoolSize;
	// 活动线程数
	private int activeCount;
	// 任务列队数
	private int queueSize;
	// 任务总数
	private long taskCount;
	// 执行完任务数
	private long completedTaskCount;
	// 保存活跃时间
	private long keepAliveTime;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCorePoolSize() {
		return corePoolSize;
	}

	public void setCorePoolSize(int corePoolSize) {
		this.corePoolSize = corePoolSize;
	}

	public int getPoolSize() {
		return poolSize;
	}

	public void setPoolSize(int poolSize) {
		this.poolSize = poolSize;
	}

	public int getMaximumPoolSize() {
		return maximumPoolSize;
	}

	public void setMaximumPoolSize(int maximumPoolSize) {
		this.maximumPoolSize = maximumPoolSize;
	}

	public int getActiveCount() {
		return activeCount;
	}

	public void setActiveCount(int activeCount) {
		this.activeCount = activeCount;
	}

	public int getQueueSize() {
		return queueSize;
	}

	public void setQueueSize(int queueSize) {
		this.queueSize = queueSize;
	}

	public long getTaskCount() {
		return taskCount;
	}

	public void setTaskCount(long taskCount) {
		this.taskCount = taskCount;
	}

	public long getCompletedTaskCount() {
		return completedTaskCount;
	}

	public void setCompletedTaskCount(long completedTaskCount) {
		this.completedTaskCount = completedTaskCount;
	}

	public long getKeepAliveTime() {
		return keepAliveTime;
	}

	public void setKeepAliveTime(long keepAliveTime) {
		this.keepAliveTime = keepAliveTime;
	}

	@Override
	public boolean visit(IVisitor visitor) {
		return visitor.visit(this);
	}

}

package com.hhly.skeleton.base.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @desc 唯一定时任务属性
 * @author jiangwei
 * @date 2017年3月7日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class FutureTaskBO extends BaseBO {
	/**
	 * 唯一主键
	 */
	private String key;
	/**
	 * 定时器执行时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date date;
	/**
	 * 执行间隔（秒）
	 */
	private long interval;
	/**
	 * 定时任务状态,0取消，1正在列队中等待运行
	 */
	private int status;
	/**
	 * 备注
	 */
	private String remark;

	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public long getInterval() {
		return interval;
	}

	public void setInterval(long interval) {
		this.interval = interval;
	}

}

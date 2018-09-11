package com.hhly.skeleton.cms.taskmgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @author huangb
 *
 * @Date 2016年12月30日
 *
 * @Desc 任务配置信息
 */
@SuppressWarnings("serial")
public class TaskBO extends BaseBO {
	
	/**
	 * 任务编号
	 */
	private Integer id;
	/**
	 * 任务名称
	 */
	private String jobName;
	/**
	 * 定时任务类的全路径
	 */
	private String jobClassName;
	/**
	 * 定时任务手动执行的请求URL
	 */
	private String jobManualUrl;
	/**
	 * 定时任务执行时间表达式
	 */
	private String jobCronExpression;
	/**
	 * 定时任务所属哪个组，对任务进行分组管理(批量启动，禁止)
	 */
	private String jobGroup;
	/**
	 * 0：无效；1：有效；2：已删除 是否有效任务
	 */
	private Short jobStatus;
	/**
	 * 0：否；1：是；是否自动运行
	 */
	private Short jobAutorun;
	/**
	 * 预留参数字段1KEY
	 */
	private String paramKey1;
	/**
	 * 预留参数字段1VALUE
	 */
	private String paramValue1;
	/**
	 * 预留参数字段2KEY
	 */
	private String paramKey2;
	/**
	 * 预留参数字段2VALUE
	 */
	private String paramValue2;
	/**
	 * 预留参数字段3KEY
	 */
	private String paramKey3;
	/**
	 * 预留参数字段3VALUE
	 */
	private String paramValue3;
	/**
	 * 修改时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date modifyTime;
	/**
	 * 修改人
	 */
	private String modifyBy;
	/**
	 * 创建人
	 */
	private String createBy;
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
	 * 定时器运行状态
	 */
	private Integer quartzStatus;
	/**
	 * 下次定时任务执行时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date nextFireTime;
	
	/**
	 * 上传执行时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date previousFireTime;
	
	/**
	 * 是否重启立即执行
	 */
	private Integer restartRun;
	/**
	 * 任务执行方式
	 */
	private Integer jobWay;
	/**
	 * 任务编号
	 */
	private String jobId;
	
	
	public Integer getRestartRun() {
		return restartRun;
	}

	public void setRestartRun(Integer restartRun) {
		this.restartRun = restartRun;
	}

	public Integer getJobWay() {
		return jobWay;
	}

	public void setJobWay(Integer jobWay) {
		this.jobWay = jobWay;
	}

	public Date getNextFireTime() {
		return nextFireTime;
	}

	public void setNextFireTime(Date nextFireTime) {
		this.nextFireTime = nextFireTime;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobClassName() {
		return jobClassName;
	}

	public void setJobClassName(String jobClassName) {
		this.jobClassName = jobClassName;
	}

	public String getJobManualUrl() {
		return jobManualUrl;
	}

	public void setJobManualUrl(String jobManualUrl) {
		this.jobManualUrl = jobManualUrl;
	}

	public String getJobCronExpression() {
		return jobCronExpression;
	}

	public void setJobCronExpression(String jobCronExpression) {
		this.jobCronExpression = jobCronExpression;
	}

	public String getJobGroup() {
		return jobGroup;
	}

	public void setJobGroup(String jobGroup) {
		this.jobGroup = jobGroup;
	}

	public Short getJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(Short jobStatus) {
		this.jobStatus = jobStatus;
	}

	public Short getJobAutorun() {
		return jobAutorun;
	}

	public void setJobAutorun(Short jobAutorun) {
		this.jobAutorun = jobAutorun;
	}

	public String getParamKey1() {
		return paramKey1;
	}

	public void setParamKey1(String paramKey1) {
		this.paramKey1 = paramKey1;
	}

	public String getParamValue1() {
		return paramValue1;
	}

	public void setParamValue1(String paramValue1) {
		this.paramValue1 = paramValue1;
	}

	public String getParamKey2() {
		return paramKey2;
	}

	public void setParamKey2(String paramKey2) {
		this.paramKey2 = paramKey2;
	}

	public String getParamValue2() {
		return paramValue2;
	}

	public void setParamValue2(String paramValue2) {
		this.paramValue2 = paramValue2;
	}

	public String getParamKey3() {
		return paramKey3;
	}

	public void setParamKey3(String paramKey3) {
		this.paramKey3 = paramKey3;
	}

	public String getParamValue3() {
		return paramValue3;
	}

	public void setParamValue3(String paramValue3) {
		this.paramValue3 = paramValue3;
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

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
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

	public Integer getQuartzStatus() {
		return quartzStatus;
	}

	public void setQuartzStatus(Integer quartzStatus) {
		this.quartzStatus = quartzStatus;
	}

	public Date getPreviousFireTime() {
		return previousFireTime;
	}

	public void setPreviousFireTime(Date previousFireTime) {
		this.previousFireTime = previousFireTime;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

}

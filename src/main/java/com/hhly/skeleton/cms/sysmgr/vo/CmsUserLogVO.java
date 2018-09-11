package com.hhly.skeleton.cms.sysmgr.vo;

import java.util.Date;

import com.hhly.skeleton.base.vo.PageVO;

/**
 * @desc    用户操作日志
 * @author  Tony Wang
 * @date    2017年5月12日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class CmsUserLogVO extends PageVO{
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 用户账号
     */
    private String userName;

    /**
     * 操作模块
     */
    private String typeName;
    
    /**
     * 操作详情
     */
    private String details;

    /**
     * 操作输入内容,JSON格式
     */
    private String inContent;

    /**
     * 操作输出内容,JSON格式
     */
    private String outContent;

    /**
     * 操作开始时间
     */
    private Date startTime;
    
    /**
     * 操作结束时间
     */
    private Date endTime;
    
    /**
     * controller路径
     */
    private String controllerPath;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getInContent() {
		return inContent;
	}

	public void setInContent(String inContent) {
		this.inContent = inContent;
	}

	public String getOutContent() {
		return outContent;
	}

	public void setOutContent(String outContent) {
		this.outContent = outContent;
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

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getControllerPath() {
		return controllerPath;
	}

	public void setControllerPath(String controllerPath) {
		this.controllerPath = controllerPath;
	}

	@Override
	public String toString() {
		return "CmsUserLogVO [id=" + id + ", userName=" + userName + ", typeName=" + typeName + ", details=" + details
				+ ", inContent=" + inContent + ", outContent=" + outContent + ", startTime=" + startTime + ", endTime="
				+ endTime + ", controllerPath=" + controllerPath + "]";
	}
}
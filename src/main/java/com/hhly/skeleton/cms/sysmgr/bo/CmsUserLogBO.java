package com.hhly.skeleton.cms.sysmgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc    用户操作日志
 * @author  Tony Wang
 * @date    2017年5月12日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class CmsUserLogBO extends BaseBO{
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

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
}
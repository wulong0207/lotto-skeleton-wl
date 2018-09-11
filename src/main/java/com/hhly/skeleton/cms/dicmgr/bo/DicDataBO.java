package com.hhly.skeleton.cms.dicmgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;


/**
 * 
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2016-11-11 上午11:36:03
 * @Desc 字典查询
 */
public class DicDataBO extends BaseBO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 654600931202682145L;
	/**
	 * 名称
	 */
	private String dicName;
    /**
     * 编码
     */
    private String dicCode;
    /**
     * 描述
     */
    private String remark;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date udpateTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
   
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getDicName() {
		return dicName;
	}

	public void setDicName(String dicName) {
		this.dicName = dicName;
	}

	public String getDicCode() {
		return dicCode;
	}

	public void setDicCode(String dicCode) {
		this.dicCode = dicCode;
	}

	public Date getUdpateTime() {
		return udpateTime;
	}

	public void setUdpateTime(Date udpateTime) {
		this.udpateTime = udpateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}

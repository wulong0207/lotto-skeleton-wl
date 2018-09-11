package com.hhly.skeleton.lotto.base.dic.bo;

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
public class DicDataDetailBO extends BaseBO {
    /**
	 * 
	 */
	private static final long serialVersionUID = -8466526610172817242L;
    /**
     * 主键
     */
	private Integer id;
	/**
     * 编号
     */
    private String dicCode;
    /**
     * 名称
     */
    private String dicDataName;
    /**
     * 值
     */
    private String dicDataValue;
    /**
     * 0：不固定；1：固定；默认为0
     */
    private Integer isFixed;
    /**
     * 0：无效；1：有效
     */
    private Integer status;
    /**
     * 排序字段
     */
    private Integer orderBy;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    
	/**
	 * 备注
	 */
	private String desc;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDicCode() {
		return dicCode;
	}

	public void setDicCode(String dicCode) {
		this.dicCode = dicCode;
	}

	public String getDicDataName() {
		return dicDataName;
	}

	public void setDicDataName(String dicDataName) {
		this.dicDataName = dicDataName;
	}

	public String getDicDataValue() {
		return dicDataValue;
	}

	public void setDicDataValue(String dicDataValue) {
		this.dicDataValue = dicDataValue;
	}

	public Integer getIsFixed() {
		return isFixed;
	}

	public void setIsFixed(Integer isFixed) {
		this.isFixed = isFixed;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(Integer orderBy) {
		this.orderBy = orderBy;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}

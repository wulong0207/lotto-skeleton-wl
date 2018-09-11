package com.hhly.skeleton.cms.customermgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.pay.bo.PageBO;

@SuppressWarnings("serial")
public class UserTypeBO extends PageBO {
    /**
     * 主键ID
     */
    private Integer id;
    
    /**
     * 类型编码
     */
    private String code;

    /**
     * 对象名称
     */
    private String name;

    /**
     * 对象描述
     */
    private String describe;

    /**
     * 备注
     */
    private String remark;

    /**
     * null
     */
    private String createBy;

    /**
     * null
     */
    private String modifyBy;

    /**
     * null
     */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")    
    private Date updateTime;

    /**
     * null
     */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")    
    private Date createTime;

    /**
     * null
     */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")    
    private Date modifyTime;

    /**
     * 主键ID
     * @return ID 主键ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键ID
     * @param id 主键ID
     */
    public void setId(Integer id) {
        this.id = id;
    }
    
    /**
     * 类型编码
     * @return typeCode 类型编码
     */
    public String getCode() {
		return code;
	}

    /**
     * 类型编码
     * @return typeCode 类型编码
     */
    public void setCode(String code) {
		this.code = code;
	}

	/**
     * 对象名称
     * @return NAME 对象名称
     */
    public String getName() {
        return name;
    }

	/**
     * 对象名称
     * @param name 对象名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 对象描述
     * @return DESCRIBE 对象描述
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * 对象描述
     * @param describe 对象描述
     */
    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    /**
     * 备注
     * @return REMARK 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * null
     * @return CREATE_BY null
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * null
     * @param createBy null
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * null
     * @return MODIFY_BY null
     */
    public String getModifyBy() {
        return modifyBy;
    }

    /**
     * null
     * @param modifyBy null
     */
    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    /**
     * null
     * @return UPDATE_TIME null
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * null
     * @param updateTime null
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * null
     * @return CREATE_TIME null
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * null
     * @param createTime null
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * null
     * @return MODIFY_TIME null
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * null
     * @param modifyTime null
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}
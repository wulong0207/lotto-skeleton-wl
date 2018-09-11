package com.hhly.skeleton.cms.operatemgr.bo;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.pay.vo.BasePageVo;

/**
 * @desc cms 缓存管理VO
 * @author YiJian
 * @date 2017年6月28日 上午10:57:55
 * @company 深圳益彩网络科技有限公司
 * @version v1.0
 */
public class CmsCacheBO implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
     * 主键ID
     */
	private Integer id;

    /**
     * 缓存类型：取字典表value
     */
    private Short type;
    
    /**
     * 缓存类型 取字典表name
     */
    private String typeName;

    /**
     * 缓存名称
     */
    private String name;
    
    /**
     * 缓存KEY
     */
    private String cKey;
    
    /**
     * 状态 0：未启用；1：启用 
     */
    private Short status;
    
    private String remark;
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Short getType() {
		return type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getcKey() {
		return cKey;
	}

	public void setcKey(String cKey) {
		this.cKey = cKey;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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
    
    
}

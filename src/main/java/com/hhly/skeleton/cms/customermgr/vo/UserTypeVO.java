package com.hhly.skeleton.cms.customermgr.vo;

import java.util.Date;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.GroupValue;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.vo.PageVO;

@SuppressWarnings("serial")
public class UserTypeVO extends PageVO {
    /**
     * 主键ID
     */
	@Group({GroupValue.UPD,GroupValue.DEL})
	@NotNull(msg="主键")
    private Integer id;
	
    /**
     * 类型编码
     */
	@Group({GroupValue.ADD,GroupValue.UPD})
	@NotNull(msg="类别编号")
    private String code;	

    /**
     * 对象名称
     */
	@Group({GroupValue.ADD,GroupValue.UPD})
	@NotNull(msg="类别名称")
    private String name;

    /**
     * 对象描述
     */
	@Group({GroupValue.ADD,GroupValue.UPD})
	@NotNull(msg="类别名称")	
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
	@Group({GroupValue.UPD})
	@NotNull(msg = "修改人")
    private String modifyBy;
	
	/**
	 * 时间类型; 1:创建时间; 2:修改时间;
	 * 
	 */
	private Integer timeType;

	/**
	 * 开始时间
	 */
	private Date beginTime;

	/**
	 * 结束时间
	 * 
	 * @return
	 */
	private Date endTime;

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
    
	public Integer getTimeType() {
		return timeType;
	}

	public void setTimeType(Integer timeType) {
		this.timeType = timeType;
	}

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
}
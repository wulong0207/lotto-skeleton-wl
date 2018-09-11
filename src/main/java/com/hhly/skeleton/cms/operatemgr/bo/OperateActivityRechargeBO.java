package com.hhly.skeleton.cms.operatemgr.bo;


import java.util.Date;
import java.util.List;

import com.hhly.skeleton.base.vo.BaseVO;
import com.hhly.skeleton.lotto.base.operate.bo.OperateCouponTempBO;

public class OperateActivityRechargeBO extends BaseVO {
    /**
     * 
     */
    private Integer id;
    /**
     * 中奖金额开始 
     */
    private Double winStartMoney;
    /**
     * 中奖金额结束 
     */
    private Double winEndMoney;
    
    /**
     * 
     */
    private Date modifyTime;

    /**
     * 
     */
    private String modifyBy;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private String createBy;

    /**
     * 
     */
    private Date updateTime;

    
    private String activityCode;
    
    private Integer activityConfigId;
    
    /**
     * 优惠券模板信息
     */
    private List<OperateCouponTempBO> couponTemp;
    
    
    
    
   

	public List<OperateCouponTempBO> getCouponTemp() {
		return couponTemp;
	}

	public void setCouponTemp(List<OperateCouponTempBO> couponTemp) {
		this.couponTemp = couponTemp;
	}

	public Integer getActivityConfigId() {
		return activityConfigId;
	}

	public void setActivityConfigId(Integer activityConfigId) {
		this.activityConfigId = activityConfigId;
	}

	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	/**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

   
    /**
     * 
     * @return modify_time 
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 
     * @param modifyTime 
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 
     * @return modify_by 
     */
    public String getModifyBy() {
        return modifyBy;
    }

    /**
     * 
     * @param modifyBy 
     */
    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy == null ? null : modifyBy.trim();
    }

    /**
     * 
     * @return create_time 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     * @param createTime 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 
     * @return create_by 
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 
     * @param createBy 
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * 
     * @return update_time 
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 
     * @param updateTime 
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

	public Double getWinStartMoney() {
		return winStartMoney;
	}

	public void setWinStartMoney(Double winStartMoney) {
		this.winStartMoney = winStartMoney;
	}

	public Double getWinEndMoney() {
		return winEndMoney;
	}

	public void setWinEndMoney(Double winEndMoney) {
		this.winEndMoney = winEndMoney;
	}       
}
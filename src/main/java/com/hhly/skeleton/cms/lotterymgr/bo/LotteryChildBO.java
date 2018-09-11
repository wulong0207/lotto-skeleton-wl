package com.hhly.skeleton.cms.lotterymgr.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.common.LotteryChildEnum;

@SuppressWarnings("serial")
public class LotteryChildBO extends BaseBO{

	private Integer id;

    private Integer lotteryChildCode;
    /**
	 * 彩种id
	 */
	private Integer lotteryId;
	/**
	 * 彩种code
	 */
    private Integer lotteryCode;

    private String childName;

    private Short saleStatus;
    
  	/**
  	 * 是否正常销售
  	 */
    private boolean salable;
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
	
	public Integer getLotteryChildCode() {
        return lotteryChildCode;
    }
    public void setLotteryChildCode(Integer lotteryChildCode) {
        this.lotteryChildCode = lotteryChildCode;
    }
    public Integer getLotteryId() {
		return lotteryId;
	}
	public void setLotteryId(Integer lotteryId) {
		this.lotteryId = lotteryId;
	}
	
	public Integer getLotteryCode() {
        return lotteryCode;
    }
    public void setLotteryCode(Integer lotteryCode) {
        this.lotteryCode = lotteryCode;
    }
    public String getChildName() {
		return childName;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}
	public Short getSaleStatus() {
		return saleStatus;
	}
	public void setSaleStatus(Short saleStatus) {
		this.saleStatus = saleStatus;
		this.salable = LotteryChildEnum.SaleStatus.isSalable(saleStatus);
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
	public boolean isSalable() {
		return salable;
	}
	
}
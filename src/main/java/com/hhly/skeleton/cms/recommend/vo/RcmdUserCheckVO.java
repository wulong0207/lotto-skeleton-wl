package com.hhly.skeleton.cms.recommend.vo;

import java.util.Date;

import com.hhly.skeleton.base.vo.PageVO;

@SuppressWarnings("serial")
public class RcmdUserCheckVO extends PageVO {
    /**
     * 
     */
    private Integer id;

    /**
     * 申请人；关联用户表
     */
    private Integer userId;
    
    /**
     * 用户账号
     */
    private String userAccount;
    
    private String cusMobile;
    private String idNum;
    private String userName;

    /**
     * 申请来源；1：个人申请；2：平台签约；
     */
    private Short applySource;

    /**
     * 申请类型
     */
    private Integer applyType;

    /**
     * 彩种编号
     */
    private Short lotteryCode;

    /**
     * 擅长的赛事；多个逗号分隔
     */
    private String adeptMatch;

    /**
     * 个人简述
     */
    private String summary;

    /**
     * 申请时间
     */
    private Date applyTime;

    /**
     * 审核时间
     */
    private Date checkTime;

    /**
     * 审核状态；1：待审核；2：审核中；3：通过；4：不通过；5：取消资格
     */
    private Short status;

    /**
     * 是否显示战绩 0：不显示；1：显示；
     */
    private Boolean isShowRecord;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 修改人
     */
    private String modifyBy;

    /**
     * 备注说明
     */
    private String remark;
    
    private Date applyStartTime;
    private Date applyEndTime;
    private Date startTime;
    private Date endTime;
    
    public String getCusMobile() {
		return cusMobile;
	}

	public void setCusMobile(String cusMobile) {
		this.cusMobile = cusMobile;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getApplyStartTime() {
		return applyStartTime;
	}

	public void setApplyStartTime(Date applyStartTime) {
		this.applyStartTime = applyStartTime;
	}

	public Date getApplyEndTime() {
		return applyEndTime;
	}

	public void setApplyEndTime(Date applyEndTime) {
		this.applyEndTime = applyEndTime;
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

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Short getApplySource() {
        return applySource;
    }

    public void setApplySource(Short applySource) {
        this.applySource = applySource;
    }

    public Integer getApplyType() {
        return applyType;
    }

    public void setApplyType(Integer applyType) {
        this.applyType = applyType;
    }

    public Short getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(Short lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public String getAdeptMatch() {
        return adeptMatch;
    }

    public void setAdeptMatch(String adeptMatch) {
        this.adeptMatch = adeptMatch == null ? null : adeptMatch.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Boolean getIsShowRecord() {
        return isShowRecord;
    }

    public void setIsShowRecord(Boolean isShowRecord) {
        this.isShowRecord = isShowRecord;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy == null ? null : modifyBy.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
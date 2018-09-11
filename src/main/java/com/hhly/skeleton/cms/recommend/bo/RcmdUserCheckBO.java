package com.hhly.skeleton.cms.recommend.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class RcmdUserCheckBO extends BaseBO {
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
    
    /**
     * 身份证
     */
    private String idNum;
    
    /**
     * 联系方式
     */
    private String cusMobile;

    /**
     * 申请来源；1：个人申请；2：平台签约；
     */
    private Short applySource;

    /**
     * 申请类型
     */
    private Short applyType;

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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date applyTime;

    /**
     * 审核时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date checkTime;

    /**
     * 审核状态；1：待审核；2：审核中；3：通过；4：不通过；5：取消资格
     */
    private Short checkStatus;

    /**
     * 是否显示战绩 0：不显示；1：显示；
     */
    private Short isShowRecord;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    /**
     * 修改人
     */
    private String modifyBy;

    /**
     * 备注说明
     */
    private String remark;
    
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

    public Short getApplyType() {
        return applyType;
    }

    public void setApplyType(Short applyType) {
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

    public Short getCheckStatus() {
		return checkStatus;
	}

	public void setCheckStatus(Short checkStatus) {
		this.checkStatus = checkStatus;
	}

	public Short getIsShowRecord() {
        return isShowRecord;
    }

    public void setIsShowRecord(Short isShowRecord) {
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

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public String getCusMobile() {
		return cusMobile;
	}

	public void setCusMobile(String cusMobile) {
		this.cusMobile = cusMobile;
	}
    
    
}
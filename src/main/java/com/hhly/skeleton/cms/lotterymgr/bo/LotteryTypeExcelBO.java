package com.hhly.skeleton.cms.lotterymgr.bo;


import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ReplaceAttribute;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.model.DicDataEnum;
/**
 * 
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2016-11-22 下午12:16:03
 * @Desc 导出excel
 */
@SuppressWarnings("serial")
public class LotteryTypeExcelBO extends BaseBO {
	@ExcelHeader("序号")
	private String id;
	
	@ExcelHeader("彩种id")
    private Double lotteryCode;
	
	@ExcelHeader("彩种名称")
    private String lotteryName;
	
	@ExcelHeader("行政类别")
	@ReplaceAttribute(DicDataEnum.LOTTERY_ADMIN_CATEGORY)
    private String adminCategory;
	
	@ExcelHeader("彩种类别")
	@ReplaceAttribute(DicDataEnum.LOTTERY_CATEGORY)
    private String lotteryCategory;
	
	@ExcelHeader("省份")
	@ReplaceAttribute(DicDataEnum.LOTTERY_AREA)
    private String area;
	
	@ExcelHeader("自动生成彩期数")
    private Double conIssueNum;
	
	@ExcelHeader("是否生成彩期")
	@ReplaceAttribute(DicDataEnum.LOTTERY_ISSUE_ADDED)
    private String stopAddIssue;
	
	@ExcelHeader("图片地址")
    private String lotteryLogoUrl;
	
	@ExcelHeader("销售状态")
	@ReplaceAttribute(DicDataEnum.LOTTERY_SALE_STATUS)
    private String saleStatus;
	
	@ExcelHeader("开派奖")
	@ReplaceAttribute(DicDataEnum.LOTTERY_AUTO_TYPE)
    private String autoType;
	
	@ExcelHeader("同步彩期")
	@ReplaceAttribute(DicDataEnum.LOTTERY_SYN_ISSUE)
    private String synIssue;
	
	@ExcelHeader("开售时间")
    private Double saleTime;
	
	@ExcelHeader("截止时间")
    private Double buyEndTime;
	
	@ExcelHeader("拆票倍数")
    private Double splitMaxNum;
	
	@ExcelHeader("检票时间")
    private Double endCheckTime;
	
	@ExcelHeader("拆票金额")
    private Double splitMaxAmount;
	
	@ExcelHeader("创建人")
    private String createBy;
	
	@ExcelHeader("修改人")
    private String modifyBy;
	
	@ExcelHeader("修改时间")
    private String updateTime;
	
	@ExcelHeader("创建时间")
    private String createTime;
	
	@ExcelHeader("备注")
    private String remark;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

	public Double getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(Double lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public String getLotteryName() {
		return lotteryName;
	}

	public void setLotteryName(String lotteryName) {
		this.lotteryName =  lotteryName;
	}

	public String getStopAddIssue() {
		return stopAddIssue;
	}

	public void setStopAddIssue(String stopAddIssue) {
		this.stopAddIssue = stopAddIssue;
	}

	public String getLotteryLogoUrl() {
		return lotteryLogoUrl;
	}

	public void setLotteryLogoUrl(String lotteryLogoUrl) {
		this.lotteryLogoUrl = lotteryLogoUrl;
	}

	public String getAdminCategory() {
		return adminCategory;
	}

	public void setAdminCategory(String adminCategory) {
		this.adminCategory = adminCategory;
	}

	public String getLotteryCategory() {
		return lotteryCategory;
	}

	public void setLotteryCategory(String lotteryCategory) {
		this.lotteryCategory = lotteryCategory;
	}

	public String getSaleStatus() {
		return saleStatus;
	}

	public void setSaleStatus(String saleStatus) {
		this.saleStatus = saleStatus;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAutoType() {
		return autoType;
	}

	public void setAutoType(String autoType) {
		this.autoType = autoType;
	}

	public String getSynIssue() {
		return synIssue;
	}

	public void setSynIssue(String synIssue) {
		this.synIssue = synIssue;
	}

	public Double getConIssueNum() {
        return conIssueNum;
    }

    public void setConIssueNum(Double conIssueNum) {
        this.conIssueNum = conIssueNum;
    }

    public Double getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(Double saleTime) {
        this.saleTime = saleTime;
    }

    public Double getBuyEndTime() {
        return buyEndTime;
    }

    public void setBuyEndTime(Double buyEndTime) {
        this.buyEndTime = buyEndTime;
    }

    public Double getSplitMaxNum() {
        return splitMaxNum;
    }

    public void setSplitMaxNum(Double splitMaxNum) {
        this.splitMaxNum = splitMaxNum;
    }

    public Double getEndCheckTime() {
        return endCheckTime;
    }

    public void setEndCheckTime(Double endCheckTime) {
        this.endCheckTime = endCheckTime;
    }

    public Double getSplitMaxAmount() {
        return splitMaxAmount;
    }

    public void setSplitMaxAmount(Double splitMaxAmount) {
        this.splitMaxAmount = splitMaxAmount;
    }

    public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	
	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
    
    
}
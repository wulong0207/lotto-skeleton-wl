package com.hhly.skeleton.cms.lotterymgr.vo;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.Max;
import com.hhly.skeleton.base.valid.Min;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;

import static com.hhly.skeleton.base.valid.GroupValue.ADD;
import static com.hhly.skeleton.base.valid.GroupValue.UPD;

/**
 * 
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2016-11-17 下午4:16:24
 * @Desc 彩种查询
 */
@SuppressWarnings("serial")
public class LotteryTypeVO extends PageVO {

	private Integer id;

	private Integer lotteryCode;

	private String lotteryName;
	@Group({ADD,UPD})
    @NotNull
    @Min(value=0,msg="彩种生成期数")
	private Short conIssueNum;

	private Short stopAddIssue;

	private String lotteryLogoUrl;
	
	/**
	 * 移动端logo
	 */
	private String lotteryLogoMobile;

	private Short adminCategory;

	private Short lotteryCategory;

	private Short saleStatus;
	
	private String platform;

	private String area;

	private Short autoType;

	private Short synIssue;
	
	@Group({ADD,UPD})
    @NotNull(msg="开售时间")
	private Integer saleTime;
	
	@Group({ADD,UPD})
    @NotNull
    @Max(value=-1,msg="截止购买时间")
	private Integer buyEndTime;
    
	private Integer splitMaxNum;
    
	@Group({ADD,UPD})
    @NotNull
    @Max(value=-1,msg="截止后检票时间")
	private Integer endCheckTime;

	private Integer splitMaxAmount;

	private String createBy;

	private String modifyBy;

	private Date modifyTime;

	private String remark;
	
    private String startSailTime;
    
    private String endSailTime;
    
    private String sailDayCycle; 
    
    private String vacations;
    
    private String drawTime;
    
    private String format;
    
    private String comeOutTime;
    
    private Integer orderId;
    
    private Integer minBet;
    
    private Integer mrMultiple;
    
    private Integer minMultiple;
    
	public LotteryTypeVO() {
	}

	/**
	 * @param lotteryCode
	 *            彩种
	 */
	public LotteryTypeVO(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	/**
	 * @param lotteryCode
	 *            彩种
	 * @param lotteryCategory
	 *            彩种类型
	 */
	public LotteryTypeVO(Integer lotteryCode, Short lotteryCategory) {
		this.lotteryCode = lotteryCode;
		this.lotteryCategory = lotteryCategory;
	}

	public String getLotteryName() {
		return lotteryName;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
	}

	public Short getConIssueNum() {
		return conIssueNum;
	}

	public void setConIssueNum(Short conIssueNum) {
		this.conIssueNum = conIssueNum;
	}

	public Short getStopAddIssue() {
		return stopAddIssue;
	}

	public void setStopAddIssue(Short stopAddIssue) {
		this.stopAddIssue = stopAddIssue;
	}

	public String getLotteryLogoUrl() {
		return lotteryLogoUrl;
	}

	public void setLotteryLogoUrl(String lotteryLogoUrl) {
		this.lotteryLogoUrl = lotteryLogoUrl;
	}

	public Short getAdminCategory() {
		return adminCategory;
	}

	public void setAdminCategory(Short adminCategory) {
		this.adminCategory = adminCategory;
	}

	public Short getSaleStatus() {
		return saleStatus;
	}

	public void setSaleStatus(Short saleStatus) {
		this.saleStatus = saleStatus;
	}
	
	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Short getAutoType() {
		return autoType;
	}

	public void setAutoType(Short autoType) {
		this.autoType = autoType;
	}

	public Short getSynIssue() {
		return synIssue;
	}

	public void setSynIssue(Short synIssue) {
		this.synIssue = synIssue;
	}

	public Integer getSaleTime() {
		return saleTime;
	}

	public void setSaleTime(Integer saleTime) {
		this.saleTime = saleTime;
	}

	public Integer getBuyEndTime() {
		return buyEndTime;
	}

	public void setBuyEndTime(Integer buyEndTime) {
		this.buyEndTime = buyEndTime;
	}

	public Integer getSplitMaxNum() {
		return splitMaxNum;
	}

	public void setSplitMaxNum(Integer splitMaxNum) {
		this.splitMaxNum = splitMaxNum;
	}

	public Integer getEndCheckTime() {
		return endCheckTime;
	}

	public void setEndCheckTime(Integer endCheckTime) {
		this.endCheckTime = endCheckTime;
	}

	public Integer getSplitMaxAmount() {
		return splitMaxAmount;
	}

	public void setSplitMaxAmount(Integer splitMaxAmount) {
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

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	

	public Integer getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(Integer lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public Short getLotteryCategory() {
		return lotteryCategory;
	}

	public void setLotteryCategory(Short lotteryCategory) {
		this.lotteryCategory = lotteryCategory;
	}

	public String getStartSailTime() {
		return startSailTime;
	}

	public void setStartSailTime(String startSailTime) {
		this.startSailTime = startSailTime;
	}

	public String getEndSailTime() {
		return endSailTime;
	}

	public void setEndSailTime(String endSailTime) {
		this.endSailTime = endSailTime;
	}

	public String getSailDayCycle() {
		return sailDayCycle;
	}

	public void setSailDayCycle(String sailDayCycle) {
		this.sailDayCycle = sailDayCycle;
	}

	public String getVacations() {
		return vacations;
	}

	public void setVacations(String vacations) {
		this.vacations = vacations;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDrawTime() {
		return drawTime;
	}

	public void setDrawTime(String drawTime) {
		this.drawTime = drawTime;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getComeOutTime() {
		return comeOutTime;
	}

	public void setComeOutTime(String comeOutTime) {
		this.comeOutTime = comeOutTime;
	}

	public String getLotteryLogoMobile() {
		return lotteryLogoMobile;
	}

	public void setLotteryLogoMobile(String lotteryLogoMobile) {
		this.lotteryLogoMobile = lotteryLogoMobile;
	}

	public Integer getMinBet() {
		return minBet;
	}

	public void setMinBet(Integer minBet) {
		this.minBet = minBet;
	}

	public Integer getMrMultiple() {
		return mrMultiple;
	}

	public void setMrMultiple(Integer mrMultiple) {
		this.mrMultiple = mrMultiple;
	}

	public Integer getMinMultiple() {
		return minMultiple;
	}

	public void setMinMultiple(Integer minMultiple) {
		this.minMultiple = minMultiple;
	}
	
	

}

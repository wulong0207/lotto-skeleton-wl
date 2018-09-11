package com.hhly.skeleton.cms.lotterymgr.bo;


import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ReplaceAttribute;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.model.DicDataEnum;




@SuppressWarnings("serial")
public class LotteryIssueExcelBO extends BaseBO {
	
	@ExcelHeader("序号")
	private Integer id;
	@ExcelHeader("彩种期号")
    private String issueCode;
	@ExcelHeader("彩种名称")
    private String lotteryName;
	@ExcelHeader("是否当前期")
	@ReplaceAttribute(DicDataEnum.ISSUE_CURRENT_ISSUE)
    private String currentIssue;
	@ExcelHeader("开始销售时间")
    private String saleTime;
	@ExcelHeader("停止销售时间")
    private String saleEndTime;
	@ExcelHeader("开奖时间")
    private String lotteryTime;
	@ExcelHeader("销售状态")
	@ReplaceAttribute(DicDataEnum.ISSUE_SALE_STATUS)
    private String saleStatus;
	@ExcelHeader("开奖号码")
    private String drawCode;
	@ExcelHeader("修改时间")
    private String updateTime;
	@ExcelHeader("创建时间")
    private String createTime;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIssueCode() {
		return issueCode;
	}

	public void setIssueCode(String issueCode) {
		this.issueCode = issueCode;
	}

	public String getLotteryName() {
		return lotteryName;
	}

	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
	}

	public String getCurrentIssue() {
		return currentIssue;
	}

	public void setCurrentIssue(String currentIssue) {
		this.currentIssue = currentIssue;
	}

	public String getSaleTime() {
		return saleTime;
	}

	public void setSaleTime(String saleTime) {
		this.saleTime = saleTime;
	}

	public String getSaleEndTime() {
		return saleEndTime;
	}

	public void setSaleEndTime(String saleEndTime) {
		this.saleEndTime = saleEndTime;
	}

	public String getLotteryTime() {
		return lotteryTime;
	}

	public void setLotteryTime(String lotteryTime) {
		this.lotteryTime = lotteryTime;
	}

	public String getSaleStatus() {
		return saleStatus;
	}

	public void setSaleStatus(String saleStatus) {
		this.saleStatus = saleStatus;
	}

	public String getDrawCode() {
		return drawCode;
	}

	public void setDrawCode(String drawCode) {
		this.drawCode = drawCode;
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
    
    

}


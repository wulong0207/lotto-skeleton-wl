package com.hhly.skeleton.cms.transmgr.vo;

import java.util.Date;
import java.util.List;

import com.hhly.skeleton.base.vo.PageVO;

/**
 * 用户充值
 * @author wytong
 * @Version 1.0
 * @CreatDate 2017年1月4日 下午6:19:21
 */
public class TransTakenVO extends PageVO{

	private static final long serialVersionUID = -5137354327730510903L;
	private Long id;
	// 系统流水编号
	private String transTakenCode;
	// 第三方流水号
	private String thirdTransNum;
	// 批次号
	private String batchNum;
	// 支付渠道 1：支付宝充值；2：微信支付；3：练练支付；4：百度支付；5：人工充值
	private Integer payChannel;
	// 1：农商银行；2：光大银行；3：交通银行；4：平安银行；5：农业银行；6：中信银行；7：广发银行；8：华夏银行；9：浦发银行；10：民生银行；11：建设银行；12：中国银行；13：工商银行；14：邮储银行；15：招商银行；16：兴业银行；
	private Integer takenBank;
	private Integer searchUserType;
	private String searchUserValue;
	private Integer searchTimeType;
	private Date startTime;
	private Date endTime;
	// 交易状态 1：
	private Integer transStatus;
	// 批次状态； 0：处理失败；1：处理成功
	private Integer batchStatus;
	/**
	 * 新的交易状态
	 */
	private Integer newTransStatus;
	
	// 审核人
	private String reviewBy;
	/**
	 * 操作作，根据不同操作保存到不同字段
	 */
	private String operator;
	
	/**
	 * 导出的银行字典值，不同银行用不同excel模板
	 */
	private Integer excelBank;
	
	private List<Long> ids;
	
	/**
	 * trans_taken
	 */
	private Integer takenType;
	
	/**
	 * 查询提款金额小于 extractAmountLt
	 */
	private Integer extractAmountLt;
	
	/**
	 * 用户实际到帐金额
	 */
	private Double realAmount;
	
	private String createBy;
	
	private String bankCardNum;

	/**
	 * 查询提款金额等于 extractAmountLt
	 */
	private Double extractAmountLtEqual;
	
	public String getTransTakenCode() {
		return transTakenCode;
	}
	public void setTransTakenCode(String transTakenCode) {
		this.transTakenCode = transTakenCode;
	}
	public String getThirdTransNum() {
		return thirdTransNum;
	}
	public void setThirdTransNum(String thirdTransNum) {
		this.thirdTransNum = thirdTransNum;
	}
	public String getBatchNum() {
		return batchNum;
	}
	public void setBatchNum(String batchNum) {
		this.batchNum = batchNum;
	}
	public Integer getPayChannel() {
		return payChannel;
	}
	public void setPayChannel(Integer payChannel) {
		this.payChannel = payChannel;
	}
	public Integer getTakenBank() {
		return takenBank;
	}
	public void setTakenBank(Integer takenBank) {
		this.takenBank = takenBank;
	}
	public Integer getSearchUserType() {
		return searchUserType;
	}
	public void setSearchUserType(Integer searchUserType) {
		this.searchUserType = searchUserType;
	}
	public String getSearchUserValue() {
		return searchUserValue;
	}
	public void setSearchUserValue(String searchUserValue) {
		this.searchUserValue = searchUserValue;
	}
	public Integer getSearchTimeType() {
		return searchTimeType;
	}
	public void setSearchTimeType(Integer searchTimeType) {
		this.searchTimeType = searchTimeType;
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
	public Integer getTransStatus() {
		return transStatus;
	}
	public void setTransStatus(Integer transStatus) {
		this.transStatus = transStatus;
	}
	public Integer getBatchStatus() {
		return batchStatus;
	}
	public void setBatchStatus(Integer batchStatus) {
		this.batchStatus = batchStatus;
	}
	public Integer getNewTransStatus() {
		return newTransStatus;
	}
	public void setNewTransStatus(Integer newTransStatus) {
		this.newTransStatus = newTransStatus;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getReviewBy() {
		return reviewBy;
	}
	public void setReviewBy(String reviewBy) {
		this.reviewBy = reviewBy;
	}
	public Integer getExcelBank() {
		return excelBank;
	}
	public void setExcelBank(Integer excelBank) {
		this.excelBank = excelBank;
	}
	public List<Long> getIds() {
		return ids;
	}
	public void setIds(List<Long> ids) {
		this.ids = ids;
	}
	public Integer getTakenType() {
		return takenType;
	}
	public void setTakenType(Integer takenType) {
		this.takenType = takenType;
	}
	public Integer getExtractAmountLt() {
		return extractAmountLt;
	}
	public void setExtractAmountLt(Integer extractAmountLt) {
		this.extractAmountLt = extractAmountLt;
	}
	public Double getRealAmount() {
		return realAmount;
	}
	public void setRealAmount(Double realAmount) {
		this.realAmount = realAmount;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getBankCardNum() {
		return bankCardNum;
	}
	public void setBankCardNum(String bankCardNum) {
		this.bankCardNum = bankCardNum;
	}
	public Double getExtractAmountLtEqual() {
		return extractAmountLtEqual;
	}
	public void setExtractAmountLtEqual(Double extractAmountLtEqual) {
		this.extractAmountLtEqual = extractAmountLtEqual;
	}
}

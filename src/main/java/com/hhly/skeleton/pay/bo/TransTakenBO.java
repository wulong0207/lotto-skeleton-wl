package com.hhly.skeleton.pay.bo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.pay.vo.TakenFlowVO;

/**
 * @desc 用户提款信息记录表
 * @author xiongjingang
 * @date 2017年3月1日 下午3:13:16
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class TransTakenBO extends BaseBO {

	private static final long serialVersionUID = 1728881085812204831L;
	/**
	 *自增长ID
	 */
	private Integer id;
	/**
	*自定义用户充值流水编号
	*/
	private String transTakenCode;
	/**
	*1、支付宝充值；2、微信支付；3、连连支付；4、百度支付；5、人工充值；6、易宝支付；7、代理系统充值；8、聚合支付；9、现在支付；10、神州支付；11、掌易付支付；12、威富通支付；13、兴业银行
	*在PayConstants.PayChannelEnum中查看
	*/
	private Short payChannel;
	/**
	 *充值渠道名称
	 */
	@JsonProperty("p_c_n")
	private String payChannelName;
	/**
	* 提款银行ID
	*/
	private Integer takenBank;
	/**
	* 提款银行名称
	*/
	@JsonProperty("t_b_n")
	private String takenBankName;
	/**
	*银行卡号
	*/
	private String bankCardNum;
	/**
	*审核时间
	*/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date reviewTime;
	/**
	*汇款时间
	*/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date remitTime;
	/**
	*到账时间
	*/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date arrivalTime;
	/**
	*银行处理时间
	*/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date dealTime;
	/**
	*下发时间
	*/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date sendDownTime;
	/**
	*分支行信息
	*/
	private String bankInfo;
	/**
	*用户ID
	*/
	@JsonIgnore
	private Integer userId;
	/**
	*提款金额
	*/
	private Double extractAmount;
	/**
	*服务费
	*/
	private Double serviceCharge;
	/**
	*审核人
	*/
	private String reviewBy;
	/**
	*银行交易凭证
	*/
	@JsonIgnore
	private String transCert;
	/**
	*交易失败原因
	*/
	private String transFailInfo;
	/**
	*1审核通过; 2审核不通过; 3银行处理成功; 4银行处理失败; 5已到帐;6待审核;7银行处理中
	*/
	private Short transStatus;
	/**
	*提款状态名称
	*/
	@JsonProperty("t_s_n")
	private String transStatusName;
	/**
	*1：本站WEB；2：本站WAP；3：Android客户端；4：IOS客户端；5：未知；
	*/
	private Short takenPlatform;
	/**
	*市场渠道ID
	*/
	private String channelId;
	/**
	*第三方流水号
	*/
	private String thirdTransNum;
	/**
	*批次号
	*/
	@JsonIgnore
	private String batchNum;
	/**
	*批次状态； 0：处理失败；1：处理成功
	*/
	@JsonIgnore
	private Short batchStatus;
	/**
	*银行返回信息描述
	*/
	private String bankReturnInfo;
	/**
	*修改时间
	*/
	@JsonIgnore
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date modifyTime;
	/**
	*修改人
	*/
	@JsonIgnore
	private String modifyBy;
	/**
	*创建人
	*/
	private String createBy;
	/**
	*更新时间
	*/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date updateTime;
	/**
	*创建时间
	*/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;
	/**
	*描述
	*/
	private String remark;
	/**
	 *用户实际到账金额（提款金额-提款手续费）
	 */
	private Double realAmount;
	/**
	 *提款次数，一天只能提3次
	 */
	@JsonIgnore
	private Short takenTimes;
	/**
	 * 提款分类:1正常提款 2原路返回
	 */
	@JsonIgnore
	private Short takenType;
	/**
	 * 充值编号
	 */
	private String transRechargeCode;
	/**
	 * 提款流程
	 */
	private List<TakenFlowVO> flowList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTransTakenCode() {
		return transTakenCode;
	}

	public void setTransTakenCode(String transTakenCode) {
		this.transTakenCode = transTakenCode;
	}

	public Short getPayChannel() {
		return payChannel;
	}

	public void setPayChannel(Short payChannel) {
		this.payChannel = payChannel;
	}

	public Integer getTakenBank() {
		return takenBank;
	}

	public void setTakenBank(Integer takenBank) {
		this.takenBank = takenBank;
	}

	public String getBankCardNum() {
		return bankCardNum;
	}

	public void setBankCardNum(String bankCardNum) {
		this.bankCardNum = bankCardNum;
	}

	public Date getReviewTime() {
		return reviewTime;
	}

	public void setReviewTime(Date reviewTime) {
		this.reviewTime = reviewTime;
	}

	public Date getRemitTime() {
		return remitTime;
	}

	public void setRemitTime(Date remitTime) {
		this.remitTime = remitTime;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Date getDealTime() {
		return dealTime;
	}

	public void setDealTime(Date dealTime) {
		this.dealTime = dealTime;
	}

	public Date getSendDownTime() {
		return sendDownTime;
	}

	public void setSendDownTime(Date sendDownTime) {
		this.sendDownTime = sendDownTime;
	}

	public String getBankInfo() {
		return bankInfo;
	}

	public void setBankInfo(String bankInfo) {
		this.bankInfo = bankInfo;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Double getExtractAmount() {
		return extractAmount;
	}

	public void setExtractAmount(Double extractAmount) {
		this.extractAmount = extractAmount;
	}

	public Double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(Double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public String getReviewBy() {
		return reviewBy;
	}

	public void setReviewBy(String reviewBy) {
		this.reviewBy = reviewBy;
	}

	public String getTransCert() {
		return transCert;
	}

	public void setTransCert(String transCert) {
		this.transCert = transCert;
	}

	public String getTransFailInfo() {
		return transFailInfo;
	}

	public void setTransFailInfo(String transFailInfo) {
		this.transFailInfo = transFailInfo;
	}

	public Short getTransStatus() {
		return transStatus;
	}

	public void setTransStatus(Short transStatus) {
		this.transStatus = transStatus;
	}

	public Short getTakenPlatform() {
		return takenPlatform;
	}

	public void setTakenPlatform(Short takenPlatform) {
		this.takenPlatform = takenPlatform;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
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

	public Short getBatchStatus() {
		return batchStatus;
	}

	public void setBatchStatus(Short batchStatus) {
		this.batchStatus = batchStatus;
	}

	public String getBankReturnInfo() {
		return bankReturnInfo;
	}

	public void setBankReturnInfo(String bankReturnInfo) {
		this.bankReturnInfo = bankReturnInfo;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Double getRealAmount() {
		return realAmount;
	}

	public void setRealAmount(Double realAmount) {
		this.realAmount = realAmount;
	}

	public Short getTakenTimes() {
		return takenTimes;
	}

	public void setTakenTimes(Short takenTimes) {
		this.takenTimes = takenTimes;
	}

	public Short getTakenType() {
		return takenType;
	}

	public void setTakenType(Short takenType) {
		this.takenType = takenType;
	}

	public String getTransRechargeCode() {
		return transRechargeCode;
	}

	public void setTransRechargeCode(String transRechargeCode) {
		this.transRechargeCode = transRechargeCode;
	}

	public String getPayChannelName() {
		return payChannelName;
	}

	public void setPayChannelName(String payChannelName) {
		this.payChannelName = payChannelName;
	}

	public String getTakenBankName() {
		return takenBankName;
	}

	public void setTakenBankName(String takenBankName) {
		this.takenBankName = takenBankName;
	}

	public String getTransStatusName() {
		return transStatusName;
	}

	public void setTransStatusName(String transStatusName) {
		this.transStatusName = transStatusName;
	}

	public List<TakenFlowVO> getFlowList() {
		return flowList;
	}

	public void setFlowList(List<TakenFlowVO> flowList) {
		this.flowList = flowList;
	}

}

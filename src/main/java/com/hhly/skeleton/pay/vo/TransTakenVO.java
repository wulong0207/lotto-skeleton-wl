package com.hhly.skeleton.pay.vo;

import java.io.Serializable;

/**
 * @desc 用户提款信息记录表
 * @author xiongjingang
 * @date 2017年3月9日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class TransTakenVO implements Serializable {

	private static final long serialVersionUID = -4175401171515750813L;
	/**
	 * 用户登录token
	 */
	private String token;
	/**
	*1：支付宝充值；2：微信支付；3：练练支付；4：百度支付；5：人工充值
	*/
	private Short payChannel;
	/**
	*1：农商银行；2：光大银行；3：交通银行；4：平安银行；5：农业银行；6：中信银行；7：广发银行；8：华夏银行；9：浦发银行；10：民生银行；11：建设银行；12：中国银行；13：工商银行；14：邮储银行；15：招商银行；16：兴业银行；
	*/
	private Integer takenBank;
	/**
	*银行卡号
	*/
	private String bankCardNum;
	/**
	*分支行信息
	*/
	private String bankInfo;
	/**
	*用户ID
	*/
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
	*1：进行中；2：交易成功；3：交易失败；4：订单已关闭；
	*/
	private Short transStatus;
	/**
	*1：本站WEB；2：本站WAP；3：Android客户端；4：IOS客户端；5：未知；
	*/
	private Short takenPlatform;
	/**
	*市场渠道ID
	*/
	private String channelId;
	/**
	*批次号
	*/
	private String batchNum;
	/**
	*批次状态； 0：处理失败；1：处理成功
	*/
	private Short batchStatus;
	/**
	*银行返回信息描述
	*/
	private String bankReturnInfo;
	/**
	*创建人
	*/
	private String createBy;
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
	private Short takenTimes;
	/**
	 * 提款分类:1正常提款 2原路返回
	 */
	private Short takenType;
	/**
	 * 充值编号
	 */
	private String transRechargeCode;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
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

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
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

	@Override
	public String toString() {
		return "TransTakenVO [token=" + token + ", payChannel=" + payChannel + ", takenBank=" + takenBank + ", bankCardNum=" + bankCardNum + ", bankInfo=" + bankInfo + ", userId=" + userId + ", extractAmount=" + extractAmount + ", serviceCharge="
				+ serviceCharge + ", transStatus=" + transStatus + ", takenPlatform=" + takenPlatform + ", channelId=" + channelId + ", batchNum=" + batchNum + ", batchStatus=" + batchStatus + ", bankReturnInfo=" + bankReturnInfo + ", createBy="
				+ createBy + ", remark=" + remark + "]";
	}

}
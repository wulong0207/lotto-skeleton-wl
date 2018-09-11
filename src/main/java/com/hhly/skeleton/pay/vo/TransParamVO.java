package com.hhly.skeleton.pay.vo;

import java.io.Serializable;
import java.util.Date;

import com.hhly.skeleton.base.constants.PayConstants.UserTransTimeTypeEnum;

/**
 * @desc 用户交易查询条件
 * @author xiongjingang
 * @date 2017年3月3日 上午10:33:54
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class TransParamVO extends BasePageVo implements Serializable {
	private static final long serialVersionUID = 3831146338535936658L;
	private String token;// 用户登录的token
	private Short moneyFlow;// 资金流向【 1收入、2支出 】
	private Short tradeType;// 交易类型 【 1：充值；2：购彩；3：返奖；4：退款；5：提款；6：其它】
	private Short transStatus;// 交易状态 0：交易失败；1：交易成功；
	private String transCode;// 交易编号
	private Short timeType;// 时间类型 【1创建时间、2交易时间。默认创建时间】
	private Date startDate;// 查询开始时间
	private Date endDate;// 查询结束时间

	/**下面几个参数客户端不用关心*/
	private Integer userId;// 用户ID
	private Object[] tradeTypes;
	private String rechargePlatform;// 充值平台
	private String thirdTransNum;// 第三方交易流水号
	private Short takenStatus;// 提款状态。是否可提款状态:0不可提、1可提 、2已提
	private Object[] excludeChannels;// 需要排除的充值渠道
	private Integer id;// 交易流水Id
	private Integer totalNum;// 总数量
	private Integer oldShowCount;// 原始显示数量
	private Short platform;// 平台

	@Override
	public String toString() {
		return "TransParamVO [token=" + token + ", moneyFlow=" + moneyFlow + ", tradeType=" + tradeType + ", transStatus=" + transStatus + ", transCode=" + transCode + ", timeType=" + timeType + ", startDate=" + startDate + ", endDate=" + endDate
				+ "]";
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Short getMoneyFlow() {
		return moneyFlow;
	}

	public void setMoneyFlow(Short moneyFlow) {
		this.moneyFlow = moneyFlow;
	}

	public Short getTradeType() {
		return tradeType;
	}

	public void setTradeType(Short tradeType) {
		this.tradeType = tradeType;
	}

	public Short getTransStatus() {
		return transStatus;
	}

	public void setTransStatus(Short transStatus) {
		this.transStatus = transStatus;
	}

	public String getTransCode() {
		return transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public Short getTimeType() {
		if (!UserTransTimeTypeEnum.containsKey(timeType)) {
			timeType = UserTransTimeTypeEnum.CREATE_TIME.getKey();
		}
		return timeType;
	}

	public void setTimeType(Short timeType) {
		this.timeType = timeType;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Object[] getTradeTypes() {
		return tradeTypes;
	}

	public void setTradeTypes(Object[] tradeTypes) {
		this.tradeTypes = tradeTypes;
	}

	public String getRechargePlatform() {
		return rechargePlatform;
	}

	public void setRechargePlatform(String rechargePlatform) {
		this.rechargePlatform = rechargePlatform;
	}

	public String getThirdTransNum() {
		return thirdTransNum;
	}

	public void setThirdTransNum(String thirdTransNum) {
		this.thirdTransNum = thirdTransNum;
	}

	public Short getTakenStatus() {
		return takenStatus;
	}

	public void setTakenStatus(Short takenStatus) {
		this.takenStatus = takenStatus;
	}

	public Object[] getExcludeChannels() {
		return excludeChannels;
	}

	public void setExcludeChannels(Object[] excludeChannels) {
		this.excludeChannels = excludeChannels;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public Integer getOldShowCount() {
		return oldShowCount;
	}

	public void setOldShowCount(Integer oldShowCount) {
		this.oldShowCount = oldShowCount;
	}

	public Short getPlatform() {
		return platform;
	}

	public void setPlatform(Short platform) {
		this.platform = platform;
	}

}

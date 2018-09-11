package com.hhly.skeleton.pay.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 运营管理的优惠券详情（彩金）
 * @author xiongJinGang
 * @date 2017年3月21日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OperateCouponSimpleBO extends BaseBO {
	private static final long serialVersionUID = 350946965937240309L;
	@JsonProperty("r_c")
	private String redCode;// 自定义编号
	@JsonProperty("r_t")
	private Short redType;// 1：充值优惠；2：消费折扣；3：彩金红包；4：加奖红包；5：大礼包；6：随机红包
	@JsonProperty("r_n")
	private String redName;// 红包名称；按照指定规则生成；根据红包类型，红包面额，最低消费生成红包名称。
	@JsonProperty("r_v")
	private Double redValue;// 红包实际金额
	@JsonProperty("r_b")
	private Double redBalance;// 红包余额
	@JsonProperty("m_s_a")
	private Integer minSpendAmount;// 最低消费金额 使用红包的条件。根据订单金额计算。
	@JsonProperty("r_l")
	private String redLabel;// 可自定义的红包标签。
	@JsonProperty("r_s")
	private String redStatus;// 0 不可使用 1：可使用
	@JsonProperty("r_o_t")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date redOverdueTime;// 获取时间+有效天数 = 红包过期时间。
	@JsonProperty("o_t_t")
	private String overdueTimeTips;// 有效期至2016.04.10
	@JsonProperty("u_t")
	private String useTips;// 使用提示。此订单还差26元可用。
	@JsonProperty("r_r")
	private String redRemark;// 红包说明。满100减20、充100送20
	@JsonProperty("s_t_e")
	private String soonToExpire;// 是否即将到期 1是
	@JsonIgnore
	private Integer sort;//排序，越小越靠前  从0开始

	public OperateCouponSimpleBO() {
		super();
	}

	public OperateCouponSimpleBO(OperateCouponBO operateCouponBO) {
		super();
		this.redCode = operateCouponBO.getRedCode();
		this.redType = operateCouponBO.getRedType();
		this.redName = operateCouponBO.getRedName();
		this.redValue = operateCouponBO.getRedValue();
		this.redBalance = operateCouponBO.getRedBalance();
		this.minSpendAmount = operateCouponBO.getMinSpendAmount();
		this.redLabel = operateCouponBO.getRedLabel();
		this.redStatus = operateCouponBO.getRedStatus();
		this.redOverdueTime = operateCouponBO.getRedOverdueTime();
	}

	public String getRedCode() {
		return redCode;
	}

	public void setRedCode(String redCode) {
		this.redCode = redCode;
	}

	public Short getRedType() {
		return redType;
	}

	public void setRedType(Short redType) {
		this.redType = redType;
	}

	public String getRedName() {
		return redName;
	}

	public void setRedName(String redName) {
		this.redName = redName;
	}

	public Double getRedValue() {
		return redValue;
	}

	public void setRedValue(Double redValue) {
		this.redValue = redValue;
	}

	public Double getRedBalance() {
		return redBalance;
	}

	public void setRedBalance(Double redBalance) {
		this.redBalance = redBalance;
	}

	public String getRedLabel() {
		return redLabel;
	}

	public void setRedLabel(String redLabel) {
		this.redLabel = redLabel;
	}

	public String getRedStatus() {
		return redStatus;
	}

	public void setRedStatus(String redStatus) {
		this.redStatus = redStatus;
	}

	public Date getRedOverdueTime() {
		return redOverdueTime;
	}

	public void setRedOverdueTime(Date redOverdueTime) {
		this.redOverdueTime = redOverdueTime;
	}

	public String getOverdueTimeTips() {
		return overdueTimeTips;
	}

	public void setOverdueTimeTips(String overdueTimeTips) {
		this.overdueTimeTips = overdueTimeTips;
	}

	public String getUseTips() {
		return useTips;
	}

	public void setUseTips(String useTips) {
		this.useTips = useTips;
	}

	public Integer getMinSpendAmount() {
		return minSpendAmount;
	}

	public void setMinSpendAmount(Integer minSpendAmount) {
		this.minSpendAmount = minSpendAmount;
	}

	public String getRedRemark() {
		return redRemark;
	}

	public void setRedRemark(String redRemark) {
		this.redRemark = redRemark;
	}

	public String getSoonToExpire() {
		return soonToExpire;
	}

	public void setSoonToExpire(String soonToExpire) {
		this.soonToExpire = soonToExpire;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

}
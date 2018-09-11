package com.hhly.skeleton.cms.report.bo;

import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;

@SuppressWarnings("serial")
public class ReportLogBO extends BaseBO {
    private Long id;
    //日期
    private Date dt;
    //用户id
    private Long userId;
    //用户名
    private String userName;
    //类型  1充值 2投注 3中奖
    private Integer type;
    //1：代购；2：追加；3：合买
    private Integer flag;
    //充值金额
    private Double fillAmount;
    //投注金额
    private Double orderAmount;
    //中奖金额
    private Double winningAmount;
    //注册渠道
    private String channelId;
    //投注平台
    private Integer platform;
    //彩种id
    private Integer lotteryCode;
    //彩种类型
    private Integer lotteryType;
    //子玩法id
    private Integer childCode;
    //子玩法名称
    private String childName;
    //彩种名称
    private String lotteryName;

    private String code;
    
    private Integer times;
    //充值渠道
    private Integer rechargeChannel;
    //支付类型
    private Integer payType;
    //充值银行
    private Integer rechargeBank;
    
    /**
     * 查询的记录数量
     */
    private Integer count;
    
    /**
     * 去重后的用户数量
     */
    private Integer distinctUserCount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public Double getFillAmount() {
		return fillAmount;
	}

	public void setFillAmount(Double fillAmount) {
		this.fillAmount = fillAmount;
	}

	public Double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Double getWinningAmount() {
		return winningAmount;
	}

	public void setWinningAmount(Double winningAmount) {
		this.winningAmount = winningAmount;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public Integer getPlatform() {
		return platform;
	}

	public void setPlatform(Integer platform) {
		this.platform = platform;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public Integer getLotteryType() {
		return lotteryType;
	}

	public void setLotteryType(Integer lotteryType) {
		this.lotteryType = lotteryType;
	}

	public Integer getChildCode() {
		return childCode;
	}

	public void setChildCode(Integer childCode) {
		this.childCode = childCode;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getTimes() {
		return times;
	}

	public void setTimes(Integer times) {
		this.times = times;
	}

	public Integer getRechargeChannel() {
		return rechargeChannel;
	}

	public void setRechargeChannel(Integer rechargeChannel) {
		this.rechargeChannel = rechargeChannel;
	}

	public Integer getPayType() {
		return payType;
	}

	public void setPayType(Integer payType) {
		this.payType = payType;
	}

	public Integer getRechargeBank() {
		return rechargeBank;
	}

	public void setRechargeBank(Integer rechargeBank) {
		this.rechargeBank = rechargeBank;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getDistinctUserCount() {
		return distinctUserCount;
	}

	public void setDistinctUserCount(Integer distinctUserCount) {
		this.distinctUserCount = distinctUserCount;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}

	public String getLotteryName() {
		return lotteryName;
	}

	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
	}
	
}
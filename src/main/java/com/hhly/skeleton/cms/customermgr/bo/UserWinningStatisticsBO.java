package com.hhly.skeleton.cms.customermgr.bo;

import com.hhly.skeleton.base.bo.BaseBO;
/**
 * 
 * @desc 用户中奖信息
 * @author jiangwei
 * @date 2017年4月24日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class UserWinningStatisticsBO extends BaseBO{
    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 会员账号
     */
    private String accountName;

    /**
     * 彩种编号
     */
    private String lotteryName;
    
    /**
     * 会员昵称
     */
    private String nickName;

    /**
     * 战绩
     */
    private Integer score;

    /**
     * (代购)购买总金额
     */
    private Double agentBuyMoney;

    /**
     * (代购)总次数
     */
    private Integer agentBuyTimes;

    /**
     * (代购)中奖总金额
     */
    private Double agentWinningMoney;

    /**
     * (代购)中奖总次数
     */
    private Integer agentWinningTimes;

    /**
     * (合买)发单总金额
     */
    private Double joinCreateMoney;

    /**
     * (合买)发单总次数
     */
    private Integer joinCreateTimes;

    /**
     * (合买)成功总次数
     */
    private Integer joinSuccessTimes;

    /**
     * (合买)中奖总金额
     */
    private Double joinWinningMoney;

    /**
     * (合买)中奖总次数
     */
    private Integer joinWinningTimes;

    /**
     * (合买)实购总金额
     */
    private Double joinBuyMoney;

    /**
     * (合买)实收入总金额
     */
    private Double joinIncomeMoney;

    /**
     * (合买)成功中奖总次数
     */
    private Integer joinSuccessWinningTimes;

    /**
     * (跟单)跟单总金额
     */
    private Double followBuyMoney;

    /**
     * (跟单)跟单总次数
     */
    private Integer followBuyTimes;

    /**
     * (跟单)成功总次数
     */
    private Integer followSuccessTimes;

    /**
     * (跟单)中奖总金额
     */
    private Double followWinningMoney;

    /**
     * (跟单)中奖总次数
     */
    private Integer followWinningTimes;

    /**
     * (跟单)实收总金额
     */
    private Double followIncomeMoney;

    /**
     * (跟单)成功中奖总次数
     */
    private Integer followSuccessWinningTimes;

    /**
     * (追号)追号总金额
     */
    private Double addBuyMoney;

    /**
     * (追号)追号总次数
     */
    private Integer addBuyTimes;

    /**
     * (追号)中奖总金额
     */
    private Double addWinningMoney;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getLotteryName() {
		return lotteryName;
	}

	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Double getAgentBuyMoney() {
		return agentBuyMoney;
	}

	public void setAgentBuyMoney(Double agentBuyMoney) {
		this.agentBuyMoney = agentBuyMoney;
	}

	public Integer getAgentBuyTimes() {
		return agentBuyTimes;
	}

	public void setAgentBuyTimes(Integer agentBuyTimes) {
		this.agentBuyTimes = agentBuyTimes;
	}

	public Double getAgentWinningMoney() {
		return agentWinningMoney;
	}

	public void setAgentWinningMoney(Double agentWinningMoney) {
		this.agentWinningMoney = agentWinningMoney;
	}

	public Integer getAgentWinningTimes() {
		return agentWinningTimes;
	}

	public void setAgentWinningTimes(Integer agentWinningTimes) {
		this.agentWinningTimes = agentWinningTimes;
	}

	public Double getJoinCreateMoney() {
		return joinCreateMoney;
	}

	public void setJoinCreateMoney(Double joinCreateMoney) {
		this.joinCreateMoney = joinCreateMoney;
	}

	public Integer getJoinCreateTimes() {
		return joinCreateTimes;
	}

	public void setJoinCreateTimes(Integer joinCreateTimes) {
		this.joinCreateTimes = joinCreateTimes;
	}

	public Integer getJoinSuccessTimes() {
		return joinSuccessTimes;
	}

	public void setJoinSuccessTimes(Integer joinSuccessTimes) {
		this.joinSuccessTimes = joinSuccessTimes;
	}

	public Double getJoinWinningMoney() {
		return joinWinningMoney;
	}

	public void setJoinWinningMoney(Double joinWinningMoney) {
		this.joinWinningMoney = joinWinningMoney;
	}

	public Integer getJoinWinningTimes() {
		return joinWinningTimes;
	}

	public void setJoinWinningTimes(Integer joinWinningTimes) {
		this.joinWinningTimes = joinWinningTimes;
	}

	public Double getJoinBuyMoney() {
		return joinBuyMoney;
	}

	public void setJoinBuyMoney(Double joinBuyMoney) {
		this.joinBuyMoney = joinBuyMoney;
	}

	public Double getJoinIncomeMoney() {
		return joinIncomeMoney;
	}

	public void setJoinIncomeMoney(Double joinIncomeMoney) {
		this.joinIncomeMoney = joinIncomeMoney;
	}

	public Integer getJoinSuccessWinningTimes() {
		return joinSuccessWinningTimes;
	}

	public void setJoinSuccessWinningTimes(Integer joinSuccessWinningTimes) {
		this.joinSuccessWinningTimes = joinSuccessWinningTimes;
	}

	public Double getFollowBuyMoney() {
		return followBuyMoney;
	}

	public void setFollowBuyMoney(Double followBuyMoney) {
		this.followBuyMoney = followBuyMoney;
	}

	public Integer getFollowBuyTimes() {
		return followBuyTimes;
	}

	public void setFollowBuyTimes(Integer followBuyTimes) {
		this.followBuyTimes = followBuyTimes;
	}

	public Integer getFollowSuccessTimes() {
		return followSuccessTimes;
	}

	public void setFollowSuccessTimes(Integer followSuccessTimes) {
		this.followSuccessTimes = followSuccessTimes;
	}

	public Double getFollowWinningMoney() {
		return followWinningMoney;
	}

	public void setFollowWinningMoney(Double followWinningMoney) {
		this.followWinningMoney = followWinningMoney;
	}

	public Integer getFollowWinningTimes() {
		return followWinningTimes;
	}

	public void setFollowWinningTimes(Integer followWinningTimes) {
		this.followWinningTimes = followWinningTimes;
	}

	public Double getFollowIncomeMoney() {
		return followIncomeMoney;
	}

	public void setFollowIncomeMoney(Double followIncomeMoney) {
		this.followIncomeMoney = followIncomeMoney;
	}

	public Integer getFollowSuccessWinningTimes() {
		return followSuccessWinningTimes;
	}

	public void setFollowSuccessWinningTimes(Integer followSuccessWinningTimes) {
		this.followSuccessWinningTimes = followSuccessWinningTimes;
	}

	public Double getAddBuyMoney() {
		return addBuyMoney;
	}

	public void setAddBuyMoney(Double addBuyMoney) {
		this.addBuyMoney = addBuyMoney;
	}

	public Integer getAddBuyTimes() {
		return addBuyTimes;
	}

	public void setAddBuyTimes(Integer addBuyTimes) {
		this.addBuyTimes = addBuyTimes;
	}

	public Double getAddWinningMoney() {
		return addWinningMoney;
	}

	public void setAddWinningMoney(Double addWinningMoney) {
		this.addWinningMoney = addWinningMoney;
	}

    
}
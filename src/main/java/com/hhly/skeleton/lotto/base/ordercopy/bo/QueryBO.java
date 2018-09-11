package com.hhly.skeleton.lotto.base.ordercopy.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhly.skeleton.base.bo.BaseBO;
/**
 * 抄单实单综合查询 BO
 * @author longguoyou
 * @date 2017年9月23日
 * @compay 益彩网络科技有限公司
 */
public class QueryBO extends BaseBO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String orderCode;//订单编号
	private Integer orderAmount;//订单金额
	@JsonIgnore
	private Double maxRoiDb;
	private String maxRoi;//最高回报率
	/** //跟单人数 数据库查出来的*/
	@JsonIgnore
	private Integer followNum;
	/** 前端使用*/
	private String followNumStr;
	private Integer isTop;//是否置顶
	private Integer isRecommend;//是否推荐
    private String recentRecord;//最近战况
    private String hitRate;//命中率
    @JsonIgnore
    private Double hitRateDb;
    private Integer level;//专家级别 
    private String headUrl;//用户头像地址
    private Integer issueTotal;//实单总数
	@JsonProperty("endLocalTime")
    private Date endTimeDb;//本站截止时间
    private String endTime;
    private Integer continueHitDb;//连红数，连续命中
    private String continueHit;//UI
    private Integer orderVisibleType;//是否可见
    @JsonIgnore
    private Date createTime;//发单时间
    private String createTimeStr;
    private String passway;//过关方式
    private String nickName;//昵称
    private Integer winStatus;//中奖情况
    private Integer userIssueId;//发单用户主键ID
    
    @JsonIgnore
    private String betContent;//订单对应订单详情的投注内容
	/**
	 * 发单类型
	 */
	private Integer issueType;
	/**
	 * 最早截止的对阵名称 如：火箭_勇士
	 */
	@JsonIgnore
	private String beginTeamName;
	/**
	 * 主队名称
	 */
	private String homeTeamName;
	/**
	 * 客队名称
	 */
	private String guestTeamName;
	/**
	 * 推荐理由
	 */
	private String recommendReason;
	/**
	 * 彩种
	 */
	private Integer lotteryCode;

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getRecommendReason() {
		return recommendReason;
	}

	public void setRecommendReason(String recommendReason) {
		this.recommendReason = recommendReason;
	}

	public String getHomeTeamName() {
		return homeTeamName;
	}

	public void setHomeTeamName(String homeTeamName) {
		this.homeTeamName = homeTeamName;
	}

	public String getGuestTeamName() {
		return guestTeamName;
	}

	public void setGuestTeamName(String guestTeamName) {
		this.guestTeamName = guestTeamName;
	}

	public Integer getIssueType() {
		return issueType;
	}

	public void setIssueType(Integer issueType) {
		this.issueType = issueType;
	}

	public String getBeginTeamName() {
		return beginTeamName;
	}

	public void setBeginTeamName(String beginTeamName) {
		this.beginTeamName = beginTeamName;
	}

	public String getBetContent() {
		return betContent;
	}
	public void setBetContent(String betContent) {
		this.betContent = betContent;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public Integer getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(Integer orderAmount) {
		this.orderAmount = orderAmount;
	}
	
	public Double getMaxRoiDb() {
		return maxRoiDb;
	}
	public void setMaxRoiDb(Double maxRoiDb) {
		this.maxRoiDb = maxRoiDb;
	}
	public String getMaxRoi() {
		return maxRoi;
	}
	public void setMaxRoi(String maxRoi) {
		this.maxRoi = maxRoi;
	}
	public Integer getFollowNum() {
		return followNum;
	}
	public void setFollowNum(Integer followNum) {
		this.followNum = followNum;
	}
	public String getFollowNumStr() {
		return followNumStr;
	}
	public void setFollowNumStr(String followNumStr) {
		this.followNumStr = followNumStr;
	}
	public Integer getIsTop() {
		return isTop;
	}
	public void setIsTop(Integer isTop) {
		this.isTop = isTop;
	}
	public Integer getIsRecommend() {
		return isRecommend;
	}
	public void setIsRecommend(Integer isRecommend) {
		this.isRecommend = isRecommend;
	}
	public String getRecentRecord() {
		return recentRecord;
	}
	public void setRecentRecord(String recentRecord) {
		this.recentRecord = recentRecord;
	}
	public String getHitRate() {
		return hitRate;
	}
	public void setHitRate(String hitRate) {
		this.hitRate = hitRate;
	}
	public Double getHitRateDb() {
		return hitRateDb;
	}
	public void setHitRateDb(Double hitRateDb) {
		this.hitRateDb = hitRateDb;
	}
	public Integer getLevel() {
		return level;
	}
	public void setLevel(Integer level) {
		this.level = level;
	}
	public String getHeadUrl() {
		return headUrl;
	}
	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}
	public Integer getIssueTotal() {
		return issueTotal;
	}
	public void setIssueTotal(Integer issueTotal) {
		this.issueTotal = issueTotal;
	}
	public Date getEndTimeDb() {
		return endTimeDb;
	}
	public void setEndTimeDb(Date endTimeDb) {
		this.endTimeDb = endTimeDb;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public Integer getContinueHitDb() {
		return continueHitDb;
	}
	public void setContinueHitDb(Integer continueHitDb) {
		this.continueHitDb = continueHitDb;
	}
	public String getContinueHit() {
		return continueHit;
	}
	public void setContinueHit(String continueHit) {
		this.continueHit = continueHit;
	}
	public Integer getOrderVisibleType() {
		return orderVisibleType;
	}
	public void setOrderVisibleType(Integer orderVisibleType) {
		this.orderVisibleType = orderVisibleType;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getCreateTimeStr() {
		return createTimeStr;
	}
	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}
	public String getPassway() {
		return passway;
	}
	public void setPassway(String passway) {
		this.passway = passway;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Integer getWinStatus() {
		return winStatus;
	}
	public void setWinStatus(Integer winStatus) {
		this.winStatus = winStatus;
	}
	public Integer getUserIssueId() {
		return userIssueId;
	}
	public void setUserIssueId(Integer userIssueId) {
		this.userIssueId = userIssueId;
	}
}

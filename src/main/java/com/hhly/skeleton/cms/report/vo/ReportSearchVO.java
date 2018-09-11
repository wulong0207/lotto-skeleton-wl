package com.hhly.skeleton.cms.report.vo;

import java.util.Date;
import java.util.List;

import com.hhly.skeleton.base.vo.PageVO;

/**
 * 
* @Description: 报表数据查询参数 
* @author HouXiangBao289
* @date 2017年8月16日 下午2:10:55 
* @version V1.0.0
 */
@SuppressWarnings("serial")
public class ReportSearchVO extends PageVO{
	private Integer timeType;
	//注册渠道
	private String channel;
	//开始时间
	private Date startTime;
	//结束时间
	private Date endTime;
	// 投注平台
	private Integer platform;
	
	//支付渠道
	private Integer payChannel;
	//注册渠道，包含子渠道
	private String[] channelIds;
	
	// 大客户投注最低金额
	private Integer maxMoney;

	public String[] getChannelIds() {
		return channelIds;
	}
	public void setChannelIds(String[] channelIds) {
		this.channelIds = channelIds;
	}
	/**
	 * 多个渠道
	 * 当选择"本站移动端"转成"ios\andorid\wap",作 not in (x,x,x)查询
	 */
	private String[] negativeChannelIds;
	//彩种编码
	private Integer lotteryCode;
	//彩种类型   1：数字彩；2：高频彩；3：竞彩
	private Integer lotteryType;
	
	// 1：充值；2：投注；3：中奖
	private Integer type;
	
	private List<Integer> types;
	// 1：代购；2：追加；3：合买
	private Integer flag;
	
	private ReportLogVO reportUser;
	
	// 充值或投注或中奖次数
	private Integer times;
	
	private List<Long> userIds;
	
	private ReportLogVO log;
	
	private ReportLotteryChildVO child;
	private ReportLotteryTypeVO lotteryTypeVO;
	//用户名
	private String userName;
	
	private List<Integer> lotteryCodes;

	public Integer getMaxMoney() {
		return maxMoney;
	}
	public void setMaxMoney(Integer maxMoney) {
		this.maxMoney = maxMoney;
	}
	public Integer getTimeType() {
		return timeType;
	}
	public void setTimeType(Integer timeType) {
		this.timeType = timeType;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
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
	public Integer getPlatform() {
		return platform;
	}
	public void setPlatform(Integer platform) {
		this.platform = platform;
	}
	public ReportLogVO getReportUser() {
		return reportUser;
	}
	public void setReportUser(ReportLogVO reportUser) {
		this.reportUser = reportUser;
	}
	public Integer getPayChannel() {
		return payChannel;
	}
	public void setPayChannel(Integer payChannel) {
		this.payChannel = payChannel;
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
	public String[] getNegativeChannelIds() {
		return negativeChannelIds;
	}
	public void setNegativeChannelIds(String[] negativeChannelIds) {
		this.negativeChannelIds = negativeChannelIds;
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
	public ReportLogVO getLog() {
		return log;
	}
	public void setLog(ReportLogVO log) {
		this.log = log;
	}
	public Integer getTimes() {
		return times;
	}
	public void setTimes(Integer times) {
		this.times = times;
	}
	public List<Long> getUserIds() {
		return userIds;
	}
	public void setUserIds(List<Long> userIds) {
		this.userIds = userIds;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public ReportLotteryChildVO getChild() {
		return child;
	}
	public void setChild(ReportLotteryChildVO child) {
		this.child = child;
	}
	public List<Integer> getLotteryCodes() {
		return lotteryCodes;
	}
	public void setLotteryCodes(List<Integer> lotteryCodes) {
		this.lotteryCodes = lotteryCodes;
	}
	public List<Integer> getTypes() {
		return types;
	}
	public void setTypes(List<Integer> types) {
		this.types = types;
	}
	public ReportLotteryTypeVO getLotteryTypeVO() {
		return lotteryTypeVO;
	}
	public void setLotteryTypeVO(ReportLotteryTypeVO lotteryTypeVO) {
		this.lotteryTypeVO = lotteryTypeVO;
	}
}

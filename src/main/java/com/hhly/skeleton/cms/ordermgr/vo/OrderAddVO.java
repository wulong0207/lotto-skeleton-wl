package com.hhly.skeleton.cms.ordermgr.vo;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.vo.PageVO;
import com.hhly.skeleton.cms.customermgr.vo.LottoCustomerVO;
import com.hhly.skeleton.cms.operatemgr.vo.OperateActivityVO;
import com.hhly.skeleton.cms.operatemgr.vo.OperateMarketChannelVO;

import java.util.Date;

/**
 * @author huangb
 *
 * @Date 2016年12月16日
 *
 * @Desc 追号计划信息
 */
public class OrderAddVO extends PageVO {

	private static final long serialVersionUID = -3566118924203610078L;
	/**
	 * 增长ID
	 */
	private Long id;
	/**
	 * 自定义追号编号
	 */
	private String orderAddCode;
	/**
	 * 彩种编号
	 */
	private Integer lotteryCode;
	/**
	 * 彩期编号
	 */
	private String issueCode;
	/**
	 * 用户ID
	 */
	private Integer userId;
	/**
	 * 用户对象
	 */
	private LottoCustomerVO user;
	/**
	 * 用户购买下单时间
	 */
	private Date buyTime;
	/**
	 * 追号计划结束的时间
	 */
	private Date endTime;
	/**
	 * 渠道表自定义的ID
	 */
	private String channelId;
	/**
	 * 渠道对象
	 */
	private OperateMarketChannelVO channel;
	/**
	 * 投注平台;1：Web,2:Wap;3:Android;4:IOS
	 */
	private Integer platform;
	/**
	 * 追号金额
	 */
	private Double addAmount;
	/**
	 * 方案倍数(该倍数无实际操作意义，仅仅是各追号子彩期倍数的和)
	 */
	private Integer multipleNum;
	/**
	 * 追号类型； 1：固定选号；2：随机选号
	 */
	private Short addType;
	/**
	 * 追号投注数(主要保存随机追号时的注数；选号追号也可以保留注数)
	 */
	private Integer addCount;
	/**
	 * 中奖税前奖金
	 */
	private Double preBonus;
	/**
	 * 中奖税后奖金
	 */
	private Double aftBonus;
	/**
	 * 活动来源ID
	 */
	private String activityId;
	/**
	 * 活动对象
	 */
	private OperateActivityVO activity;
	/**
	 * 支付状态； 1：等待支付；2：支付成功；3：未支付过期；4：支付失败；5：用户取消；6：退款
	 */
	private Short payStatus;
	/**
	 * 追号状态； 1：追号中；2：中奖停追；3：追号结束；4：用户撤单；5：系统撤单；
	 */
	private Short addStatus;
	/**
	 * 停追类型； 1：奖项；2：金额；3：永追
	 */
	private Short stopType;
	/**
	 * 停追条件；例如：奖项：二等奖；永追：空；金额：5000
	 */
	private String stopCondition;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 0：否；1：是
	 */
	private Short isDltAdd;

	public OrderAddVO() {
	}

	public OrderAddVO(Long id) {
		this.id = id;
	}

	public OrderAddVO(Long id, String orderAddCode) {
		this(id);
		this.orderAddCode = orderAddCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderAddCode() {
		return orderAddCode;
	}

	public void setOrderAddCode(String orderAddCode) {
		this.orderAddCode = orderAddCode;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getIssueCode() {
		return issueCode;
	}

	public void setIssueCode(String issueCode) {
		this.issueCode = issueCode;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public LottoCustomerVO getUser() {
		return user;
	}

	public void setUser(LottoCustomerVO user) {
		this.user = user;
	}

	public Date getBuyTime() {
		return buyTime;
	}

	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public OperateMarketChannelVO getChannel() {
		return channel;
	}

	public void setChannel(OperateMarketChannelVO channel) {
		this.channel = channel;
	}

	public Integer getPlatform() {
		return platform;
	}

	public void setPlatform(Integer platform) {
		this.platform = platform;
	}

	public Double getAddAmount() {
		return addAmount;
	}

	public void setAddAmount(Double addAmount) {
		this.addAmount = addAmount;
	}

	public Integer getMultipleNum() {
		return multipleNum;
	}

	public void setMultipleNum(Integer multipleNum) {
		this.multipleNum = multipleNum;
	}

	public Short getAddType() {
		return addType;
	}

	public void setAddType(Short addType) {
		this.addType = addType;
	}

	public Integer getAddCount() {
		return addCount;
	}

	public void setAddCount(Integer addCount) {
		this.addCount = addCount;
	}

	public Double getPreBonus() {
		return preBonus;
	}

	public void setPreBonus(Double preBonus) {
		this.preBonus = preBonus;
	}

	public Double getAftBonus() {
		return aftBonus;
	}

	public void setAftBonus(Double aftBonus) {
		this.aftBonus = aftBonus;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public OperateActivityVO getActivity() {
		return activity;
	}

	public void setActivity(OperateActivityVO activity) {
		this.activity = activity;
	}

	public Short getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(Short payStatus) {
		this.payStatus = payStatus;
	}

	public Short getAddStatus() {
		return addStatus;
	}

	public void setAddStatus(Short addStatus) {
		this.addStatus = addStatus;
	}

	public Short getStopType() {
		return stopType;
	}

	public void setStopType(Short stopType) {
		this.stopType = stopType;
	}

	public String getStopCondition() {
		return stopCondition;
	}

	public void setStopCondition(String stopCondition) {
		this.stopCondition = stopCondition;
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

	public Short getIsDltAdd() {
		return isDltAdd;
	}

	public void setIsDltAdd(Short isDltAdd) {
		this.isDltAdd = isDltAdd;
	}

}

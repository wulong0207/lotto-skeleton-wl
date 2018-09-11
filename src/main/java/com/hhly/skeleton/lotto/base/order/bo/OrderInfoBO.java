package com.hhly.skeleton.lotto.base.order.bo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.constants.SymbolConstants;
import com.hhly.skeleton.base.util.ObjectUtil;
import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.lotto.base.order.vo.OrderDetailVO;

/**
 * @author huangb
 *
 * @Date 2016年11月30日
 *
 * @Desc 订单信息
 */
@SuppressWarnings("serial")
public class OrderInfoBO extends BaseBO {

	/**
	 * 编号
	 */
	@JsonIgnore
	private Long id;
	/**
	 * 订单编号
	 */
	@JsonProperty("oc")
	private String orderCode;
	@JsonIgnore
	private String orderAddCode;
	/**
	 * 彩种代码
	 */
	@JsonIgnore
	private Integer lotteryCode;

	/**
	 * 彩种代码
	 */
	@JsonIgnore
	private Integer lotteryChildCode;

	/**
	 * 彩种名称
	 */
	@JsonIgnore
	private String lotteryName;
	/**
	 * 彩期
	 */
	@JsonIgnore
	private String lotteryIssue;
	/**
	 * 开奖号码
	 */
	@JsonIgnore
	private String drawCode;
	/**
	 * 购买下单时间
	 */
	@JsonIgnore
	private Date buyTime;
	/**
	 * 高频，数字彩，老足彩：取lottery_issue official_end_time； 其它竞技彩：取lottery_issue
	 * official_end_time与订单中最早开赛赛事的比赛时间进行比较，若大于，取比赛时间，若小于取official_end_time
	 */
	@JsonIgnore
	private Date endTicketTime;
	/**
	 * lottery_type的end_check_time 与 end_ticket_time 进行计算。
	 */
	@JsonIgnore
	private Date endCheckTime;
	/**
	 * 订单有所票出票成功后 的时间
	 */
	@JsonIgnore
	private Date comeOutTime;
	/**
	 * 此订单完成开奖的时间
	 */
	@JsonIgnore
	private Date lotteryTime;
	/**
	 * 此订单完成派奖的时间
	 */
	@JsonIgnore
	private Date sendTime;
	/**
	 * 用户
	 */
	@JsonIgnore
	private Integer userId;
	/**
	 * 订单总额
	 */
	@JsonIgnore
	private Double orderAmount;
	/**
	 * 此订单总倍数
	 */
	@JsonIgnore
	private Integer multipleNum;
	/**
	 * 拆票的总数量
	 */
	@JsonIgnore
	private Integer splitNum;
	/**
	 * 数字彩：中奖等级，竞技彩：过关方式；高频彩：玩法名称
	 */
	@JsonIgnore
	private String winningDetail;
	/**
	 * 税前奖金
	 */
	@JsonIgnore
	private Double preBonus;
	/**
	 * 税后奖金
	 */
	@JsonIgnore
	private Double aftBonus;
	/**
	 * 1：代购；2：追号；3：合买
	 */
	@JsonIgnore
	private Short buyType;
	/**
	 * 1：等待支付；2：支付成功；3：未支付过期；4：支付失败；5：用户取消；6：退款
	 */
	@JsonIgnore
	private Short payStatus;
	/**
	 * 1：待上传；2：待拆票；3：拆票中；4：待出票；5:出票中；6：已出票；7：出票失败
	 */
	@Group("cmsupd")
	@NotNull
	@JsonIgnore
	private Short orderStatus;
	/**
	 * 1：未开奖；2：未中奖；3：已中奖；4：已派奖
	 */
	@JsonIgnore
	private Short winningStatus;
	/**
	 * 渠道
	 */
	@JsonIgnore
	private String channelId;
	/**
	 * 开奖后生成的加奖奖金
	 */
	@JsonIgnore
	private Double addedBonus;
	/**
	 * 网站加奖
	 */
	@JsonIgnore
	private Double websiteBonus;
	/**
	 * 投注内容,拼接格式自定义(选球(根据单/复式/胆拖规则拼接):注数:倍数:金额:子玩法:选号方式:内容类型:投注模式)
	 */
	@JsonIgnore
	private String betContent;
	/**
	 * 订单明细列表(根据投注内容生成)
	 */
	@JsonIgnore
	private List<OrderDetailVO> orderDetailList;

	/**
	 * 修改人
	 */
	@JsonIgnore
	private String modifyBy;
	/**
	 * 备注
	 */
	@JsonIgnore
	private String remark;
	/**
	 * 开奖后生成的优惠券中的红包编号ID(系统自动发放的红包编号ID)
	 */
	@JsonIgnore
	private String redCodeUsed;
	/**
	 *开奖后生成的优惠券中的红包编号(系统自动发放的红包编号)
	 */
	private String redCodeGet;

	/**
	 * 竞技彩购买的场次编号
	 */
	@JsonIgnore
	private String buyScreen;
	/**
	 * 订单的系统截止时间
	 */
	@JsonIgnore
	private Date endSysTime;

	/**
	 * 大乐透追号:0否;1是
	 */
	@NotNull
	@JsonIgnore
	private short lottoAdd;
	/**
	 * 订单数量
	 */
	private Integer counter;
	/**
	 * 活动表的活动ID
	 */
	private String activitySource;

	@JsonIgnore
	private String token;
	/**
	 * 平台 投注平台:1：Web,2:Wap;3:Android;4:IOS
	 */
	@JsonIgnore
	private Short platform;
	/**
	 * 1、未推单 2、已推单 3、已跟单
	 */
	private int orderType;

	@JsonIgnore
	private Short categoryId;

	private String maxBonusStr;
	/**
	 * 超总倍数异常时，返回的倍数
	 */
	private Integer multiple;

	public Double getMaxBonus() {
		if (!ObjectUtil.isBlank(maxBonusStr)) {
			String bonus[] = maxBonusStr.split(SymbolConstants.TRAVERSE_SLASH);
			if (bonus.length == 2) {
				return Double.valueOf(bonus[1]);
			}
		}
		return 0d;
	}

	public Double getMinBonus() {
		if (!ObjectUtil.isBlank(maxBonusStr)) {
			String bonus[] = maxBonusStr.split(SymbolConstants.TRAVERSE_SLASH);
			if (bonus.length == 2) {
				return Double.valueOf(bonus[0]);
			}
		}
		return 0d;
	}

	public String getMaxBonusStr() {
		return maxBonusStr;
	}

	public void setMaxBonusStr(String maxBonusStr) {
		this.maxBonusStr = maxBonusStr;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getCounter() {
		return counter;
	}

	public void setCounter(Integer counter) {
		this.counter = counter;
	}

	public Date getEndSysTime() {
		return endSysTime;
	}

	public void setEndSysTime(Date endSysTime) {
		this.endSysTime = endSysTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getLotteryName() {
		return lotteryName;
	}

	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
	}

	public String getLotteryIssue() {
		return lotteryIssue;
	}

	public void setLotteryIssue(String lotteryIssue) {
		this.lotteryIssue = lotteryIssue;
	}

	public String getDrawCode() {
		return drawCode;
	}

	public void setDrawCode(String drawCode) {
		this.drawCode = drawCode;
	}

	public Date getBuyTime() {
		return buyTime;
	}

	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}

	public Date getEndTicketTime() {
		return endTicketTime;
	}

	public void setEndTicketTime(Date endTicketTime) {
		this.endTicketTime = endTicketTime;
	}

	public Date getEndCheckTime() {
		return endCheckTime;
	}

	public void setEndCheckTime(Date endCheckTime) {
		this.endCheckTime = endCheckTime;
	}

	public Date getComeOutTime() {
		return comeOutTime;
	}

	public void setComeOutTime(Date comeOutTime) {
		this.comeOutTime = comeOutTime;
	}

	public Date getLotteryTime() {
		return lotteryTime;
	}

	public void setLotteryTime(Date lotteryTime) {
		this.lotteryTime = lotteryTime;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Integer getMultipleNum() {
		return multipleNum;
	}

	public void setMultipleNum(Integer multipleNum) {
		this.multipleNum = multipleNum;
	}

	public Integer getSplitNum() {
		return splitNum;
	}

	public void setSplitNum(Integer splitNum) {
		this.splitNum = splitNum;
	}

	public String getWinningDetail() {
		return winningDetail;
	}

	public void setWinningDetail(String winningDetail) {
		this.winningDetail = winningDetail;
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

	public Short getBuyType() {
		return buyType;
	}

	public void setBuyType(Short buyType) {
		this.buyType = buyType;
	}

	public Short getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(Short payStatus) {
		this.payStatus = payStatus;
	}

	public Short getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Short orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Short getWinningStatus() {
		return winningStatus;
	}

	public void setWinningStatus(Short winningStatus) {
		this.winningStatus = winningStatus;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public Double getAddedBonus() {
		return addedBonus;
	}

	public void setAddedBonus(Double addedBonus) {
		this.addedBonus = addedBonus;
	}

	public String getBetContent() {
		return betContent;
	}

	public void setBetContent(String betContent) {
		this.betContent = betContent;
	}

	public List<OrderDetailVO> getOrderDetailList() {
		return orderDetailList;
	}

	public void setOrderDetailList(List<OrderDetailVO> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}

	public String getBuyScreen() {
		return buyScreen;
	}

	public void setBuyScreen(String buyScreen) {
		this.buyScreen = buyScreen;
	}

	public String getRedCodeUsed() {
		return redCodeUsed;
	}

	public void setRedCodeUsed(String redCodeUsed) {
		this.redCodeUsed = redCodeUsed;
	}

	public String getRedCodeGet() {
		return redCodeGet;
	}

	public void setRedCodeGet(String redCodeGet) {
		this.redCodeGet = redCodeGet;
	}

	/**
	 * @param orderDetail
	 *            订单明细对象
	 * @Desc 添加明细对象
	 */
	public void addOrderDetail(OrderDetailVO orderDetail) {
		if (this.orderDetailList == null) {
			this.orderDetailList = new ArrayList<OrderDetailVO>();
		}
		this.orderDetailList.add(orderDetail);
	}

	public short getLottoAdd() {
		return lottoAdd;
	}

	public void setLottoAdd(short lottoAdd) {
		this.lottoAdd = lottoAdd;
	}

	public String getActivitySource() {
		return activitySource;
	}

	public void setActivitySource(String activitySource) {
		this.activitySource = activitySource;
	}

	public Short getPlatform() {
		return platform;
	}

	public void setPlatform(Short platform) {
		this.platform = platform;
	}

	public int getOrderType() {
		return orderType;
	}

	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}

	public Integer getLotteryChildCode() {
		return lotteryChildCode;
	}

	public void setLotteryChildCode(Integer lotteryChildCode) {
		this.lotteryChildCode = lotteryChildCode;
	}

	public Short getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Short categoryId) {
		this.categoryId = categoryId;
	}

	public String getOrderAddCode() {
		return orderAddCode;
	}

	public void setOrderAddCode(String orderAddCode) {
		this.orderAddCode = orderAddCode;
	}

	public Integer getMultiple() {
		return multiple;
	}

	public void setMultiple(Integer multiple) {
		this.multiple = multiple;
	}

	public Double getWebsiteBonus() {
		return websiteBonus;
	}

	public void setWebsiteBonus(Double websiteBonus) {
		this.websiteBonus = websiteBonus;
	}

}

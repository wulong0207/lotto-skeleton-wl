package com.hhly.skeleton.lotto.base.order.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.hhly.skeleton.base.constants.SymbolConstants;
import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.vo.BaseVO;
import com.hhly.skeleton.lotto.base.lottery.bo.LotteryBO;

/**
 * @author huangb
 *
 * @Date 2016年11月30日
 *
 * @Desc 订单信息
 */
@SuppressWarnings("serial")
public class OrderInfoVO extends BaseVO {

	/**
	 * 编号
	 */
	private Long id;
	/**
	 * 订单编号
	 */
	private String orderCode;
	/**
	 * 彩种代码
	 */
	private Integer lotteryCode;
	/**
	 * 彩种名称
	 */
	private String lotteryName;
	/**
	 * 子玩法代码
	 */
	private Integer lotteryChildCode;
	/**
	 * 彩期
	 */
	private String lotteryIssue;
	/**
	 * 开奖号码
	 */
	private String drawCode;
	/**
	 * 购买下单时间
	 */
	private Date buyTime;
	/**
	 * 高频，数字彩，老足彩：取lottery_issue official_end_time； 其它竞技彩：取lottery_issue
	 * official_end_time与订单中最早开赛赛事的比赛时间进行比较，若大于，取比赛时间，若小于取official_end_time
	 */
	private Date endTicketTime;
	/**
	 * lottery_type的end_check_time 与 end_ticket_time 进行计算。
	 */
	private Date endCheckTime;
	/**
	 * 订单有所票出票成功后 的时间
	 */
	private Date comeOutTime;
	/**
	 * 此订单完成开奖的时间
	 */
	private Date lotteryTime;
	/**
	 * 此订单完成派奖的时间
	 */
	private Date sendTime;
	/**
	 * 用户
	 */
	private Integer userId;
	/**
	 * 令牌
	 */
	private String token;
	/**
	 * 订单总额
	 */
	private Double orderAmount;
	/**
	 * 此订单总倍数
	 */
	private Integer multipleNum;
	/**
	 * 订单总场次
	 */
	private Integer gameNum;
	/**
	 * 拆票的总数量
	 */
	private Integer splitNum;
	/**
	 * 数字彩：中奖等级，竞技彩：过关方式；高频彩：玩法名称
	 */
	private String winningDetail;
	/**
	 * 税前奖金
	 */
	private Double preBonus;
	/**
	 * 税后奖金
	 */
	private Double aftBonus;
	/**
	 * 1：代购；2：追号；3：合买
	 */
	private Short buyType;
	/**
	 * 1：等待支付；2：支付成功；3：未支付过期；4：支付失败；5：用户取消；6：退款
	 */
	private Short payStatus;
	/**
	 * 1：待上传；2：待拆票；3：拆票中；4：待出票；5:出票中；6：已出票；7：出票失败
	 */
	@Group("cmsupd")
	@NotNull
	private Short orderStatus;
	/**
	 * 1：未开奖；2：未中奖；3：已中奖；4：已派奖
	 */
	private Short winningStatus;
	/**
	 * 渠道
	 */
	private String channelId;
	/**
	 * 开奖后生成的加奖奖金
	 */
	private Double addedBonus;
	/**
	 * 投注内容,拼接格式自定义(选球(根据单/复式/胆拖规则拼接):注数:倍数:金额:子玩法:选号方式:内容类型:投注模式)
	 */
	private String betContent;
	/**
	 * 订单明细列表(根据投注内容生成)
	 */
	private List<OrderDetailVO> orderDetailList;
	
	/**
	 * 修改人
	 */
	private String modifyBy;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 竞彩足球玩法: M-混合 S-胜平负 R-让胜平负 Q-全场比分 Z-总进球 B-半全场胜平负
	 * 竞彩篮球玩法：S:胜负，R-让分胜负，D-大小分，C-胜分差，M-混合
	 */
	private String flag;
	/**
	 * 是否大乐透追加 0：否；1：是
	 */
	private Short isDltAdd;
	
	/**
	 * 竞技彩购买的场次编号(竞彩足球、竞彩篮球、北单需要前端传参，其它彩种不需要)
	 */
	private String buyScreen;
	/**
	 * 订单的系统截止时间
	 */
	private Date endSysTime;
	
	/**
	 * 竞技彩 Tab 标签分类
	 */
	private int tabType; 
	
	/**
	 * 总注数
	 */
	private Integer buyNumber;
	
	/**
	 * 平台
	 */
	private Short platform;

	/**
	 * 单式上传文件地址
	 */
	private String bettingContentUrl;

	/**
	 * 是否是单式上传订单 0：不是。1：是。默认不是
	 */
	private Short isSingleOrder=0;
	
	/**
	 * 重复订单验证开关(1:不验证重复; 其它值:验证重复)
	 */
	private Short verifyOpen;
	
	/**
	 * 投注赛事详情的对阵编号systemCode
	 */
    private Set<String> matchSet = new HashSet<>();
    
    /**
     * 投注类型：1、单关胜负平；2、单场制胜；4、猜单双；5、猜大小球
     */
    private Short categoryId;

	/**
	 * 活动编号
	 */
	private String activityCode;
	
	/**
	 * 彩种信息
	 */
	private LotteryBO lotteryBO;

	/**
	 * 订单类别 1、未推单 2、已推单 3、已跟单
	 */
	private Short orderType;
	/**
	 * 本站截止时间
	 */
	private Date endLocalTime;
	/**
	 * 预计最大奖金
	 */
	private String maxBonus;
	/**
	 * 兑换码
	 */
	private String redeemCode;
	
    public LotteryBO getLotteryBO() {
		return lotteryBO;
	}

	public void setLotteryBO(LotteryBO lotteryBO) {
		this.lotteryBO = lotteryBO;
	}

	public Short getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Short categoryId) {
		this.categoryId = categoryId;
	}

	public Short getVerifyOpen() {
		return verifyOpen;
	}

	public void setVerifyOpen(Short verifyOpen) {
		this.verifyOpen = verifyOpen;
	}

	public Set<String> getMatchSet() {
		return matchSet;
	}

	public void setMatchSet(Set<String> matchSet) {
		this.matchSet = matchSet;
	}

	public Short getPlatform() {
		return platform;
	}

	public void setPlatform(Short platform) {
		this.platform = platform;
	}

	public Integer getBuyNumber() {
		return buyNumber;
	}

	public void setBuyNumber(Integer buyNumber) {
		this.buyNumber = buyNumber;
	}

	public int getTabType() {
		return tabType;
	}

	public void setTabType(int tabType) {
		this.tabType = tabType;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
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

	public Integer getLotteryChildCode() {
		return lotteryChildCode;
	}

	public void setLotteryChildCode(Integer lotteryChildCode) {
		this.lotteryChildCode = lotteryChildCode;
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

	public String getRedeemCode() {
		return redeemCode;
	}

	public void setRedeemCode(String redeemCode) {
		this.redeemCode = redeemCode;
	}

	/**
	 * @param orderDetail  订单明细对象
	 *           
	 * @Desc 添加明细对象
	 */
	public void addOrderDetail(OrderDetailVO orderDetail) {
		if (this.orderDetailList == null) {
			this.orderDetailList = new ArrayList<OrderDetailVO>();
		}
		if(this.betContent.indexOf(SymbolConstants.SEMICOLON) > -1){
			String multipleContent = this.betContent.substring(this.betContent.lastIndexOf(SymbolConstants.UP_CAP)+1);
			String[] multiples = multipleContent.split(SymbolConstants.SEMICOLON);
			for(String numStr : multiples){
				orderDetail.setMultiple(Integer.parseInt(numStr));
				this.orderDetailList.add(orderDetail);
			}
		}else{
			this.orderDetailList.add(orderDetail);
		}
	}

	public Integer getGameNum() {
		return gameNum;
	}

	public void setGameNum(Integer gameNum) {
		this.gameNum = gameNum;
	}

	public Short getIsDltAdd() {
		return isDltAdd;
	}

	public void setIsDltAdd(Short isDltAdd) {
		this.isDltAdd = isDltAdd;
	}

	public Date getEndSysTime() {
		return endSysTime;
	}

	public void setEndSysTime(Date endSysTime) {
		this.endSysTime = endSysTime;
	}


	@Override
	public String toString() {
		return "OrderInfoVO [id=" + id + ", orderCode=" + orderCode + ", lotteryCode=" + lotteryCode + ", lotteryName="
				+ lotteryName + ", lotteryChildCode=" + lotteryChildCode + ", lotteryIssue=" + lotteryIssue
				+ ", drawCode=" + drawCode + ", buyTime=" + buyTime + ", endTicketTime=" + endTicketTime
				+ ", endCheckTime=" + endCheckTime + ", comeOutTime=" + comeOutTime + ", lotteryTime=" + lotteryTime
				+ ", sendTime=" + sendTime + ", userId=" + userId + ", token=" + token + ", orderAmount=" + orderAmount
				+ ", multipleNum=" + multipleNum + ", gameNum=" + gameNum + ", splitNum=" + splitNum
				+ ", winningDetail=" + winningDetail + ", preBonus=" + preBonus + ", aftBonus=" + aftBonus
				+ ", buyType=" + buyType + ", payStatus=" + payStatus + ", orderStatus=" + orderStatus
				+ ", winningStatus=" + winningStatus + ", channelId=" + channelId + ", addedBonus=" + addedBonus
				+ ", betContent=" + betContent + ", orderDetailList=" + orderDetailList + ", modifyBy=" + modifyBy
				+ ", remark=" + remark + ", flag=" + flag + ", isDltAdd=" + isDltAdd + ", buyScreen=" + buyScreen
				+ ", endSysTime=" + endSysTime + ", tabType=" + tabType + ", buyNumber=" + buyNumber + "]";
	}

	public String getBettingContentUrl() {
		return bettingContentUrl;
	}

	public void setBettingContentUrl(String bettingContentUrl) {
		this.bettingContentUrl = bettingContentUrl;
	}

	public Short getIsSingleOrder() {
		return isSingleOrder;
	}

	public void setIsSingleOrder(Short isSingleOrder) {
		this.isSingleOrder = isSingleOrder;
	}

	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public Short getOrderType() {
		return orderType;
	}

	public void setOrderType(Short orderType) {
		this.orderType = orderType;
	}

	public Date getEndLocalTime() {
		return endLocalTime;
	}

	public void setEndLocalTime(Date endLocalTime) {
		this.endLocalTime = endLocalTime;
	}

	public String getMaxBonus() {
		return maxBonus;
	}

	public void setMaxBonus(String maxBonus) {
		this.maxBonus = maxBonus;
	}
}

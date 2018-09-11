package com.hhly.skeleton.cms.ordermgr.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.hhly.skeleton.base.valid.Group;
import com.hhly.skeleton.base.valid.NotNull;
import com.hhly.skeleton.base.vo.BaseVO;

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
	@Group("cmsupd")
	@NotNull
	private Long id;
	/**
	 * 订单编号
	 */
	@Group({"status","operate"})
	@NotNull(msg="订单编号")
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
	 * 订单总额
	 */
	private Double orderAmount;
	/**
	 * 此订单总倍数
	 */
	private Integer multipleNum;
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
	@Group({"status"})
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
	@Group({"operate"})
	@NotNull
	private Integer operate;
	/**
	 * 最大编号
	 */
	private  String maxBuyScreen;
	
	 /**
     * 追号计划订单
     */
    private String  orderAddCode;

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

	public Integer getOperate() {
		return operate;
	}

	public void setOperate(Integer operate) {
		this.operate = operate;
	}

	public String getMaxBuyScreen() {
		return maxBuyScreen;
	}

	public void setMaxBuyScreen(String maxBuyScreen) {
		this.maxBuyScreen = maxBuyScreen;
	}

	/**
	 * @return the orderAddCode
	 */
	public String getOrderAddCode() {
		return orderAddCode;
	}

	/**
	 * @param orderAddCode the orderAddCode to set
	 */
	public void setOrderAddCode(String orderAddCode) {
		this.orderAddCode = orderAddCode;
	}
}

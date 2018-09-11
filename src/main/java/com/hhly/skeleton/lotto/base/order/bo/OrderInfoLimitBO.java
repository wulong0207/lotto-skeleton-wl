package com.hhly.skeleton.lotto.base.order.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.lotto.base.issue.bo.IssueOfficialTimeBO;

import java.util.Date;
import java.util.List;

/**
 * 未支付订单信息：限制返回字段，已使用@JsonIgnore，如不合适请自行新增新类，不要在此基础上修改。
 * @author longguoyou
 * @date 2017年4月25日
 * @compay 益彩网络科技有限公司
 */
public class OrderInfoLimitBO extends BaseBO {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5544208058358213204L;

    /**
     * 主键
     */
	@JsonIgnore
    private Integer id;

    /**
     * 订单编号
     */
    private String orderCode;

    /**
     * 小彩种编号，参考LotteryEnum 枚举
     */
    @JsonIgnore
    private Integer lotteryChildCode;

    /**
     * 小彩种名称
     */
    @JsonIgnore
    private String lotteryChildName;

    /**
     * 彩种编号
     */
    private Integer lotteryCode;

    /**
     * 彩种名称
     */
    private String lotteryName;

    /**
     * 默认订单创建日期
     * 未支付且未过期的方案取方案截止时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date showDate;

    /**
     * 本站销售截止时间 （未支付时的倒计时）
     */
    @JsonIgnore
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date endSaleTime;

    /**
     * 出票时间（时间段串）
     */
    @JsonIgnore
    private String ticketTime;

    /**
     * 开奖时间
     */
    @JsonIgnore
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date lotteryTime;

    /**
     * 派奖时间
     */
    @JsonIgnore
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date throwTime;

    /**
     * 数字彩：开奖号码
     */
    @JsonIgnore
    private String drawCode;

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
     * 支付时使用的红包编号
      */
    @JsonIgnore
    private String redCode;

    /**
     * 开奖后生成的红包编号
     */
    @JsonIgnore
    private String redCodeGet;

    /**
     * 现金支付金额
     */
    private Double cashAmount;

    /**
     * 红包支付金额
     */
    @JsonIgnore
    private Double redAmount;

    /**
     * 红包返奖金额
     */
    @JsonIgnore
    private Double getRedAmount;

    /**
     * 期号
     */
    @JsonIgnore
    private String lotteryIssue;

    /**
     * 方案 0:全部； 1：代购；2：追号代购；3：合买；4：追号计划
     */
    private Integer buyType;

    /**
     * 付款金额
     */
    private Double orderAmount;

    /**
     * 订单状态 1：待上传；2：待拆票；3：拆票中；4：待出票；5:出票中；6：已出票；7：出票失败；8：已撤单;9拆票失败
     */
    private Integer orderStatus;

    /**
     * 支付状态 1：等待支付；2：支付成功；3：未支付过期；4：支付失败；5：用户取消；6：退款
     */
    @JsonIgnore
    private Integer payStatus;

    /**
     * 开奖状态 1：未开奖；2：未中奖；3：已中奖；4：已派奖
     */
    @JsonIgnore
    private Integer winningStatus;

    /**
     * 追号状态； 1：追号中；2：中奖停追；3：追号结束；4：用户撤单；5：系统撤单；
     */
    @JsonIgnore
    private Integer addStatus;

    /**
     * 追号：已追期数
     */
    @JsonIgnore
    private Integer hadIssue;

    /**
     * 追号：总期数
     */
    @JsonIgnore
    private Integer totalIssue;

    /**
     * 串关 2_1,3_1组成
     */
    @JsonIgnore
    private String bunchStr;

    /**
     * 订单总倍数
     */
    @JsonIgnore
    private Integer multipleNum;

    /**
     * 订单总注数
     */
    @JsonIgnore
    private Integer betNum;

    /**
     * 1：单式；2：复式；3：胆拖；
     */
    @JsonIgnore
    private Integer contentType;

    /**
     * 出票失败原因
     */
    @JsonIgnore
    private String betFailMsg;

    /**
     * 最大场次编号
     */
    @JsonIgnore
    private String maxBuyScreen;

    /**
     * 出票时间
     */
    @JsonIgnore
    private IssueOfficialTimeBO issueOfficialTimeBO;
    
    private List<OrderInfoDetailLimitBO> orderInfoDetailLimitBO;

    public List<OrderInfoDetailLimitBO> getOrderInfoDetailLimitBO() {
		return orderInfoDetailLimitBO;
	}

	public void setOrderInfoDetailLimitBO(List<OrderInfoDetailLimitBO> orderInfoDetailLimitBO) {
		this.orderInfoDetailLimitBO = orderInfoDetailLimitBO;
	}

	public String getLotteryIssue() {
        return lotteryIssue;
    }

    public void setLotteryIssue(String lotteryIssue) {
        this.lotteryIssue = lotteryIssue;
    }

    public Integer getBuyType() {
        return buyType;
    }

    public void setBuyType(Integer buyType) {
        this.buyType = buyType;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }


    public Date getShowDate() {
        return showDate;
    }

    public void setShowDate(Date showDate) {
        this.showDate = showDate;
    }

    public Double getPreBonus() {
        return preBonus;
    }

    public void setPreBonus(Double preBonus) {
        this.preBonus = preBonus;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getWinningStatus() {
        return winningStatus;
    }

    public void setWinningStatus(Integer winningStatus) {
        this.winningStatus = winningStatus;
    }

    public Integer getHadIssue() {
        return hadIssue;
    }

    public void setHadIssue(Integer hadIssue) {
        this.hadIssue = hadIssue;
    }

    public Integer getTotalIssue() {
        return totalIssue;
    }

    public void setTotalIssue(Integer totalIssue) {
        this.totalIssue = totalIssue;
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

    public Integer getAddStatus() {
        return addStatus;
    }

    public void setAddStatus(Integer addStatus) {
        this.addStatus = addStatus;
    }

    public Integer getLotteryChildCode() {
        return lotteryChildCode;
    }

    public void setLotteryChildCode(Integer lotteryChildCode) {
        this.lotteryChildCode = lotteryChildCode;
    }

    public String getLotteryChildName() {
        return lotteryChildName;
    }

    public void setLotteryChildName(String lotteryChildName) {
        this.lotteryChildName = lotteryChildName;
    }

    public String getLotteryName() {
        return lotteryName;
    }

    public void setLotteryName(String lotteryName) {
        this.lotteryName = lotteryName;
    }

    public String getRedCode() {
        return redCode;
    }

    public void setRedCode(String redCode) {
        this.redCode = redCode;
    }

    public String getBunchStr() {
        return bunchStr;
    }

    public void setBunchStr(String bunchStr) {
        this.bunchStr = bunchStr;
    }

    public Integer getMultipleNum() {
        return multipleNum;
    }

    public void setMultipleNum(Integer multipleNum) {
        this.multipleNum = multipleNum;
    }

    public Integer getBetNum() {
        return betNum;
    }

    public void setBetNum(Integer betNum) {
        this.betNum = betNum;
    }

    public Integer getContentType() {
        return contentType;
    }

    public void setContentType(Integer contentType) {
        this.contentType = contentType;
    }

    public Date getEndSaleTime() {
        return endSaleTime;
    }

    public void setEndSaleTime(Date endSaleTime) {
        this.endSaleTime = endSaleTime;
    }

    public String getTicketTime() {
        return ticketTime;
    }

    public void setTicketTime(String ticketTime) {
        this.ticketTime = ticketTime;
    }

    public Date getLotteryTime() {
        return lotteryTime;
    }

    public void setLotteryTime(Date lotteryTime) {
        this.lotteryTime = lotteryTime;
    }

    public String getDrawCode() {
        return drawCode;
    }

    public void setDrawCode(String drawCode) {
        this.drawCode = drawCode;
    }

    public Integer getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(Integer lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public Double getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(Double cashAmount) {
        this.cashAmount = cashAmount;
    }

    public Double getRedAmount() {
        return redAmount;
    }

    public void setRedAmount(Double redAmount) {
        this.redAmount = redAmount;
    }

    public String getBetFailMsg() {
        return betFailMsg;
    }

    public void setBetFailMsg(String betFailMsg) {
        this.betFailMsg = betFailMsg;
    }

    public String getMaxBuyScreen() {
        return maxBuyScreen;
    }

    public void setMaxBuyScreen(String maxBuyScreen) {
        this.maxBuyScreen = maxBuyScreen;
    }

    public Date getThrowTime() {
        return throwTime;
    }

    public void setThrowTime(Date throwTime) {
        this.throwTime = throwTime;
    }

    public IssueOfficialTimeBO getIssueOfficialTimeBO() {
        return issueOfficialTimeBO;
    }

    public void setIssueOfficialTimeBO(IssueOfficialTimeBO issueOfficialTimeBO) {
        this.issueOfficialTimeBO = issueOfficialTimeBO;
    }

    public Double getAftBonus() {
        return aftBonus;
    }

    public void setAftBonus(Double aftBonus) {
        this.aftBonus = aftBonus;
    }

    public String getRedCodeGet() {
        return redCodeGet;
    }

    public void setRedCodeGet(String redCodeGet) {
        this.redCodeGet = redCodeGet;
    }

    public Double getGetRedAmount() {
        return getRedAmount;
    }

    public void setGetRedAmount(Double getRedAmount) {
        this.getRedAmount = getRedAmount;
    }
}

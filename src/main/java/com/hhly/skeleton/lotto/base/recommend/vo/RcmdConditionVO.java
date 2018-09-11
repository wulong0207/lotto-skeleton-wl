package com.hhly.skeleton.lotto.base.recommend.vo;

import java.util.Date;

import com.hhly.skeleton.base.vo.BaseVO;


@SuppressWarnings("serial")
public class RcmdConditionVO extends BaseVO {
    /**
     * 
     */
    private Integer id;

    /**
     * 推单发起人；关联用户表
     */
    private Integer userId;

    /**
     * 推单编号；可定义“T”开头的21位编号
     */
    private String rcmdCode;

    /**
     * 推文标题
     */
    private String title;

    /**
     * 栏目编号;推文分栏目展示	保留字段；后续有用
     */
    private Integer typeId;

    /**
     * 推文标签
     */
    private String label;

    /**
     * 阅读数量/浏览量
     */
    private Integer click;

    /**
     * 彩种编号
     */
    private Short lotteryCode;

    /**
     * 方案金额
     */
    private Double planAmount;
    
    /**
     * 彩种名称
     */
    private String lotteryName;

    /**
     * 彩期
     */
    private String lotteryIssue;

    /**
     * 玩法编号
     */
    private Integer lotteryChildCode;

    /**
     * 过关方式；1：单关 2：2串1
     */
    private Byte passWay;

    /**
     * 方案状态；1：进行中；2：已完场；3：删除
     */
    private Boolean status;

    /**
     * 赛事销售截止时间；取最早赛事的
     */
    private Date saleEndTime;

    /**
     * 推文方案的开奖的时间
     */
    private Date lotteryTime;

    /**
     * 中奖状态；1：未中；2：命中；
     */
    private Boolean winningStatus;

    /**
     * 付费类型；1：免费；2：付费；
     */
    private Boolean payType;

    /**
     * 付费金额
     */
    private Float payAmount;

    /**
     * 付费人数
     */
    private Integer payCount;

    /**
     * 启用退款(即不中退款)；0：否 1：是
     */
    private Boolean refundEnabled;

    /**
     * 是否已退款；用于标识，退款启用(1)且没有命中时，钱款是否已退0：否 1：是
     */
    private Boolean isRefunded;

    /**
     * 推单平台;1：Web,2:Wap;3:Android;4:IOS
     */
    private Short platform;

    /**
     * 渠道来源;渠道表自定义的ID
     */
    private String channelId;

    /**
     * 是否置顶 0：不置顶；1：置顶；
     */
    private Boolean isTop;

    /**
     * 是否加推荐 0：不推荐；1：推荐；
     */
    private Boolean isRecommend;

    /**
     * 是否锁定；0：不锁定；1：锁定；	注：锁定的推单不纳入到统计信息(如命中率，连中数等)方便调整显示面
     */
    private Boolean isLock;

    /**
     * 创建时间/发起时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 修改人
     */
    private String modifyBy;

    /**
     * 备注说明
     */
    private String remark;

    /**
     * 推荐理由
     */
    private String reason;

    /**
     * 场次编号列表，逗号分隔
     */
    private String screens;
    
    public RcmdConditionVO(RcmdInfoVO rcmdInfoVO) {
		this.lotteryCode = rcmdInfoVO.getLotteryCode();
		this.lotteryIssue = rcmdInfoVO.getLotteryIssue();
		this.userId = rcmdInfoVO.getUserId();
	}

	public String getScreens() {
		return screens;
	}

	public void setScreens(String screens) {
		this.screens = screens;
	}

	private String token;

    public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Double getPlanAmount() {
		return planAmount;
	}

	public void setPlanAmount(Double planAmount) {
		this.planAmount = planAmount;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRcmdCode() {
        return rcmdCode;
    }

    public void setRcmdCode(String rcmdCode) {
        this.rcmdCode = rcmdCode == null ? null : rcmdCode.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public Integer getClick() {
        return click;
    }

    public void setClick(Integer click) {
        this.click = click;
    }

    public Short getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(Short lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public String getLotteryName() {
        return lotteryName;
    }

    public void setLotteryName(String lotteryName) {
        this.lotteryName = lotteryName == null ? null : lotteryName.trim();
    }

    public String getLotteryIssue() {
        return lotteryIssue;
    }

    public void setLotteryIssue(String lotteryIssue) {
        this.lotteryIssue = lotteryIssue == null ? null : lotteryIssue.trim();
    }

    public Integer getLotteryChildCode() {
        return lotteryChildCode;
    }

    public void setLotteryChildCode(Integer lotteryChildCode) {
        this.lotteryChildCode = lotteryChildCode;
    }

    public Byte getPassWay() {
        return passWay;
    }

    public void setPassWay(Byte passWay) {
        this.passWay = passWay;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getSaleEndTime() {
        return saleEndTime;
    }

    public void setSaleEndTime(Date saleEndTime) {
        this.saleEndTime = saleEndTime;
    }

    public Date getLotteryTime() {
        return lotteryTime;
    }

    public void setLotteryTime(Date lotteryTime) {
        this.lotteryTime = lotteryTime;
    }

    public Boolean getWinningStatus() {
        return winningStatus;
    }

    public void setWinningStatus(Boolean winningStatus) {
        this.winningStatus = winningStatus;
    }

    public Boolean getPayType() {
        return payType;
    }

    public void setPayType(Boolean payType) {
        this.payType = payType;
    }

    public Float getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Float payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getPayCount() {
        return payCount;
    }

    public void setPayCount(Integer payCount) {
        this.payCount = payCount;
    }

    public Boolean getRefundEnabled() {
        return refundEnabled;
    }

    public void setRefundEnabled(Boolean refundEnabled) {
        this.refundEnabled = refundEnabled;
    }

    public Boolean getIsRefunded() {
        return isRefunded;
    }

    public void setIsRefunded(Boolean isRefunded) {
        this.isRefunded = isRefunded;
    }

    public Short getPlatform() {
        return platform;
    }

    public void setPlatform(Short platform) {
        this.platform = platform;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public Boolean getIsTop() {
        return isTop;
    }

    public void setIsTop(Boolean isTop) {
        this.isTop = isTop;
    }

    public Boolean getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Boolean isRecommend) {
        this.isRecommend = isRecommend;
    }

    public Boolean getIsLock() {
        return isLock;
    }

    public void setIsLock(Boolean isLock) {
        this.isLock = isLock;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy == null ? null : modifyBy.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }
}
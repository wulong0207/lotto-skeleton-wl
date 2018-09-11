package com.hhly.skeleton.cms.ordermgr.bo;

import java.util.Date;
import java.util.Map;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.bo.StatisticBO;
import com.hhly.skeleton.base.common.ChaseEnum.ChaseStopType;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.excel.ReplaceAttribute;
import com.hhly.skeleton.base.model.DicDataEnum;
import com.hhly.skeleton.base.util.StringUtil;

/**
 * @desc 导出追号计划
 * @author huangb
 * @date 2017年1月20日
 * @company 益彩网络
 * @version v1.0
 */
@SuppressWarnings("serial")
public class OrderAddExcelCmsBO extends BaseBO {
	@ExcelHeader("序号")
	private String id;
	@ExcelHeader("彩种名称")
	private String lotteryName;
	@ExcelHeader("彩期编号")
	private String issueCode;
	@ExcelHeader("用户昵称")
	private String nickName;
	@ExcelHeader("追号编号")
	private String orderAddCode;
	@ExcelHeader("支付状态")
	@ReplaceAttribute(DicDataEnum.ORDER_ORDER_PAY_STATUS)
	private String payStatus;
	@ExcelHeader("追号金额")
	private Double addAmount;
	@ExcelHeader("追号状态")
	@ReplaceAttribute(DicDataEnum.ORDER_CHASE_STATUS)
	private String addStatus;
	@ExcelHeader("已追/总期数")
	private String addStatis;
	@ExcelHeader("停追类型")
	@ReplaceAttribute(DicDataEnum.ORDER_CHASE_STOP_TYPE)
	private String stopType;
	@ExcelHeader("停追条件")
	private String stopCondition;
	@ExcelHeader("税前金额")
	private Double preBonus;
	@ExcelHeader("税后金额")
	private Double aftBonus;
	@ExcelHeader("购买时间")
	private Date buyTime;
	@ExcelHeader("结束时间")
	private Date endTime;
	@ExcelHeader("渠道")
	private String channelId;
	@ExcelHeader("平台")
	@ReplaceAttribute(DicDataEnum.OPERATE_MARKET_CHANNEL_TPF)
	private String platform;
	@ExcelHeader("修改时间")
	private Date updateTime;
	@ExcelHeader("创建时间")
	private Date createTime;

	public OrderAddExcelCmsBO() {

	}

	/**
	 * @param id 序号
	 * @param orderAddBO 数据对象
	 * @param gradeMap 奖级map（处理停追类型-奖级处理）
	 */
	public OrderAddExcelCmsBO(int id, OrderAddBO orderAddBO, Map<String, String> gradeMap) {
		this.id = String.valueOf(id);
		if (orderAddBO != null) {
			this.lotteryName = StringUtil.convertObjToStr(orderAddBO.getLotteryCode());
			this.issueCode = StringUtil.convertObjToStr(orderAddBO.getIssueCode());
			this.nickName = (null == orderAddBO.getUser()) ? "" : StringUtil.convertObjToStr(orderAddBO.getUser().getNickName());
			this.orderAddCode =StringUtil.convertObjToStr(orderAddBO.getOrderAddCode());
			this.payStatus = StringUtil.convertObjToStr(orderAddBO.getPayStatus());
			this.addAmount = orderAddBO.getAddAmount();
			this.addStatus = StringUtil.convertObjToStr(orderAddBO.getAddStatus());
			StatisticBO statisInfo = orderAddBO.getOrderAddIssueStatis();
			String statis = "";
			if(null != statisInfo) {
				statis += (statisInfo.getCount1() + statisInfo.getCount2() + statisInfo.getCount3() + statisInfo.getCount4()) ; // 已追的期数
				statis += "/" + statisInfo.getCountAll(); // 总期数
			}
			this.addStatis = StringUtil.convertObjToStr(statis);
			this.stopType = StringUtil.convertObjToStr(orderAddBO.getStopType());
			if (this.stopType.equals(String.valueOf(ChaseStopType.PRIZE.getValue()))) {
				// 如果停追类型为奖级
				this.stopCondition = StringUtil.convertObjToStr(gradeMap.get(orderAddBO.getStopCondition()));
			} else {
				this.stopCondition = StringUtil.convertObjToStr(orderAddBO.getStopCondition());
			}
			this.preBonus = orderAddBO.getPreBonus();
			this.aftBonus = orderAddBO.getAftBonus();
			this.buyTime = orderAddBO.getBuyTime();
			this.endTime = orderAddBO.getEndTime();
			this.channelId = orderAddBO.getChannelId();
			this.platform = StringUtil.convertObjToStr(orderAddBO.getPlatform());
			this.updateTime = orderAddBO.getUpdateTime();
			this.createTime = orderAddBO.getCreateTime();
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLotteryName() {
		return lotteryName;
	}

	public void setLotteryName(String lotteryName) {
		this.lotteryName = lotteryName;
	}

	public String getIssueCode() {
		return issueCode;
	}

	public void setIssueCode(String issueCode) {
		this.issueCode = issueCode;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getOrderAddCode() {
		return orderAddCode;
	}

	public void setOrderAddCode(String orderAddCode) {
		this.orderAddCode = orderAddCode;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public Double getAddAmount() {
		return addAmount;
	}

	public void setAddAmount(Double addAmount) {
		this.addAmount = addAmount;
	}

	public String getAddStatus() {
		return addStatus;
	}

	public void setAddStatus(String addStatus) {
		this.addStatus = addStatus;
	}

	public String getAddStatis() {
		return addStatis;
	}

	public void setAddStatis(String addStatis) {
		this.addStatis = addStatis;
	}

	public String getStopType() {
		return stopType;
	}

	public void setStopType(String stopType) {
		this.stopType = stopType;
	}

	public String getStopCondition() {
		return stopCondition;
	}

	public void setStopCondition(String stopCondition) {
		this.stopCondition = stopCondition;
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

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
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

}

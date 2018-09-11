package com.hhly.skeleton.cms.ordermgr.bo;

import java.util.Date;
import java.util.Map;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.excel.ReplaceAttribute;
import com.hhly.skeleton.base.model.DicDataEnum;
import com.hhly.skeleton.base.util.StringUtil;

/**
 * @desc 派奖数据导出
 * @author huangb
 * @date 2017年2月12日
 * @company 益彩网络
 * @version v1.0
 */
@SuppressWarnings("serial")
public class SendPrizeExcelBO extends BaseBO {

	@ExcelHeader("序号")
	private String id;

	@ExcelHeader("彩种名称")
	private String lotteryName;

	@ExcelHeader("彩期编号")
	private String lotteryIssue;

	@ExcelHeader("用户昵称")
	private String nickName;

	@ExcelHeader("购买类型")
	@ReplaceAttribute(DicDataEnum.ORDER_ORDER_BUY_TYPE)
	private String buyType;

	@ExcelHeader("方案编号")
	private String orderCode;

	@ExcelHeader("方案金额")
	private Double orderAmount;

	@ExcelHeader("税前金额")
	private Double preBonus;

	@ExcelHeader("税后金额")
	private Double aftBonus;

	@ExcelHeader("应派金额")
	private Double sendBonus;

	@ExcelHeader("开奖时间")
	private Date lotteryTime;

	@ExcelHeader("中奖奖项")
	private String winningDetail;

	public SendPrizeExcelBO() {

	}

	/**
	 * @param id
	 *            序号
	 * @param userWalletBO
	 *            数据对象
	 */
	public SendPrizeExcelBO(int id, OrderInfoCmsBO orderInfoCmsBO, Map<String, String> gradeMap) {
		this.id = String.valueOf(id);
		if (orderInfoCmsBO != null) {
			this.lotteryName = StringUtil.convertObjToStr(orderInfoCmsBO.getLotteryCode());
			this.lotteryIssue = StringUtil.convertObjToStr(orderInfoCmsBO.getLotteryIssue());
			this.nickName = StringUtil.convertObjToStr(orderInfoCmsBO.getNickName());
			this.buyType = StringUtil.convertObjToStr(orderInfoCmsBO.getBuyType());
			this.orderCode = StringUtil.convertObjToStr(orderInfoCmsBO.getOrderCode());
			this.orderAmount = orderInfoCmsBO.getOrderAmount();
			this.preBonus = orderInfoCmsBO.getPreBonus();
			this.aftBonus = orderInfoCmsBO.getAftBonus();
			this.sendBonus = orderInfoCmsBO.getSendBonus();
			this.lotteryTime = orderInfoCmsBO.getLotteryTime();
			// 奖级特殊处理
			if(gradeMap == null || gradeMap.isEmpty()) {
				this.winningDetail = orderInfoCmsBO.getWinningDetail();
			} else {
				this.winningDetail = StringUtil.convertObjToStr(gradeMap.get(orderInfoCmsBO.getWinningDetail()));
			}
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

	public String getLotteryIssue() {
		return lotteryIssue;
	}

	public void setLotteryIssue(String lotteryIssue) {
		this.lotteryIssue = lotteryIssue;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getBuyType() {
		return buyType;
	}

	public void setBuyType(String buyType) {
		this.buyType = buyType;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public Double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
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

	public Double getSendBonus() {
		return sendBonus;
	}

	public void setSendBonus(Double sendBonus) {
		this.sendBonus = sendBonus;
	}

	public Date getLotteryTime() {
		return lotteryTime;
	}

	public void setLotteryTime(Date lotteryTime) {
		this.lotteryTime = lotteryTime;
	}

	public String getWinningDetail() {
		return winningDetail;
	}

	public void setWinningDetail(String winningDetail) {
		this.winningDetail = winningDetail;
	}

}

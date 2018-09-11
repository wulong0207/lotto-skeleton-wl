package com.hhly.skeleton.cms.ordermgr.bo;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.base.excel.ExcelHeader;
import com.hhly.skeleton.base.excel.ReplaceAttribute;
import com.hhly.skeleton.base.model.DicDataEnum;
import com.hhly.skeleton.base.util.DateUtil;
import com.hhly.skeleton.base.util.StringUtil;

/**
 * @desc 导出追号计划彩期的实体
 * @author huangb
 * @date 2017年1月20日
 * @company 益彩网络
 * @version v1.0
 */
@SuppressWarnings("serial")
public class OrderAddIssueExcelCmsBO extends BaseBO {

	@ExcelHeader("序号")
	private String id;

	@ExcelHeader("追号编号")
	private String orderAddCode;

	@ExcelHeader("彩期期号")
	private String issueCode;

	@ExcelHeader("认购金额")
	private String buyAmount;

	@ExcelHeader("倍数")
	private String multiple;

	@ExcelHeader("追号状态")
	@ReplaceAttribute(DicDataEnum.ORDER_CHASE_ISSUE_STATUS)
	private String addStatus;

	@ExcelHeader("方案编号")
	private String orderCode;

	@ExcelHeader("税前奖金")
	private String preBonus;

	@ExcelHeader("追号时间")
	private String addTime;

	@ExcelHeader("修改时间")
	private String updateTime;

	@ExcelHeader("创建时间")
	private String createTime;

	public OrderAddIssueExcelCmsBO() {

	}

	/**
	 * @param id
	 *            序号
	 * @param orderAddBO
	 *            数据对象
	 */
	public OrderAddIssueExcelCmsBO(int id, OrderAddIssueBO orderAddIssue) {
		this.id = String.valueOf(id);
		if (orderAddIssue != null) {
			this.orderAddCode = StringUtil.convertObjToStr(orderAddIssue.getOrderAddCode());
			this.issueCode = StringUtil.convertObjToStr(orderAddIssue.getIssueCode());
			this.buyAmount = StringUtil.convertObjToStr(orderAddIssue.getBuyAmount());
			this.multiple = StringUtil.convertObjToStr(orderAddIssue.getMultiple());
			this.addStatus = StringUtil.convertObjToStr(orderAddIssue.getAddStatus());
			this.orderCode = StringUtil.convertObjToStr(orderAddIssue.getOrderCode());
			this.preBonus = StringUtil.convertObjToStr(orderAddIssue.getPreBonus());
			this.addTime = DateUtil.convertDateToStr(orderAddIssue.getAddTime());
			this.updateTime = DateUtil.convertDateToStr(orderAddIssue.getUpdateTime());
			this.createTime = DateUtil.convertDateToStr(orderAddIssue.getCreateTime());
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderAddCode() {
		return orderAddCode;
	}

	public void setOrderAddCode(String orderAddCode) {
		this.orderAddCode = orderAddCode;
	}

	public String getIssueCode() {
		return issueCode;
	}

	public void setIssueCode(String issueCode) {
		this.issueCode = issueCode;
	}

	public String getBuyAmount() {
		return buyAmount;
	}

	public void setBuyAmount(String buyAmount) {
		this.buyAmount = buyAmount;
	}

	public String getMultiple() {
		return multiple;
	}

	public void setMultiple(String multiple) {
		this.multiple = multiple;
	}

	public String getAddStatus() {
		return addStatus;
	}

	public void setAddStatus(String addStatus) {
		this.addStatus = addStatus;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getPreBonus() {
		return preBonus;
	}

	public void setPreBonus(String preBonus) {
		this.preBonus = preBonus;
	}

	public String getAddTime() {
		return addTime;
	}

	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

}

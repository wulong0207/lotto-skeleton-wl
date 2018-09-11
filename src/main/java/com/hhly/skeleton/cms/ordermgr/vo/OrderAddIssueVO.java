package com.hhly.skeleton.cms.ordermgr.vo;

import com.hhly.skeleton.base.vo.PageVO;

import java.util.Date;

/**
 * @author huangb
 *
 * @Date 2016年12月16日
 *
 * @Desc 追号期数信息
 */
public class OrderAddIssueVO extends PageVO {

	private static final long serialVersionUID = -8024425610065189892L;
	/**
	 * 增长ID
	 */
	private Long id;
	/**
	 * 追号编号
	 */
	private String orderAddCode;
	/**
	 * 订单编号
	 */
	private String orderCode;
	/**
	 * 彩期期号
	 */
	private String issueCode;
	/**
	 * 认购金额
	 */
	private Double buyAmount;
	/**
	 * 倍数
	 */
	private Integer multiple;
	/**
	 * 追号状态；1：追号成功；2：追号失败；3：系统撤单；4：用户撤单；5：等待追号
	 */
	private Short addStatus;
	/**
	 * 税前奖金
	 */
	private Double preBonus;
	/**
	 * 追号时间,完成下单的时间
	 */
	private Date addTime;
	/**
	 * 操作时间，用户修改操作的时间(包括系统CMS用户)
	 */
	private Date modifyTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 创建时间
	 */
	private Date createTime;

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

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getIssueCode() {
		return issueCode;
	}

	public void setIssueCode(String issueCode) {
		this.issueCode = issueCode;
	}

	public Double getBuyAmount() {
		return buyAmount;
	}

	public void setBuyAmount(Double buyAmount) {
		this.buyAmount = buyAmount;
	}

	public Integer getMultiple() {
		return multiple;
	}

	public void setMultiple(Integer multiple) {
		this.multiple = multiple;
	}

	public Short getAddStatus() {
		return addStatus;
	}

	public void setAddStatus(Short addStatus) {
		this.addStatus = addStatus;
	}

	public Double getPreBonus() {
		return preBonus;
	}

	public void setPreBonus(Double preBonus) {
		this.preBonus = preBonus;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
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

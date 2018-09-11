package com.hhly.skeleton.task.order.bo;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 追号期数信息
 * @author huangb
 * @date 2017年4月20日
 * @company 益彩网络
 * @version v1.0
 */
public class ChaseIssueBO extends BaseBO {

	private static final long serialVersionUID = -1418914761746529666L;
	/**
	 * 增长ID
	 */
	private Long id;
	/**
	 * 自定义追号编号
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
	 * 追号顺序标识
	 */
	private Integer flag;

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

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

}

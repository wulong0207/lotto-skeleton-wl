package com.hhly.skeleton.task.order.bo;

/**
 * @desc 追号投注内容(与订单明细内容基本一致，生成订单时即作为明细内容入表)
 * @author huangb
 * @date 2017年4月24日
 * @company 益彩网络
 * @version v1.0
 */
public class ChaseContentBO extends OrderDetailBO {
	private static final long serialVersionUID = 4681470968798065608L;
	/**
	 * 追号投注内容编号
	 */
	private String orderAddCode;

	public ChaseContentBO() {
	}

	/**
	 * 构造
	 * 
	 * @param planContent
	 *            投注内容
	 * @param multiple
	 *            倍数
	 * @param amount
	 *            倍数
	 * @param codeWay
	 *            选号方式 1：手选；2：机选；3：上传；
	 * @param contentType
	 *            内容类型 1：单式；2：复式；3：胆拖；
	 * @param lotteryChildCode
	 *            子玩法ID
	 * @param buyNumber
	 *            注数
	 */
	public ChaseContentBO(String planContent, Integer multiple, Double amount, Integer codeWay, Integer contentType,
			Integer lotteryChildCode, Integer buyNumber) {
		super.setPlanContent(planContent);
		super.setMultiple(multiple);
		super.setAmount(amount);
		super.setCodeWay(codeWay);
		super.setContentType(contentType);
		super.setLotteryChildCode(lotteryChildCode);
		super.setBuyNumber(buyNumber);
	}

	public String getOrderAddCode() {
		return orderAddCode;
	}

	public void setOrderAddCode(String orderAddCode) {
		this.orderAddCode = orderAddCode;
	}
}

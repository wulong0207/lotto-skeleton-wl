package com.hhly.skeleton.base.mq;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * @desc 开奖后追号订单创建的队列消息模型(主要用于开奖后，对当前期的追号生成订单(针对有停追条件的追号))
 * @author huangb
 * @date 2017年5月29日
 * @company 益彩网络
 * @version v1.0
 */
public class ChaseOrderCreateAfterDrawMsgModel extends BaseVO {

	private static final long serialVersionUID = -1167548392534776289L;
	/**
	 * 彩种；必填
	 */
	private Integer lotteryCode;
	/**
	 * 期号：选填；暂时不会用该条件，追号只针对当前期
	 */
	private String issueCode;

	public ChaseOrderCreateAfterDrawMsgModel() {
	}

	public ChaseOrderCreateAfterDrawMsgModel(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public ChaseOrderCreateAfterDrawMsgModel(Integer lotteryCode, String issueCode) {
		this(lotteryCode);
		this.issueCode = issueCode;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getIssueCode() {
		return issueCode;
	}

	public void setIssueCode(String issueCode) {
		this.issueCode = issueCode;
	}

}

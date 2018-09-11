package com.hhly.skeleton.base.mq;

import com.hhly.skeleton.base.vo.BaseVO;

/**
 * @desc 订单未支付过期比赛时间点队列消息模型(主要用户竞技彩对阵比赛时间变化的监听)
 * @author huangb
 * @date 2017年5月29日
 * @company 益彩网络
 * @version v1.0
 */
public class OrderOverdueMsgModel extends BaseVO {

	private static final long serialVersionUID = -1058500200364339546L;

	/**
	 * 彩种编号
	 */
	private Integer lotteryCode;
	/**
	 * 彩期编号
	 */
	private String issueCode;

	public OrderOverdueMsgModel() {
	}

	public OrderOverdueMsgModel(Integer lotteryCode, String issueCode) {
		this.lotteryCode = lotteryCode;
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


    @Override
    public String toString() {
        return "OrderOverdueMsgModel{" +
                "lotteryCode=" + lotteryCode +
                ", issueCode='" + issueCode + '\'' +
                '}';
    }
}

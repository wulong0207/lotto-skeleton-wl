package com.hhly.skeleton.lotto.base.order.vo;

import java.util.List;

import com.hhly.skeleton.base.vo.BaseVO;


/**
 * @desc    中奖VO
 * @author  Tony Wang
 * @date    2017年8月12日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class WinVO extends BaseVO {

	/**
	 * 彩种代码
	 */
	private Integer lotteryCode;
	/**
	 * 1：未开奖；2：未中奖；3：已中奖；4：已派奖
	 */
	private List<Integer> winningStatuses;
	
	/**
	 * 1：待上传；2：待拆票；3：拆票中；4：待出票；5:出票中；6：已出票；7：出票失败；8：已撤单;9拆票失败;10撤单中
	 */
	private Integer orderStatus;
	
	/**
	 * 排序条件
	 */
	private String orderField;
	
	private String orderValue;
	
	
	/**
	 * 查询记录数
	 */
	private Integer limit;

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public List<Integer> getWinningStatuses() {
		return winningStatuses;
	}

	public void setWinningStatuses(List<Integer> winningStatuses) {
		this.winningStatuses = winningStatuses;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public String getOrderField() {
		return orderField;
	}

	public void setOrderField(String orderField) {
		this.orderField = orderField;
	}

	public String getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(String orderValue) {
		this.orderValue = orderValue;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}
}

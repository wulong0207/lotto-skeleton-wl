package com.hhly.skeleton.lotto.base.activity.vo;

import java.util.List;

/**
 * 新用户活动（注册送活动）VO
 *
 * @author huangchengfang1219
 * @date 2018年1月11日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class ActivityNewUserVO extends BaseActivityVO {

	private static final long serialVersionUID = 7759226690198597953L;

	/**
	 * 投注内容
	 */
	private String planContent;

	private List<ActivityNewUserOrderVO> orderDetailList;

	public String getPlanContent() {
		return planContent;
	}

	public void setPlanContent(String planContent) {
		this.planContent = planContent;
	}

	public List<ActivityNewUserOrderVO> getOrderDetailList() {
		return orderDetailList;
	}

	public void setOrderDetailList(List<ActivityNewUserOrderVO> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}

}

package com.hhly.skeleton.lotto.base.operate.bo;

import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * 帮助中心彩种
 *
 * @author huangchengfang1219
 * @date 2018年2月22日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OperateHelpLotteryBO extends BaseBO {

	private static final long serialVersionUID = -4878322058356316630L;

	/**
	 * 彩种分类:1福彩(福彩+数字彩), 2高频, 3体彩(体彩+数字彩), 4竞技彩
	 */
	private Short category;

	/**
	 * 彩种分类名称
	 */
	private String categoryName;

	/**
	 * 彩种列表
	 */
	private List<OperateHelpLotteryTypeBO> lotteryList;

	public Short getCategory() {
		return category;
	}

	public void setCategory(Short category) {
		this.category = category;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<OperateHelpLotteryTypeBO> getLotteryList() {
		return lotteryList;
	}

	public void setLotteryList(List<OperateHelpLotteryTypeBO> lotteryList) {
		this.lotteryList = lotteryList;
	}

}

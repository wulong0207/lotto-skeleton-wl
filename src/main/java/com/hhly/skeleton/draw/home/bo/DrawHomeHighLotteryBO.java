package com.hhly.skeleton.draw.home.bo;

import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 高频彩开奖主页开奖彩种
 * @author huangchengfang1219
 * @date 2017年10月11日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class DrawHomeHighLotteryBO extends BaseBO {

	private static final long serialVersionUID = -1156939442188122322L;

	private Integer childCategoryId;

	private String childCategoryName;

	private List<DrawHomeLotteryIssueBO> drawLotteryList;

	public Integer getChildCategoryId() {
		return childCategoryId;
	}

	public void setChildCategoryId(Integer childCategoryId) {
		this.childCategoryId = childCategoryId;
	}

	public String getChildCategoryName() {
		return childCategoryName;
	}

	public void setChildCategoryName(String childCategoryName) {
		this.childCategoryName = childCategoryName;
	}

	public List<DrawHomeLotteryIssueBO> getDrawLotteryList() {
		return drawLotteryList;
	}

	public void setDrawLotteryList(List<DrawHomeLotteryIssueBO> drawLotteryList) {
		this.drawLotteryList = drawLotteryList;
	}

}

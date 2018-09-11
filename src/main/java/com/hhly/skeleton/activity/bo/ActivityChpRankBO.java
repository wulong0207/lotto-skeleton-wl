package com.hhly.skeleton.activity.bo;

import java.util.List;

/**
 * @desc 竞猜排行展示
 * @author lidecheng
 * @date 2018年4月4日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class ActivityChpRankBO {
	/**
	 * 我的排行
	 */
	private ActivityChpUserBO myRank;
	/**
	 * 排行列表
	 */
	private List<ActivityChpUserBO> rankList;
	public ActivityChpUserBO getMyRank() {
		return myRank;
	}
	public void setMyRank(ActivityChpUserBO myRank) {
		this.myRank = myRank;
	}
	public List<ActivityChpUserBO> getRankList() {
		return rankList;
	}
	public void setRankList(List<ActivityChpUserBO> rankList) {
		this.rankList = rankList;
	}		
}

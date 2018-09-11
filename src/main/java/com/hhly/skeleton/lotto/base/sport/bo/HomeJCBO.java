package com.hhly.skeleton.lotto.base.sport.bo;

import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.lotto.base.issue.bo.IssueLottJCBO;
import com.hhly.skeleton.lotto.base.lottery.bo.LotteryBO;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @desc  主页竞彩比赛信息
 * @author lidecheng
 * @date 2017年4月4日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class HomeJCBO extends BaseBO{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3747095252369234375L;
	/**比赛issue*/
	private List<IssueLottJCBO> issueList;                                                                                                                             
	/**竞彩比赛信息*/
	private List<JcOldDataBO> jcList;
	
	private LotteryBO lottery;
	
	public HomeJCBO(List<IssueLottJCBO> issueList,List<JcOldDataBO> jcList,LotteryBO lottery){
		this.issueList = issueList;
		this.jcList = jcList;
		this.lottery = lottery;
	}
	
	public LotteryBO getLottery() {
		return lottery;
	}

	public void setLottery(LotteryBO lottery) {
		this.lottery = lottery;
	}

	public List<IssueLottJCBO> getIssueList() {
		return issueList;
	}
	public void setIssueList(List<IssueLottJCBO> issueList) {
		this.issueList = issueList;
	}
	public List<JcOldDataBO> getJcList() {
		return jcList;
	}
	public void setJcList(List<JcOldDataBO> jcList) {
		this.jcList = jcList;
	}


	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("issueList", issueList)
				.append("jcList", jcList)
				.append("lottery", lottery)
				.toString();
	}
}

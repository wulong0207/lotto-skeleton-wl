package com.hhly.skeleton.base.issue.itf;

import com.hhly.skeleton.base.issue.entity.CatchIssueBO;

/**
 * 
 * @desc 抓取期号信息接口
 * @author jiangwei
 * @date 2017年4月13日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public interface ICatchIssue {
	/**
	 * 抓取第三方彩期信息
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年4月13日 下午5:18:37
	 * @param issueCode
	 * @param lotteryCode
	 * @return 包含期号，官方开售时间，官方截止时间，官方开奖时间
	 */
	CatchIssueBO getIssue(String issueCode,int lotteryCode);
}

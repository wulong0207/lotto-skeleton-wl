package com.hhly.skeleton.base.issue.itf;

import com.hhly.skeleton.base.issue.entity.CatchIssueBO;
import com.hhly.skeleton.base.issue.entity.NewIssueBO;
import com.hhly.skeleton.base.issue.entity.NewTypeBO;
/**
 * @desc 同步出票商
 * @author jiangwei
 * @date 2017年12月21日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class SynDealerHighIssueBuilder extends HighIssueBuilder {

	private CatchIssueBO catchIssueBO;
	
	public SynDealerHighIssueBuilder(NewIssueBO lastIssuePO, NewTypeBO lotteryBO) {
		super(lastIssuePO, lotteryBO);
	}

	@Override
	public void computeOfficialEndTime() {
		catchIssueBO = lotteryBO.getNewIssueBO(issuePO.getIssueCode());
		issuePO.setOfficialEndTime(catchIssueBO.getEndTime());
	}
	
}

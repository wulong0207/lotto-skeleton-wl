package com.hhly.skeleton.base.issue.itf;


import java.util.Date;

import org.apache.commons.lang.time.DateUtils;

import com.hhly.skeleton.base.common.LotteryEnum.LotIssueSaleStatus;
import com.hhly.skeleton.base.exception.ServiceRuntimeException;
import com.hhly.skeleton.base.issue.entity.CatchIssueBO;
import com.hhly.skeleton.base.issue.entity.NewIssueBO;
import com.hhly.skeleton.base.issue.entity.NewTypeBO;

/**
 * @desc 老足彩同步第三方生成彩期
 * @author jiangwei
 * @date 2017-1-20
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OldFootIssueBuilder extends AbstractIssueBuilder implements
		IIssueBuilder {
	
	private CatchIssueBO catchIssueBO;

	public OldFootIssueBuilder(NewIssueBO lastIssuePO, NewTypeBO lotteryBO) {
		super(lastIssuePO, lotteryBO);
	}

	@Override
	public void computeIssueCode() {
		if(lotteryBO.getCatchIssue() == null){
			throw new ServiceRuntimeException(lotteryBO.getLotteryName()+"彩种同步第三方未实现");
		}
		catchIssueBO = lotteryBO.getNewIssueBO(lastIssuePO.getIssueCode());
		issuePO.setIssueCode(catchIssueBO.getIssueCode());
	}

	@Override
	public void computeOfficialEndTime() {
		issuePO.setOfficialEndTime(catchIssueBO.getEndTime());
	}

	@Override
	public void computeLotteryTime() {
		issuePO.setLotteryTime(DateUtils.setHours(catchIssueBO.getPrizeTime(), 11));
	}
	
	@Override
	protected short normalSale(){
		return LotIssueSaleStatus.NOT_SALE.getValue();
	}

	@Override
	public void computeSaleTime() {
		issuePO.setOfficialStartTime(catchIssueBO.getStartTime());
		//官方销售时间+设置的值
		Date saleTime = DateUtils.addSeconds(catchIssueBO.getStartTime(), lotteryBO.getSaleTime());
		issuePO.setSaleTime(saleTime);
	}

	@Override
	protected void handleIssueCodeBefore() {
		
	}

	@Override
	protected void handleIssueCodeAfter() {
		
	}
	
	
}

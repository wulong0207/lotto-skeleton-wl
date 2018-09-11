package com.hhly.skeleton.base.issue.director;

import java.util.Objects;

import org.springframework.util.Assert;

import com.hhly.skeleton.base.bo.ResultBO;
import com.hhly.skeleton.base.common.LotteryEnum;
import com.hhly.skeleton.base.common.LotteryEnum.Lottery;
import com.hhly.skeleton.base.common.LotteryEnum.SynIssue;
import com.hhly.skeleton.base.exception.ServiceRuntimeException;
import com.hhly.skeleton.base.issue.entity.NewIssueBO;
import com.hhly.skeleton.base.issue.entity.NewTypeBO;
import com.hhly.skeleton.base.issue.itf.HighIssueBuilder;
import com.hhly.skeleton.base.issue.itf.IIssueBuilder;
import com.hhly.skeleton.base.issue.itf.NumberIssueBuilder;
import com.hhly.skeleton.base.issue.itf.OldFootIssueBuilder;
import com.hhly.skeleton.base.issue.itf.SingleMarketIssueBuilder;
import com.hhly.skeleton.base.issue.itf.SportIssueBuilder;
import com.hhly.skeleton.base.issue.itf.SynDealerHighIssueBuilder;

/**
 * @desc 彩期指导建造者
 * @author jiangwei
 * @date 2017-1-20
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class IssueDirector {
     /**
      * 跟据彩期生成器创建彩期
     * @author jiangwei
     * @Version 1.0
     * @CreatDate 2017-1-20 下午2:21:21
     * @param builder 闯入指定的彩期生成器
     * @return 返回彩期
     */
    public NewIssueBO createLotteryIssue(IIssueBuilder builder){
    	 if(builder != null){
    		 builder.before();
    		 
    		 builder.computeIssueCode();
    		 
    		 builder.computeIssueStatus();
    		 
    		 builder.computeOfficialEndTime();
    		 
    		 builder.computeLotteryTime();
    		 
    		 builder.computeSaleTime();
    		 
    		 builder.computeSaleEndTime();
    		 
    		 builder.after();
    		 
    		 return builder.getLotteryIssuePO();
    	 }
    	 return null;
     }
    
    /**
     * 创建指定的彩期生成器
     * @author jiangwei
     * @Version 1.0
     * @CreatDate 2017-1-20 下午2:38:50
     * @param lotteryBO
     * @param issue
     * @return
     */
    public IIssueBuilder getIssueBuilder(NewTypeBO lotteryBO,NewIssueBO issue){
    	Assert.notNull(lotteryBO,"生成彩期错误,彩种不能为空");
    	Assert.notNull(issue,"生成彩期错误,不存在上一期彩期");
    	
    	// 是否能生成彩期
    	if (0 == lotteryBO.getStopAddIssue()) {
    		throw new ServiceRuntimeException("30001",ResultBO.getMsg("30001", lotteryBO.getLotteryCode()));
    	}     
    	return  doCreateBuilder(lotteryBO, issue);
    }
    
	/** 
	 * 或得具体的生成期
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017-1-20 下午3:40:35
	 * @param lotteryBO
	 * @param issue
	 * @return
	 */
	private IIssueBuilder doCreateBuilder(NewTypeBO lotteryBO,
			NewIssueBO issue) {
		IIssueBuilder issueBuilder = null;
    	short lotteryCategory = lotteryBO.getLotteryCategory();
    	if(Objects.equals(lotteryBO.getSynIssue(),SynIssue.SYN.getValue())){
    		//同步第三方生成器
    		if(Lottery.isOldFoot(lotteryBO.getLotteryCode())){
    			issueBuilder = new OldFootIssueBuilder(issue, lotteryBO);
    		}else if(Lottery.isHigh(lotteryBO.getLotteryCode())){
    			issueBuilder = new SynDealerHighIssueBuilder(issue, lotteryBO);
    		}
    	}else{
    		if(Lottery.isOldFoot(lotteryBO.getLotteryCode())){
    			throw new ServiceRuntimeException("老足彩不能自动生成彩期");
    		}
    		//不是同步
    		if (lotteryCategory == LotteryEnum.LotteryCategory.NUM.getValue()) {
        		issueBuilder = new NumberIssueBuilder(issue, lotteryBO);
    		} else if (lotteryCategory == LotteryEnum.LotteryCategory.HIGH.getValue()) {
    			issueBuilder = new HighIssueBuilder(issue, lotteryBO);
    		} else if (lotteryCategory == LotteryEnum.LotteryCategory.SPORT.getValue()) {
    			boolean simple = Objects.equals(Lottery.BJDC.getName(),lotteryBO.getLotteryCode())
						|| Objects.equals(Lottery.SFGG.getName(),lotteryBO.getLotteryCode());
    			if(simple){
    				//北京单场，胜负过关
    				issueBuilder = new SingleMarketIssueBuilder(issue, lotteryBO);
    			}else{
    				issueBuilder = new SportIssueBuilder(issue, lotteryBO);	
    			}
    		}
    	}
		return issueBuilder;
	}
}

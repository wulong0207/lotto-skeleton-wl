package com.hhly.skeleton.base.issue;

import com.hhly.skeleton.base.issue.entity.NewIssueBO;
import com.hhly.skeleton.base.issue.entity.NewTypeBO;

/**
 * @desc 彩期抽象创建者
 * @author jiangwei
 * @date 2017-1-20
 * @company 益彩网络科技公司
 * @version 1.0
 */
public abstract class AbstractIssue {
	
	  //上一期彩期信息
	  protected final NewIssueBO lastIssuePO;
	  //彩种信息
	  protected final NewTypeBO lotteryBO;
	  //创建彩期
      protected final NewIssueBO issuePO; 
      
      public AbstractIssue(NewIssueBO lastIssuePO,NewTypeBO lotteryBO){
    	  this.lastIssuePO = lastIssuePO;
    	  this.lotteryBO = lotteryBO;
    	  issuePO = new NewIssueBO();
      }
}

package com.hhly.skeleton.base.issue;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.Assert;

import com.hhly.skeleton.base.issue.director.IssueDirector;
import com.hhly.skeleton.base.issue.entity.NewIssueBO;
import com.hhly.skeleton.base.issue.entity.NewTypeBO;
import com.hhly.skeleton.base.issue.itf.IIssueBuilder;

/**
 * @desc 彩期生成工厂
 * @author jiangwei
 * @date 2017-1-20
 * @company 益彩网络科技公司
 * @version 1.0
 */
public abstract class IssueHandler {
	
    /**
     * 创建彩期
     * 采用的建造者设计模式对不同彩种的彩期进行生成
     * @author jiangwei
     * @Version 1.0
     * @CreatDate 2017-1-20 下午2:45:12
     * @param lotteryBO 彩种信息
     * @param num 生成彩期数
     * @param issue 上一期信息（依赖彩期）
     * @return
     */
    public static List<NewIssueBO> createIssue(NewTypeBO lotteryBO, int num,
			NewIssueBO issue){
    	Assert.notNull(lotteryBO,"生成彩期错误,彩种不能为空");
    	Assert.notNull(issue,"生成彩期错误,不存在上一期彩期");
    	
    	List<NewIssueBO> issues  = new ArrayList<NewIssueBO>();
    	IssueDirector director  = new IssueDirector();
    	IIssueBuilder issueBuilder;
    	NewIssueBO lastIssuePO = issue;
    	for (int i = 0; i < num; i++) {
    		 issueBuilder = director.getIssueBuilder(lotteryBO, lastIssuePO);
    		 Assert.notNull(issueBuilder,"生成彩期错误,没有指定的彩期生成器issueBuilder");
    		 NewIssueBO issuePO = director.createLotteryIssue(issueBuilder);
    		 issues.add(issuePO);
    		 lastIssuePO = issuePO;
		}
    	return  issues;
    }
}

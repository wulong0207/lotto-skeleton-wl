package com.hhly.skeleton.base.log.visit;

import com.hhly.skeleton.base.log.entity.RunnableLog;
import com.hhly.skeleton.base.log.entity.ThreadPoolLog;

/**
 * @desc 日志界限过滤
 * @author jiangwei
 * @date 2017年3月2日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class LogLimitVisitor extends AbstractVisitor{

	
	/* 
	 * 根据任务执行时间过滤 任务执行是否超过1秒
	 * (non-Javadoc)
	 * @see com.hhly.skeleton.base.log.visit.IVisitor#visit(com.hhly.skeleton.base.log.entity.RunnableLog)
	 */
	@Override
	public boolean visit(RunnableLog bo) {
		return bo.getSpendTime() > 1000;
	}

	/* 
	 * 剩余可用的线程数
	 * (non-Javadoc)
	 * @see com.hhly.skeleton.base.log.visit.IVisitor#visit(com.hhly.skeleton.base.log.entity.ThreadPoolLog)
	 */
	@Override
	public boolean visit(ThreadPoolLog bo) {
		int num = bo.getPoolSize() - bo.getActiveCount();
		return num <= 2;
	}

}

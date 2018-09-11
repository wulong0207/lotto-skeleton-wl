package com.hhly.skeleton.base.log.visit;

import com.hhly.skeleton.base.log.entity.RunnableLog;
import com.hhly.skeleton.base.log.entity.ThreadPoolLog;

/**
 * @desc 访问者实现
 * @author jiangwei
 * @date 2017年3月2日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public interface IVisitor {
	 
     /**
      * 过滤线程任务日志
     * @author jiangwei
     * @Version 1.0
     * @CreatDate 2017年3月2日 下午4:50:57
     * @param bo
     * @return
     */
     boolean visit(RunnableLog bo);
     
     
     /**
      * 过滤线程池日志
     * @author jiangwei
     * @Version 1.0
     * @CreatDate 2017年3月2日 下午4:51:22
     * @param bo
     * @return
     */
    boolean visit(ThreadPoolLog bo);
}

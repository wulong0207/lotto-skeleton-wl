package com.hhly.skeleton.base.log.entity;

import com.hhly.skeleton.base.log.visit.IVisitor;

/**
 * @desc 用于对日志过滤接口
 * @author jiangwei
 * @date 2017年3月2日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public interface ILog {
	
	/**
	 * 根据不同的访问者，过滤指定的日志
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年3月2日 下午4:47:26
	 * @param visitor
	 * @return
	 */
	boolean visit(IVisitor visitor);
}

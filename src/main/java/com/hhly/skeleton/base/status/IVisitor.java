package com.hhly.skeleton.base.status;

/**
 * @desc 状态访问
 * @author jiangwei
 * @date 2017年3月14日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public interface IVisitor<V,P,U>{
	/**
	 * 处理状态为-2
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年3月14日 上午9:44:23
	 * @param po 数据信息
	 * @param updateStatus 要修改状态
	 * @return
	 */
	V visitNegativeTwo(P po,U update);
	/**
	 * 处理状态为-1
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年3月14日 上午9:44:23
	 * @param po 数据信息
	 * @param updateStatus 要修改状态
	 * @return
	 */
	V visitNegativeOne(P po,U update);
	/**
	 * 处理状态为0
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年3月14日 上午9:44:23
	 * @param po 数据信息
	 * @param updateStatus 要修改状态
	 * @return
	 */
	V visitZero(P po,U update);
	/**
	 * 处理状态为1
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年3月14日 上午9:44:23
	 * @param po 数据信息
	 * @param updateStatus 要修改状态
	 * @return
	 */
	V visitOne(P po,U update);
	/**
	 * 处理状态为2
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年3月14日 上午9:44:23
	 * @param po 订单数据信息
	 * @param updateStatus 要修改订单状态
	 * @return
	 */
	V visitTwo(P po,U update);
	/**
	 * 处理状态3
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年3月14日 上午9:44:23
	 * @param po 数据信息
	 * @param updateStatus 要修改状态
	 * @return
	 */
	V visitThree(P po,U update);
	/**
	 * 处理状态4
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年3月14日 上午9:44:23
	 * @param po 数据信息
	 * @param updateStatus 要修改状态
	 * @return
	 */
	V visitFour(P po,U update);
	/**
	 * 处理状态5
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年3月14日 上午9:44:23
	 * @param po 数据信息
	 * @param updateStatus 要修改状态
	 * @return
	 */
	V visitFive(P po,U update);
	/**
	 * 处理状态6
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年3月14日 上午9:44:23
	 * @param po 数据信息
	 * @param updateStatus 要修改状态
	 * @return
	 */
	V visitSix(P po,U update);
	/**
	 * 处理状态7
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年3月14日 上午9:44:23
	 * @param po 数据信息
	 * @param updateStatus 要修改状态
	 * @return
	 */
	V visitSeven(P po,U update);
	/**
	 * 处理状态8
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年3月14日 上午9:44:23
	 * @param po 数据信息
	 * @param updateStatus 要修改状态
	 * @return
	 */
	V visitEight(P po,U update);
	/**
	 * 处理状态9
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年3月14日 上午9:44:23
	 * @param po 数据信息
	 * @param updateStatus 要修改状态
	 * @return
	 */
	V visitNine(P po,U update);
	
}

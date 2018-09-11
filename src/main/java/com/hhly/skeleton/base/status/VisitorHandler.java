package com.hhly.skeleton.base.status;

import com.hhly.skeleton.base.exception.ServiceRuntimeException;
/**
 * @desc 状态处理类 
 * @author jiangwei
 * @date 2017年3月14日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public abstract class VisitorHandler {
	/**
	 * 状态处理
	 * @author jiangwei
	 * @Version 1.0
	 * @CreatDate 2017年3月14日 上午10:17:47
	 * @param status 订单状态
	 * @param bo 参数信息
	 * @param update 执行的操作
	 * @param visitor 指定处理器
	 * @return
	 */
	public static <T,P,U> T disboseOrderStatus(int status,P bo,U update,IVisitor<T,P,U> visitor){
		switch (status) {
		case -2:
			return visitor.visitNegativeTwo(bo, update);
		case -1:
			return visitor.visitNegativeOne(bo, update);
		case 0:
			return visitor.visitZero(bo, update);
		case 1:
			return visitor.visitOne(bo, update);
		case 2:
			return visitor.visitTwo(bo, update);
		case 3:
			return visitor.visitThree(bo, update);
		case 4:
			return visitor.visitFour(bo, update);
		case 5:
			return visitor.visitFive(bo, update);
		case 6:
			return visitor.visitSix(bo, update);
		case 7:
			return visitor.visitSeven(bo, update);
		case 8:
			return visitor.visitEight(bo, update);
		case 9:
			return visitor.visitNine(bo, update);
		default:
			break;
		}
		throw new ServiceRuntimeException("状态有误，没有该状态的解析方式："+ status);
	}
}

package com.hhly.skeleton.base.status;

import com.hhly.skeleton.base.exception.ServiceRuntimeException;

/**
 * @desc 状态处理抽象类，
 * 为每一个状态默认一个处理方法
 * 具体的子类根据有的状态覆盖指定方法
 * @author jiangwei
 * @date 2017年3月20日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public abstract class AbstractVisitor<V, P, U> implements IVisitor<V, P, U> {

	@Override
	public V visitNegativeTwo(P po, U update) {
		throw new ServiceRuntimeException("状态错误！");
	}

	@Override
	public V visitNegativeOne(P po, U update) {
		throw new ServiceRuntimeException("状态错误！");
	}

	@Override
	public V visitZero(P po, U update) {
		throw new ServiceRuntimeException("状态错误！");
	}

	@Override
	public V visitOne(P po, U update) {
		throw new ServiceRuntimeException("状态错误！");
	}

	@Override
	public V visitTwo(P po, U update) {
		throw new ServiceRuntimeException("状态错误！");
	}

	@Override
	public V visitThree(P po, U update) {
		throw new ServiceRuntimeException("状态错误！");
	}

	@Override
	public V visitFour(P po, U update) {
		throw new ServiceRuntimeException("状态错误！");
	}

	@Override
	public V visitFive(P po, U update) {
		throw new ServiceRuntimeException("状态错误！");
	}

	@Override
	public V visitSix(P po, U update) {
		throw new ServiceRuntimeException("状态错误！");
	}

	@Override
	public V visitSeven(P po, U update) {
		throw new ServiceRuntimeException("状态错误！");
	}

	@Override
	public V visitEight(P po, U update) {
		throw new ServiceRuntimeException("状态错误！");
	}

	@Override
	public V visitNine(P po, U update) {
		throw new ServiceRuntimeException("状态错误！");
	}

}

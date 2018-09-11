package com.hhly.skeleton.base.model;

/**
 * @author huangb
 *
 * @date 2016年11月15日
 *
 * @desc 缓存服务定义的key集合
 */
public enum CacheKey {

	/**
	 * 公共缓存：数据字典详情全量数据
	 */
	PUB_DIC_DATA_DTL("DIC_DATA_DTL"),
	/**
	 * 公共缓存：彩种投注注数，倍数截止时间配置
	 */
	PUB_LOTTERY_BET_MUL("LOTTERY_BET_MUL"),
	/**
	 * 公共缓存：彩种子玩法配置
	 */
	PUB_LOTTERY_CHILD("LOTTERY_CHILD");

	private String key;

	CacheKey(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}

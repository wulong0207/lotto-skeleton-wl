package com.hhly.skeleton.base.common.cache;

/***
 * @desc 缓存枚举接口
 * @author lidecheng
 * @date 2017年5月8日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public interface CacheEnumService {
	/***
	 * 获取缓存key
	 * @return
	 */
	String getValue();
	/***
	 * 获取缓存描述
	 * @return
	 */
    String getMessage();
}

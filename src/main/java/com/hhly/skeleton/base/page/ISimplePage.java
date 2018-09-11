package com.hhly.skeleton.base.page;

import java.util.List;

/**
 * 
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2017-1-7 上午9:05:46
 * @Desc 分页接口
 */
public interface ISimplePage<T> {
	/**
	 * 分页总行数
	 * @return
	 */
     int getTotal();
    /**
     * 分页数据
     * @return
     */
     List<T> getData();
}

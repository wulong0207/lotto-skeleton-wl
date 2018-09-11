package com.hhly.skeleton.base.page;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2017-1-9 下午4:14:13
 * @Desc 用于统计信息的页面，进行分页查询
 */
public abstract class AbstractStatisticsPage<T> implements ISimplePage<T> {
	/**
	 * 保存数据库查询统计信息
	 */
	private Map<String, Object> sis;
	/**
	 * 用于保存单页数据
	 */
	private List<T> dataList;
	/**
	 * 统计方法
	 * @return
	 */
	public abstract Object getOther();
	 
  
	public List<T> getDataList() {
		return dataList;
	}




	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}




	public Map<String, Object> getSis() {
		return sis;
	}

	public void setSis(Map<String, Object> sis) {
		this.sis = sis;
	}
     
     
}

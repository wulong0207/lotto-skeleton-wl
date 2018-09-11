package com.hhly.skeleton.base.util;

import org.springframework.beans.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author jiangwei
 * @Version 1.0
 * @CreatDate 2016-11-11 下午3:46:32
 * @Desc 用于类之间的copy (主要用户po 和 bo 之间的copy)
 */
public class CopyUtil {
	/**
	 * 把集合origList copy 到类型为T的ArrayList中
	 * @param c
	 * @param origList
	 * @return ArrayList 的集合
	 */
	public static   <T>  List<T>  copyPropertiesList(Class<T> c, List<?> origList){
		if (origList == null || origList.size() < 1) {
			return null;
		}
		List<T> result = new ArrayList<T>();
		for (Object obj : origList) {
			try {
				T bo  = c.newInstance();
				BeanUtils.copyProperties(obj,bo);
				result.add(bo);
			} catch (Exception e) {
				throw new RuntimeException("copy error");
			}
		}
		return result;
	}
	
	
	
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		/*DicDataPO po = new DicDataPO();
		po.setCreateTime(new Date());
		List<DicDataPO> list = new ArrayList<DicDataPO>();
		list.add(po);
		
		List<DicDataBO> result = copyPropertiesList(DicDataBO.class,list);
		
		System.out.println(result.get(0).getCreateTime());*/

	}
}

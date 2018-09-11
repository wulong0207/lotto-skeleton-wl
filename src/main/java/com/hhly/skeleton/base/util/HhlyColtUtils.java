package com.hhly.skeleton.base.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 集合工具类
 * @author wytong
 * @Version 1.0
 * @CreatDate 2016年12月14日 下午2:41:20
 */
public abstract class HhlyColtUtils {

	/**
	 * 判断集合是否为空
	 * @param collection
	 * @return
	 */
	public static boolean isEmpty(Collection<?> collection) {
		return (collection == null || collection.size()==0);
	}
	
	/**
	 * 集合的长度是否在范围内
	 * @param collection
	 * @param minL
	 * @param maxL
	 * @return
	 */
	public static boolean lenInRange(Collection<?> collection, int minL, int maxL) {
		if(isEmpty(collection)) return false;
		return (collection.size() >= minL && collection.size() <= maxL);
	}
	
	/**
	 * 集合的值是否在范围内
	 * @param collection
	 * @param min
	 * @param max
	 * @return
	 */
	public static boolean valInRange(Collection<Integer> collection, int min, int max) {
		if(isEmpty(collection)) return false;
		for(Integer tmp : collection) {
			if(tmp.compareTo(min) < 0 || tmp.compareTo(max) > 0)
				return false;
		}
		return true;
	}
	
	/**
	 * 判断集合是否存在重复元素
	 * @param collection
	 * @return
	 */
	public static <T>  Boolean isDuplicate(Collection<T> collection) {
		Set<T> set = new HashSet<>(collection);
		return set.size() < collection.size();
	}
	
	/**
	 * 为1~9的值添加前缀
	 * @param collection
	 * @param pre
	 * @return
	 */
	public static List<String> prefix(List<Integer> collection, String pre) {
		List<String> ret = new ArrayList<>();
		if(isEmpty(collection))
			return ret;
		for(Integer tmp : collection) {
			if (tmp < 10 && tmp >=0) 
				ret.add(pre + tmp);
			else
				ret.add(""+tmp);
		}
		return ret;
	}
	
	public static List<String> prefix(List<Integer> collection) {
		return prefix(collection, "0");
	}
	
	/**
	 * 返回多个集合的交集,集合不存在重复元素
	 * @param collections
	 * @return
	 */
	@SafeVarargs
	public static <T> Collection<T> intersect(Collection<T>... collections) {
		ConcurrentHashMap<T, Integer> statis = occurrence(collections);
		Set<T> intersect = new HashSet<>();
		if(statis.size() == 0) return intersect;
		for( Map.Entry<T, Integer> entry : statis.entrySet() ) {
			if(entry.getValue()==collections.length)
				intersect.add(entry.getKey());
		}
		return intersect;
	}
	
	/**
	 * 统计多个集合中各种值的出现次数
	 * @param collections
	 * @return
	 */
	@SafeVarargs
	public static <T> ConcurrentHashMap<T, Integer> occurrence(Collection<T>... collections) {
		ConcurrentHashMap<T, Integer> statis = new ConcurrentHashMap<>();
		for(Collection<T> col : collections) {
			if(isEmpty(col))
				return statis;
		}
		for(Collection<T> col : collections) {
			for(T tmp : col) {
				statis.putIfAbsent(tmp, 0);
				statis.put(tmp, statis.get(tmp)+1);
			}
		}
		return statis;
	}
}

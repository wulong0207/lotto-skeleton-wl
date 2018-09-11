package com.hhly.skeleton.lotto.base.operate.bo;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc  点击量缓存类
 * @author lidecheng
 * @date 2017年5月22日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class CacheClickBO extends BaseBO{
	/**
	 * 统计时间
	 */
	private Date countTime;
	/**
	 * 统计点击量对象
	 */
	private Map<String,ClickBO> clickBO = new ConcurrentHashMap<String,ClickBO>() ;

	public CacheClickBO(){
		
	}
	public CacheClickBO(Date countTime,List<ClickBO> clickBOList){
		this.countTime = countTime;
		this.clickBO  = new ConcurrentHashMap<String,ClickBO>();
		for(ClickBO bo : clickBOList){
			this.clickBO.put(bo.getId(), bo);
		}
	}
	public Date getCountTime() {
		return countTime;
	}

	public void setCountTime(Date countTime) {
		this.countTime = countTime;
	}

	public Map<String, ClickBO> getClickBO() {
		return clickBO;
	}

	public void setClickBO(Map<String, ClickBO> clickBO) {
		this.clickBO = clickBO;
	}

}

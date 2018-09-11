package com.hhly.skeleton.lotto.base.operate.bo;


import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc  点击量缓存类
 * @author lidecheng
 * @date 2017年5月22日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class ClickBO extends BaseBO{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4997857567551116879L;
	/**
	 * 主键id
	 */
	private String id;
	/***
	 * 初始化点击量
	 */
	private Integer initClick;
	/***
	 * 最新点击量
	 */
	private Integer click;
	
	public ClickBO(){
		
	}
	public ClickBO(String id,Integer click,Integer initClick){
		this.click = click;
		this.id = id;
		this.initClick = initClick;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getInitClick() {
		return initClick;
	}
	public void setInitClick(Integer initClick) {
		this.initClick = initClick;
	}
	public Integer getClick() {
		return click;
	}
	public void setClick(Integer click) {
		this.click = click;
	}	
	public boolean check(){
		if(click>initClick){
			return true;
		}
		return false;
	}
}

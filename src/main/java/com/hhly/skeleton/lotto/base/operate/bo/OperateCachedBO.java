package com.hhly.skeleton.lotto.base.operate.bo;

import java.util.Date;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.lotto.base.operate.vo.OperateCachedVO;

/**
 * @desc  缓存数据的信息
 * @author lidecheng
 * @date 2017年4月21日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class OperateCachedBO extends BaseBO{
	/**上传用户的ip*/
	private String ip;
	/**缓存文件id*/
	private String id;
	/**缓存文件数量*/
	private Integer num;
	/**创建时间*/
	private Date crateDate;
	/**上传用户的userId*/
	private Integer userId;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Date getCrateDate() {
		return crateDate;
	}
	public void setCrateDate(Date crateDate) {
		this.crateDate = crateDate;
	}
	public OperateCachedBO(){
		
	}
	public OperateCachedBO(OperateCachedVO vo){
		this.id = vo.getId();
		this.ip = vo.getIp();
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	
}

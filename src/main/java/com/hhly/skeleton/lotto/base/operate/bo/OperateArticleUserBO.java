package com.hhly.skeleton.lotto.base.operate.bo;

import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 彩票专栏用户信息
 * @author lidecheng
 * @date 2017年3月28日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OperateArticleUserBO extends BaseBO{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8269356961792477361L;
	private String userName;
	private String headUrl;
	private String userRemark;
	private List<OperateArticleBaseBO> artList;

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getHeadUrl() {
		return headUrl;
	}
	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}
	public String getUserRemark() {
		return userRemark;
	}
	public void setUserRemark(String userRemark) {
		this.userRemark = userRemark;
	}
	public List<OperateArticleBaseBO> getArtList() {
		return artList;
	}
	public void setArtList(List<OperateArticleBaseBO> artList) {
		this.artList = artList;
	}
	
}

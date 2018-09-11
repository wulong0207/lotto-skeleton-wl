package com.hhly.skeleton.lotto.mobile.news.bo;

import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.lotto.base.operate.bo.OperateArticleLottBO;

/**
 * @desc 资讯详情页信息
 * @author lidecheng
 * @date 2017年3月29日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class MobialNewsDetailPageBO extends BaseBO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1777488356324767004L;
	/**
	 * 资讯详情信息
	 */
	private OperateArticleLottBO operArtDetail;
	/**
	 * 相似资讯信息
	 */	
	private List<OperateArticleLottBO> operArtList;
	
	public MobialNewsDetailPageBO(OperateArticleLottBO operArtDetail,List<OperateArticleLottBO> operArtList){
		this.operArtDetail= operArtDetail;
		this.operArtList= operArtList;
	}
	public OperateArticleLottBO getOperArtDetail() {
		return operArtDetail;
	}
	public void setOperArtDetail(OperateArticleLottBO operArtDetail) {
		this.operArtDetail = operArtDetail;
	}
	public List<OperateArticleLottBO> getOperArtList() {
		return operArtList;
	}
	public void setOperArtList(List<OperateArticleLottBO> operArtList) {
		this.operArtList = operArtList;
	}
	
}

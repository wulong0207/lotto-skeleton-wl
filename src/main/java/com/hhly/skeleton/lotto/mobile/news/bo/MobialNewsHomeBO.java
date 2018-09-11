package com.hhly.skeleton.lotto.mobile.news.bo;

import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.lotto.base.operate.bo.OperateAdLottoBO;
import com.hhly.skeleton.lotto.base.operate.bo.OperateArticleLottBO;
import com.hhly.skeleton.lotto.base.operate.bo.OperateFastLottBO;
import com.hhly.skeleton.lotto.base.operate.bo.OperateLotteryDetailBO;

/**
 * @desc 资讯主页信息
 * @author lidecheng
 * @date 2017年3月29日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class MobialNewsHomeBO extends BaseBO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1777488356324767004L;
	 /**
	 * 广告信息
	 */
	private List<OperateAdLottoBO> operAdList;
	
	/**
	 * 快投信息
	 */
	private List<OperateFastLottBO> operFastList; 
	/**
	 * 首页资讯信息
	 */
	
	public MobialNewsHomeBO(
			List<OperateAdLottoBO> operAdList,
			List<OperateArticleLottBO> operArtList,
			List<OperateFastLottBO> operFastList){		
		this.operAdList = operAdList;
		this.operArtList = operArtList;
		this.operFastList = operFastList;
	}
	private List<OperateArticleLottBO> operArtList;
	public List<OperateAdLottoBO> getOperAdList() {
		return operAdList;
	}
	public void setOperAdList(List<OperateAdLottoBO> operAdList) {
		this.operAdList = operAdList;
	}
	public List<OperateFastLottBO> getOperFastList() {
		return operFastList;
	}
	public void setOperFastList(List<OperateFastLottBO> operFastList) {
		this.operFastList = operFastList;
	}
	public List<OperateArticleLottBO> getOperArtList() {
		return operArtList;
	}
	public void setOperArtList(List<OperateArticleLottBO> operArtList) {
		this.operArtList = operArtList;
	}
	
	
}

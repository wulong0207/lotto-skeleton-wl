package com.hhly.skeleton.lotto.mobile.home.bo;
import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;
import com.hhly.skeleton.lotto.base.operate.bo.OperateAdLottoBO;
import com.hhly.skeleton.lotto.base.operate.bo.OperateArticleLottBO;
import com.hhly.skeleton.lotto.base.operate.bo.OperateFastLottBO;
import com.hhly.skeleton.lotto.base.operate.bo.OperateLottBO;
import com.hhly.skeleton.lotto.base.operate.bo.OperateLotteryDetailBO;
import com.hhly.skeleton.lotto.base.order.bo.UserWinInfoBO;

/**
 * @desc  资讯首页头部接口
 * @author lidecheng
 * @date 2017年3月8日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class MobailHomeBO  extends BaseBO{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3588908982957020846L;

	private Integer openStatus;
	/**
	 * 主页彩种运营信息
	 */
	private List<OperateLotteryDetailBO>  operLottList;
	
	/**
	 * 广告信息
	 */
	private List<OperateAdLottoBO> operAdList;
	/**
	 * 首页资讯信息
	 */
	private List<OperateArticleLottBO> operArtList;
	
	/**
	 * 
	 */
	private List<OperateLottBO> lotteryList;
	/**
	 * 快投信息
	 */
	private List<OperateFastLottBO> operFastList;

	/**
	 * 用户中奖轮播信息
	 */
	private List<String> winInfoList;

	
	public MobailHomeBO(List<OperateLotteryDetailBO>  operLottList,
			List<OperateAdLottoBO> operAdList,
			List<OperateArticleLottBO> operArtList,
			List<OperateFastLottBO> operFastList,
			List<String> winInfoList,
			List<OperateLottBO> lotteryList,
			Integer openStatus){
		
		this.operAdList = operAdList;
		this.operArtList = operArtList;
		this.operFastList = operFastList;
		this.winInfoList = winInfoList;
		this.operLottList = operLottList;
		this.lotteryList = lotteryList;
		this.openStatus = openStatus;
	}
	public List<OperateLotteryDetailBO> getOperLottList() {
		return operLottList;
	}
	public void setOperLottList(List<OperateLotteryDetailBO> operLottList) {
		this.operLottList = operLottList;
	}
	public List<OperateAdLottoBO> getOperAdList() {
		return operAdList;
	}
	public void setOperAdList(List<OperateAdLottoBO> operAdList) {
		this.operAdList = operAdList;
	}
	public List<OperateArticleLottBO> getOperArtList() {
		return operArtList;
	}
	public void setOperArtList(List<OperateArticleLottBO> operArtList) {
		this.operArtList = operArtList;
	}
	public List<OperateFastLottBO> getOperFastList() {
		return operFastList;
	}
	public void setOperFastList(List<OperateFastLottBO> operFastList) {
		this.operFastList = operFastList;
	}
	public List<OperateLottBO> getLotteryList() {
		return lotteryList;
	}
	public void setLotteryList(List<OperateLottBO> lotteryList) {
		this.lotteryList = lotteryList;
	}
	public Integer getOpenStatus() {
		return openStatus;
	}
	public void setOpenStatus(Integer openStatus) {
		this.openStatus = openStatus;
	}

	public List<String> getWinInfoList() {
		return winInfoList;
	}

	public void setWinInfoList(List<String> winInfoList) {
		this.winInfoList = winInfoList;
	}
}

package com.hhly.skeleton.lotto.base.operate.bo;
import java.util.List;

import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 彩种运营类
 * @author lidecheng
 * @date 2017年3月14日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OperateLotteryBO  extends BaseBO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5980683085524076599L;
	private Integer id;
	/**
	 * 上线时间
	 */
	private String onlineTime;
	/**
	 * 下线时间
	 */
	private String offlineTime;
	/**
	 * 上线周期
	 */
	private Short onlineWeek;
	/**
	 * 下线周期
	 */
	private Short offlineWeek;
	
	private List<OperateLotteryDetailBO> lotteryInfoList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOnlineTime() {
		return onlineTime;
	}

	public void setOnlineTime(String onlineTime) {
		this.onlineTime = onlineTime;
	}

	public String getOfflineTime() {
		return offlineTime;
	}

	public void setOfflineTime(String offlineTime) {
		this.offlineTime = offlineTime;
	}

	public Short getOnlineWeek() {
		return onlineWeek;
	}

	public void setOnlineWeek(Short onlineWeek) {
		this.onlineWeek = onlineWeek;
	}

	public Short getOfflineWeek() {
		return offlineWeek;
	}

	public void setOfflineWeek(Short offlineWeek) {
		this.offlineWeek = offlineWeek;
	}

	public List<OperateLotteryDetailBO> getLotteryInfoList() {
		return lotteryInfoList;
	}

	public void setLotteryInfoList(List<OperateLotteryDetailBO> lotteryInfoList) {
		this.lotteryInfoList = lotteryInfoList;
	}	
}

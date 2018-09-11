package com.hhly.skeleton.lotto.base.cooperate.vo;


import java.util.Date;

import com.hhly.skeleton.base.util.DateUtil;
import com.hhly.skeleton.base.vo.PageVO;

/**
 * @Description 商户信息查询参数封装
 * @Author lidecheng
 * @Date 2018/3/24 18:04
 * @Since 1.8
 */

public class CoOperateRecordQueryVO extends PageVO {
	
	private String channelToken;
	/**
	 * 渠道id
	 */
	private String channelId;
	
	/**
	 * 兑换状态;1,已分配;2,未分配;3,待兑换;4,已兑换;5,已过期
	 */
	private Short status;
	
	
	/**
	 * 查询彩种
	 */
	private Integer lotteryCode;
	
	/**
	 * 本站兑换码
	 */
	private String myCdkey;
	/**
	 * 查询开始时间
	 */
	private Date startTime;
	/**
	 * 查询结束时间
	 */
	private Date endTime;

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public String getMyCdkey() {
		return myCdkey;
	}

	public void setMyCdkey(String myCdkey) {
		this.myCdkey = myCdkey;
	}

	public String getChannelToken() {
		return channelToken;
	}

	public void setChannelToken(String channelToken) {
		this.channelToken = channelToken;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}	
	
	
}

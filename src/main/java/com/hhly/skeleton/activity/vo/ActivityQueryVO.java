package com.hhly.skeleton.activity.vo;
import java.util.Date;
import com.hhly.skeleton.base.bo.BaseBO;

/**
 * @desc 活动查询vo类
 * @author lidecheng
 * @date 2017年6月30日
 * @company 益彩网络科技公司
 * @version 1.0
 */
@SuppressWarnings("serial")
public class ActivityQueryVO extends BaseBO{
	/**彩种类型*/
	private Integer lotteryCode;
	/**查询起始时间*/
	private Date selectTime;
	/**查询结束时间*/
	private Date endTime;
	public Integer getLotteryCode() {
		return lotteryCode;
	}
	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}
	public Date getSelectTime() {
		return selectTime;
	}
	public void setSelectTime(Date selectTime) {
		this.selectTime = selectTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}	
}

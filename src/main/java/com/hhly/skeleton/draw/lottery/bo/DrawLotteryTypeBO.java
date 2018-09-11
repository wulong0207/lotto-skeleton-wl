package com.hhly.skeleton.draw.lottery.bo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hhly.skeleton.lotto.base.lottery.bo.LotteryBO;

/**
 * @desc
 * @author huangchengfang1219
 * @date 2017年10月25日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class DrawLotteryTypeBO extends LotteryBO {

	private static final long serialVersionUID = 3018904983015075817L;

	/**
	 * 彩种关键字
	 */
	private String lotteryKey;

	/**
	 * 1：数字彩；2：高频彩；3：竞技彩
	 */
	private Short lotteryCategory;

	/**
	 * 高频彩子分类编码
	 */
	private Integer childCategoryId;

	/**
	 * 高频彩子分类名称
	 */
	private String childCategoryName;

	/**
	 * 开奖提示
	 */
	private String lotteryDrawText;

	/**
	 * 是否今日开奖 0:否, 1:是
	 */
	private Short isAward;

	/**
	 * 1：福彩；2：体彩
	 */
	private Short adminCategory;

	/**
	 * 地区ID
	 */
	@JsonIgnore
	private Integer area;

	/**
	 * 地区名
	 */
	@JsonIgnore
	private String areaName;

	/**
	 * 每天彩期总数
	 */
	private Integer totalIssueNum;

	/**
	 * 每天遗留彩期
	 */
	private Integer tomorrowIssueNum;

	/**
	 * 记录缓存时间，用于判断是否需要重新加载缓存
	 */
	@JsonIgnore
	private Date cacheTime;

	/**
	 * 高频彩最早开奖日期
	 */
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date minDrawDate;

	public String getLotteryKey() {
		return lotteryKey;
	}

	public void setLotteryKey(String lotteryKey) {
		this.lotteryKey = lotteryKey;
	}

	public String getLotteryDrawText() {
		return lotteryDrawText;
	}

	public void setLotteryDrawText(String lotteryDrawText) {
		this.lotteryDrawText = lotteryDrawText;
	}

	public Short getLotteryCategory() {
		return lotteryCategory;
	}

	public void setLotteryCategory(Short lotteryCategory) {
		this.lotteryCategory = lotteryCategory;
	}

	public Integer getChildCategoryId() {
		return childCategoryId;
	}

	public void setChildCategoryId(Integer childCategoryId) {
		this.childCategoryId = childCategoryId;
	}

	public String getChildCategoryName() {
		return childCategoryName;
	}

	public void setChildCategoryName(String childCategoryName) {
		this.childCategoryName = childCategoryName;
	}

	@JsonIgnore
	public String getDrawTime() {
		return super.getDrawTime();
	}

	public Short getIsAward() {
		return isAward;
	}

	public void setIsAward(Short isAward) {
		this.isAward = isAward;
	}

	public Short getAdminCategory() {
		return adminCategory;
	}

	public void setAdminCategory(Short adminCategory) {
		this.adminCategory = adminCategory;
	}

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Integer getTotalIssueNum() {
		return totalIssueNum;
	}

	public void setTotalIssueNum(Integer totalIssueNum) {
		this.totalIssueNum = totalIssueNum;
	}

	public Integer getTomorrowIssueNum() {
		return tomorrowIssueNum;
	}

	public void setTomorrowIssueNum(Integer tomorrowIssueNum) {
		this.tomorrowIssueNum = tomorrowIssueNum;
	}

	@JsonIgnore
	public String getSailDayCycle() {
		return super.getSailDayCycle();
	}

	public Date getCacheTime() {
		return cacheTime;
	}

	public void setCacheTime(Date cacheTime) {
		this.cacheTime = cacheTime;
	}

	public Date getMinDrawDate() {
		return minDrawDate;
	}

	public void setMinDrawDate(Date minDrawDate) {
		this.minDrawDate = minDrawDate;
	}

}

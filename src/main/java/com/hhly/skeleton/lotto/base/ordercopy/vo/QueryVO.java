package com.hhly.skeleton.lotto.base.ordercopy.vo;

import java.util.Date;

import com.hhly.skeleton.base.vo.PageVO;
/**
 * 抄单综合查询 VO
 * @author longguoyou
 * @date 2017年9月23日
 * @compay 益彩网络科技有限公司
 */
public class QueryVO extends PageVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 彩种
	 * */
	private Integer lotteryCode;
	
	/**
	 * 用户级别 1：专家 0：普通用户
	 */
	private Integer level;
	/**
	 * 是否展示 1：展示 0：隐藏
	 */
	private Integer isShow;
	/**
	 * 关注表，数据有效性 1：有效 0：无效
	 */
	private Integer dataStatus;
	/**
	 * 排序条件 
	 */
	private Integer sortCondition;
	/**
	 * 普通用户ID
	 */
	private Integer userId;
    /**
     * 发单用户ID
     */
	private Integer issueUserId;
    /**
     * 查询类型：区分实单查询
	 * 1：首页实单查询；2：实单综合查询; 3：专家详情页实单; 4：专家页面实单; 5：动态列表实单(与我相关) 6:抄单详情，更多推荐查询
	 * 默认推荐该专家下的抄单推荐，如果没有可以推荐其他专家的订单（按命中率排序，取前五条）
     */
	private Integer queryType;
	/**
	 * 订单编号
	 */
	private String orderCode;
	/**
	 * 近几天数
	 */
	private Integer daysNum;
	/**
	 * 开始时间
	 */
	private Date beginTime;
	/**
	 * 结束时间
	 */
	private Date endTime;
	/**
	 * 用户登录token
	 */
	private String token;
	
	/**
	 * 1、实单查询：是否开赛 ，值空查询所有，非空未开赛；<br>
	 */
	private Integer flag;
	/**
	 * 2、专家查询：传值60，表示盈利率60%以上；<br>
	 */
	private Double percent;
	/**
	 * 所有实单，值不空时，查询结果为order_status不过滤的所有实单
	 */
	private Integer all;
	/**
	 * 发单类型：1、实单；2、推荐
	 */
	private Integer issueType;
	/**
	 * tab标签：<br>
	 *     1:实单全部；2：实单足球；3：实单篮球；4：推荐全部
	 */
	private Integer tabType;

	public Integer getTabType() {
		return tabType;
	}

	public void setTabType(Integer tabType) {
		this.tabType = tabType;
	}

	public Integer getIssueType() {
		return issueType;
	}

	public void setIssueType(Integer issueType) {
		this.issueType = issueType;
	}

	public Integer getAll() {
		return all;
	}

	public void setAll(Integer all) {
		this.all = all;
	}

	public Double getPercent() {
		return percent;
	}

	public void setPercent(Double percent) {
		this.percent = percent;
	}

	public Integer getLotteryCode() {
		return lotteryCode;
	}

	public void setLotteryCode(Integer lotteryCode) {
		this.lotteryCode = lotteryCode;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getIsShow() {
		return isShow;
	}

	public void setIsShow(Integer isShow) {
		this.isShow = isShow;
	}

	public Integer getDataStatus() {
		return dataStatus;
	}

	public void setDataStatus(Integer dataStatus) {
		this.dataStatus = dataStatus;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public Integer getIssueUserId() {
		return issueUserId;
	}

	public void setIssueUserId(Integer issueUserId) {
		this.issueUserId = issueUserId;
	}

	public Integer getQueryType() {
		return queryType;
	}

	public void setQueryType(Integer queryType) {
		this.queryType = queryType;
	}

	public Integer getSortCondition() {
		return sortCondition;
	}

	public void setSortCondition(Integer sortCondition) {
		this.sortCondition = sortCondition;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	
	public Integer getDaysNum() {
		return daysNum;
	}

	public void setDaysNum(Integer daysNum) {
		this.daysNum = daysNum;
	}

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}
}

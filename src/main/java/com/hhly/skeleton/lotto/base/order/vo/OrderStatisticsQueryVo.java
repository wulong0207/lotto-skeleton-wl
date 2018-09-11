package com.hhly.skeleton.lotto.base.order.vo;

import com.hhly.skeleton.base.vo.BaseVO;

import java.util.Date;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc 订单统计查询VO
 * @date 2017/3/17 17:15
 * @company 益彩网络科技公司
 */
public class OrderStatisticsQueryVo extends BaseVO {

   
	private static final long serialVersionUID = 1L;

	/**
     * 用户ID
     */
    private Integer userId;

    /**
     * 用户token
     */
    private String token;

    /**
     * 开始时间
     */
    private Date beginDate;

    /**
     * 结束时间
     */
    private Date endDate;


    /**
     * 1：查询订单列表统计 2：查询订单详情统计
     */
    private Integer source;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }
}

package com.hhly.skeleton.base.issue.itf;

import com.hhly.skeleton.base.issue.entity.NewIssueBO;

/**
 * @desc 彩种彩期生成
 * @author jiangwei
 * @date 2017-1-20
 * @company 益彩网络科技公司
 * @version 1.0
 */
public interface IIssueBuilder {
	 
     /**
      * 开始计算彩期前置处理,处理基本信息
     * @author jiangwei
     * @Version 1.0
     * @CreatDate 2017-1-20 上午9:13:13
     */
    void before();
     
     /**
      * 计算彩期期号
     * @author jiangwei
     * @Version 1.0
     * @CreatDate 2017-1-20 上午9:13:44
     */
    void computeIssueCode();
     
     /**
      * 计算彩期状态
     * @author jiangwei
     * @Version 1.0
     * @CreatDate 2017-1-20 上午9:13:58
     */
    void computeIssueStatus();
     
     /**
      * 计算官方截止时间（送票截止时间）
     * @author jiangwei
     * @Version 1.0
     * @CreatDate 2017-1-20 上午9:14:14
     */
    void computeOfficialEndTime();
     
     /**
      * 官方开奖时间
     * @author jiangwei
     * @Version 1.0
     * @CreatDate 2017-1-20 上午9:14:31
     */
    void computeLotteryTime();
     
     /**
      * 本站开始送票时间
     * @author jiangwei
     * @Version 1.0
     * @CreatDate 2017-1-20 上午9:14:33
     */
    void computeSaleTime();
     
     /**
      * 本站截止销售时间
     * @author jiangwei
     * @Version 1.0
     * @CreatDate 2017-1-20 上午9:14:35
     */
    void computeSaleEndTime();
     
    /**
     * 后置处理
     * @author jiangwei
     * @Version 1.0
     * @CreatDate 2017-1-20 上午9:14:37
     */
    void after();
    /**
     * 获取创建的彩期
     * @author jiangwei
     * @Version 1.0
     * @CreatDate 2017-1-20 下午2:19:18
     * @return
     */
    NewIssueBO getLotteryIssuePO();
     
}

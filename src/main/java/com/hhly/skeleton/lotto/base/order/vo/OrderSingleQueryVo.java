package com.hhly.skeleton.lotto.base.order.vo;

import com.hhly.skeleton.base.vo.BaseVO;
import com.hhly.skeleton.base.vo.PageVO;

import java.util.List;

/**
 * @author yuanshangbing
 * @version 1.0
 * @desc 订单简单查询对象
 * @date 2017/3/22 17:07
 * @company 益彩网络科技公司
 */
public class OrderSingleQueryVo extends PageVO {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 订单编号
     */
    private String orderCode;

    /**
     * 订单编号集合
     */
    private List<String> orderCodes;

    /**
     * token
     */
    private String token;

    /**
     * 1：等待支付；2：支付成功；3：未支付过期；4：支付失败；5：用户取消；6：退款
     */
    private Integer payStatus;

    /**
     * 1.查询支付明细（现金+红包）2.查询奖金明细（奖金、加奖红包）
     */
    private Integer type;

    /*RECHARGE((short) 1, "充值"), // 充值
    LOTTERY((short) 2, "购彩"), // 购彩
    RETURN_AWARD((short) 3, "返奖"), // 返奖
    REFUND((short) 4, "退款"), // 退款
    DRAWING((short) 5, "提款"), // 提款
    OTHER((short) 6, "其它");// 其它*/
    private Integer tranType;

    /**
     * 大彩种名称
     */
    private String lotteryCode;


    /**
     * 方案 0:全部； 1：代购；2：追号代购；3：合买；4：追号计划
     */
    private Integer buyType;

    /**
     * 0 Pc端； 1 移动端，默认PC端
     */
    private Integer source=0;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 合买跟单表主键ID，只有合买跟单的单才有，其他没有
     */
    private Integer orderGroupContentId;

    /**com/hhly/skeleton/lotto/base/order/vo/OrderSingleQueryVo.java:125
     * 合买密码
     */
    private String applyCode;

    /**
     * 1.合买大厅查看个人主页，不需要登录 传userId 2我的个人主页，传token
     */
    private Integer seeType;


    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getTranType() {
        return tranType;
    }

    public void setTranType(Integer tranType) {
        this.tranType = tranType;
    }

    public String getLotteryCode() {
        return lotteryCode;
    }

    public void setLotteryCode(String lotteryCode) {
        this.lotteryCode = lotteryCode;
    }

    public Integer getBuyType() {
        return buyType;
    }

    public void setBuyType(Integer buyType) {
        this.buyType = buyType;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public List<String> getOrderCodes() {
        return orderCodes;
    }

    public void setOrderCodes(List<String> orderCodes) {
        this.orderCodes = orderCodes;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderGroupContentId() {
        return orderGroupContentId;
    }

    public void setOrderGroupContentId(Integer orderGroupContentId) {
        this.orderGroupContentId = orderGroupContentId;
    }

    public String getApplyCode() {
        return applyCode;
    }

    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode;
    }

    public Integer getSeeType() {
        return seeType;
    }

    public void setSeeType(Integer seeType) {
        this.seeType = seeType;
    }


}

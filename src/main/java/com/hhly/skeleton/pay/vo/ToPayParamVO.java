package com.hhly.skeleton.pay.vo;

import java.util.List;

import com.hhly.skeleton.lotto.base.order.vo.OrderQueryVo;

/**
 * @desc 跳转支付请求参数
 * @author xiongJinGang
 * @date 2017年4月25日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class ToPayParamVO {
	private String token;// 登录token
	private String orderCode;// 订单编号,多个用逗号隔开
	private String buyType;// 购买类型,多个用逗号隔开
	private String channelId;// 渠道ID 2、本站PC；4、本站android；5、本站IOS；6、本站WAP；7、未知渠道
	private List<OrderQueryVo> orderQueryVoList;// 订单号，购买类型列表
	private String imgUrl;// 访问图片的前缀
	private String browserType;// 浏览器类型 1微信、2支付宝、3QQ。2018-02-27添加 【选填】
	private Double buyAmount;// 参与合买的金额【选填】，只有是参与合买的订单才需要传值

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	public String getBuyType() {
		return buyType;
	}

	public void setBuyType(String buyType) {
		this.buyType = buyType;
	}

	public List<OrderQueryVo> getOrderQueryVoList() {
		return orderQueryVoList;
	}

	public void setOrderQueryVoList(List<OrderQueryVo> orderQueryVoList) {
		this.orderQueryVoList = orderQueryVoList;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getBrowserType() {
		return browserType;
	}

	public void setBrowserType(String browserType) {
		this.browserType = browserType;
	}

	public Double getBuyAmount() {
		return buyAmount;
	}

	public void setBuyAmount(Double buyAmount) {
		this.buyAmount = buyAmount;
	}

}

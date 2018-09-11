/**    
* @Title: PayParamVo.java  
* @Package com.hhly.skeleton.pay.vo  
* @Description: TODO
* @author xiongjingang 
* @date 2017年3月6日 下午2:53:33  
* @version V1.0    
*/
package com.hhly.skeleton.pay.vo;

import java.io.Serializable;

/**
 * @desc 跳转支付请求参数
 * @author xiongJinGang
 * @date 2017年5月8日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class ToPayInputParamVO implements Serializable {

	private static final long serialVersionUID = -944787123037739292L;
	/**以下字段是客户端必传的**/
	private String orderCode;// 订单号
	private String token;// 用户登录的token
	private String buyType;// 购买类型
	private String clientType;// 客户端类型（h:h5，i:ios，a:android）
	private String channelId;// 渠道ID 2、本站PC；4、本站android；5、本站IOS；6、本站WAP；7、未知渠道
	private String jsApi;// 微信公众号支付 1 是

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

	public String getBuyType() {
		return buyType;
	}

	public void setBuyType(String buyType) {
		this.buyType = buyType;
	}

	public String getClientType() {
		return clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getJsApi() {
		return jsApi;
	}

	public void setJsApi(String jsApi) {
		this.jsApi = jsApi;
	}

}

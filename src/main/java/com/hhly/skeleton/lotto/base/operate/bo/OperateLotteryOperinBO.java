package com.hhly.skeleton.lotto.base.operate.bo;


import com.hhly.skeleton.base.bo.BaseBO;
/**
 * 
 * @desc  彩种快速入口详细信息
 * @author lidecheng
 * @date 2017年3月8日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OperateLotteryOperinBO extends BaseBO{

	private static final long serialVersionUID = -36863916871925246L;


	  /**
	   * 彩种ID
	   */
	  private Integer typeId;
	  
	  /**
	   * 彩种别名
	   */
	  private String typeAlias;
	
	
	  /**
	   * 彩种链接
	   */
	  private String typeUrl;
	
	
	  /**
	   * 运营图标:0无;1新;2热;3加奖;4其他
	   */
	  private Byte icon;
	
	  /**
	   * 打开方式:0:_blank;1:_self;
	   */
	  private Byte target;
	
	 
	  
	  /**
	   * 排序
	   */
	  private Integer orderId;

	  /**
		 * 彩种logourl
		 */
	private String lotteryLogoUrl;

	public String getLotteryLogoUrl() {
		return lotteryLogoUrl;
	}



	public void setLotteryLogoUrl(String lotteryLogoUrl) {
		this.lotteryLogoUrl = lotteryLogoUrl;
	}



	public Integer getTypeId() {
		return typeId;
	}



	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}



	public String getTypeAlias() {
		return typeAlias;
	}



	public void setTypeAlias(String typeAlias) {
		this.typeAlias = typeAlias;
	}



	public String getTypeUrl() {
		return typeUrl;
	}



	public void setTypeUrl(String typeUrl) {
		this.typeUrl = typeUrl;
	}



	public Byte getIcon() {
		return icon;
	}



	public void setIcon(Byte icon) {
		this.icon = icon;
	}



	public Byte getTarget() {
		return target;
	}



	public void setTarget(Byte target) {
		this.target = target;
	}



	public Integer getOrderId() {
		return orderId;
	}



	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	 
	
}
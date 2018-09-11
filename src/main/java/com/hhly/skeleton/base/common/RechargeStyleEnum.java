package com.hhly.skeleton.base.common;

public enum RechargeStyleEnum {
	BANK(1, "网银"), FAST(2, "快捷"), OTHER(3, "第三方"),ALIPAY(4, "支付宝"),WXPAY(5, "微信"),QQ(6, "QQ"),CARD(7, "充值卡");
	private Integer type;
	private String style;

	RechargeStyleEnum(Integer type, String style) {
		this.type = type;
		this.style = style;
	}

	public static String getStyle(Integer type) {
		for (RechargeStyleEnum value : RechargeStyleEnum.values()) {
			if (type.equals(value.getType())) {
				return value.getStyle();
			}
		}
		return null;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

}

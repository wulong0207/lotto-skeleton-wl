package com.hhly.skeleton.base.common;

import java.util.Objects;

import com.hhly.skeleton.lotto.base.cooperate.bo.CoOperateChannelBO;

public class CoOperateEnum {

	/**
	 * 兑换码状态
	 *
	 * @author huangchengfang1219
	 * @date 2018年3月8日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum CdkeyStatusEnum {
		ALLOCATED((short) 1, "已分配"), UNALLOCATED((short) 2, "未分配"), //
		UNEXCHANGE((short) 3, "未兑换"), EXCHANGED((short) 4, "已兑换"), EXPIRED((short) 5, "已过期");

		private Short value;
		private String name;

		private CdkeyStatusEnum(Short value, String name) {
			this.value = value;
			this.name = name;
		}

		public Short getValue() {
			return value;
		}

		public void setValue(Short value) {
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	/**
	 * 交易类型
	 *
	 * @author huangchengfang1219
	 * @date 2018年3月8日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum ExchangeRecordPayClass {
		RECHARGE((short) 1, "资金充值"), EXCHANGE((short) 2, "兑换");
		private Short value;
		private String name;

		private ExchangeRecordPayClass(Short value, String name) {
			this.value = value;
			this.name = name;
		}

		public Short getValue() {
			return value;
		}

		public void setValue(Short value) {
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

	/**
	 * 商户结算类型
	 *
	 * @author huangchengfang1219
	 * @date 2018年3月8日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum SettlementType {
		BALANCE_CAN_ARREARS((short) 1, "余额（可欠款）"), BALANCE_CANNOT_ARREARS((short) 2, "余额（不可欠款）"), STOCK((short) 3, "彩种库存");
		private Short value;
		private String name;

		private SettlementType(Short value, String name) {
			this.value = value;
			this.name = name;
		}

		public Short getValue() {
			return value;
		}

		public void setValue(Short value) {
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

	/**
	 * 流水类别
	 *
	 * @author huangchengfang1219
	 * @date 2018年3月8日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum SerialType {
		MERCHANT_RECHARGE((short) 1, "商户充值流水"), USE_CDKEY((short) 2, "cdkey使用流水详情");
		private Short value;
		private String name;

		private SerialType(Short value, String name) {
			this.value = value;
			this.name = name;
		}

		public Short getValue() {
			return value;
		}

		public void setValue(Short value) {
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

	/**
	 * 流水类型
	 *
	 * @author lgs
	 * @version 1.0
	 * @date 2018年3月8日
	 * @company 益彩网络科技公司
	 */
	public enum SerialTypeEnum {
		COOPERATE_SERIAL((short) 1, "商户充值流水"), CDKEY_SERIAL((short) 2, "cdkey使用流水详情");
		private Short value;
		private String name;

		private SerialTypeEnum(Short value, String name) {
			this.value = value;
			this.name = name;
		}

		public Short getValue() {
			return value;
		}

		public void setValue(Short value) {
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

	/**
	 * 兑换码类型
	 *
	 * @author huangchengfang1219
	 * @date 2018年3月13日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum CdkeyType {
		HB((short) 1, "红包"), JF((short) 2, "积分");
		private Short value;
		private String name;

		private CdkeyType(Short value, String name) {
			this.value = value;
			this.name = name;
		}

		public Short getValue() {
			return value;
		}

		public void setValue(Short value) {
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

	/**
	 * 渠道类型
	 *
	 * @author huangchengfang1219
	 * @date 2018年3月13日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum ChannelType {
		NORMAL((short) 1, "普通商户"), AGENT((short) 2, "中介商户"), //
		CO_PROXY((short) 3, "代理合作商户"), PROXY((short) 4, "代理商户");
		private Short value;
		private String name;

		private ChannelType(Short value, String name) {
			this.value = value;
			this.name = name;
		}

		public Short getValue() {
			return value;
		}

		public void setValue(Short value) {
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

	/**
	 * 渠道商户类型（前端显示）
	 *
	 * @author huangchengfang1219
	 * @date 2018年3月8日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum MerchantType {
		BALANCE((short) 1, "余额结算"), STOCK((short) 2, "库存结算"), AGENT((short) 3, "中介商户"), //
		PROXY((short) 4, "代理商户"), CO_PROXY((short) 5, "代理合作商户");
		private Short value;
		private String name;

		private MerchantType(Short value, String name) {
			this.value = value;
			this.name = name;
		}

		public Short getValue() {
			return value;
		}

		public void setValue(Short value) {
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public static MerchantType valueOf(Short value) {
			if (value == null) {
				return null;
			}
			for (MerchantType temp : MerchantType.values()) {
				if (Objects.equals(temp.getValue(), value)) {
					return temp;
				}
			}
			return null;
		}

		/**
		 * 获取渠道商户类型
		 * 
		 * @param channelBO
		 * @return
		 */
		public static Short getMerchantTypeValue(CoOperateChannelBO channelBO) {
			if (CoOperateEnum.ChannelType.NORMAL.getValue().equals(channelBO.getType())) {// 普通商户
				if (CoOperateEnum.SettlementType.BALANCE_CAN_ARREARS.getValue().equals(channelBO.getSettlementType())) {
					return MerchantType.BALANCE.getValue();
				} else if (CoOperateEnum.SettlementType.BALANCE_CANNOT_ARREARS.getValue().equals(channelBO.getSettlementType())) {
					return MerchantType.BALANCE.getValue();
				} else if (CoOperateEnum.SettlementType.STOCK.getValue().equals(channelBO.getSettlementType())) {
					return MerchantType.STOCK.getValue();
				}
			} else if (CoOperateEnum.ChannelType.AGENT.getValue().equals(channelBO.getType())) {// 中介商户
				return CoOperateEnum.MerchantType.AGENT.getValue();
			} else if (CoOperateEnum.ChannelType.PROXY.getValue().equals(channelBO.getType())) {// 代理商户
				return CoOperateEnum.MerchantType.PROXY.getValue();
			} else if (CoOperateEnum.ChannelType.CO_PROXY.getValue().equals(channelBO.getType())) {// 代理合作商户
				return CoOperateEnum.MerchantType.CO_PROXY.getValue();
			}
			return null;
		}
	}

	/**
	 * 中介渠道订单状态
	 *
	 * @author huangchengfang1219
	 * @date 2018年3月13日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum ChannelOrderStatus {
		UNEXCHANGE((short) 1, "未兑换"), WAIT_WINING((short) 2, "已兑换待开奖"), WINING((short) 3, "已中奖"), //
		NOT_WINING((short) 4, "未中奖"), EXPIRED((short) 5, "已过期");
		private Short value;
		private String name;

		private ChannelOrderStatus(Short value, String name) {
			this.value = value;
			this.name = name;
		}

		public Short getValue() {
			return value;
		}

		public void setValue(Short value) {
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public static ChannelOrderStatus valueOf(Short value) {
			if (value == null) {
				return null;
			}
			for (ChannelOrderStatus temp : ChannelOrderStatus.values()) {
				if (Objects.equals(temp.getValue(), value)) {
					return temp;
				}
			}
			return null;
		}

	}

	/**
	 * B端前端展示兑换状态
	 *
	 * @author huangchengfang1219
	 * @date 2018年3月13日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum ChannelBMerchantStatus {
		SUCCESS((short) 1, "交易成功"), EXCHANGED((short) 2, "已兑换"), UNEXCHANGE((short) 3, "未兑换"), EXPIRED((short) 4, "已过期");
		private Short value;
		private String name;

		private ChannelBMerchantStatus(Short value, String name) {
			this.value = value;
			this.name = name;
		}

		public Short getValue() {
			return value;
		}

		public void setValue(Short value) {
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	/**
	 * 充值前端显示状态
	 *
	 * @author huangchengfang1219
	 * @date 2018年4月24日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum ProxyRechargeStatus {
		SUCCESS((short) 1, "成功"), FAIL((short) 2, "失败");
		private Short value;
		private String name;

		private ProxyRechargeStatus(Short value, String name) {
			this.value = value;
			this.name = name;
		}

		public Short getValue() {
			return value;
		}

		public void setValue(Short value) {
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public static ProxyRechargeStatus valueOf(Short value) {
			if (value == null) {
				return null;
			}
			for (ProxyRechargeStatus temp : ProxyRechargeStatus.values()) {
				if (Objects.equals(temp.getValue(), value)) {
					return temp;
				}
			}
			return null;
		}
	}

	public enum ProxyOrderStatus {
		// 代购类订单状态
		WAIT_TICKET((short) 1, "等待出票"), TICKET_FAIL((short) 2, "出票失败(退款)"), WAIT_WINING((short) 3, "等待开奖"),
		// 公共状态
		WINING((short) 4, "已中奖"), NOT_WINING((short) 5, "未中奖"),
		// 追号计划订单状态
		CHASING((short) 6, "追号中"), USER_CANCEL((short) 7, "用户撤单"), SYSTEM_UNDO((short) 8, "系统撤单");
		private Short value;
		private String name;

		private ProxyOrderStatus(Short value, String name) {
			this.value = value;
			this.name = name;
		}

		public Short getValue() {
			return value;
		}

		public void setValue(Short value) {
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public static ProxyOrderStatus valueOf(Short value) {
			if (value == null) {
				return null;
			}
			for (ProxyOrderStatus temp : ProxyOrderStatus.values()) {
				if (Objects.equals(temp.getValue(), value)) {
					return temp;
				}
			}
			return null;
		}
	}
	
	/**
	 * 支付类型
	 *
	 * @author huangchengfang1219
	 * @date 2018年6月8日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum PayType {
		MIX((short) 1, "混合支付"), CASH((short) 2, "现金支付"), RED((short)3, "彩金红包支付");
		private Short value;
		private String name;

		private PayType(Short value, String name) {
			this.value = value;
			this.name = name;
		}

		public Short getValue() {
			return value;
		}

		public void setValue(Short value) {
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public static PayType valueOf(Short value) {
			if (value == null) {
				return null;
			}
			for (PayType temp : PayType.values()) {
				if (Objects.equals(temp.getValue(), value)) {
					return temp;
				}
			}
			return null;
		}
	}
}

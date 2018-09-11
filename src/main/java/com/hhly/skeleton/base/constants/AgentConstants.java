package com.hhly.skeleton.base.constants;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hhly.skeleton.base.util.Md5Util;
import com.hhly.skeleton.base.util.ObjectUtil;

/**
 * @desc 代理系统 易众平台 参数配置
 * @author YiJian
 * @date 2017年7月31日 下午6:03:08
 * @company 深圳益彩网络科技有限公司
 * @version v1.0
 */
public class AgentConstants {


	public static String createSign(String secretKey, Map<String, String> param) {
		Map params = paraFilter(param);
		StringBuilder buf = new StringBuilder((params.size() + 1) * 10);

		buildPayParams(buf, params, false);
		String preStr = buf.toString();
		String sign = Md5Util.md5_32(preStr + "&key=" + secretKey);
		return sign;
	}

	public static Map<String, String> paraFilter(Map<String, String> sArray) {
		Map result = new HashMap(sArray.size());
		if ((sArray == null) || (sArray.size() <= 0)) {
			return result;
		}
		for (String key : sArray.keySet()) {
			String value = (String) sArray.get(key);
			if ((value != null) && (!value.equals("")) && (!key.equalsIgnoreCase("sign")) && (!key.equalsIgnoreCase("charset"))) {
				result.put(key, value);
			}
		}
		return result;
	}

	public static void buildPayParams(StringBuilder sb, Map<String, String> payParams, boolean encoding) {
		List<String> keys = new ArrayList(payParams.keySet());
		Collections.sort(keys);
		for (String key : keys) {
			sb.append(key).append("=");
			if (encoding)
				sb.append(urlEncode((String) payParams.get(key)));
			else {
				sb.append((String) payParams.get(key));
			}
			sb.append("&");
		}
		sb.setLength(sb.length() - 1);
	}

	public static String urlEncode(String str) {
		try {
			return URLEncoder.encode(str, "UTF-8");
		} catch (Throwable e) {
		}
		return str;
	}

	/********************代理提现*************************/

	/**
	 *每个月提现一次
	 */
	public static final Integer TAKEN_COUNT = 1;
	/**
	 * 最低提现金额
	 */
	public static final Double LOWEST_TAKEN_AMOUNT = 10d;

	public static final Double TWENTY_PERCENT = 0.2;
	public static final Double THIRTY_PERCENT = 0.3;
	public static final Double FORTY_PERCENT = 0.4;
	public static final Double EIGHT_HUNDRED = 800d;
	public static final Double FOUR_THOUSAND = 4000d;
	public static final Double TWENTY_THOUSAND = 20000d;
	public static final Double FIFTY_THOUSAND = 50000d;

	/**
	 * @desc 交易类型；1:充值到账号;2:提现到银行卡;3:充值失败退款;4:提现失败退款;5:结算佣金
	 * @author xiongJinGang
	 * @date 2018年3月3日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum AgentTransTypeEnum {
		RECHARGE_TO_ACCOUNT((short) 1, "充值到账号", (short) 2), // 充值到账号
		TAKEN_TO_BANK((short) 2, "提现到银行卡", (short) 2), // 提现到银行卡
		RECHARGE_FAIL_BACK((short) 3, "充值失败退款", (short) 1), // 充值失败退款
		TAKEN_FAIL_BACK((short) 4, "提现失败退款", (short) 1), // 提现失败退款
		SETTLE_ACCOUNTS((short) 5, "结算佣金", (short) 1);// 结算佣金
		private Short key;
		private String value;
		private Short moneyFlow;

		AgentTransTypeEnum(Short key, String value, Short moneyFlow) {
			this.key = key;
			this.value = value;
			this.moneyFlow = moneyFlow;
		}

		// 根据key获取值
		public static AgentTransTypeEnum getTransTypeByKey(Short key) {
			if (!ObjectUtil.isBlank(key)) {
				for (AgentTransTypeEnum agentTransTypeEnum : AgentTransTypeEnum.values()) {
					if (key.equals(agentTransTypeEnum.getKey())) {
						return agentTransTypeEnum;
					}
				}
			}
			return null;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public Short getKey() {
			return key;
		}

		public void setKey(Short key) {
			this.key = key;
		}

		public Short getMoneyFlow() {
			return moneyFlow;
		}

		public void setMoneyFlow(Short moneyFlow) {
			this.moneyFlow = moneyFlow;
		}

	}

	/**
	 * @desc 资金流向
	 * @author xiongJinGang
	 * @date 2018年3月6日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum MoneyFlowEnum {
		IN((short) 1, "收入"), // 出入
		OUT((short) 2, "支出");// 支出
		private Short key;
		private String value;

		MoneyFlowEnum(Short key, String value) {
			this.key = key;
			this.value = value;
		}

		// 判断key是否存在
		public static boolean containsKey(Short key) {
			if (!ObjectUtil.isBlank(key)) {
				for (MoneyFlowEnum moneyFlowEnum : MoneyFlowEnum.values()) {
					if (key.equals(moneyFlowEnum.getKey())) {
						return true;
					}
				}
			}
			return false;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public Short getKey() {
			return key;
		}

		public void setKey(Short key) {
			this.key = key;
		}
	}

	/**
	 * @desc 代理交易流水状态枚举 0：交易失败；1：交易成功；2：待审核； 3：审核通过； 4：审核不通过
	 * @author xiongJinGang
	 * @date 2018年3月3日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum AgentTransStatusEnum {
		TRADE_FAIL((short) 0, "交易失败"), // 交易失败
		TRADE_SUCCESS((short) 1, "交易成功"), // 交易成功
		WAIT_AUDIT((short) 2, "待审核"), // 待审核
		AUDIT_SUCCESS((short) 3, "审核通过"), // 审核通过
		AUDIT_FAIL((short) 4, "审核不通过");// 审核不通过

		private Short key;
		private String value;

		AgentTransStatusEnum(Short key, String value) {
			this.key = key;
			this.value = value;
		}

		// 根据key获取值
		public static AgentTransStatusEnum getEnum(Short key) {
			for (AgentTransStatusEnum transTypeEnum : AgentTransStatusEnum.values()) {
				if (key.equals(transTypeEnum.getKey())) {
					return transTypeEnum;
				}
			}
			return null;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public Short getKey() {
			return key;
		}

		public void setKey(Short key) {
			this.key = key;
		}
	}

	/**
	 * @desc 代理钱包资金流向
	 * @author xiongJinGang
	 * @date 2018年3月5日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum AgentWalletTransTypeEnum {
		IN((short) 1, "入账"), // 入账
		OUT((short) 2, "出账"); // 出账

		private Short key;
		private String value;

		AgentWalletTransTypeEnum(Short key, String value) {
			this.key = key;
			this.value = value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public Short getKey() {
			return key;
		}

		public void setKey(Short key) {
			this.key = key;
		}
	}
}

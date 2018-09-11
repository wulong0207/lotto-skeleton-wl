package com.hhly.skeleton.base.common.cache.pay;

import java.util.ArrayList;
import java.util.List;

import com.hhly.skeleton.base.common.cache.CacheEnumService;
import com.hhly.skeleton.base.constants.CacheConstants;

public class PayCacheEnum {

	/**
	 * @desc 支付相关缓存
	 * @author xiongJinGang
	 * @date 2017年12月14日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum Pay implements CacheEnumService {
		P_CORE_USER_PAY_CHANNEL(CacheConstants.P_CORE_USER_PAY_CHANNEL + "*", "用户支付渠道列表缓存（后面跟用户ID+平台）"), //
		P_CORE_PAY_CHANNEL_MGR_LIST(CacheConstants.P_CORE_PAY_CHANNEL_MGR_LIST + "*", "支付渠道列表缓存"), //
		P_CORE_PAY_CHANNEL_LIMIT_LIST(CacheConstants.P_CORE_PAY_CHANNEL_LIMIT_LIST + "*", "支付渠道限额缓存"), //
		P_CORE_PAY_BANK_LIST(CacheConstants.P_CORE_PAY_BANK_LIST, "银行列表"), //
		// PAY_BANK_LIMIT_SINGLE(CacheConstants.P_CORE_PAY_BANK_LIMIT_SINGLE + "*", "单个银行支付限额缓存（后面跟具体的银行ID）"), //
		P_CORE_PAY_CHANNEL_LIST(CacheConstants.P_CORE_PAY_BANK_CHANNEL_SINGLE + "*", "银行渠道列表的缓存"),
		P_CORE_USER_PAY_CHANNEL_LIST(CacheConstants.P_CORE_USER_PAY_CHANNEL+ "*","用户支付渠道列表缓存");

		private final String _code;
		private final String _message;
		private final static List<String> ENUM_MAP;
		static {
			ENUM_MAP = new ArrayList<String>();
			for (Pay cacheEnum : Pay.values()) {
				ENUM_MAP.add(cacheEnum.getValue());
			}
		}

		Pay(String code, String message) {
			_code = code;
			_message = message;
		}

		@Override
		public String getValue() {
			return _code;
		}

		@Override
		public String getMessage() {
			return _message;
		}

		public static List<String> getCacheKey() {
			return ENUM_MAP;
		}
	}

	/**
	 * @desc 支付渠道限额缓存
	 * @author xiongJinGang
	 * @date 2017年12月14日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum PayChannelLimit implements CacheEnumService {
		P_CORE_PAY_CHANNEL_LIST(CacheConstants.P_CORE_PAY_BANK_CHANNEL_SINGLE + "*", "银行渠道列表的缓存"), //
		P_CORE_PAY_CHANNEL_LIMIT_LIST(CacheConstants.P_CORE_PAY_CHANNEL_LIMIT_LIST + "*", "单个渠道的支付限额");

		private final String _code;
		private final String _message;
		private final static List<String> ENUM_MAP;
		static {
			ENUM_MAP = new ArrayList<String>();
			for (Pay cacheEnum : Pay.values()) {
				ENUM_MAP.add(cacheEnum.getValue());
			}
		}

		PayChannelLimit(String code, String message) {
			_code = code;
			_message = message;
		}

		@Override
		public String getValue() {
			return _code;
		}

		@Override
		public String getMessage() {
			return _message;
		}

		public static List<String> getCacheKey() {
			return ENUM_MAP;
		}
	}

	/**
	 * @desc 市场渠道的缓存
	 * @author xiongJinGang
	 * @date 2018年1月27日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum OperateMarketChannel implements CacheEnumService {
		P_CORE_PAY_CHANNEL_LIST(CacheConstants.P_CORE_OPERATE_MARKET_CHANNEL_LIST + "*", "市场渠道列表的缓存");//

		private final String _code;
		private final String _message;
		private final static List<String> ENUM_MAP;
		static {
			ENUM_MAP = new ArrayList<String>();
			for (Pay cacheEnum : Pay.values()) {
				ENUM_MAP.add(cacheEnum.getValue());
			}
		}

		OperateMarketChannel(String code, String message) {
			_code = code;
			_message = message;
		}

		@Override
		public String getValue() {
			return _code;
		}

		@Override
		public String getMessage() {
			return _message;
		}

		public static List<String> getCacheKey() {
			return ENUM_MAP;
		}
	}
}

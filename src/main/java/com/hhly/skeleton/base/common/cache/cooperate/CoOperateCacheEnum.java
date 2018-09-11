package com.hhly.skeleton.base.common.cache.cooperate;

import java.util.ArrayList;
import java.util.List;

import com.hhly.skeleton.base.common.cache.CacheEnumService;
import com.hhly.skeleton.base.constants.CacheConstants;

public class CoOperateCacheEnum {

	/**
	 * 积分兑换渠道缓存枚举
	 *
	 * @author huangchengfang1219
	 * @date 2018年3月29日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum ChannelCacheEnum implements CacheEnumService {
		C_CORE_COOPERATE_AGENCY_CHANNEL_LIST(CacheConstants.C_CORE_COOPERATE_AGENCY_CHANNEL_LIST, "中介商户可见渠道列表");

		private final String _code;
		private final String _message;
		private final static List<String> ENUM_MAP;
		static {
			ENUM_MAP = new ArrayList<String>();
			for (ChannelCacheEnum cacheEnum : ChannelCacheEnum.values()) {
				ENUM_MAP.add(cacheEnum.getValue());
			}
		}

		ChannelCacheEnum(String code, String message) {
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

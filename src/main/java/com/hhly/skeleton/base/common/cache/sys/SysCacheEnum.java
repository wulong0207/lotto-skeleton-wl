package com.hhly.skeleton.base.common.cache.sys;

import java.util.ArrayList;
import java.util.List;

import com.hhly.skeleton.base.common.cache.CacheEnumService;
import com.hhly.skeleton.base.constants.CacheConstants;

public class SysCacheEnum {

	/**
	 * 数据字典缓存
	 *
	 * @author huangchengfang1219
	 * @date 2018年1月11日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum DicDataCacheEnum implements CacheEnumService {
		C_CORE_DIC_DATA(CacheConstants.C_CORE_DIC_DATA, "活动详细信息");

		private final String _code;
		private final String _message;
		private final static List<String> ENUM_MAP;
		static {
			ENUM_MAP = new ArrayList<String>();
			for (DicDataCacheEnum cacheEnum : DicDataCacheEnum.values()) {
				ENUM_MAP.add(cacheEnum.getValue());
			}
		}

		DicDataCacheEnum(String code, String message) {
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

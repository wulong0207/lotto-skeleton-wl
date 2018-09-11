
package com.hhly.skeleton.base.common;

/**
 * @desc    
 * @author  cheng chen
 * @date    2017年7月8日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class ChannelEnum {

	public enum ChannelTypeEnum{
		
		//ALL(-1,"全部"),
		// 本站客户端，包含：本站andriod、本站ios渠道
		//CLIENT(-2,"本站客户端"),
		SITE(1,"本站"),
		PC(2,"本站PC"),
		WIRELESS(3,"本站无线"),
		ANDROID(4,"本站android"),
		IOS(5,"本站iOS"),
		WAP(6,"本站wap"),
		// 未知渠道都归在本渠道下面
		UNKNOWN(7,"未知渠道"),
		;
		
		private Integer code;
		
		private String name;

		ChannelTypeEnum(Integer code, String name) {
			this.code = code;
			this.name = name;
		}
		
		public static ChannelTypeEnum valueOf(Integer channelId){
			for (ChannelTypeEnum channelType : ChannelTypeEnum.values()) {
				if(channelType.getCode().equals(channelId))
					return channelType;
			}
			return null;
		}

		public Integer getCode() {
			return code;
		}

		public String getName() {
			return name;
		}
	}
}

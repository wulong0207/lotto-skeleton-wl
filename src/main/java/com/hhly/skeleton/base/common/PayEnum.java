package com.hhly.skeleton.base.common;

/**
 * @author lgs on
 * @version 1.0
 * @desc 支付相关枚举类
 * @date 2017/3/22.
 * @company 益彩网络科技有限公司
 */
public class PayEnum {

    /**
     * @author lgs on
     * @version 1.0
     * @desc 入口枚举类 标明那个端口访问字段
     * @date 2017/3/22.
     * @company 益彩网络科技有限公司
     */
    public enum EntranceEnum {
        PC("PC"),
        H5("H5"),
        IOS("IOS"),
        ANDROID("ANDROID"),
    	WECHAT("WECHAT");

        private String value;

        EntranceEnum(String value) {
            this.value = value;
        }
        
        public static EntranceEnum getEnum(String entrance) {
			for (EntranceEnum entranceEnum : EntranceEnum.values()) {
				if (entrance.equals(entranceEnum.getValue())) {
					return entranceEnum;
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

    }

    /**
     * @author lgs on
     * @version 1.0
     * @desc 入口枚举类 标明那个端口访问字段
     * @date 2017/3/22.
     * @company 益彩网络科技有限公司
     */
    public enum IsStartEnum {
        START((short)1),
        CLOSE((short)0);

        private Short value;

        IsStartEnum(Short value) {
            this.value = value;
        }

        public Short getValue() {
            return value;
        }

        public void setValue(Short value) {
            this.value = value;
        }

    }
}

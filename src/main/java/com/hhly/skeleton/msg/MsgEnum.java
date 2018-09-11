package com.hhly.skeleton.msg;

/**
 * @desc    消息枚举类
 * @author  Tony Wang
 * @date    2017年8月24日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public interface MsgEnum {

        public enum EventType {
        	
            LimitChanged (4),
        	ChildChanged (5);

            private final int intValue;     

            EventType(int intValue) {
                this.intValue = intValue;
            }

            public int getIntValue() {
                return intValue;
            }
        }
}

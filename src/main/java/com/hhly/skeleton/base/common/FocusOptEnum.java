package com.hhly.skeleton.base.common;
/**
 * 关注操作枚举
 * @author longguoyou
 * @date 2017年9月21日
 * @compay 益彩网络科技有限公司
 */
public class FocusOptEnum {
    /**
     * 关注： 加一， 减一
     * @author longguoyou
     * @date 2017年9月21日
     * @compay 益彩网络科技有限公司
     */
	public enum OptEnum {
		
		ADD(1),//关注
		DELETE(-1);//取消关注
		
		private final int value;

		OptEnum(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
		
	}
}

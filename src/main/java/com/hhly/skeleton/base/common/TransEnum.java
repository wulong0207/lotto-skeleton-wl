/**
 * 
 */
package com.hhly.skeleton.base.common;

/**
 * @desc 账务枚举类
 * @author Bruce
 * @date 2017年1月19日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class TransEnum {

	public enum RechargeStatus {
		// 1：进行中；2：交易成功；3：交易失败；4：订单已关闭；
		ING(1),
		SUCCESS(2),
		FAIL(3),
		CLOSE(4)
		;
		private final int value;

		RechargeStatus(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
		
	}
	
	public enum TakenStatus {
		// 1审核通过; 2审核不通过; 3银行处理成功; 4银行处理失败; 5已到帐;6待审核;7银行处理中
		PASS(1),
		REJECT(2),
		BANK_SUCCESS(3),
		BANK_FAIL(4),
		ARRIVED_ACCOUNT(5),
		WAIT_PASS(6),
		BANK_PROCESSING(7)
		;
		private final int value;
		
		TakenStatus(int value) {
			this.value = value;
		}
		
		public int getValue() {
			return value;
		}
		
	}
}

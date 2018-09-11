package com.hhly.skeleton.base.common;

import com.hhly.skeleton.lotto.base.lottery.bo.LotteryTypeBO;

public class OperateHelpEnum {

	/**
	 * 彩种介绍分类
	 *
	 * @author huangchengfang1219
	 * @date 2018年2月22日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum LotteryCategory {
		NUM_BLESS((short) 1, "福彩"), NUM_SPROT((short) 2, "体彩"), HIGH((short) 3, "高频彩"), SPORT((short) 4, "竞技彩"),;

		private Short value;
		private String name;

		private LotteryCategory(Short value, String name) {
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

		/**
		 * 根据彩种获取对应彩种介绍分类
		 * 
		 * @param lotteryType
		 * @return
		 */
		public static LotteryCategory getCategory(LotteryTypeBO lotteryType) {
			if (lotteryType.getLotteryCategory() == null || lotteryType.getAdminCategory() == null) {
				return null;
			}
			// 高频彩
			if (lotteryType.getLotteryCategory().intValue() == LotteryEnum.LotteryCategory.HIGH.getValue()) {
				return LotteryCategory.HIGH;
			} else if (lotteryType.getLotteryCategory().intValue() == LotteryEnum.LotteryCategory.SPORT.getValue()) {
				return LotteryCategory.SPORT;
			} else if (lotteryType.getAdminCategory().intValue() == LotteryEnum.AdminCategory.BLESS_LOTTERY.getValue()) {
				return LotteryCategory.NUM_BLESS;
			} else if (lotteryType.getAdminCategory().intValue() == LotteryEnum.AdminCategory.SPROT_LOTTERY.getValue()) {
				return LotteryCategory.NUM_SPROT;
			}
			return null;
		}

	}
}

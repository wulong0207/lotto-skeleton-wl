package com.hhly.skeleton.base.common;

/**
 * 
 * 开奖数据抓取枚举
 * 
 * @author huangchengfang1219
 * @date 2018年1月17日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class LotterySourceEnum {

	/**
	 * 彩期状态
	 *
	 * @author huangchengfang1219
	 * @date 2018年1月17日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum IssueStatus {
		DRAW("已开奖", (short) 3), WARN("已报警", (short) 4), DONE("已处理", (short) 5),;
		private String desc;
		private short value;

		IssueStatus(String desc, short value) {
			this.desc = desc;
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public short getValue() {
			return value;
		}

		public void setValue(short value) {
			this.value = value;
		}
	}

	/**
	 * 数据来源
	 *
	 * @author huangchengfang1219
	 * @date 2018年1月17日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum Source {
		AICAILE("爱彩乐", (short) 1), FEIFAN("非凡", (short) 2), WUBAI("500", (short) 3), LIANGYUAN("2元", (short) 4),;
		private String desc;
		private Short value;

		Source(String desc, Short value) {
			this.desc = desc;
			this.value = value;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public Short getValue() {
			return value;
		}

		public void setValue(Short value) {
			this.value = value;
		}
	}
}

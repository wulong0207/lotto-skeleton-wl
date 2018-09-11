/**
 * 
 */
package com.hhly.skeleton.base.common;

import java.util.Objects;

/**
 * @desc 运营管理枚举类
 * @author Bruce
 * @date 2017年1月19日
 * @company 益彩网络科技公司
 * @version 1.0
 */
public class OperateEnum {

	/**
	 * @desc    彩种运营发布状态:0暂停发布;1待发布;2发布中;3发布结束
	 * @author  Tony Wang
	 * @date    2017年2月22日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum ReleaseStatus {
		STOP((byte)0),WAITING((byte)1),RELEASING((byte)2),END((byte)3);
		private final byte value;

		ReleaseStatus(byte value) {
			this.value = value;
		}

		public byte getValue() {
			return value;
		}
	}
	
	/**
	 * @desc    彩种运营显示状态:0否;1是;2设定时间下线
	 * @author  Tony Wang
	 * @date    2017年2月22日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum LotteryDisplay {
		NO((byte)0),YES((byte)1),OFFLINE((byte)2);
		private final byte value;
		
		LotteryDisplay(byte value) {
			this.value = value;
		}
		
		public byte getValue() {
			return value;
		}
	}
	
	/*****************************广告相关 start***********************************************/
	
	/**
	 * 广告对像下拉框"全部用户"选项的值
	 */
	public static final Long AD_ALL_USERS= 0L;
	/**
	 * "全部渠道"下拉框"全部渠道"选项的值
	 */
	public static final String AD_ALL_CHANNELS= "0";
	
	/**
	 * @desc    是否为默认广告
	 * @author  Tony Wang
	 * @date    2017年4月24日
	 * @company 益彩网络科技公司
	 * @version 1.0
	 */
	public enum defaultAd {
		NO(0),YES(1);
		private final int value;
		defaultAd(int value) {
			this.value = value;
		}
		public int getValue() {
			return value;
		}
	}
	
	/*****************************广告相关      end***********************************************/
	
	/*****************************帮助中心      start*********************************************/
	public enum HelpStatus {
		// 0被驳回;1编辑中;2待审核;3审核通过,4已发布(数据库不保存此状态)
		REJECT(0),
		EDITING(1),
		WAIT_APPROVE(2),
		APPROVE(3);
		//RELEASE(4);
        HelpStatus(int status) {
			this.status = status;
		}

		private final int status;

		public int getStatus() {
			return status;
		}

		public static boolean isEditable(Integer status) {
			return Objects.equals(status, REJECT.getStatus()) ||
					Objects.equals(status, EDITING.getStatus()) ||
							Objects.equals(status, APPROVE.getStatus());
		}
	}

	/**
	 * 活动配置详情
	 */
	public enum EditEnum {
		QUERY_DETAIL(0, "查看详情"),
		ADD_AWARD(1, "加奖活动"),
		THE_AWARDS(2, "奖上奖活动"),
		TOPUP_PRESENT(3, "充值送活动"),
		IMP_RETURN(4, "不中返"),
		PREFECT_PRESENT(5, "完善资料送"),
		MUTIL_BET(6, "倍投立减"),
		ADD_CODE(7, "追号送"),
		SPECIAL(8, "特定赛事加奖"),
		SINGLE_PASS(9, "单关加奖");

		private int key;

		private String value;

		EditEnum(int key, String value) {
			this.key=key;
			this.value=value;
		}

		public int getKey() {
			return key;
		}

		public void setKey(int key) {
			this.key = key;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public static String getEdit(Integer type) {
			if (type == null) {
				return "";
			}
			for (OperateEnum.EditEnum edit : OperateEnum.EditEnum.values()) {
				if (Objects.equals(edit.getKey(), type)) {
					return edit.getValue();
				}
			}
			return "";
		}
	}



	/*****************************广告相关      end***********************************************/

	public enum RebateHisEnum {
		HIS(0, "历史"),
		NOW(1, "当前");

		private int key;

		private String value;

		RebateHisEnum(int key, String value) {
			this.key=key;
			this.value=value;
		}

		public int getKey() {
			return key;
		}


		public String getValue() {
			return value;
		}
	}
	
}

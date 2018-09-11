package com.hhly.skeleton.base.common;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 扑克牌
 * 
 * @author huangchengfang1219
 *
 */
public class PokerEnum {

	private static Map<String, Integer> POKER_NAME_MAP = new HashMap<String, Integer>();

	static {
		POKER_NAME_MAP.put(Poker.POKER_A.getName(), Poker.POKER_A.getValue());
		POKER_NAME_MAP.put(Poker.POKER_2.getName(), Poker.POKER_2.getValue());
		POKER_NAME_MAP.put(Poker.POKER_3.getName(), Poker.POKER_3.getValue());
		POKER_NAME_MAP.put(Poker.POKER_4.getName(), Poker.POKER_4.getValue());
		POKER_NAME_MAP.put(Poker.POKER_5.getName(), Poker.POKER_5.getValue());
		POKER_NAME_MAP.put(Poker.POKER_6.getName(), Poker.POKER_6.getValue());
		POKER_NAME_MAP.put(Poker.POKER_7.getName(), Poker.POKER_7.getValue());
		POKER_NAME_MAP.put(Poker.POKER_8.getName(), Poker.POKER_8.getValue());
		POKER_NAME_MAP.put(Poker.POKER_9.getName(), Poker.POKER_9.getValue());
		POKER_NAME_MAP.put(Poker.POKER_10.getName(), Poker.POKER_10.getValue());
		POKER_NAME_MAP.put(Poker.POKER_J.getName(), Poker.POKER_J.getValue());
		POKER_NAME_MAP.put(Poker.POKER_Q.getName(), Poker.POKER_Q.getValue());
		POKER_NAME_MAP.put(Poker.POKER_K.getName(), Poker.POKER_K.getValue());
	}

	public enum Poker {
		POKER_A(1, "A"), POKER_2(2, "2"), POKER_3(3, "3"), POKER_4(4, "4"), POKER_5(5, "5"), POKER_6(6, "6"), POKER_7(7, "7"), POKER_8(8,
				"8"), POKER_9(9, "9"), POKER_10(10, "10"), POKER_J(11, "J"), POKER_Q(12, "Q"), POKER_K(13, "K");
		private Integer value;

		private String name;

		private Poker(Integer value, String name) {
			this.value = value;
			this.name = name;
		}

		public Integer getValue() {
			return value;
		}

		public void setValue(Integer value) {
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

	/**
	 * 获取牌对应的值
	 * 
	 * @param name
	 * @return
	 */
	public static int getPokerValue(String name) {
		Integer value = POKER_NAME_MAP.get(name);
		return value == null ? 0 : value;
	}

	/**
	 * 判断3个牌是不是顺子
	 * 
	 * @param pokerName1
	 * @param pokerName2
	 * @param pokerName3
	 * @return
	 */
	public static boolean isSz(String pokerName1, String pokerName2, String pokerName3) {
		int[] pokerValues = new int[] { PokerEnum.getPokerValue(pokerName1), PokerEnum.getPokerValue(pokerName2),
				PokerEnum.getPokerValue(pokerName3) };
		Arrays.sort(pokerValues);
		int pokerValue1 = pokerValues[0];
		int pokerValue2 = pokerValues[1];
		int pokerValue3 = pokerValues[2];
		if(pokerValue2 == pokerValue1+1&& pokerValue3 == pokerValue2+1) {
			return true;
		}
		if(pokerValue1 == PokerEnum.Poker.POKER_A.getValue() && pokerValue2 == PokerEnum.Poker.POKER_Q.getValue() && pokerValue3 == PokerEnum.Poker.POKER_K.getValue()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isSz("K","Q","A"));
	}
}

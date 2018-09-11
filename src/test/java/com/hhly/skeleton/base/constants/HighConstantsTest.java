package com.hhly.skeleton.base.constants;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Field;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.junit.Test;

import com.hhly.skeleton.cms.report.vo.ReportUserVO;

public class HighConstantsTest {

	@Test
	public void testReg() {
//		assertFalse(Pattern.matches(HighConstants.X115_REGEX_R2_SINGLE, "2,11"));
//		assertTrue(Pattern.matches(HighConstants.X115_REGEX_R2_SINGLE, "02,11"));
//		assertFalse(Pattern.matches(HighConstants.X115_REGEX_R2_SINGLE, "1,12"));
//		assertFalse(Pattern.matches(HighConstants.X115_REGEX_R2_SINGLE, "111,2"));
//		
//		assertFalse(Pattern.matches(HighConstants.X115_REGEX_R2_MULTIPLE, "02,11"));
//		assertFalse(Pattern.matches(HighConstants.X115_REGEX_R2_MULTIPLE, "2,2,11"));
//		assertTrue(Pattern.matches(HighConstants.X115_REGEX_R2_MULTIPLE, "02,02,11"));
//		assertFalse(Pattern.matches(HighConstants.X115_REGEX_R2_MULTIPLE, "2,2,11,2,11,2,11,2,11,2,11"));
//		assertTrue(Pattern.matches(HighConstants.X115_REGEX_R2_MULTIPLE, "02,02,11,02,11,02,11,02,11,02,11"));
//		assertFalse(Pattern.matches(HighConstants.X115_REGEX_R2_MULTIPLE, "2,2,11,2,11,2,11,2,11,2,11,2"));
//		assertFalse(Pattern.matches(HighConstants.X115_REGEX_R2_MULTIPLE, "02,02,13"));
//		
//		assertTrue(Pattern.matches(HighConstants.X115_REGEX_R2_DANTUO, "01#04,05,06,07,08,09"));
//		assertTrue(Pattern.matches(HighConstants.X115_REGEX_R2_DANTUO, "01#04,05,06,07,08,09,09,09,09,09"));
//		assertFalse(Pattern.matches(HighConstants.X115_REGEX_R2_DANTUO, "01#04,05,06,07,08,09,09,09,09,09,10"));
//		assertFalse(Pattern.matches(HighConstants.X115_REGEX_R2_DANTUO, "01,04,05,06,07,08,09"));
//		assertFalse(Pattern.matches(HighConstants.X115_REGEX_R2_DANTUO, "01,04#05,06,07,08,09"));
		
//		public static final String X115_REGEX_Q1_SINGLE = "^([1-9]|10|11)$";
//		/**
//		 * 十一选五前一复式,2至11个1~11之间的数字,如"1,11"
//		 */
//		public static final String X115_REGEX_Q1_MULTIPLE = "^([1-9]|10|11)(,[1-9]|,10|,11){1,10}$";		
		
//		assertTrue(Pattern.matches(HighConstants.X115_REGEX_Q1_SINGLE, "01"));
//		assertFalse(Pattern.matches(HighConstants.X115_REGEX_Q1_SINGLE, "01,02"));
//		assertFalse(Pattern.matches(HighConstants.X115_REGEX_Q1_SINGLE, "13"));
//		assertFalse(Pattern.matches(HighConstants.X115_REGEX_Q1_SINGLE, "1a"));
//		assertFalse(Pattern.matches(HighConstants.X115_REGEX_Q1_SINGLE, "a1"));
//		
//		assertFalse(Pattern.matches(HighConstants.X115_REGEX_Q1_MULTIPLE, "1"));
//		assertTrue(Pattern.matches(HighConstants.X115_REGEX_Q1_MULTIPLE, "01,02"));
//		assertTrue(Pattern.matches(HighConstants.X115_REGEX_Q1_MULTIPLE, "01,02,02,02,02,02,02,02,02,02,02"));
//		assertFalse(Pattern.matches(HighConstants.X115_REGEX_Q1_MULTIPLE, "01,02,02,02,02,02,02,02,02,02,02,02"));
//		
//		assertTrue(Pattern.matches(HighConstants.X115_REGEX_Q2_DIRECT_SINGLE, "01|02"));
//		assertFalse(Pattern.matches(HighConstants.X115_REGEX_Q2_DIRECT_SINGLE, "01|12"));
//		assertFalse(Pattern.matches(HighConstants.X115_REGEX_Q2_DIRECT_SINGLE, "01|02|03"));
//		assertFalse(Pattern.matches(HighConstants.X115_REGEX_Q2_DIRECT_SINGLE, "01,02|02"));
//		
//		assertTrue(Pattern.matches(HighConstants.X115_REGEX_Q2_DIRECT_MULTIPLE, "01,02|02"));
//		assertTrue(Pattern.matches(HighConstants.X115_REGEX_Q2_DIRECT_MULTIPLE, "01|02"));
//		assertTrue(Pattern.matches(HighConstants.X115_REGEX_Q2_DIRECT_MULTIPLE, "01|02,06,06,06,06,06,06,06,06,06,06"));
//		assertFalse(Pattern.matches(HighConstants.X115_REGEX_Q2_DIRECT_MULTIPLE, "01|02,06,06,06,06,06,06,06,06,06,06,08"));
//		
//		assertTrue(Pattern.matches(HighConstants.X115_REGEX_Q3_DIRECT_SINGLE, "01|02|03"));
//		assertFalse(Pattern.matches(HighConstants.X115_REGEX_Q3_DIRECT_SINGLE, "01|02|03|04"));
//		assertFalse(Pattern.matches(HighConstants.X115_REGEX_Q3_DIRECT_SINGLE, "01|02|03,04"));
//		
//		assertFalse(Pattern.matches(HighConstants.K3_REGEX_S_SINGLE, "-1"));
//		assertTrue(Pattern.matches(HighConstants.K3_REGEX_S_SINGLE, "6"));
//		assertFalse(Pattern.matches(HighConstants.K3_REGEX_S_SINGLE, ""));
//		assertTrue(Pattern.matches(HighConstants.K3_REGEX_S_SINGLE, "11"));
//		assertTrue(Pattern.matches(HighConstants.K3_REGEX_S_SINGLE, "17"));
//		
//		assertTrue(Pattern.matches(HighConstants.K3_REGEX_TD3_SINGLE, "111"));
//		assertFalse(Pattern.matches(HighConstants.K3_REGEX_TD3_SINGLE, ""));
//		assertFalse(Pattern.matches(HighConstants.K3_REGEX_TD3_SINGLE, "777"));
//		
//		assertFalse(Pattern.matches(HighConstants.K3_REGEX_TD3_MULTIPLE, "777"));
//		assertTrue(Pattern.matches(HighConstants.K3_REGEX_TD3_MULTIPLE, "111;222"));
//		
//		assertTrue(Pattern.matches(HighConstants.K3_REGEX_TD2_SINGLE, "1,1,1"));
//		assertFalse(Pattern.matches(HighConstants.K3_REGEX_TD2_SINGLE, "2,1,1"));
//		assertFalse(Pattern.matches(HighConstants.K3_REGEX_TD2_SINGLE, "1,1"));
//		assertTrue(Pattern.matches(HighConstants.K3_REGEX_TD2_SINGLE, "2,2,3"));
//		assertFalse(Pattern.matches(HighConstants.K3_REGEX_TD2_SINGLE, "2"));
//		
//		assertTrue(Pattern.matches(HighConstants.K3_REGEX_TD2_MULTIPLE, "1,1,2;2,2,1;3,3,2"));
//		assertFalse(Pattern.matches(HighConstants.K3_REGEX_TD2_MULTIPLE, "1,1,2;2,2,1;3,3,2;"));
//		assertFalse(Pattern.matches(HighConstants.K3_REGEX_TD2_MULTIPLE, "1,1,2"));
//		assertFalse(Pattern.matches(HighConstants.K3_REGEX_TD2_MULTIPLE, "1,1,2;2,2,1;3,3"));
//		assertTrue(Pattern.matches(HighConstants.K3_REGEX_TD2_MULTIPLE, "1,1,2;2,2,2"));
//		
//		assertFalse(Pattern.matches(HighConstants.K3_REGEX_BT2_DANTUO, "1"));
//		assertTrue(Pattern.matches(HighConstants.K3_REGEX_BT2_DANTUO, "1#1"));
//		assertFalse(Pattern.matches(HighConstants.K3_REGEX_BT2_DANTUO, "1,1,2"));
//		assertTrue(Pattern.matches(HighConstants.K3_REGEX_BT2_DANTUO, "1#1,2"));
		
		assertTrue(Pattern.matches("^([0-9])(\\|[0-9]){4}$", "0|2|3|4|5"));
		assertFalse(Pattern.matches("^([0-9])(\\|[0-9]){4}$", "0|2|3|4|10"));
		assertFalse(Pattern.matches("^([0-9])(\\|[0-9]){4}$", "0|2|3|4|4|"));
		assertFalse(Pattern.matches("^([0-9])(\\|[0-9]){4}$", "0|2|3|4|04"));
		assertFalse(Pattern.matches("^([0-9])(\\|[0-9]){4}$", "0|2|3|4|&4"));
		int min = 4;
		String reg = "^([0-9])(\\|[0-9]){"+ min +"}$";
		assertTrue(Pattern.matches(reg, "0|2|3|4|5"));
		assertFalse(Pattern.matches(reg, "0|2|3|4|10"));
		
		String reg_1 = "^([0-9])(\\|[0-9]){"+ (min-4) +"}$";
		assertTrue(Pattern.matches(reg_1, "0"));
		assertFalse(Pattern.matches(reg_1, "0|2|3|4|10"));
		
		int min2 = 5;
		String reg2 = "^([0-9])(,[0-9]){0,9}(\\|([0-9])(,[0-9]){0,9}){"+(min2-1)+"}$";
		assertTrue(Pattern.matches(reg2, "1,2,3,4|2|3,4|4|5,6,9"));
		assertFalse(Pattern.matches(reg2, "1,2,3,4||3,4|4|5,6,9"));
		assertFalse(Pattern.matches(reg2, "1,2,3,4||3,4|4|5,6,9,10"));
		assertFalse(Pattern.matches(reg2, "1,2,3,4|3,4|4|5,6,9"));
		assertFalse(Pattern.matches(reg2, "1,2,3,4|3,4|4|5,6,9|"));
		assertTrue(Pattern.matches(reg2, "1,2,3,4|3,4|4|5,6,9|6"));
		assertTrue(Pattern.matches(reg2, "1,2,3,4|3,4|4|5,6,9|6,6,6,6"));
		
		int ssc3_group_min = 3;
		String ssc3_group_reg = "^([0-9])(,[0-9]){"+ (ssc3_group_min-1) +"}$";
		assertTrue(Pattern.matches(ssc3_group_reg, "1,2,3"));
		assertTrue(Pattern.matches(ssc3_group_reg, "1,2,9"));
		assertFalse(Pattern.matches(ssc3_group_reg, "1,2,10"));
		
		//时时彩大小单双
		String ssc3_dxds_reg = "^[1-4]\\|[1-4]$";
		assertTrue(Pattern.matches(ssc3_dxds_reg, "1|2"));
		assertFalse(Pattern.matches(ssc3_dxds_reg, "0|2"));
		assertFalse(Pattern.matches(ssc3_dxds_reg, "1|5"));
		assertFalse(Pattern.matches(ssc3_dxds_reg, "1||2"));
		assertFalse(Pattern.matches(ssc3_dxds_reg, "1|"));
		
		String ssc3_dxds_fs_reg = "^([1-4])(,[1-4]){0,3}\\|([1-4])(,[1-4]){0,3}$";
		assertTrue(Pattern.matches(ssc3_dxds_fs_reg, "1|2"));
		assertFalse(Pattern.matches(ssc3_dxds_fs_reg, "0|2"));
		assertFalse(Pattern.matches(ssc3_dxds_fs_reg, "1|5"));
		assertFalse(Pattern.matches(ssc3_dxds_fs_reg, "1||2"));
		assertFalse(Pattern.matches(ssc3_dxds_fs_reg, "1|"));
		assertFalse(Pattern.matches(ssc3_dxds_fs_reg, "01|2"));
		assertTrue(Pattern.matches(ssc3_dxds_fs_reg, "1,1,1,1|2,2"));
		assertFalse(Pattern.matches(ssc3_dxds_fs_reg, "1,1,1,1,1|2,2"));
		//String [] a = StringUtils.tokenizeToStringArray("1,1,1,1,1|2,2", SymbolConstants.VERTICAL_BAR);
		
		String reg_ssc_3z3_dantuo = "^[0-9]#[0-9](,[0-9]){0,8}$";
		assertFalse(Pattern.matches(reg_ssc_3z3_dantuo, "1,2#4,5,6,7,8,9"));
		assertTrue(Pattern.matches(reg_ssc_3z3_dantuo, "1#4,5,6,7,8,9"));
		assertTrue(Pattern.matches(reg_ssc_3z3_dantuo, "1#4"));
		assertTrue(Pattern.matches(reg_ssc_3z3_dantuo, "1#2,3,4,5,6,7,8,9,0"));
		assertFalse(Pattern.matches(reg_ssc_3z3_dantuo, "1#2,3,4,5,6,7,8,9,0,2"));
		
		// 三不同号单式
		String k3_bt3_single = "^[1-6](,[1-6]){2}$";
		assertFalse(Pattern.matches(k3_bt3_single, "1,2,7"));
		assertFalse(Pattern.matches(k3_bt3_single, "1,2,3,4"));
		assertTrue(Pattern.matches(k3_bt3_single, "1,2,3"));
		
		// 二同号单选
		String k3_td2_single = "^(11|22|33|44|55|66)#[1-6]$";
		assertFalse(Pattern.matches(k3_td2_single, "11#2,7"));
		assertFalse(Pattern.matches(k3_td2_single, "22#"));
		assertFalse(Pattern.matches(k3_td2_single, "12#34"));
		assertTrue(Pattern.matches(k3_td2_single, "11#3"));
		assertTrue(Pattern.matches(k3_td2_single, "11#1"));
		System.out.println("11".indexOf("1"));
		System.out.println("1".indexOf("11"));
		
		String k3_td2_multi = "^(11|22|33|44|55|66)(,11|,22|,33|,44|,55|,66){0,5}#[1-6](,[1-6]){0,5}$";
		assertFalse(Pattern.matches(k3_td2_multi, "11#2,7"));
		assertTrue(Pattern.matches(k3_td2_multi, "11#2,2"));
		assertTrue(Pattern.matches(k3_td2_multi, "11,11#1,1"));
		assertFalse(Pattern.matches(k3_td2_multi, "11,88#1,1"));
		assertFalse(Pattern.matches(k3_td2_multi, ""));
		assertFalse(Pattern.matches(k3_td2_multi, "11,22"));
		
		// 二不同号
		String k3_bt2_single = "^[1-6],[1-6]$";
		assertFalse(Pattern.matches(k3_bt2_single, ""));
		assertFalse(Pattern.matches(k3_bt2_single, "0,6"));
		assertFalse(Pattern.matches(k3_bt2_single, "1,"));
		assertFalse(Pattern.matches(k3_bt2_single, "1"));
		assertTrue(Pattern.matches(k3_bt2_single, "1,2"));
	}
	
	@Test
	public void testQxc() {
		// "^[0-9](,[0-9]){0,6}(\\|[0-9](,[0-9]){0,6}){6}$"
		assertTrue(Pattern.matches(NUMConstants.QXC_REGEX_NORMAL_MULTIPLE, "0|0,1,2,3,4|0|0,1,2,3,4,5,6|0,1,2,3,4,5,6,7|0,1,2,3,4,5,6,7,8|0,1,2,3,4,5,6,7,8,9"));
	}
	
	public void testSunzhi() {
		for(int i = 0 ; i< HighConstants.POKER_NUM_RANGE.length-2; i++) {
			System.out.print("\""+HighConstants.POKER_NUM_RANGE[i]+HighConstants.POKER_NUM_RANGE[i+1]+HighConstants.POKER_NUM_RANGE[i+2]+"\",");
		}
		System.out.println();
		for(int i = 0 ; i< HighConstants.POKER_NUM_RANGE.length; i++) {
			System.out.print("\""+HighConstants.POKER_NUM_RANGE[i]+HighConstants.POKER_NUM_RANGE[i]+"\",");
		}
		System.out.println();
		for(int i = 0 ; i< HighConstants.POKER_NUM_RANGE.length; i++) {
			System.out.print("\""+HighConstants.POKER_NUM_RANGE[i]+HighConstants.POKER_NUM_RANGE[i]+HighConstants.POKER_NUM_RANGE[i]+"\",");
		}
		System.out.println();
		for(int i = 3 ; i<= 18; i++) {
			System.out.print("\""+i+"\""+",");
		}
	}
	
	@Test
	public void tmp() {
		StringBuilder str = new StringBuilder();
		str.append(",");
		for(int i=0;i<=27;i++){
			str.append("\"");
			str.append(i);
			str.append("\"");
			str.append(",");
		}
		System.out.println(str);
	}
	
	@Test
	public void tmp2() {
		StringBuilder str = new StringBuilder();
//		String vo = "threeCode";
		String pre = "groupThree";
		String pre2 = "zx3_";
		for(int i=0;i<=9;i++){
			str.append(MessageFormat.format("<if test=\"{0}{1}\">", pre, i));
			str.append("\r\n");
			str.append(pre2+i+",");
			str.append("\r\n");
			str.append("</if>");
			str.append("\r\n");
		}
		System.out.println(str);
	}
	
	@Test
	public void tmp3() {
//		String source = 
//				"id,adddate, channel_id, channel_name, platform, reg_user, check_user, order_user,  order_times, order_money, new_order_user, new_order_times, new_order_money, old_order_user,old_order_times, old_order_money, fill_user, fill_times, fill_money, new_fill_user, new_fill_times, new_fill_money, old_fill_user, old_fill_times, old_fill_money"; 
		Field[] fields = ReportUserVO.class.getDeclaredFields();

//		String[] arr = source.split(",");
//		String vo = "threeCode";
		String pre = "reportUser";
		StringBuilder str = new StringBuilder();
		for(Field ele : fields) {
			str.append(MessageFormat.format("<if test=\"{0}.{1}\">", pre, ele.getName()));
			str.append("\r\n");
			str.append(ele.getName()+",");
			str.append("\r\n");
			str.append("</if>");
			str.append("\r\n");
		}
		System.out.println(str);
	}
	
	@Test
	public void testReg2() {
		String str = "s0, s1, s2, s3,s4, s5, s6, s7, s8, s9, s10, s11,s12, s13, s14, s15,s16, s17, s18";
		for(String tmp : str.split(",")) {
			System.out.println(tmp+Pattern.matches("^s\\d{1,2}", tmp.trim()));
		}
		
	}
	
	@Test
	public void testSort() {
		List<Integer> a = Arrays.asList(9,8,9);
		List<Integer> b = Arrays.asList(9,8,8);
		Collections.sort(a);
		Collections.sort(b);
	}
	
	@Test
	public void testSet() {
		Collection<String> a= new HashSet<>();
		a.add("a");
		a.add("b");
		Set<String> b= new HashSet<>();
		b.add("a");
		b.add("b");
		a.addAll(b);
		a = new ArrayList<>(a);
		a.addAll(b);
		System.out.println(a);
	}
	
	@Test
	public void test2() {
		System.out.println(Objects.equals(2.0d, 2d));
		System.out.println(String.format("**********限号信息额修改，推送到mq,彩种：%d*******************", 21001/100));
	}
	
	@Test
	public void test3() {
	    Calendar c = Calendar.getInstance();
	    int i = c.get(Calendar.DAY_OF_WEEK) - c.getFirstDayOfWeek();
	    // 鬼佬的工作日是周日算起，所有加1
	    c.add(Calendar.DATE, -i  + 1);
	    Date start = c.getTime();
	    c.add(Calendar.DATE, 6);
	    Date end = c.getTime();
	    System.out.println(start + " - " + end);
	}
	
	@Test
	public void test4() {
		Calendar aCalendar = Calendar.getInstance();
		// add -1 month to current month
		aCalendar.add(Calendar.MONTH, -1);
		// set DATE to 1, so first date of previous month
		aCalendar.set(Calendar.DATE, 1);

		Date firstDateOfPreviousMonth = aCalendar.getTime();

		// set actual maximum date of previous month
		aCalendar.set(Calendar.DATE,     aCalendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		//read it
		Date lastDateOfPreviousMonth = aCalendar.getTime();
		long days= TimeUnit.DAYS.convert(lastDateOfPreviousMonth.getTime()-firstDateOfPreviousMonth.getTime(), TimeUnit.MILLISECONDS);
//	    System.out.println(firstDateOfPreviousMonth + " - " + lastDateOfPreviousMonth);
	    System.out.println(Arrays.asList(1,2));
	}
	
}

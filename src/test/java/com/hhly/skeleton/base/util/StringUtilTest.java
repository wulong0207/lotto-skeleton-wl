package com.hhly.skeleton.base.util;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testToIntList() {
		String str = "1,2,3#4,5,6,7,8,9";
		List<Integer> ints = StringUtil.toIntList(str, ",#|");
		Assert.assertTrue(ints.size()==9);
		String str2 = "1";
		List<Integer> ints2 = StringUtil.toIntList(str2, ",#|");
		Assert.assertTrue(ints2.size()==1);
		Assert.assertTrue(ints2.get(0)==1);
	}

}

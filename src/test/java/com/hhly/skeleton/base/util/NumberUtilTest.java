package com.hhly.skeleton.base.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberUtilTest {

	@Test
	public void testGetPermutation() {
		assertTrue(NumberUtil.getPermutation(3, 2)==6);
		assertTrue(NumberUtil.getPermutation(6, 2)==30);
		assertTrue(NumberUtil.getPermutation(10, 2)==90);
		assertTrue(NumberUtil.getPermutation(100, 6)==858277728000L);
	}

}

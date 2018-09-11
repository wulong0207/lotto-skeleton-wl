package com.hhly.skeleton.base.constants;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

import org.junit.Test;

public class NUMConstantsTest {

	@Test
	public void testQXC_REGEX_NORMAL_SINGLE() {
		String reg = NUMConstants.QXC_REGEX_NORMAL_SINGLE;
		assertTrue(Pattern.matches(reg, "0|1|2|3|4|5|6"));
		assertTrue(Pattern.matches(reg, "1|2|3|4|5|6|7"));
		assertTrue(Pattern.matches(reg, "0|1|2|3|4|5|9"));
		assertFalse(Pattern.matches(reg, "0|2|3|4|5"));
		assertFalse(Pattern.matches(reg, "0|1|2|3|4|5|9|1"));
		assertFalse(Pattern.matches(reg, "-1|1|2|3|4|5|6"));
	}
	
	@Test
	public void testQXC_REGEX_NORMAL_MULTIPLE() {
		String reg = NUMConstants.QXC_REGEX_NORMAL_MULTIPLE;
		assertTrue(Pattern.matches(reg, "0|1|2|3|4|5|6"));
		assertTrue(Pattern.matches(reg, "0|1|2|3|4|5|9"));
		assertTrue(Pattern.matches(reg, "0,1|1|2|3|4|5|9"));
		assertTrue(Pattern.matches(reg, "0,1,1,1|1|2|3|4|5|9"));
		assertTrue(Pattern.matches(reg, "0,1,1,1|1,2,3|2|3|4|5|9"));
		//assertFalse(Pattern.matches(reg, "0,1,1,1,2,2,2,3|1|2|3|4|5|9"));
		assertFalse(Pattern.matches(reg, "0|2|3|4|5"));
		assertFalse(Pattern.matches(reg, "0|1|2|3|4|5|9|1"));
		assertFalse(Pattern.matches(reg, "-1|1|2|3|4|5|6"));
	}
}

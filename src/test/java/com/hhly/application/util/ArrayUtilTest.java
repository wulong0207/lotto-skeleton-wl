package com.hhly.application.util;

import static org.junit.Assert.assertEquals;

import java.nio.file.Paths;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.hhly.skeleton.base.util.ArrayUtil;

/**
 * 
 * @author wytong
 * @Version 1.0
 * @CreatDate 2016年12月13日 下午4:59:09
 */
public class ArrayUtilTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		Paths.get("");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIntersect() {
		String [] a = {"01","02","03"};
		String [] b = {"1" ,"02","03","3","4"};
		String [] c = ArrayUtil.intersect(a, b);
		assertEquals(2, c.length);
		assertEquals("02", c[0]);
		assertEquals("03", c[1]);
		
		String [] d = {"01","02","03"};
		String [] e = {"3","4"};
		String [] f = ArrayUtil.intersect(d, e);
		assertEquals(0, f.length);
		
//		String str = "123|4,6,6".replaceAll("[|,,]", "");
	}

}

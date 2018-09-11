package com.hhly.application.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.hhly.skeleton.base.util.HhlyColtUtils;

/**
 * 
 * @author wytong
 * @Version 1.0
 * @CreatDate 2016年12月14日 下午2:56:36
 */
public class HhlyColtUtilsTest {

	private List<Integer> list;
	private List<Integer> list2;
	private List<String> list3;
	private List<Integer> list4;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		list = Arrays.asList(1,2,3);
		list2 = Arrays.asList(1,2,3,2);
		list3 = Arrays.asList("abc","bd","abc");
		list4 = Arrays.asList(4,5);
	}

	@After
	public void tearDown() throws Exception {	
		list = null;
		list2 = null;
		list3 = null;
		list4 = null;
	}

	@Test
	public void testLenInRange() {
		assertTrue(HhlyColtUtils.valInRange(list, 1, 3));
		assertFalse(HhlyColtUtils.valInRange(list, 2, 3));
	}

	@Test
	public void testValInRange() {
		assertTrue(HhlyColtUtils.valInRange(list, 1, 3));
		assertFalse(HhlyColtUtils.valInRange(list, 2, 3));
	}
	
	@Test
	public void testIsDuplicate() {
		assertFalse(HhlyColtUtils.isDuplicate(list));
		assertTrue(HhlyColtUtils.isDuplicate(list2));
		assertTrue(HhlyColtUtils.isDuplicate(list3));
	}
	
	@Test
	public void testOccurrence() {
		ConcurrentHashMap<Integer, Integer> ret = HhlyColtUtils.occurrence(list, list2);
		assertNotNull(ret);
		assertTrue(3==ret.get(2));
		ret = HhlyColtUtils.occurrence(list, list4);
		assertNotNull(ret);
	}
	
	@Test
	public void testIntersect() {
		Collection<Integer> ret = HhlyColtUtils.intersect(list, list2);
		assertTrue(2==ret.size());
		ret = HhlyColtUtils.intersect(list, list4);
		assertNotNull(0==ret.size());
	}
	
	

}

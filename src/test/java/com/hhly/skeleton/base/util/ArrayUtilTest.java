package com.hhly.skeleton.base.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ArrayUtilTest {

//	protected static final String[] NUM_RANGE = {"01","02","03","04","05","06","07","08","09","10","11"};
	
	@Test
	public void testIsSame() {
		String [] arr = {"1","1","2"};
		assertFalse(ArrayUtil.isSame(arr));
		String [] arr1 = {"1","1","1"};
		assertTrue(ArrayUtil.isSame(arr1));
		Integer [] arr2 = {3,3,3};
		assertTrue(ArrayUtil.isSame(arr2));
		Integer [] arr3 = {666,666,666};
		assertTrue(ArrayUtil.isSame(arr3));
		Integer [] arr4 = {666,777,666};
		assertFalse(ArrayUtil.isSame(arr4));
	}
	
	@Test
	public void testContainsAll() {
		String [] x115 = {"01","02","03","04","05","06","07","08","09","10","11"};
		String [] arr = {"01","02","3"};
		String [] arr2 = {"01","02","03"};
		String [] arr3 = {"01","02","12"};
		String [] arr4 = {"01","02","03","04","05","06","07","08","09","10","11","01"};
		assertFalse(ArrayUtil.containsAll(x115,arr));
		assertTrue(ArrayUtil.containsAll(x115,arr2));
		assertFalse(ArrayUtil.containsAll(x115,arr3));
		assertTrue(ArrayUtil.containsAll(x115,arr4));
	}

//	@Test
//	public void testThread() throws InterruptedException {
//	      Runnable r = new Runnable()
//          {
//             @Override
//             public void run()
//             {
//                String name = Thread.currentThread().getName();
//                for(int i = 0 ; i < NUM_RANGE.length ; i++) {
//                	if(i==new Random().nextInt(NUM_RANGE.length)) {
//                		 try {
//         					Thread.sleep(1000);
//         				} catch (InterruptedException e) {
//         					e.printStackTrace();
//         				}
//                	}
//                	System.out.println(name + ": " + NUM_RANGE[i]);
//                }
//             }
//          };
//          ExecutorService es = Executors.newFixedThreadPool(2);
//          es.submit(r);
//          es.submit(r);
//          Thread.sleep(5000);
//	}
}

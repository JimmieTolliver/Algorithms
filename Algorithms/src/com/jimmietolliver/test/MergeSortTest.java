/**
 * 
 */
package com.jimmietolliver.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.jimmietolliver.divideandconquer.MergeSort;

/**
 * @author Jimmie Tolliver
 *
 */
public class MergeSortTest {

	@Test
	public void test() {
		int[] array = {5,3,2,1,6,0,9,8,7,4};
		int[] expectedResult = {0,1,2,3,4,5,6,7,8,9};
		
		MergeSort mergeSort = new MergeSort();
		mergeSort.mergesort(array);
		
		assertArrayEquals(expectedResult, array);
	}

}

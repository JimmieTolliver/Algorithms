/**
 * 
 */
package com.jimmietolliver.divideandconquer;

/**
 * @author Jimmie Tolliver
 *
 */
public class MergeSort {
	public int[] array;

	/**
	 * 
	 */
	public MergeSort() {
	}

	/**
	 * @param array
	 */
	public MergeSort(int[] array) {
		this.array = array;
	}

	public int[] mergesort(int[] array) {
		int[] helper = new int[array.length];
		mergesort(array, helper, 0, array.length - 1);
		return array;
	}

	void mergesort(int[] array, int[] helper, int low, int high) {
		if (low < high) {
			int middle = (low + high) / 2;
			mergesort(array, helper, low, middle); // sort left half
			mergesort(array, helper, middle + 1, high); // sort right half
			merge(array, helper, low, middle, high); // merge left and right half
		}
	}

	
	private void merge(int[] array, int[] helper, int low, int mid, int high) {
		for (int i = low; i <= high; i++) {
			helper[i] = array[i];
		}
		int helperLeft = low;
		int helperRight = mid + 1;
		int cur = low;
		// iterate through helper array. Compare the left and right half,
		// copying back the smaller element from the two halves into the
		// original array.
		while (helperLeft <= mid && helperRight <= high) {
			if (helper[helperLeft] <= helper[helperRight]) {
				array[cur] = helper[helperLeft];
				helperLeft++;
			} else {
				array[cur] = helper[helperRight];
				helperRight++;
			}
			cur++;
		}
		// copy the rest of the left side of the array into the target array.
		// The right side doesn't need to be copied because it's already there.
		int remaining = mid - helperLeft;
		for (int i = 0; i <= remaining; i++) {
			array[cur + i] = helper[helperLeft + i];
		}
	}
}

package testing;

import java.util.Arrays;

public class OptimalSortMoves {
	
	/*
	 * Time Complexity: O(n^2 log(n))
	 * 
	 * Space Complexity: O(2n)
	 * 
	 */

	public static int optimalSort(int[] arr) {
		
		// clone the array
		int[] sortedArr = arr.clone();
		
		// sort the clone
		Arrays.sort(sortedArr);

		// set int counter
		int counter = 0;

		// iterate thru array find differences
		for (int i = 0; i < arr.length; i++) {
			if (sortedArr[i] != arr[i]) {
				counter++;
			}
		}

		// return counter
		return counter;

	}

}

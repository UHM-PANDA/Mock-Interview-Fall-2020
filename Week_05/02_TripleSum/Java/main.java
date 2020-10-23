public class Main {

	/*
	 * Brute Force.
	 * 
	 * O(n^3) Time O(1) space
	 */
	boolean bruteForce(int A[], int sum) {

		// Fix the first element as A[i]
		for (int i = 0; i < A.length - 2; i++) {

			// Fix the second element as A[j]
			for (int j = i + 1; j < A.length - 1; j++) {

				// Now look for the third number
				for (int k = j + 1; k < A.length; k++) {
					if (A[i] + A[j] + A[k] == sum) {
						return true;
					}
				}
			}
		}
		// If we reach here, then no triplet was found
		return false;
	}

	/*
	 * Less than search
	 * 
	 * O(n^2) time 
	 * O(1) space
	 */
	boolean lessThanSearch(int A[], int sum) {
		int l, r;

		int arr_size = A.length;

		/* Sort the elements */
		quickSort(A, 0, arr_size - 1);

		/*
		 * Now fix the first element one by one and find the other two elements
		 */
		for (int i = 0; i < arr_size - 2; i++) {

			// To find the other two elements, start two index variables
			// from two corners of the array and move them toward each
			// other
			l = i + 1; // index of the first element in the remaining elements
			r = arr_size - 1; // index of the last element
			while (l < r) {
				if (A[i] + A[l] + A[r] == sum) {
					return true;
				} else if (A[i] + A[l] + A[r] < sum)
					l++;

				else // A[i] + A[l] + A[r] > sum
					r--;
			}
		}

		// If we reach here, then no triplet was found
		return false;
	}

	/*
	 * Less than search hashed
	 * 
	 *  O(n^2) time 
	 *  O(1) space
	 */
	static boolean find3Numbers(int A[], int arr_size, int sum) {
		// Fix the first element as A[i] 
		for (int i = 0; i < arr_size - 2; i++) {
			// Find pair in subarray A[i+1..n-1] 
			// with sum equal to sum - A[i] 
			HashSet<Integer> s = new HashSet<Integer>();
			int curr_sum = sum - A[i];
			for (int j = i + 1; j < arr_size; j++) {
				if (s.contains(curr_sum - A[j])) {
					return true;
				}
				s.add(A[j]);
			}
		}

		// If we reach here, then no triplet was found 
		return false;
	}
}

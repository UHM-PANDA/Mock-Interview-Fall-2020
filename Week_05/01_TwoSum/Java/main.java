public class Main {

	/*
	 * Brute Force
	 *
	 * Time O(n^2) double for loop Space O(1) since no auxiliary structures are
	 * created
	 */
	private boolean bruteForce(int[] arr, int k) {

		// double for loop checks every option
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == k) {
					return true;
				}
			}
		}
		return false;
	}

	/*
	 * Hash
	 *
	 * Time O(n) -- goes thru once, checks of hash contains k - A[i] Space O(n) --
	 * hash
	 */
	private boolean sumsToTarget(int[] arr, int k) {

		HashSet<Integer> values = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (values.contains(k - A[i])) {
				return true;
			}
			values.add(A[i]);
		}
		return false;

	}
}

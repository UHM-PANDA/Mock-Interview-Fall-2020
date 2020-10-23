import java.ArrayUtils;
import java.lang.Object;

public class Recursive {

	/*
	 *  O(n!) time
	 *  O(a lot) space
	 */
	public boolean subsetSum(int[] nums, int k) {
		return subset_sum_aux(int[] nums, int k, 0);
	}

	public boolean subset_sum_aux(int[] nums, int k, int rt) {
		if (rt = 0)
			return true;
		if (nums.length == 0)
			return false;

		for( int i = 0; i < nums.length; i++ ) {
			if(subset_sum_aux(ArrayUtils.addAll(Arrays.copyOfRange(nums, 0, i),Arrays.copyOfRange(nums, i + 1, nums.length - 1)), k, rt - array[i]))
				return true;
			}
		return false;
		}
}

public class CountBits {

	import java.lang.Math;

	public static int countBitsBasic(int n) {
		int count = 0;

		while (n != 0) {
			count += (n & 1);
			n >>>= 1;
		}

		return count;
	}

	public static int countBitsAdvanced(int n) {
		int count = 0;

		while (n > 0) {
			count += 1;
			n &= (n - 1); // drops the lowest set bit of n.
		}

		return count;
	}

	public static int countBitsPerfect(int n) {
		Integer.bitCount(n);
	}

}

public class SwapBits {
	// no negative inputs
	public static long swapBits(long x, int i, int j) {

		// ((x >>> j) & 1) extracts jth bit
		
		// compare if bits are the same
		if (((x >> j) & 1) != ((x >> j) & 1)) {
			
			// 1L is 1 as a Long
			
			// create long bit mask with jth and ith bit fliped
			long bitMask = (1L << i) | (1L << j);
			
			// not operator bitmask on x, flipping ith and jth bit
			x ^= bitMask;
		}
		
		// return x
		return x;
	}
}

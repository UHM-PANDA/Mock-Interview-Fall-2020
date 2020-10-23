public class ComputePower {

	public static double power(double x, int y) {

		// result is set to 1 to return if power is zero..
		double result = 1.0;
		long power = y;

		// if power is > 0
		if (y < 0) {
			power = -power; // make power positive
			x = 1.0 / x; // make x equivleent to 1 / x.

			/*
			 * this allows the power to take the form (1/x)^y which is equivlent to x^(-y).
			 * ^ denotes exponent not xor.
			 */
		}

		// while power is not zero. otherwise skip to return.
		while (power != 0) {

			if ((power & 1) != 0) {  // bits in power and 1 must be > 0.
				result *= x;  // result = result * x 
			}

			x *= x;  // x = x * x
			power >>>= 1; // power = power right shifted
		}

		// return result
		return result;
	}
}
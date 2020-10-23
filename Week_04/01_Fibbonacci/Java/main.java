public class Recursion {

	public static int fib(int n) {
		// if number is less than or equal to 1
		if (n <= 1)
			// return the number because it should be the same
			return n;

		// call recursion for (n - 1) and (n - 2)
		return fib(n - 1) + fib(n - 2);
	}

	static int fib(int n) {
		/* Declare an array to store Fibonacci numbers. */
		int f[] = new int[n + 2]; // 1 extra to handle case, n = 0
		int i;

		/* 0th and 1st number of the series are 0 and 1 */
		f[0] = 0;
		f[1] = 1;

		for (i = 2; i <= n; i++) {
			/*
			 * Add the previous 2 numbers in the series and store it
			 */
			f[i] = f[i - 1] + f[i - 2];
		}

		return f[n];
	}

	public static int fib(int n) {

		// set inital
		int a = 0, b = 1, c;

		// if 0, return 1
		if (n == 0) {
			return a;
		}

		// just add it up
		for (int i = 2; i <= n; i++) {
			// new fib number
			c = a + b;
			// move up old fib numbers
			a = b;
			b = c;
		}

		// return the sum
		return b;
	}

}

	public static int fib(int n) {
		// mathmatical PHI constant
		double phi = (1 + Math.sqrt(5)) / 2;

		// mathmatical idea
		// FIB(n) = (PHI ^ n) / sqrt(5) rounded
		// accurate to infinity
		return (int) Math.round(Math.pow(phi, n) / Math.sqrt(5));
	}

}

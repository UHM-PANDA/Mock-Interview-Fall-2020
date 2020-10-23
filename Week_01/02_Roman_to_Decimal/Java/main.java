public class RomanToDecimal {

	static int RomanToDecimal(String R) {
		// counter for decimal value
		int Decimal = 0;

		// tracks previous char "R.charAt(x - 1)", when iterating thru array.
		char Previous = 0;

		// iterate thru array
		for (int x = 0; x < R.length(); x++) {

			// if 'I' add 1
			if (R.charAt(x) == 'I')
				Decimal += 1;

			// if 'V' add 5,
			if (R.charAt(x) == 'V') {
				Decimal += 5;

				// if previous is 'I', making it 'IV'
				if (Previous == 'I') {
					/*
					 * In previous step, 1 was added bc char was 'I', thus to make it 1 less than
					 * 'V', 2 will be subtracted
					 */	
					Decimal -= 2;
				}
			}

			// if 'X' add 10
			if (R.charAt(x) == 'X') {
				Decimal += 10;

				// if previous is 'I', making it 'IX'
				if (Previous == 'I') {
					/*
					 * In previous step, 1 was added bc char was 'I', thus to make it 1 less than
					 * 'X', 2 will be subtracted
					 */
					Decimal -= 2;
				}
			}

			// if 'L' add 50
			if (R.charAt(x) == 'L') {
				Decimal += 50;

				// if previous is 'X', making it 'XL'
				if (Previous == 'X') {
					/*
					 * In previous step, 10 was added bc char was 'X', thus to make it 10 less than
					 * 'L', 20 will be subtracted
					 */
					Decimal -= 20;
				}
			}

			// if 'C' add 100
			if (R.charAt(x) == 'C') {
				Decimal += 100;

				// if previous is 'X', making it 'XC'
				if (Previous == 'X') {
					/*
					 * In previous step, 10 was added bc char was 'X', thus to make it 10 less than
					 * 'C', 20 will be subtracted
					 */
					Decimal -= 20;
				}
			}

			// if 'D' add 500
			if (R.charAt(x) == 'D') {
				Decimal += 500;

				// if previous is 'C', making it 'CD'
				if (Previous == 'C') {
					/*
					 * In previous step, 100 was added bc char was 'C', thus to make it 100 less than
					 * 'D', 200 will be subtracted
					 */
					Decimal -= 200;
				}
			}

			// if 'D' add 1000
			if (R.charAt(x) == 'M') {
				Decimal += 1000;

				// if previous is 'C', making it 'CM'
				if (Previous == 'C') {
					/*
					 * In previous step, 100 was added bc char was 'C', thus to make it 100 less than
					 * 'M', 200 will be subtracted
					 */
					Decimal -= 200;
				}

			}

			// update Previous
			Previous = R.charAt(x);
		}
		// return decimal
		return Decimal;
	}
}
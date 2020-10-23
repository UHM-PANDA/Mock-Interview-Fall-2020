public class numberOfStepsInTowerOfHanoi {

	/*
	 * I'm confused... what are we returning???
	 * 
	 * The number of steps???
	 */

	static int numberOfStepsInTowerOfHanoi(int n) {
		// its technically right!
		return (2 ^ n) - 1;
	}

}

public class computeTowerHanoi {
	
	/*
	 * This question is confusing I don't get it.  Biggest Panda help.  
	 * 
	 * This is solution from JAVA book.
	 */

	public static List<List<Integer>> computeTowerHanoi(int numRings) {

		List<Deque<Integer>> pegs = IntStream.range(0, NUM_PEGS).mapToObj(i -> new ArrayDeque<Integer>())
				.collect(Collectors.toList());
		// Initialize pegs.
		for (int i = numRings; i >= 1; --i) {
			pegs.get(0).addFirst(i);
		}
		List<List<Integer>> result = new ArrayList<>();
		computeTowerHanoiSteps(numRings, pegs, 0, 1, 2, result);
		return result;
	}

	// recursive helper
	private static void computeTowerHanoiSteps(int numRingsToMove, List<Deque<Integer>> pegs, int fromPeg, int toPeg,
			int usePeg, List<List<Integer>> result) {
		
		// if rings left to move is 1 or more.... 
		if (numRingsToMove > 0) {
			// recursive for numRingsToMove - 1
			computeTowerHanoiSteps(numRingsToMove - 1, pegs, fromPeg, usePeg, toPeg, result);
			// ?????
			pegs.get(toPeg).addFirst(pegs.get(fromPeg).removeFirst());
			// add to result
			result.add(List.of(fromPeg, toPeg));
			// ?????
			computeTowerHanoiSteps(numRingsToMove - 1, pegs, usePeg, toPeg, fromPeg, result);
		}
	}
}
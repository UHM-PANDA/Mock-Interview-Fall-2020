/**
 * @author Robert Lemon
 * 
 * The first problem from the PANDA challenge:
 *
 * Given coordinates to two rectangles vertices. Determine whether or not the two 
 * rectangles overlap each other. If they overlap, return true, else return false. 
 * Overlap: there exists an area > 0 that is contained within both rectangles.
 * 
 */

public class Problem1 {
	
	/**
	 * @param rec1 is the first rectangle (vertices IN ORDER)
	 * @param rec2 is the second rectangle (vertices IN ORDER)
	 * @return	TRUE if overlapping area
	 * 			FALSE if not
	 */
	public static boolean overlappingRectangles2D(double[][] rec1, double[][] rec2) {
		
		// Q.O.L.
		int X = 0;
		int Y = 1;
		
		// find diagonal corners
		double[] topLeft1 = topLeftCorner(rec1);
		double[] bottomRight1 = bottomRightCorner(rec1);
		double[] topLeft2 = topLeftCorner(rec2);
		double[] bottomRight2 = bottomRightCorner(rec2);
		
		// check if rec1 is right of rec2
		if ( topLeft1[X] >= bottomRight2[X] ) {
			return false;
		}
		
		// check if rec2 is right of rec1
		if ( topLeft2[X] >= bottomRight1[X] ) {
			return false;
		}
		
		// check if rec1 is under rec2
		if ( topLeft1[Y] <= bottomRight2[Y] ) {
			return false;
		}
		
		// check if rec2 is under rec1
		if ( topLeft2[Y] <= bottomRight1[Y] ) {
			return false;
		}
		
		// else
		return true;
	}
	
	/**
	 * @param rec the rectangle
	 * @return	the coords of the top left corner
	 */
	public static double[] topLeftCorner(double[][] rec) {
		
		double[] topLeft = new double[2];
		
		double xMin = Double.POSITIVE_INFINITY;
		double yMax = Double.NEGATIVE_INFINITY;
		
		// find yMax
		for ( int i = 0; i < 4; i++ ) {
			if ( rec[i][1] > yMax ) {
				yMax = rec[i][1];
			}
		}
		// find xMin
		for ( int i = 0; i < 4; i++ ) {
			if ( rec[i][1] == yMax && rec[i][0] < xMin ) {
				xMin = rec[i][0];
			}
		}

		topLeft[0] = xMin;
		topLeft[1] = yMax;
		
		return topLeft;
	}

	/**
	 * @param rec the rectangle
	 * @return	the coords of the bottom right corner
	 */
	public static double[] bottomRightCorner(double[][] rec) {
		double[] bottomRight = new double[2];
		
		double xMax = Double.NEGATIVE_INFINITY;
		double yMin = Double.POSITIVE_INFINITY;
		
		// find yMin
		for ( int i = 0; i < 4; i++ ) {
			if ( rec[i][1] < yMin ) {
				yMin = rec[i][1];
			}
		}
		// find xMax
		for ( int i = 0; i < 4; i++ ) {
			if ( rec[i][1] == yMin && rec[i][0] > xMax ) {
				xMax = rec[i][0];
			}
		}
		
		bottomRight[0] = xMax;
		bottomRight[1] = yMin;
		
		return bottomRight;
	}
}

public class IterativeSolution {
	
	public List<Integer> sprialMatrix(int[][] matrix) {

		ArrayList<Integer> result = new ArrayList<Integer>();

		// if matrix is null or length 0 return
		if (matrix == null || matrix.length == 0) {
			return result;
		}

		// define m and n as hight and width of matrix
		int m = matrix.length;
		int n = matrix[0].length;

		
		// define x and y as pointers used to move across array
		int x = 0;
		int y = 0;

		while (m > 0 && n > 0) {

			// for 1 by n matrix
			if (m == 1) {
				for (int i = 0; i < n; i++) {
					result.add(matrix[x][y++]);
				}
				break;
			} else if (n == 1) {
				for (int i = 0; i < m; i++) {
					result.add(matrix[x++][y]);
				}
				break;
			}

			// navigate top of matrix
			for (int i = 0; i < n - 1; i++) {
				result.add(matrix[x][y++]);
			}

			// navigate right of matrix
			for (int i = 0; i < m - 1; i++) {
				result.add(matrix[x++][y]);
			}

			// navigate bottem of matrix
			for (int i = 0; i < n - 1; i++) {
				result.add(matrix[x][y--]);
			}

			// navigate left of matrix
			for (int i = 0; i < m - 1; i++) {
				result.add(matrix[x--][y]);
			}

			// iterate x and y, which moves to 'inner section' of array.
			x++;
			y++;

			// subtract length of array by two, bc 'inner section' is shorter by two
			// lost 1 on both sides of length
			m = m - 2;
			n = n - 2;
		}

		return result;

	}
	
	
}

class RecursiveSolution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
       List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }
        generate(matrix, 0, matrix[0].length - 1, 0, matrix.length - 1, result);
        return result;
    }
    
     private void generate(int[][] matrix, int left, int right, int up, int down, List<Integer> result) {
        if (left > right || up > down) {           
            return;
        }
        if (left == right) {
            for (int i = up; i <= down; i++) {
                result.add(matrix[i][left]);
            }
            return;
        }
        if (up == down) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[up][i]);
            }
            return;
        }
        for (int i = left; i < right; i++) {
            result.add(matrix[up][i]);
        }
        for (int i = up; i < down; i++) {
            result.add(matrix[i][right]);
        }
        for (int i = right; i > left; i--) {
            result.add(matrix[down][i]);
        }
        for (int i = down; i > up; i--) {
            result.add(matrix[i][left]);
        }
        generate(matrix, left + 1, right - 1, up + 1, down - 1, result);
    }
     

}
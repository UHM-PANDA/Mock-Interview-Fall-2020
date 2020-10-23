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

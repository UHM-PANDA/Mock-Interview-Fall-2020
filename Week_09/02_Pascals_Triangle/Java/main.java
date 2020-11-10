public class Main {
     static int[][] printPascal(int n) {

          int[][] triangle = new int[n][n];
          int triangle[0][0] = 1;

          for (int line = 1; line < n; line++) {
               triangle[line][0] = 1;
               triangle[line][line] = 1;
               for (int i = 1; i < line; i++) {
                    triangle[line][i] = triangle[line - 1][i] + triangle[line - 1][i - 1];
               }
          }
          return triangle;
     }

     static int[][] printPascalchoose(int n) {
          int[][] triangle = new int[n][n];
          for (int line = 0; line < n; line++) {
               for (int i = 0; i <= line; i++) {
                    triangle[line][i] = choose(line, i);
               }
          }
          return triangle;
     }

     // some bs for choose function
     static int choose(int n, int k) {
          int res = 1;
          if (k > n - k) {
               k = n - k;
          }
          for (int i = 0; i < k; ++i) {
               res *= (n - i);
               res /= (i + 1);
          }
          return res;
     }

}

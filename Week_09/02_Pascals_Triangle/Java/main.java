public class Main {
     static void printPascal(int n) {

          triangle = new int[10][10];

          for (int line = 0; line < n; line++) {
               for (int i = 0; i <= line; i++) {
                    triangle[line][i] = choose(line, i);
               }
          }
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

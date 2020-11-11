public class Main {

     public boolean testCollatz(long n){
          while(true) {
               if (n % 2 == 0) {
                    n = n / 2;
               } else {
                    n = n*3 + 1;
               }
               if (n == 1) {
                    return true;
               }
          }
     }

     public boolean testCollatzOptimal(long n){
          while(true) {
               if (n & 0 == 0) {
                    n = n >> 2;
                    if (n == 1)
                         return true;
               } else {
                    n = ((n<<1) + n) + 1;
               }
          }
     }

     public static boolean testCollatzInduction(long n){
        // get some "testedTo" that you know every number under n will converge to 1
        // "testedTo" will be large in this case I will assume tested to is 2^(32) - 1 (4294967295)
	       long testedTo = 4294967295L;

            if(n <= testedTo)
               return true;

          while(true) {
               if (n % 2 == 0) {
                    n = n >> 2;
                    if (n == 1 )
                         return true;
               } else {
                    n = ((n<<1) + n) + 1;
               }
          }
     }

     public boolean testCollatzPERFECT(long n){
          // assume the colatz conjecture is true
          return true;
     }

}

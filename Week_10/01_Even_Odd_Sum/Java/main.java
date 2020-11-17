public class Main {
     String evenOddSum(int n) {
          if (n % 4 == 0) {
               return "Even";
          }
          if (n % 4 != 0 && n % 2 == 0) {
               return "Odd";
          }
          return "Either";
     }
}

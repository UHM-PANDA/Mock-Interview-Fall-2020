public class main {
     public boolean isStringPalindrome(String s) {
          int l=0;
          int r=s.length()-1;
          while(l<r) {
               char rchar = Character.toLowerCase(s.charAt(r));
               char lchar = Character.toLowerCase(s.charAt(l));
               if(rchar == lchar){
                    l++;
                    r--;
               } else {
                    return false;
               }
          }
          return true;
     }
     
     public boolean isStringPalindrome(int x) {
          if (x < 0)
               return false;
          int copy = x;
          reverse = 0;
          do {
               reverse *= 10;
               reverse += copy % 10;
               copy = copy/10;
          } while (copy != 0);

          return reverse == x;
     }
}

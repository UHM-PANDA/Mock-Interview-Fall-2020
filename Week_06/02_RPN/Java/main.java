public class Main {

     public int reversePolishNotation(Char[] arr) {

          int returnValue = 0;
          String operators = "+-*/";

          Stack<Char> stack new Stack<Char>();

          for (char t: arr) {
               if (!operators.contains(t)) {
                    stack.push(t);
               } else {
                    int a = Integer.valueOf(stack.pop());
                    int b = Integer.valueOf(stack.pop());
                    switch(t) {
                    case "+":
                         stack.push(String.valueOf(b+a));
                         break;
                    case "-":
                         stack.push(String.valueOf(b-a));
                         break;
                    case "*":
                         stack.push(String.valueOf(b * a));
                         break;
                    case "/":
                         stack.push(String.valueOf(b/a));
                         break;
                    }
               }
          }
          returnValue = Integer.valueOf(stack.pop());

          return returnValue;
     }

}

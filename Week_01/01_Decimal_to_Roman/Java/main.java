public class DecimalToRoman {

// another test

  public static String decimalToRoman(int input) {

    //create string
    String s = "";

    //while string is >= than 1000, append "M" to denote 1000, minus 1000 off input
    while (input >= 1000) {
      s += "M";
      input -= 1000;
    }

    //while string is >= than 900, append "CM" to denote 900, minus 900 off input
    while (input >= 900) {
      s += "CM";
      input -= 900;
    }

    //while string is >= than 500, append "D" to denote 500, minus 500 off input
    while (input >= 500) {
      s += "D";
      input -= 500;
    }

    //while string is >= than 400, append "CD" to denote 400, minus 400 off input
    while (input >= 400) {
      s += "CD";
      input -= 400;
    }

    //while string is >= than 100, append "C" to denote 100, minus 100 off input
    while (input >= 100) {
      s += "C";
      input -= 100;
    }

    //while string is >= than 90, append "XC" to denote 90, minus 90 off input
    while (input >= 90) {
      s += "XC";
      input -= 90;
    }

    //while string is >= than 50, append "L" to denote 50, minus 50 off input
    while (input >= 50) {
      s += "L";
      input -= 50;
    }

    //while string is >= than 40, append "XL" to denote 40, minus 40 off input
    while (input >= 40) {
      s += "XL";
      input -= 40;
    }

    //while string is >= than 10, append "X" to denote 10, minus 10 off input
    while (input >= 10) {
      s += "X";
      input -= 10;
    }

    //while string is >= than 9, append "IX" to denote 9, minus 9 off input
    while (input >= 9) {
      s += "IX";
      input -= 9;
    }

    //while string is >= than 5, append "V" to denote 5, minus 5 off input
    while (input >= 5) {
      s += "V";
      input -= 5;
    }

    //while string is >= than 4, append "IV" to denote 4, minus 4 off input
    while (input >= 4) {
      s += "IV";
      input -= 4;
    }

    //while string is >= than 1, append "IX" to denote 1 , minus 1 off input
    while (input >= 1) {
      s += "I";
      input -= 1;
    }

    //return the string
    return s;
  }
}

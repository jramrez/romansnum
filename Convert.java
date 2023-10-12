class Convert {
  public static void toInt(String romanNum) {
    int result = 0;
    for (int i = 0; i < romanNum.length(); i++) {
      switch (romanNum.charAt(i)) {
        case 'M':
          if (i > 0) {
            if (romanNum.charAt(i-1) == 'C') {
              result += 800;
            }
            else {
              result += 1000;
            }
          }  
          else {
            result += 1000;
          }
          break;
        case 'D':
          if (i > 0) {
            if (romanNum.charAt(i-1) == 'C') {
              result += 300;
            }
            else {
              result += 500;
            }
          }  
          else {
            result += 500;
          }
          break;
        case 'C':
          if (i > 0) {
            if (romanNum.charAt(i-1) == 'X') {
              result += 80;
            }
            else {
              result += 100;
            }
          }  
          else {
            result += 100;
          }
          break;
        case 'L':
          if (i > 0) {
            if (romanNum.charAt(i-1) == 'X') {
              result += 30;
            }
            else {
              result += 50;
            }
          }  
          else {
            result += 50;
          }
          break;
        case 'X':
          if (i > 0) {
            if (romanNum.charAt(i-1) == 'I') {
              result += 8;
            }
            else {
              result += 10;
            }
          }  
          else {
            result += 10;
          }
          break;
        case 'V':
          if (i > 0) {
            if (romanNum.charAt(i-1) == 'I') {
              result += 3;
            }
            else {
              result += 5;
            }
          }  
          else {
            result += 5;
          }
          break;
        case 'I':
          result += 1;
          break;
      }
    }
    System.out.println(result);
  }


  public static void toRomanNum(int num) {
    String result = "";
    int[] romanValues = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    for (int i = 0; i < romanValues.length; i++) {
      while (num >= romanValues[i]) {
        result += romanLetters[i];
        num = num - romanValues[i];
      }
    }
    System.out.println(result);
  }
}
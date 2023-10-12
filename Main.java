import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("[1] Convert to int or [2] Convert to roman numeral?");
    String response = scan.nextLine();
    if (response.equals("1")) {
      System.out.println("Enter a Roman Numeral to convert: ");
      String strInput = scan.nextLine();
      Convert.toInt(strInput);
    }
    else if (response.equals("2")) {
      System.out.println("Enter a Number to convert: ");
      int intInput = scan.nextInt();
      Convert.toRomanNum(intInput);
    }
    
    
    
    scan.close();
  }
}
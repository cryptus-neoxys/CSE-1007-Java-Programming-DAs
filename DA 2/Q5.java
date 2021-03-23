import java.util.Scanner;

public class Q5 {
  /*
   * Write a Java program to convert a binary number to decimal number and to
   * decimal number to binary number.
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter Binary number to convert:");
    long num = in.nextLong();
    int decimal = convertBinaryToDecimal(num);
    System.out.println("Binary to Decimal");
    System.out.println(num + " = " + decimal);
    System.out.println("Enter Decimal number to convert:");
    num = in.nextLong();
    System.out.println("Decimal to Binary");
    long binary = convertDecimalToBinary(num);
    System.out.println("" + num + " = " + binary);
    in.close();
  }

  public static int convertBinaryToDecimal(long num) {
    int decimalNumber = 0, i = 0;
    long remainder;

    while (num != 0) {
      remainder = num % 10;
      num /= 10;
      decimalNumber += remainder * Math.pow(2, i);
      ++i;
    }

    return decimalNumber;
  }

  public static long convertDecimalToBinary(long num) {
    long binaryNumber = 0;
    long remainder, i = 1;
    // int step = 1;

    while (num != 0) {
      remainder = num % 2;
      // System.out.println("Step " + step++ + ": " + num + "/2");
      // System.out.println("Quotient = " + num / 2 + ", Remainder = " + remainder);
      num /= 2;
      binaryNumber += remainder * i;
      i *= 10;
    }

    return binaryNumber;
  }
}
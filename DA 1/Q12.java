import java.util.Scanner;

public class Q12 {

  public static void main(String[] args) {
    int base, exp, pow = 1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter base");
    base = sc.nextInt();
    System.out.println("Enter exponent");
    exp = sc.nextInt();
    for (int i = 0; i < exp; ++i) {
      pow *= base;
    }
    sc.close();
    System.out.println("The power " + base + "^" + exp + " = " + pow);
  }
}

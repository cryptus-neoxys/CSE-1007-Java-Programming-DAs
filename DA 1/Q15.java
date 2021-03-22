import java.util.Scanner;

public class Q15 {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 604 for Java Programming \n Enter 605 for Python Programming ");
    n = sc.nextInt();
    if(n % 3 == 0) {
      System.out.println("Divisible by 3");
    } if(n % 5 == 0) {
      System.out.println("Divisible by 5");
    } if (n == 604) {
      System.out.println("Java Programming");
    } else if (n == 605) {
      System.out.println("Python Programming");
    } else {
      System.out.println("Invalid Number");
    }
    sc.close();
  }
}

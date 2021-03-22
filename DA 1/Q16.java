import java.util.Scanner;

public class Q16 {
  public static void main(String[] args) {
    int n, Sum;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n (1 + 2 + 3 + .. + n)");
    n = sc.nextInt();
    Sum = n*(n+1)/2;
    System.out.println(Sum);
    sc.close();
  }
}

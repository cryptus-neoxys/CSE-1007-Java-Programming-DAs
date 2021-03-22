import java.util.Scanner;

public class Q17 {
  public static void main(String[] args) {
    int n, Sum;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n ((1^2) + (2^2) + (3^2) + (..^2) + (n^2))");
    n = sc.nextInt();
    Sum = n*(n+1)*(2*n + 1) / 6;
    System.out.println(Sum);
    sc.close();
  }
}


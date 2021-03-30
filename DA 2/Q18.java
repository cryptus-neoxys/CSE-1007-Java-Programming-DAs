import java.util.Scanner;

public class Q18 {
  public static void main(String[] args) {
    int n;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter n:");
    n = in.nextInt();

    for (int i = 1; i < 2 * n; ++i) {
      for (int j = 1; j <= n - (Math.abs(n - i)); ++j)
        System.out.print(j);
      System.out.println();
    }

    in.close();
  }
}
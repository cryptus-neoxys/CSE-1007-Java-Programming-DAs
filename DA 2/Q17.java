import java.util.Scanner;

public class Q17 {
  public static void main(String[] args) {
    int m, n;

    System.out.println("Enter rows and Columns:");
    Scanner in = new Scanner(System.in);

    n = in.nextInt();
    m = in.nextInt();

    int[][] matrix = new int[n][m];

    for (int i = 0; i < n; ++i)
      for (int j = 0; j < n; ++j)
        matrix[i][j] = in.nextInt();

    System.out.println("\nThe matrix is");
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j)
        System.out.print(matrix[i][j] + "\t");
      System.out.println();
    }

    System.out.println("\nThe diagonal elements are:");
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        if (i == j)
          System.out.print(matrix[i][j] + "\t");
        else
          System.out.print("\t");
      }
      System.out.println();
    }
    in.close();
  }
}

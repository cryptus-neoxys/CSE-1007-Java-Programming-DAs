import java.util.Scanner;

public class Q4 {
  /*
   * Write a Java program to separate even and odd numbers of an given array of
   * integers. Put all even numbers first, and then odd numbers.
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no. of elements: ");
    int N = sc.nextInt();
    int[] arr = new int[N];
    // Array user input
    for (int i = 0; i < N; ++i) {
      System.out.print("Enter " + i + "th element:\t");
      arr[i] = sc.nextInt();
    }
    sc.close();

    // View elements
    System.out.println("Array Elements");
    for (int x : arr)
      System.out.print(x + "\t");
    System.out.println();

    int i = 0, j = arr.length - 1;

    while (i < j - 1) {
      while (arr[i] % 2 == 0)
        i++;
      while (arr[j] % 2 == 1)
        j--;
      int t = arr[i];
      arr[i] = arr[j];
      arr[j] = t;
      System.out.print("After Swap:\t");
      for (int x : arr)
        System.out.print(x + "\t");
      System.out.println();
    }

    // View elements
    System.out.println("Required Array");
    for (int x : arr)
      System.out.print(x + "\t");
    System.out.println();

  }
}

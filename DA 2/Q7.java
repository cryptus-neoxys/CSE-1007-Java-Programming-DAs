import java.util.Scanner;

public class Q7 {
  /*
   * Write a Java program to test if the first and the last element of two array
   * of integers are same. The length of the array must be greater than or equal
   * to. Test Data: Array1 = 50, -20, 0, 30, 40, 60, 12 array2 = 45, 20, 10, 20,
   * 30, 50, 11 Sample Output: false
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of Array 1: ");
    int N1 = sc.nextInt();
    int[] arr1 = new int[N1];
    // Array user input
    for (int i = 0; i < N1; ++i) {
      System.out.print("Enter " + i + "th element:\t");
      arr1[i] = sc.nextInt();
    }
    System.out.println("Enter size of Array 2: ");
    int N2 = sc.nextInt();
    int[] arr2 = new int[N2];
    // Array user input
    for (int i = 0; i < N2; ++i) {
      System.out.print("Enter " + i + "th element:\t");
      arr2[i] = sc.nextInt();
    }
    sc.close();

    // View elements
    System.out.print("\nArra1 Elements:\t");
    for (int x : arr1)
      System.out.print(x + "\t");
    System.out.println();
    System.out.print("Array2 Elements:\t");
    for (int x : arr2)
      System.out.print(x + "\t");
    System.out.println();

    // Output
    System.out.println("\nOutput: " + ((arr1[0] == arr2[0]) && (arr1[arr1.length - 1] == arr2[arr2.length - 1])));
  }
}

import java.util.Scanner;

public class Q8 {
  /*
   * Write a Java program to create a new array of length 2 from two arrays of
   * integers with three elements and the new array will contain the first and
   * last elements from the two arrays Test Data: array1 = 50, -20, 0 array2 = 5,
   * -50, 10 Sample Output: Array1: [50, -20, 0] Array2: [5, -50, 10] New Array:
   * [50, 10]
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

    int[] newArr = { arr1[0], arr2[arr2.length - 1] };

    // Output
    System.out.println("\nRequired Array: ");
    for (int x : newArr)
      System.out.print(x + "\t");
    System.out.println();
  }
}

import java.util.Scanner;

public class Q6 {
  /*
   * Write a Java program to test if the first and the last element of an array of
   * integers are same. The length of the array must be greater than or equal to
   * 2. Test Data: array = 50, -20, 0, 30, 40, 60, 10 Sample Output: False
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
    System.out.print("Array Elements:\t");
    for (int x : arr)
      System.out.print(x + "\t");
    System.out.println();

    // if(arr[0] == arr[arr.length - 1]) System.out.println("");
    System.out.println(arr[0] == arr[arr.length - 1]);
  }
}

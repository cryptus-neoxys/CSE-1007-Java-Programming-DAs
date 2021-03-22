import java.util.Scanner;

public class Q1 {
  // Write a Java program to print the third largest number in an array
  public static void main(String[] args) {
    int[] arr = new int[10];
    Scanner sc = new Scanner(System.in);
    // Array user input
    for (int i = 0; i < 10; ++i) {
      System.out.print("Enter " + i + "th element:\t");
      arr[i] = sc.nextInt();
    }
    System.out.println("Array Elements");
    sc.close();

    for (int x : arr)
      System.out.print(x + "\t");
    System.out.println();

    // Bubble Sort
    for (int i = 0; i < 10; ++i) {
      for (int j = i; j < 10 - 1; ++j) {
        if (arr[i] < arr[j + 1]) {
          int t = arr[i];
          arr[i] = arr[j + 1];
          arr[j + 1] = t;
        }
      }
    }

    System.out.println("Third largest element is" + arr[2]);

    // TEST_OUTPUT
    // for (int x : arr)
    // System.out.print(x + "\t");
  }
}

import java.util.Scanner;

public class Q3 {
  /*
   * Write a Java program to sort an array of positive integers of an given array,
   * in the sorted array the value of the first element should be maximum, second
   * value should be minimum value, third should be second maximum, fourth second
   * be second minimum and so on.
   */
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

    System.out.println("The sorted array:");
    for (int x : arr)
      System.out.print(x + "\t");
    System.out.println();

    // Insert elements
    int[] newArr = new int[10];

    for (int i = 0; i < 5; ++i) {
      newArr[i * 2] = arr[i];
      newArr[i * 2 + 1] = arr[9 - i];
    }

    System.out.println("The required array:");
    for (int x : newArr)
      System.out.print(x + "\t");
    System.out.println();

  }
}
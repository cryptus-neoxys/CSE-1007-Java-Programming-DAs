public class Q10 {
  /*
   * Write a Java program to rotate an array (length 3) of integers in left
   * direction. Sample Output: Original Array: [20, 30, 40] Rotated Array: [30,
   * 40, 20]
   */
  public static void main(String[] args) {
    int[] arr = { 10, 20, 30 };
    System.out.print("Original array:\t");
    for (int x : arr)
      System.out.print(x + "\t");
    System.out.println();

    int t = arr[0];
    for (int i = 1; i < arr.length; i++) {
      arr[i - 1] = arr[i];
    }
    arr[2] = t;

    // Output
    System.out.print("Rotated array:\t");
    for (int x : arr)
      System.out.print(x + "\t");
    System.out.println();
  }
}

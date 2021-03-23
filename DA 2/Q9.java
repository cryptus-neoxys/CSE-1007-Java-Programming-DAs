public class Q9 {
  /*
   * Write a Java program to test that a given array of integers of length 2
   * contains a 4 or a 7. Original Array: [5, 7] Sample Output: true
   */
  public static void main(String[] args) {
    int[] arr1 = { 2, 7 };
    System.out.println("Array1:\t" + arr1[0] + " " + arr1[1]);
    System.out.println((arr1[0] == 4 || arr1[0] == 7 || arr1[1] == 4 || arr1[1] == 7));
    int[] arr2 = { 4, 7 };
    System.out.println("\nArray2:\t" + arr2[0] + " " + arr2[1]);
    System.out.println((arr2[0] == 4 || arr2[0] == 7 || arr2[1] == 4 || arr2[1] == 7));
    int[] arr3 = { 4, 9 };
    System.out.println("\nArray3:\t" + arr3[0] + " " + arr3[1]);
    System.out.println((arr3[0] == 4 || arr3[0] == 7 || arr3[1] == 4 || arr3[1] == 7));
    int[] arr4 = { 2, 11 };
    System.out.println("\nArray3:\t" + arr4[0] + " " + arr4[1]);
    System.out.println((arr4[0] == 4 || arr4[0] == 7 || arr4[1] == 4 || arr4[1] == 7));
  }
}

import java.util.Arrays;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in Array 1:");
        n = sc.nextInt();

        int[] array_nums  = new int[n];
        System.out.println("Enter the elements of the Array 1: ");
        for(int i = 0; i < n; i++)
        {
            //reading array elements from the user
            array_nums[i]=sc.nextInt();
        }
        System.out.println("Original Array 1 looks like: "+ Arrays.toString(array_nums));

        int n1;
        System.out.println("Enter the number of elements in Array 2:");
        n1 = sc.nextInt();

        int[] array_nums1  = new int[n1];
        System.out.println("Enter the elements of the Array 2: ");
        for(int i = 0; i < n1; i++)
        {
            //reading array elements from the user
            array_nums1[i] = sc.nextInt();
        }
        System.out.println("Original Array 2 looks like: "+ Arrays.toString(array_nums1));

        String result = "";
        for (int i = 0; i < n1 && n == n1; i++) {
            int num1 = array_nums[i];
            int num2 = array_nums1[i];
            result += Integer.toString(num1 * num2) + " ";
        }
        System.out.println("\nThe result of the operation is: " + result);
    }
}

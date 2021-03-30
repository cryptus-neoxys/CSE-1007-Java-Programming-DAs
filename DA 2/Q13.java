import java.util.Arrays;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args)
    {
        int n;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();

        int[] array_nums  = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i< n; i++)
        {
            //reading array elements from the user
            array_nums[i]=sc.nextInt();
        }
        System.out.println("Original Array looks like: "+ Arrays.toString(array_nums));

        int max_val = array_nums[0];
        if(max_val <= array_nums[array_nums.length-1])
            max_val = array_nums[array_nums.length-1];
        if(max_val <= array_nums[array_nums.length/2])
            max_val = array_nums[array_nums.length/2];

        System.out.println("Largest element between first, last, and middle values: "+max_val);
    }
}

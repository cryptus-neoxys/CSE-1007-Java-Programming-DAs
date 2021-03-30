import java.util.Arrays;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int[] array_nums  = new int[3];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i< 3; i++)
        {
            //reading array elements from the user
            array_nums[i]=sc.nextInt();
        }

        System.out.println("Original Array: "+ Arrays.toString(array_nums));
        int x = array_nums[0];
        array_nums[0] = array_nums[array_nums.length-1];
        array_nums[array_nums.length-1] = x;
        System.out.println("New array after swapping the first and last elements: "+Arrays.toString(array_nums));

    }
}

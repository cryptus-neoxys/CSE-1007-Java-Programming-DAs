package JavaDA;

import java.util.Arrays;
import java.util.Scanner;
public class Q11 {
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

        int max_val = array_nums[0];
        if(array_nums[2] >= max_val)
            max_val = array_nums[2];
        System.out.println("Larger value between first and last element: "+max_val);
    }
}


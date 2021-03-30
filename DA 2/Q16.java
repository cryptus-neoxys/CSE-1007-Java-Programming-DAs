import java.util.Scanner;

class Q16
{
    public static void main(String[] args)
    {
        int m, n, p, q, sum = 0, c, d, k;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of Matrices 1");
        m = in.nextInt();
        n = in.nextInt();

        int[][] first = new int[m][n];

        System.out.println("Enter elements of Matrices 1");

        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                first[c][d] = in.nextInt();

        System.out.println("Enter the number of rows and columns of Matrices 2");
        p = in.nextInt();
        q = in.nextInt();

        if (n != p)
            System.out.println("Matrices cannot be multiplied");
        else
        {
            int[][] second = new int[p][q];
            int[][] multiply = new int[m][q];

            System.out.println("Enter elements of Matrices 2");

            for (c = 0; c < p; c++)
                for (d = 0; d < q; d++)
                    second[c][d] = in.nextInt();

            for (c = 0; c < m; c++)
            {
                for (d = 0; d < q; d++)
                {
                    for (k = 0; k < p; k++)
                    {
                        sum = sum + first[c][k]*second[k][d];
                    }

                    multiply[c][d] = sum;
                    sum = 0;
                }
            }

            System.out.println("Product:");

            for (c = 0; c < m; c++)
            {
                for (d = 0; d < q; d++)
                    System.out.print(multiply[c][d]+"\t");

                System.out.print("\n");
            }
        }
    }
}
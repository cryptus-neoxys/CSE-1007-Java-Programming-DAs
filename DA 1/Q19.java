import java.util.Scanner;

class Q19 {
  public static void main(String args[]) {
    int a, b, c, user = 0;
    Scanner sc = new Scanner(System.in);
    while(user != 2) {
      System.out.println("1st Number: ");
      a = sc.nextInt();
      System.out.println("2nd Number: ");
      b = sc.nextInt();
      c = a + b;
      System.out.print("The sum is: ");
      System.out.println(c);
      System.out.println("1. Add more numbers \n2. Exit");
      user = sc.nextInt();
    }
    System.out.println("Exiting ... ");
    sc.close();
  }
}
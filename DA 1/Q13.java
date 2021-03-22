public class Q13 {
  public static void main(String[] args) {
    int Sum = 0;
    for(int i = 10; i <= 50; ++i) {
      if(i % 3 == 0) {
        Sum += i;
      }
    }
    System.out.println("Sum of all digits between 10 and 50, which are divisible by 3" + Sum);
  }
}

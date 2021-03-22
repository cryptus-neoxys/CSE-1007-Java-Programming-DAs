public class Q14 {
  public static void main(String[] args) {
    for(int i = 200; i <= 800; ++i) {
      if(i % 2 != 0 && i % 5 == 0) {
        System.out.print(i + ", ");
      }
    }
  }
}

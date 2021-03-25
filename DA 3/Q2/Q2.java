
interface Factortial {
  int factl(int n);
}

interface SumToN {
  int sumN(int n);
}

class Demo implements Factortial, SumToN {

  @Override
  public int factl(int n) {
    int P = 1;
    for (int i = 1; i <= n; ++i)
      P *= i;
    return P;
  }

  @Override
  public int sumN(int n) {
    int S = 0;
    for (int i = 1; i <= n; ++i)
      S += i;
    return S;
  }

}

public class Q2 {
  public static void main(String[] args) {
    Demo obj = new Demo();
    System.out.println(obj.factl(8));
    System.out.println(obj.sumN(8));
  }
}

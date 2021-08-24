
package java1;

public class Sum {

  public static int sum(int a, int b) {
    int sum = 0;
    for (int i = a; i <= b; i++) {
      sum += i;
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(sum(10, 20));
    System.out.println(sum(20, 40));

  }
}
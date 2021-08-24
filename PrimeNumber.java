import java.util.*;

public class PrimeNumber {
  public static void main(String[] args) {
    int i;
    boolean f = false;
    System.out.println("enter any number");
    Scanner input = new Scanner(System.in);
    int prime = input.nextInt();
    for (i = 2; i < prime; i++) {
      if (prime % i == 0) {
        f = true;
        break;
      }
    }
    if (f) {
      System.out.println("not prime number");
    } else {
      System.out.println("prime number");
    }
  }
}

import java.util.*;

public class GretestComDiv {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the value of Num1:");
    int num1 = input.nextInt();
    System.out.println("Enter the value of Num2:");
    int num2 = input.nextInt();
    int gcd = 1;
    for (int k = 1; k <= num1 && k <= num2; k++) {
      if (num1 % k == 0 && num2 % k == 0)
        gcd = k;
    }
    input.close();
    System.out.println("GCD= " + gcd);
  }

}

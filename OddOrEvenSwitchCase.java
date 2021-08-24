import java.util.*;

public class OddOrEvenSwitchCase {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num1 = input.nextInt();

    switch (num1 % 2) {
      case 0:
        System.out.println(num1 + "is an even number");
        break;
      case 1:
        System.out.println(num1 + "is an odd number");
        break;
    }

  }

}

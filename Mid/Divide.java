package Mid;

import java.util.*;

public class Divide {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter the integer : ");
    int i = input.nextInt();
    if (i % 5 == 0 && i % 6 == 0) {
      System.out.println("Divisible by 5 and 6");
    } else if (i % 5 == 0 || i % 6 == 0) {
      System.out.println("Divisible by 5 or 6");
    } else {
      System.out.println("wrong input");
    }

  }
}

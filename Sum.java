import java.util.*;

public class Sum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int sum = 0;
    System.out.print("Enter Integer Value : ");
    for (int i = 0; i < 5; i++) {
      int number = input.nextInt();
      sum = sum + number;
    }
    System.out.println(sum);

  }
}
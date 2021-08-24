import java.util.Scanner;

public class Smallest {
  public static void main(String[] args) {
    int div = 2;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Integer Value : ");
    int number = input.nextInt();
    while (number > 1) {
      if (number % div == 0) {
        System.out.print(div + ",");
        number = number / div;
      } else {
        div++;
      }
    }
  }

}
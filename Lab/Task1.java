package Lab;

import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) {
    System.out.println("enter row: ");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    for (int i = 1; i <= n; ++i) {

      for (int j = 1; j <= i; ++j) {

        System.out.print(((char) ('A' - 1 + j)));

      }

      System.out.println();
    }

  }

}
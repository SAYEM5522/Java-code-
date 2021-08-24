package practicecode;

import java.util.Scanner;

import java.lang.Math;

public class Book {
  public static int recursiveCountPage(int numberOfBooks) {
    int pages = 0;
    if (numberOfBooks == 0) {
      return 0;
    }
    pages = (int) (Math.random() * 751) + 50;
    return pages = pages + recursiveCountPage(numberOfBooks - 1);

  }

  public static int iterativeCount(int numberOfBooks) {
    int pages = 0;
    for (int i = 0; i < numberOfBooks; i++) {
      int p = (int) (Math.random() * 751) + 50;

      pages = pages + p;

    }
    return pages;

  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int b1, b2, b3;
    System.out.println("Enter the number of books : ");
    b1 = input.nextInt();
    b2 = input.nextInt();
    b3 = input.nextInt();

    System.out.println(recursiveCountPage(b1));
    System.out.println(recursiveCountPage(b2));
    System.out.println(recursiveCountPage(b3));

    System.out.println(iterativeCount(b1));
    System.out.println(iterativeCount(b2));
    System.out.println(iterativeCount(b3));

  }
}

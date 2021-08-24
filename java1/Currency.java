package java1;

import java.util.*;

public class Currency {
  public static final String[] SingleNum = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
      "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

  public static final String[] TeensNumber = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
      "eighty", "ninety" };

  private static int n;

  public static int getN() {
    return n;
  }

  public static void setN(int n) {
    Currency.n = n;
  }

  public static String amountInWords(int n) {
    if (n < 0) {
      return "minus " + amountInWords(-n);
    }

    if (n < 20) {
      return SingleNum[n];
    }

    if (n < 100) {

      return TeensNumber[n / 10] + ((n % 10 != 0) ? " " : "") + SingleNum[n % 10];
    }

    if (n < 1000) {
      return SingleNum[n / 100] + " hundred " + ((n % 100 != 0) ? " " : "") + amountInWords(n % 100);
    }

    if (n < 10000) {
      return amountInWords(n / 1000) + " thousand " + ((n % 1000 != 0) ? " " : "") + amountInWords(n % 1000);
    } else {

      return null;

    }

  }

  public static void main(final String[] args) {

    System.out.println("Enter your Currency:");
    Scanner i = new Scanner(System.in);
    Currency c = new Currency();
    int n = i.nextInt();
    if (n < 10000) {
      c.setN(n);
      System.out.println("Your Currency in Word =  " + amountInWords(c.getN()));

    } else {
      System.out.println("Your ammount is too large");
    }

    i.close();
  }
}

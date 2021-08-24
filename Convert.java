import java.util.*;

public class Convert {
  public static final String[] units = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
      "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

  public static final String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
      "ninety" };

  public static String convert(int n) {
    if (n < 0) {
      return "minus " + convert(-n);
    }

    if (n < 20) {
      return units[n];
    }

    if (n < 100) {
      return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
    }

    if (n < 1000) {
      return units[n / 100] + " hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
    }

    if (n <= 10000) {
      return convert(n / 1000) + " thousand" + ((n % 1000 != 0) ? " " : "") + convert(n % 1000);
    } else {
      return null;
    }

  }

  public static void main(final String[] args) {
    int n;
    System.out.println("Enter your Currency:");
    Scanner i = new Scanner(System.in);

    n = i.nextInt();
    System.out.printf("%10d = '%s'%n", n, convert(n));

  }
}
package practicecode;

import java.util.Scanner;

public class Calender1 {

  /*
   * enum Month { JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4), MAY(5), JUNE(6),
   * JULY(7), AUGUST(8), SEPTEMBER(9), OCTOBER(10), NOVEMBER(11), DECEMBER(12);
   * 
   * Month(int i) { } }
   * 
   * 
   * enum Day { SATURDAY(0), SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4),
   * THURSDAY(5), FRIDAY(6);
   * 
   * Day(int i) { } }
   */

  public static void main(String[] args) {

    /*
     * Scanner input = new Scanner(System.in);
     * 
     * 
     * for (int i = 0; i < 3; i++) { System.out.print("Enter month: "); int m =
     * input.nextInt(); System.out.print("Enter year: "); int year =
     * input.nextInt(); System.out.print("Enter the day of the month: "); int q =
     * input.nextInt(); //System.out.println(computeDayOfWeek());
     * //System.out.println(); System.out.println("Day of the week is " + Name);
     * System.out.println(); }
     * 
     * //}
     */

    // public static void computeDayOfWeek(int year, Month monthName, byte
    // dayOfMonth) {
    int m = 0;
    int year = 0;
    int q = 0;

    if (m < 3) {
      m += 12;
      year -= 1;
    }

    int j = year / 100;
    int k = year % 100;
    int H = ((q + (((m + 1) * 26) / 10) + k + (k / 4) + (j / 4)) + (5 * j)) % 7;

    String Name = "";

    switch (H) {
    case 0:
      Name = "SATURDAY";
      break;
    case 1:
      Name = "SUNDAY";
      break;
    case 2:
      Name = "MONDAY";
      break;
    case 3:
      Name = "TUESDAY";
      break;
    case 4:
      Name = "WEDNESDAY";
      break;
    case 5:
      Name = "THURSDAY";
      break;
    case 6:
      Name = "FRIDAY";
      break;
    }
    // System.out.println("Day of the week is " + Name);
    // System.out.println();

    // public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    for (int i = 0; i < 3; i++) {
      System.out.print("Enter month: ");
      String monthName = input.next();
      System.out.print("Enter year: ");
      int y = input.nextInt();
      System.out.print("Enter the day of the month: ");
      int date = input.nextInt();
      // System.out.println(computeDayOfWeek());
      System.out.println("Day of the week is: " + Name);
      System.out.println();

    }
  }
}

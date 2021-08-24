
// import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String args[]) {
    int year;

    Scanner sc = new Scanner(System.in);
    year = sc.nextInt();
    sc.close();
    if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
      System.out.printf("%d is a leap year.", year);
    else
      System.out.printf("%d is not a leap year.", year);
  }
}

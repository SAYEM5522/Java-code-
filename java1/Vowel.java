package java1;

import java.util.*;

public class Vowel {

  public static void num(String s, int n) {
    int u = 0;
    for (int i = 0; i <= n - 1; i++) {
      char c = s.charAt(i);
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        u = s.lastIndexOf(c);
      }
    }
    System.out.println("The Index of Second Last Occurence of Vowel:" + u);
  }

  public static void main(String[] args) {
    int j = 0;
    int i = 0;
    System.out.println("Enter a string:");
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    s.toLowerCase();
    for (i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

        j = s.lastIndexOf(c);

      }
    }
    if (s.length() <= 1) {
      System.out.println("The length of string is too small");
    } else {
      num(s, j);
    }

  }
}

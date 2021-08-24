
package java1;

import java.util.Scanner;

public class Hex {
  public static int hex2dec(String s) {
    String index = "0123456789ABCDEF";
    s = s.toUpperCase();
    int dec = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      int k = index.indexOf(c);
      dec = 16 * dec + k;
    }

    return dec;
  }

  public static void main(String args[]) {
    Scanner i = new Scanner(System.in);
    System.out.print("Enter Hexadecimal Number : ");
    String hexadecimal = i.nextLine();
    System.out.print("Decimal Number is " + hex2dec(hexadecimal));
  }
}
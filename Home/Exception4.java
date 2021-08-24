package Home;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exception4 {
  public static void main(String[] args) {
    int count = 0;
    while (true) {

      int ran = (int) (Math.random() * 101);
      int[] arr = new int[ran];
      Scanner input = new Scanner(System.in);
      System.out.println("enter array index : ");
      int index = input.nextInt();
      System.out.println("Enter array value : ");
      int val = input.nextInt();
      count++;

      try {

        arr[index] = val;

      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(count);
        System.out.println(e.getMessage());
        System.exit(0);

      }

    }
  }
}

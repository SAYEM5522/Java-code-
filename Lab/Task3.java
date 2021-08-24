package Lab;

import java.util.Scanner;

public class Task3 {
  public static void main(String[] args) {
    int i, j, leftDiagonal = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter x:");
    int x = input.nextInt();
    System.out.println("Enter y:");
    int y = input.nextInt();

    int[][] arr = new int[x][y];
    System.out.println("Enter Array Element:");
    for (i = 0; i < x; i++) {
      for (j = 0; j < y; j++) {
        arr[i][j] = input.nextInt();
      }
    }
    for (i = 0; i < x; i++) {
      for (j = 0; j < y; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println("\n");
    }

    for (i = 0; i < x; i++) {
      for (j = 0; j < y; j++) {
        if (i + j == 3 - 1) {
          leftDiagonal = leftDiagonal + arr[i][j];
        }
      }
    }
    System.out.println("");
    System.out.println("Sum of Left Diagonal:" + leftDiagonal);
    if (leftDiagonal % 2 == 0) {
      System.out.println("the Sum is even");
    } else {
      System.out.println("the Sum is odd");
    }
  }
}
package Mid;

import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
    int i, j, sumCollumn, sumRow, leftDiagonal = 0, rightDiagonal = 0;
    Scanner input = new Scanner(System.in);

    int[][] arr = new int[3][3];
    System.out.println("Enter Array Element:");
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++) {
        arr[i][j] = input.nextInt();
      }
    }
    for (i = 0; i < 3; i++) {
      sumRow = 0;
      for (j = 0; j < 3; j++) {
        sumRow = sumRow + arr[i][j];
      }
      System.out.println("Sum of each row :" + sumRow);
    }
    System.out.println("");
    for (i = 0; i < 3; i++) {
      sumCollumn = 0;
      for (j = 0; j < 3; j++) {
        sumCollumn = sumCollumn + arr[j][i];
      }
      System.out.println("Sum of each column :" + sumCollumn);
    }
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++) {
        if (i == j) {
          rightDiagonal = rightDiagonal + arr[i][j];
        }
      }
    }
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++) {
        if (i + j == 3 - 1) {
          leftDiagonal = leftDiagonal + arr[i][j];
        }
      }
    }
    System.out.println("");
    System.out.println("Sum of Right Diagonal:" + rightDiagonal);
    System.out.println("Sum of Left Diagonal:" + leftDiagonal);
  }
}
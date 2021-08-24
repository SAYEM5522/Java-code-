package java2;

import java.util.*;

public class Text {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number of rows: ");
    int a = input.nextInt();
    System.out.println("Enter number of columns: ");
    int b = input.nextInt();
    int[][] matrix = new int[a][b];
    System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        matrix[i][j] = input.nextInt();
      }
    }
    System.out.println("output ");
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();

    }

  }

}
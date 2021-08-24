import java.util.*;

public class Array1 {

  public static double min(double[] array) {
    int i;
    double min = array[0];
    for (i = 0; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
      }
    }
    return min;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the size of Array:" + " ");
    int n = input.nextInt();

    double[] arr = new double[n];

    for (int i = 0; i < n; i++) {
      arr[i] = input.nextDouble();
      System.out.print(arr[i] + " ");

    }
    System.out.println("");
    System.out.println("smallest element:" + min(arr));

  }
}
/*
 * import java.util.Scanner;
 * 
 * public class Array { public static void main(String[] args) { int i, j,
 * sumCollumn, sumRow, leftDiagonal = 0, rightDiagonal = 0; Scanner input = new
 * Scanner(System.in);
 * 
 * int[][] arr = new int[3][3]; System.out.println("Enter Array Element:"); for
 * (i = 0; i < 3; i++) { for (j = 0; j < 3; j++) { arr[i][j] = input.nextInt();
 * } } for (i = 0; i < 3; i++) { sumRow = 0; for (j = 0; j < 3; j++) { sumRow =
 * sumRow + arr[i][j]; } System.out.println("Sum of each row :" + sumRow); } //
 * System.out.println(""); // for (i = 0; i < 3; i++) { // sumCollumn = 0; //
 * for (j = 0; j < 3; j++) { // sumCollumn = sumCollumn + arr[j][i]; // } //
 * System.out.println("Sum of each column :" + sumCollumn); // }
 * 
 * // for (i = 0; i < 3; i++) { // for (j = 0; j < 3; j++) { // if (i == j) { //
 * rightDiagonal = rightDiagonal + arr[i][j]; // } // } // } // for (i = 0; i <
 * 3; i++) { // for (j = 0; j < 3; j++) { // if (i + j == 3 - 1) { //
 * leftDiagonal = leftDiagonal + arr[i][j]; // } // } // }
 * System.out.println(""); // System.out.println("Sum of Right Diagonal:" +
 * rightDiagonal); // System.out.println("Sum of Left Diagonal:" +
 * leftDiagonal); // System.out.println(sumRow);
 * 
 * } }
 */
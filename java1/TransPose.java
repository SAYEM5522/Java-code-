package java1;

public class TransPose {

  public static int matrixTranspose(int[][] matrix) {
    System.out.println("The matrix is: ");
    for (int[] row : matrix) {
      for (int column : row) {
        System.out.print(column + " ");
      }
      System.out.println();
    }
    return 0;
  }

  public static void main(String[] args) {
    int row = 2, column = 3;
    int[][] matrix = { { 2, 3, 4 }, { 5, 6, 4 } };
    matrixTranspose(matrix);

    int[][] transpose = new int[column][row];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        transpose[j][i] = matrix[i][j];
      }
    }

    matrixTranspose(transpose);
  }

}
import java.util.Scanner;

public class Array {
  int total = 0;
  int TotalStudent;
  int TotalSubject;

  void Student_total(int marks[][]) {
    for (int i = 0; i < TotalStudent; i++) {
      total = 0;
      for (int j = 0; j < TotalSubject; j++) {
        total = total + marks[i][j];
      }
      System.out.println("Each Student Total Marks: " + total);
    }

  }

  void Class_Total() {
    int value = 0;
    for (int i = 0; i < TotalStudent; i++) {
      value = value + total;
    }
    System.out.println("Class Total : " + value);
    System.out.println("Class Average: " + value / TotalStudent);
  }

  public static void main(String[] args) {
    int i, j;
    Array A = new Array();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Total Student : ");
    A.TotalStudent = input.nextInt();
    System.out.println("Enter Total Subject  : ");
    A.TotalSubject = input.nextInt();
    int[][] arr = new int[A.TotalStudent][A.TotalSubject];
    System.out.println("Enter Array Element:");
    for (i = 0; i < A.TotalStudent; i++) {
      for (j = 0; j < A.TotalSubject; j++) {
        arr[i][j] = input.nextInt();
      }
    }
    A.Student_total(arr);
    A.Class_Total();

  }
}
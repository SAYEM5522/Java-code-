import java.util.*;

public class Course {
  private int marks;
  private int[] students = new int[5];
  private int numberOfStudents = 0;
  int total;

  public int Student_total(int marks) {

    // for (int i = 0; i < 2; i++) {
    // total = 0;
    // for (int j = 0; j < 3; j++) {
    return total = total + marks;
    // }

    // }

  }

  public Course() {
  }

  public void setMarks(int marks) {
    this.marks = marks;
  }

  public int getMarks() {
    return marks;
  }

  public void addStudent(int week) {
    this.students[numberOfStudents] = week;
    numberOfStudents++;
  }

  public int[] getStudents() {
    return students;
  }

  public int getNumberOfStudents() {
    return numberOfStudents;
  }

  public static void main(String[] args) {
    Scanner In = new Scanner(System.in);
    Course c = new Course();
    System.out.println("ENTER MARKS:");
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 3; j++) {
        int marks = In.nextInt();
        c.setMarks(marks);
      }

    }
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 3; j++) {
        c.Student_total(c.getMarks());
      }

    }

  }

}
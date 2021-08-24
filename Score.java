
import java.util.Scanner;

public class Score {
  public static void main(String[] args) {
    Scanner In = new Scanner(System.in);

    int highestScore = 0;
    String highestScorerName = "";

    System.out.print("Enter Total  students: ");
    int totalStudents = In.nextInt();

    System.out.println("Enter student’s name and score");
    for (int i = 0; i < totalStudents; i++) {
      System.out.print("Student: " + (i + 1) + "\n   Name of the Student : ");
      String name = In.next();
      System.out.print("   Score of the Student: ");
      int score = In.nextInt();

      if (score > highestScore) {
        highestScore = score;
        highestScorerName = name;
      }

    }

    System.out.println(" highest scorer Name: " + highestScorerName);
  }
}
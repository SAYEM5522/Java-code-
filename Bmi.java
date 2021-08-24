import java.util.*;

public class Bmi {
  public static void main(String[] args) {
    System.out.println("Enter Your number :");
    Scanner bmi = new Scanner(System.in);
    float value = bmi.nextFloat();
    if (value < 18.5) {
      System.out.println("underweight");
    } else if (value >= 18.5 && value <= 24.5) {
      System.out.println("you're \"healthy\"");
    } else if (value >= 25 && value <= 29.9) {
      System.out.println("yo're \"overweight\"");
    } else if (value >= 30 && value <= 39.9) {
      System.out.println("you're \"obese\"");
    } else {
      System.out.println("Not valid number");
    }
  }
}

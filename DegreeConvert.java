import java.util.*;

public class DegreeConvert {
  public static void main(String[] args) {
    System.out.println("Enter Fahrenheit Degree");
    Scanner degree = new Scanner(System.in);
    float fahrenheit = degree.nextFloat();
    float celsius = 5 * (fahrenheit - 32) / 9;
    System.out.println("Celsious:" + celsius);
  }
}

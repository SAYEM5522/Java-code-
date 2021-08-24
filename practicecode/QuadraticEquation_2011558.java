package practicecode;

import java.util.Scanner;

public class QuadraticEquation_2011558 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double q1a, q1b, q1c;

    System.out.println("Enter Objects value: ");
    q1a = input.nextDouble();
    q1b = input.nextDouble();
    q1c = input.nextDouble();

    QuadraticEquation q1 = new QuadraticEquation(q1a, q1b, q1c);
    double obj2a, obj2b, obj2c;
    obj2a = input.nextDouble();
    obj2b = input.nextDouble();
    obj2c = input.nextDouble();
    QuadraticEquation q2 = new QuadraticEquation(obj2a, obj2b, obj2c);
    double obj3a;
    double obj3b;
    double obj3c;
    obj3a = input.nextDouble();
    obj3b = input.nextDouble();
    obj3c = input.nextDouble();
    QuadraticEquation q3 = new QuadraticEquation(obj3a, obj3b, obj3c);
    q1.evaluateDiscriment();
    System.out.println(q1.getRoot1());
    System.out.println(q1.getRoot2());

    System.out.println(q1.toString());
    q2.evaluateDiscriment();
    System.out.println(q2.getRoot1());

    System.out.println(q2.getRoot2());
    System.out.println(q2.toString());
    q3.evaluateDiscriment();
    System.out.println(q3.getRoot1());
    System.out.println(q3.getRoot2());

    System.out.println(q3.toString());
  }
}

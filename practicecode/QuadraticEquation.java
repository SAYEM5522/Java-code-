package practicecode;

import java.util.*;

public class QuadraticEquation {
  private double a;
  private double b;
  private double c;

  public QuadraticEquation() {
  }

  public QuadraticEquation(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double getA() {
    return a;
  }

  public void setA(double a) {
    this.a = a;
  }

  public double getB() {
    return b;
  }

  public void setB(double b) {
    this.b = b;
  }

  public double getC() {
    return c;
  }

  public void setC(double c) {
    this.c = c;
  }

  private double getDiscriment() {
    double dis = this.b * this.b - 4 * this.a * this.c;
    return dis;
  }

  public void evaluateDiscriment() {
    if (getDiscriment() > 0) {
      System.out.println("Two distinct soluation");
    } else if (getDiscriment() == 0) {
      System.out.println("one unique  soluation");
    } else if (getDiscriment() < 0) {
      System.out.println("No real soluation");
    }
  }

  public double getRoot1() {
    double r1;
    if (this.a == 0 || getDiscriment() < 0) {
      System.out.println("Not possible to calculate soluations since discriment is negative ");
      return -1;
    } else {
      r1 = (-this.b + Math.sqrt(getDiscriment())) / 2 * this.a;
      return r1;
    }

  }

  public double getRoot2() {
    double r2;
    if (this.a == 0 || getDiscriment() < 0) {
      System.out.println("Not possible to calculate soluations since discriment is negative ");
      return -1;
    } else {
      r2 = (-this.b - Math.sqrt(getDiscriment())) / 2 * this.a;
      return r2;
    }

  }

  @Override
  public String toString() {
    return "Coefficient|  Value \n " + "a\t\t" + a + "\n " + "b\t\t" + b + "\n " + "c\t\t" + c;
  }

}

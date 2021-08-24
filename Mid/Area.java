package Mid;

import java.util.*;

public class Area {
  double length = 0;
  double breadth = 0;

  Area() {

  }

  public Area(double length, double breadth) {
    this.length = length;
    this.breadth = breadth;

  }

  public void setWidth(double width) {
    this.length = length;
  }

  public double getHeght() {
    return breadth;
  }

  public void setHeight(double height) {
    this.breadth = breadth;
  }

  public double getWidth() {
    return length;
  }

  public static double returnArea(double length, double breadth) {
    double area = length * breadth;
    return area;
  }

  @Override
  public String toString() {
    return " Width= " + length + "\nHeight= " + breadth + "\nArea of Rectangle=" + returnArea(length, breadth) + "\n ";
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter length: ");

    double l = input.nextDouble();
    System.out.println("enter breadth: ");
    double b = input.nextDouble();
    Area r = new Area(l, b);
    System.out.println(r.toString());
  }

}
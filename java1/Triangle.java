package java1;

import java.util.*;

class GeometricObject {
  private boolean filled;
  private String color;

  public GeometricObject() {
  }

  public GeometricObject(boolean filled, String color) {
    this.filled = filled;
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isFilled() {
    return filled;
  }

  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  @Override
  public String toString() {
    return "\n  color=" + color + "\n  filled=" + filled + "";
  }

}

// Rectangle

class Rectangle extends GeometricObject {
  double width = 1;
  double height = 1;

  Rectangle() {

  }

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;

  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeght() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public static double getArea(double width, double height) {
    double area = width * height;
    return area;
  }

  public static double getPerimeter(double width, double height) {
    double perimeter = 2 * (width + height);
    return perimeter;
  }

  @Override
  public String toString() {
    return " Width= " + width + "\nHeight= " + height + "\nArea of Rectangle=" + getArea(width, height)
        + "\n Perimeter of Rectangle=" + getPerimeter(width, height) + super.toString();
  }
}

// Triangle

public class Triangle extends GeometricObject {
  double sid1 = 1;
  double sid2 = 1;
  double sid3 = 1;

  Triangle() {

  }

  public Triangle(double sid1, double sid2, double sid3) {
    this.sid1 = sid1;
    this.sid2 = sid2;
    this.sid3 = sid3;
  }

  public void setSid1(double sid1) {
    this.sid1 = sid1;
  }

  public double getSid2() {
    return sid2;
  }

  public void setSid2(double sid2) {
    this.sid2 = sid2;
  }

  public double getSid3() {
    return sid3;
  }

  public void setSid3(double sid3) {
    this.sid3 = sid3;
  }

  public double getSid1() {
    return sid1;
  }

  public static double getArea(double s1, double s2, double s3) {
    double s = (s1 + s2 + s3) / 2;
    double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    return area;
  }

  @Override
  public String toString() {
    return " sid1=" + sid1 + "\n sid2=" + sid2 + "\n sid3=" + sid3 + "\n perimeter of Triangle= "
        + getPerimetr(sid1, sid2, sid3) + "\n Area of Triangle= " + getArea(sid1, sid2, sid3) + super.toString();
  }

  public static double getPerimetr(double s1, double s2, double s3) {
    double s = (s1 + s2 + s3);
    return s;
  }

  public static void displayObject(GeometricObject s) {
    System.out.println(s);
  }

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter Triangle Side1 :");
    double s1 = input.nextDouble();
    System.out.println("Enter Triangle Side2 :");
    double s2 = input.nextDouble();
    System.out.println("Enter Triangle Side3 :");
    double s3 = input.nextDouble();
    System.out.println("Enter Triangle color: ");
    String c = input.next();
    System.out.println("Enter Triangle Bollen value: ");
    boolean value = input.nextBoolean();
    System.out.println("Enter Rectangle width: ");
    double width = input.nextDouble();
    System.out.println("Enter Rectangle height: ");
    double height = input.nextDouble();
    System.out.println("Enter Rectangle color: ");
    String rc = input.next();
    System.out.println("Enter Rectangle Bollen value: ");
    boolean rb = input.nextBoolean();
    GeometricObject s = new Triangle(s1, s2, s3);
    GeometricObject r = new Rectangle(width, height);
    s.setColor(c);
    s.setFilled(value);
    r.setColor(rc);
    r.setFilled(rb);
    displayObject(s);
    displayObject(r);

  }

}

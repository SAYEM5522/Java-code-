package Lab;

import java.util.*;

class Shape {
  protected boolean filled;
  protected String color;

  public Shape() {
  }

  public Shape(boolean filled, String color) {
    this.filled = filled;
    this.color = color;
  }

  public boolean isFilled() {
    return filled;
  }

  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "Shape [color=" + color + ", filled=" + filled + "]";
  }

}

class Square extends Shape {
  private double width;

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public Square(boolean filled, String color, double width) {
    super(filled, color);
    this.width = width;
  }

  public double getArea() {
    double area = this.width * this.width;
    return area;
  }

  public double getPerimeter() {
    double perimeter = 4 * width;
    return perimeter;

  }

  @Override
  public String toString() {
    return "Square [width=" + width + " color= " + super.color + " filled= " + super.isFilled() + "]";
  }

}

class Rectangle extends Shape {

  protected double length;
  protected double width;
  double perimeter;
  double area;

  Rectangle() {

  }

  public Rectangle(boolean filled, String color, double length, double width) {
    super(filled, color);
    this.length = length;
    this.width = width;
  }

  public void setArea(double area) {
    this.area = area;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getArea() {
    return this.area = this.length * this.width;
  }

  public double getPerimeter() {
    return this.perimeter = 2 * (this.length + this.width);
  }

  public void setPerimeter(double perimeter) {
    this.perimeter = perimeter;
  }

  @Override
  public String toString() {
    return "Rectangle [length=" + length + ", width=" + width + " color= " + super.color + " filled= "
        + super.isFilled() + "]";
  }

}

public class ShapeInfo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    Scanner input3 = new Scanner(System.in);

    System.out.println("Enter Shape Color:");
    String color = input.nextLine();
    System.out.println("Enter Shape filled:");
    boolean filled = input.nextBoolean();
    Shape sh = new Shape(filled, color);
    System.out.println("Enter Squre Color:");
    String Squre_Color = input2.nextLine();
    System.out.println("Enter Squre filled:");
    boolean Squre_filled = input2.nextBoolean();
    System.out.println("Enter Squre Length:");
    double Squre_Length = input2.nextDouble();
    Square s = new Square(Squre_filled, Squre_Color, Squre_Length);
    System.out.println("Enter Rectangle Color:");
    String Rectangle_Color = input3.nextLine();
    System.out.println("Enter Rectangle filled:");
    boolean Rectangle_filled = input3.nextBoolean();
    System.out.println("Enter Rectangle Length:");
    double Rectangle_Length = input3.nextDouble();
    System.out.println("Enter Rectangle width:");
    double Rectangle_width = input3.nextDouble();

    Rectangle r = new Rectangle(Rectangle_filled, Rectangle_Color, Rectangle_Length, Rectangle_width);

    System.out.println("Area of the Square with length of " + s.getWidth() + " is : " + s.getArea());
    System.out.println("Perimeter of the Square length of " + s.getWidth() + " is : " + s.getPerimeter());
    System.out
        .println("Area of the Rectangle length of " + r.getWidth() + "  and " + r.getLength() + " is : " + r.getArea());
    System.out.println("Perimeter of the Rectangle length of " + r.getWidth() + "  and " + r.getLength() + " is : "
        + r.getPerimeter());
    System.out.println(sh.toString());
    System.err.println(s.toString());
    System.out.println(r.toString());

  }
}

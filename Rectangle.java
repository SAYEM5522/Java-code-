
public class Rectangle {
  public double area;
  public double length;
  public double perimeter;
  public double width;

  Rectangle() {

  }

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public double getArea() {
    return area;
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

  public void area() {
    this.area = this.length * this.width;
    System.out.println("Area: " + area);
  }

  public void perimeter() {
    this.perimeter = 2 * (this.length + this.width);
    System.out.println("Perimrter: " + perimeter);
  }

  public static void main(String[] args) {
    Rectangle rec = new Rectangle(5.0, 8.0);
    rec.area();
    rec.perimeter();

  }
}

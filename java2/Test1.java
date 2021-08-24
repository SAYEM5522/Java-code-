package java2;

import java2.GeometricObject.Rectangle;
import java2.GeometricObject.Triangle;

class GeometricObject {

  private double area;

  public GeometricObject() {

  }

  public double getArea() {
    return area;
  }

  public void setArea(double area) {
    this.area = area;
  }

  class Triangle extends GeometricObject {
    public double side1;
    public double side2;
    public double side3;
    double area;

    public Triangle(double side1, double side2, double side3) {
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;

    }

    public void setArea() {
      double s = (side1 + side2 + side3) / 2;
      area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

  }

  class Rectangle extends GeometricObject {
    private double side1;
    private double side2;
    double area;

    public Rectangle(double side1, double side2) {
      this.side1 = side1;
      this.side2 = side2;
    }

    public void setArea() {
      area = this.side1 * this.side2;
    }

  }

}

interface CompareAreaInterface<E> {
  public int compareArea(E t, E r);
}

class Test<E> implements CompareAreaInterface<E> {

  public int compareArea(E t, E r) {
    return 0;

  }

  public <E extends GeometricObject> boolean compareArea(E t, E r) {
    return t.getArea() == r.getArea();

  }

}

public class Test1 {

  public static void main(String[] args) {
    GeometricObject g = new GeometricObject();
    Test<Double> t = new Test<Double>();
    Triangle t1 = g.new Triangle(5, 5, 5);
    Rectangle r1 = g.new Rectangle(5, 6);
    t1.setArea();
    r1.setArea();
    t1.setArea(t1.area);
    r1.setArea(r1.area);
    System.out.println("CompareArea= " + t.compareArea(t1, r1));
    System.out.println("Triangle Area= " + t1.getArea());
    System.out.println("Rectangle Area= " + r1.getArea());

  }

}
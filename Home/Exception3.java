package Home;

class IllegalTriangleException extends Exception {
  public String mes;

  public IllegalTriangleException() {

  }

  public IllegalTriangleException(String message) {
    this.mes = message;
  }

  public String getMes() {
    return mes;
  }

}

class Triangle {
  private double s1;
  private double s2;
  private double s3;

  public void Compare() throws IllegalTriangleException {
    if ((this.s1 + this.s2) < s3) {
      throw new IllegalTriangleException("The sum of the two side is not getter then third side");
    } else {
      // System.out.println("The sum of the two side is getter then third side");
      System.out.println(this.s1 + this.s2);
    }
  }

  public Triangle(double s1, double s2, double s3) {
    this.s1 = s1;
    this.s2 = s2;
    this.s3 = s3;
  }

}

public class Exception3 {
  public static void main(String[] args) throws IllegalTriangleException {
    Triangle t = new Triangle(5, 6, 20);
    try {
      t.Compare();
    } catch (IllegalTriangleException e) {
      System.out.println(e.mes);
    }
  }
}

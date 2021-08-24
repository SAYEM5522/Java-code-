package Mid;

// public class MyPoint {
//   private int x = 0;
//   private int y = 0;

//   MyPoint() {

//   }

//   MyPoint(int x, int y) {
//     this.x = x;
//     this.y = y;
//   }

//   public int getX() {
//     return x;
//   }

//   public void setX(int x) {
//     this.x = x;
//   }

//   public int getY() {
//     return y;
//   }

//   public void setY(int y) {
//     this.y = y;
//   }

//   public void setXY(int x, int y) {
//     this.x = x;
//     this.y = y;
//   }

//   public int[] getXY() {
//     int[] xy = { getX(), getY() };
//     return xy;

//   }

//   public double distance(int x, int y) {
//     int Diffx = this.x - x;
//     int Diffy = this.y - y;
//     return Math.sqrt(Diffx * Diffy + Diffy * Diffy);
//   }

//   public double distance(MyPoint another) {
//     // double Diffx = this.x - another.x;
//     // double Diffy = this.y - another.x;
//     // return Math.sqrt(Diffx * Diffy + Diffy * Diffy);
//     // return Diffx;
//     return double distance = Math.sqrt(Math.pow((another.x-this.x), 2)+Math.pow((another.y-this.y), 2));
//   }

//   public static void main(String[] args) {
//     // MyPoint o = new MyPoint();
//     MyPoint p1 = new MyPoint(3, 4);
//     MyPoint p2 = new MyPoint(5, 6);
//     System.out.println(p1.distance(p2));
//     p1.setX(8);
//     p1.setY(6);
//     System.out.println("x is: " + p1.getX());
//     System.out.println("y is: " + p1.getY());
//     MyPoint[] points = new MyPoint[10];
//     for (int i = 0; i < points.length; i++) {
//       points[i] = new MyPoint(p1.getXY()[0], p1.getXY()[1]);
//     }
//   }

// }

// import java.util.*;
// public class MyPoint {
//   private int x = 0;
//   private int y = 0;

//   public MyPoint() {
//   }

//   public MyPoint(int x, int y) {
//     this.x = x;
//     this.y = y;
//   }

//   public int getX() {
//     return x;
//   }

//   public int getY() {
//     return y;
//   }

//   public void setX(int x) {
//     this.x = x;
//   }

//   public void setY(int y) {
//     this.y = y;
//   }

//   public int[] getXY() {
//     int[] XY = { this.x, this.y };
//     return XY;

//   }

//   public void setXY(int x, int y) {
//     this.x = x;
//     this.y = y;

//   }

//   public double distence(int x, int y) {
//     double dis = Math.sqrt((Math.pow((this.x - x), 2)) + (Math.pow((this.y - y), 2)));
//     return dis;

//   }

//   public double distence(MyPoint otherpoint) {
//     double dis = Math.sqrt((Math.pow((this.x - otherpoint.x), 2)) + (Math.pow((this.y - otherpoint.y), 2)));
//     return dis;
//   }

//   public double distence() {
//     System.out.println("Enter  the X  and y value");
//     Scanner input = new Scanner(System.in);
//     System.out.println("X");
//     int x = input.nextInt();
//     System.out.println("Y");
//     int y = input.nextInt();
//     double dis = Math.sqrt((Math.pow((this.x - x), 2)) + (Math.pow((this.y - y), 2)));
//     return dis;

//   }

//   @Override
//   public String toString() {
//     return "MyPoint{" + "x=" + x + ", y=" + y + '}';
//   }

// }

public class MyPoint {
  private int x = 0;
  private int y = 0;

  public MyPoint() {

  }

  public MyPoint(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int[] getXY() {
    int[] XY = { getX(), getY() };
    return XY;
  }

  public void setXY(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public String toString() {
    return "(" + this.x + "," + this.y + ")";
  }

  public double distance(int x, int y) {
    double distance = Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
    return distance;
  }

  public double distance() {
    double distance = Math.sqrt(Math.pow((0 - this.x), 2) + Math.pow((0 - this.y), 2));
    return distance;
  }

  public double distance(MyPoint another) {
    double distance = Math.sqrt(Math.pow((another.x - this.x), 2) + Math.pow((another.y - this.y), 2));
    return distance;
  }

  public static void main(String[] args) {
    MyPoint p = new MyPoint(5, 8);
    MyPoint d = new MyPoint();
    MyPoint h = new MyPoint();

    d.setX(3);
    d.setY(7);
    h.setXY(5, 9);

    System.out.println(p.distance());
    System.out.println(d.distance(3, 4));
    System.out.println(h.distance(p));

  }
}

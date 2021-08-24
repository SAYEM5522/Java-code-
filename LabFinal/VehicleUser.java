package LabFinal;

class Vehicle {
  private int x = 0;
  private int y = 0;

  public Vehicle() {

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

  public void moveUp() {

    y++;

  }

  public void moveDown() {

    y--;

  }

  public void moveLeft() {

    x--;

  }

  public void moveRight() {

    x++;

  }

  @Override
  public String toString() {

    return "(" + getX() + "," + getY() + ")";
  }

}

public class VehicleUser {
  public static void main(String[] args) {
    Vehicle c = new Vehicle();
    System.out.println(c.toString());
    c.moveUp();
    System.out.println(c.toString());
    c.moveLeft();
    System.out.println(c.toString());
    c.moveDown();
    System.out.println(c.toString());
    c.moveRight();

    System.out.println(c.toString());
    System.out.println(c);
  }
}
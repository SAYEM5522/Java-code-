package Lab;

public class H {
  int s = 81;

  public static void main(String[] args) {

    new H().go();

  }

  void go() {
    inc(++s);
    System.out.println(s);
  }

  void inc(int s) {
    s += 10;
  }
}

public class Fraction1 {

  private int num;
  private int denom;

  Fraction1(int n, int d) {
    num = n;
    denom = d;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public int getDenom() {
    return denom;
  }

  public void setDenom(int denom) {
    this.denom = denom;
  }

  public String toString() {
    return "Fraction =" + num + "/" + denom;
  }

  public Fraction1() {
  }

  Fraction1 add(Fraction1 f1, Fraction1 f2) {
    int denominator = f1.denom * f2.denom;
    int numerator = f1.num * f2.denom + f1.denom * f2.num;
    return new Fraction1(numerator, denominator);
  }

  Fraction1 sub(Fraction1 f1, Fraction1 f2) {
    int denominator = f1.denom * f2.denom;
    int numerator = f1.num * f2.denom - f1.denom * f2.num;
    return new Fraction1(numerator, denominator);
  }

  Fraction1 product(Fraction1 f1, Fraction1 f2) {
    return new Fraction1(f1.num * f2.num, f1.denom * f2.denom);
  }

  Fraction1 divide(Fraction1 f1, Fraction1 f2) {
    return new Fraction1(f1.num * f2.denom, f1.denom * f2.num);
  }

  void frac(Fraction1 f) {
    System.out.println(f.num + "/" + f.denom);
  }

  public static void main(String[] args) {
    Fraction1 f1 = new Fraction1();
    f1.setDenom(4);
    f1.setNum(1);
    Fraction1 f2 = new Fraction1();
    f2.setNum(3);
    f2.setDenom(5);
    System.out.println(f1);
    System.out.println(f2);
    System.out.print("Add: ");
    f1.frac(f1.add(f1, f2));
    System.out.print("Minus: ");
    f1.frac(f1.sub(f1, f2));
    System.out.print("Product: ");
    f1.frac(f1.product(f1, f2));
    System.out.print("Divide: ");
    f1.frac(f1.divide(f1, f2));
    System.out.print("calling object: ");
    f1.frac(f1);

  }

}
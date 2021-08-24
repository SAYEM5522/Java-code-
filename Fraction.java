
public class Fraction {

  private int num;
  private int denom;

  Fraction(int n, int d) {
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

  // public void add(Fraction f) {
  // this.num = this.num * f.denom + this.denom * f.num;
  // this.denom = this.denom * f.denom;
  // System.out.println(this.num + "/" + this.denom);
  // }
  // public void add(Fraction f1, Fraction f2) {
  // int dtemp = f1.denom * f2.denom;
  // int ntemp = f1.num * f2.denom + f1.denom * f2.num;
  // System.out.println(ntemp + "/" + dtemp);
  // }

  // public void sub(Fraction f1, Fraction f2) {
  // int dtemp = f1.denom * f2.denom;
  // int ntemp = f1.num * f2.denom - f1.denom * f2.num;
  // System.out.println(ntemp + "/" + dtemp);
  // }

  public String toString() {
    return "Fraction =" + num + "/" + denom;
  }

  public Fraction() {
    // TODO Auto-generated constructor stub
  }

  Fraction sum(Fraction f1, Fraction f2) {
    int dtemp = f1.denom * f2.denom;
    int ntemp = f1.num * f2.denom + f1.denom * f2.num;
    return new Fraction(ntemp, dtemp);
  }

  Fraction minus(Fraction f1, Fraction f2) {
    int dtemp = f1.denom * f2.denom;
    int ntemp = f1.num * f2.denom - f1.denom * f2.num;
    return new Fraction(ntemp, dtemp);
  }

  Fraction product(Fraction f1, Fraction f2) {
    return new Fraction(f1.num * f2.num, f1.denom * f2.denom);
  }

  Fraction divide(Fraction f1, Fraction f2) {
    return new Fraction(f1.num * f2.denom, f1.denom * f2.num);
  }

  void printfrac(Fraction fr) {
    System.out.println(fr.num + "/" + fr.denom);
  }

  public static void main(String[] args) {
    Fraction f1 = new Fraction();
    f1.setDenom(4);
    f1.setNum(1);
    Fraction f2 = new Fraction(3, 5);

    // f1.add(f1, f2);
    // f1.sub(f1, f2);
    System.out.println(f1);
    // System.out.println(f1.getDenom() + f1.getNum());
    // Fraction f2 = new Fraction(1, 2);

    System.out.println("Add:\n");
    f1.printfrac(f1.sum(f1, f2));
    System.out.println("Minus:\n");
    f1.printfrac(f1.minus(f1, f2));
    System.out.println("Product:\n");
    f1.printfrac(f1.product(f1, f2));

    System.out.println("Divide:\n");
    f1.printfrac(f1.divide(f1, f2));

    f1.printfrac(f1);
    // f1.sum(f1, f2);
  }

}
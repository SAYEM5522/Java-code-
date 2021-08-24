// import java.math.BigDecimal;

// class Octagon {
// private BigDecimal lengthOfSide;
// public final int side = 8;

// public Octagon(BigDecimal lengthOfSide) {
// this.lengthOfSide = lengthOfSide;
// }

// public Octagon(String lengthOfSide) {
// this.lengthOfSide = new BigDecimal(lengthOfSide);
// }

// public String getLengthOfSide() {
// return lengthOfSide.toString();
// }

// public BigDecimal CalculateArea() {

// double A = 2 * (1 + Math.sqrt(2)) * lengthOfSide.doubleValue() *
// lengthOfSide.doubleValue();
// BigDecimal b = BigDecimal.valueOf(A);
// return b;
// }

// public BigDecimal CalculatePerimeter() {
// double P = side * lengthOfSide.doubleValue();
// BigDecimal per = BigDecimal.valueOf(P);
// return per;
// }

// @Override
// public String toString() {
// return "Octagon [ " + "LengthOfSide= " + getLengthOfSide() + " Area=" +
// CalculateArea() + " Perimeter= "
// + CalculatePerimeter() + "]";
// }

// public Octagon() {
// }

// }

// class Decagon {
// private BigDecimal lengthOfSide;
// public final int side = 10;

// public Decagon(BigDecimal lengthOfSide) {
// this.lengthOfSide = lengthOfSide;
// }

// public Decagon(String lengthOfSide) {
// this.lengthOfSide = new BigDecimal(lengthOfSide);
// }

// public Decagon() {
// }

// public String getLengthOfSide() {
// return lengthOfSide.toString();
// }

// public BigDecimal CalculateArea() {

// double A = (5 / 2) * lengthOfSide.doubleValue() * lengthOfSide.doubleValue()
// * Math.sqrt(5 + 2 * Math.sqrt(5));
// BigDecimal b = BigDecimal.valueOf(A);
// return b;
// }

// public BigDecimal CalculatePerimeter() {
// double P = side * lengthOfSide.doubleValue();
// BigDecimal per = BigDecimal.valueOf(P);
// return per;
// }

// @Override
// public String toString() {
// return "Decagon [ " + "LengthOfSide= " + getLengthOfSide() + " Area=" +
// CalculateArea() + " Perimeter= "
// + CalculatePerimeter() + "]";
// }
// }

// public class Area {
// public static BigDecimal GetRandomeNumber() {
// double Max = 5600000000000d, Min = 100000000000d;
// BigDecimal db = new BigDecimal(Math.random() * (Max - Min) + Min);
// return db.setScale(15, BigDecimal.ROUND_HALF_UP);

// }

// public static void main(String[] args) {

// for (int i = 1; i <= 10; i++) {
// if (i % 2 != 0) {
// Octagon O = new Octagon(GetRandomeNumber());
// Octagon O1 = new Octagon(GetRandomeNumber().toString());

// System.out.println(O.toString());

// } else {
// Decagon D = new Decagon(GetRandomeNumber());
// Decagon d1 = new Decagon(GetRandomeNumber().toString());

// System.out.println(D.toString());
// }
// }
// }
// }
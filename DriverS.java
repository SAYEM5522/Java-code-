import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;

class OctagonS {
  private BigDecimal lengthOfSide;
  private LocalDateTime createdOn;
  public static final int NUMBER_OF_SIDES = 8;

  public OctagonS() {
  }

  public OctagonS(BigDecimal lengthOfSide) {
    this.lengthOfSide = lengthOfSide;
  }

  public LocalDateTime setLocalDateTime(LocalDateTime date) {
    return this.createdOn = date;
  }

  public OctagonS(String lengthOfSide) {
    this.lengthOfSide = new BigDecimal(lengthOfSide);
  }

  public String getLengthOfSide() {
    return lengthOfSide.toString();
  }

  public BigDecimal calculateArea() {

    double A = 2 * (1 + Math.sqrt(2)) * lengthOfSide.doubleValue() * lengthOfSide.doubleValue();
    BigDecimal a = BigDecimal.valueOf(A);
    return a;
  }

  public BigDecimal calculatePerimeter() {
    double perimeter = NUMBER_OF_SIDES * lengthOfSide.doubleValue();
    BigDecimal p = BigDecimal.valueOf(perimeter);
    return p;
  }

  @Override
  public String toString() {
    System.out.println("Name of class : Octagon");
    System.out.println("Number of sides : 8");
    System.out.println("Length of side : " + getLengthOfSide() + " units");
    System.out.println("Created on: " + String.format("%1$tB %1$te,%1$tY on %1$tI:%1$tM:%1$tS", createdOn));
    System.out.println("Area : " + calculateArea() + " sq units");
    return "Perimeter : " + calculatePerimeter() + " units\n";
  }
}

class DecagonS {
  private BigDecimal lengthOfSide;
  private LocalDateTime createdOn;
  public final int NUMBER_OF_SIDES = 10;

  public DecagonS() {
  }

  public DecagonS(BigDecimal lengthOfSide) {
    this.lengthOfSide = lengthOfSide;
  }

  public DecagonS(String lengthOfSide) {
    this.lengthOfSide = new BigDecimal(lengthOfSide);
  }

  public String getLengthOfSide() {
    return lengthOfSide.toString();
  }

  public LocalDateTime setLocalDateTime(LocalDateTime date) {
    return this.createdOn = date;
  }

  public BigDecimal calculateArea() {
    double area = (5 / 2) * lengthOfSide.doubleValue() * lengthOfSide.doubleValue() * Math.sqrt(5 + (2 * Math.sqrt(5)));
    BigDecimal a = BigDecimal.valueOf(area);
    return a;
  }

  public BigDecimal calculatePerimeter() {
    double perimeter = NUMBER_OF_SIDES * lengthOfSide.doubleValue();
    BigDecimal p = BigDecimal.valueOf(perimeter);
    return p;
  }

  @Override
  public String toString() {
    System.out.println("Name of class : Decagon");
    System.out.println("Number of sides : 10");
    System.out.println("Length of side : " + getLengthOfSide() + " units");
    System.out.println("Created on: " + String.format("%1$tB %1$te,%1$tY on %1$tI:%1$tM:%1$tS", createdOn));

    System.out.println("Area : " + calculateArea() + " sq units");
    return "Perimeter : " + calculatePerimeter() + " units\n";
  }
}

public class DriverS {
  public static BigDecimal getRandomBigDecimal() {
    double max = 5600000000000d;
    double min = 100000000000d;
    BigDecimal bigd = new BigDecimal(Math.random() * (max - min) + min);
    return bigd.setScale(15, RoundingMode.CEILING);
  }

  public static void main(String[] args) {

    for (int i = 1; i <= 10; i++) {
      if (i % 2 != 0) {
        OctagonS oct = new OctagonS(getRandomBigDecimal());
        OctagonS octa = new OctagonS(getRandomBigDecimal().toString());
        LocalDateTime createdOn = LocalDateTime.now();
        oct.setLocalDateTime(createdOn);
        System.out.println(oct.toString());

      } else {
        DecagonS dec = new DecagonS(getRandomBigDecimal());
        DecagonS deca = new DecagonS(getRandomBigDecimal().toString());
        LocalDateTime createdOn = LocalDateTime.now();
        dec.setLocalDateTime(createdOn);
        System.out.println(dec.toString());
      }
    }

  }
}

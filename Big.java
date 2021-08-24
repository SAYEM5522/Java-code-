
import java.math.BigDecimal;

/**
 * 
 * @author lan
 * 
 */
public class Big {

  /**
   * @param args
   */
  public static void main(String[] args) {
    double Max = 5600000000000d, Min = 100000000000d;
    for (int i = 0; i < 10; i++) {
      BigDecimal db = new BigDecimal(Math.random() * (Max - Min) + Min);
      System.out.println(db.setScale(15, BigDecimal.ROUND_HALF_UP).toString());
    }
  }

}
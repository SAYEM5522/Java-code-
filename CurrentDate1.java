import java.time.*;

public class CurrentDate1 {
  public static void main(String[] args) {
    LocalTime time = LocalTime.now();
    System.out.println(time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
  }
}

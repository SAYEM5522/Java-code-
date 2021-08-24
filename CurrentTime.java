public class CurrentTime {
  public static void main(String[] args) {
    long Milliseconds = System.currentTimeMillis();
    long Seconds = Milliseconds / 1000;
    long currentSecond = (int) (Seconds % 60);
    long Minutes = Seconds / 60;
    long currentMinute = (int) (Minutes % 60);
    long Hours = Minutes / 60;
    long currentHour = (int) (Hours % 24);
    System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");

  }
}

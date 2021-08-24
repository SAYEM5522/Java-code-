import java.util.Date;

public class CurrentDate {
  public static void main(String args[]) {
    Date date = new Date();

    System.out.println(date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds());
  }
}

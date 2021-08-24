import java.util.*;

public class Month {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter month number : ");
    int number = input.nextInt();

    int days;
    switch (number) {
      case 1:
        days = 31;
        System.out.println(days);
        break;
      case 2:
        days = 28;
        System.out.println(days);
        break;
      case 3:
        days = 31;
        System.out.println(days);
        break;
      case 4:
        days = 30;
        System.out.println(days);
        break;
      case 5:
        days = 31;
        System.out.println(days);
        break;
      case 6:
        days = 30;
        System.out.println(days);
        break;
      case 7:
        days = 31;
        System.out.println(days);
        break;
      case 8:
        days = 31;
        System.out.println(days);
        break;
      case 9:
        days = 30;
        System.out.println(days);
        break;
      case 10:
        days = 31;
        System.out.println(days);
        break;
      case 11:
        days = 30;
        System.out.println(days);
        break;
      case 12:
        days = 31;
        System.out.println(days);
        break;
    }
  }
}

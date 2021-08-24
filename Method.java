import java.util.*;

public class Method {
  public static double balance = 0;

  public static double Deposite(double amount) {
    return balance = balance + amount;
  }

  public static double Withdrow(double amount1) {
    return balance = balance - amount1;
  }

  public static void main(String[] args) {
    boolean f = false;
    while (true) {
      System.out.println("1. Deposit");
      System.out.println("2. Withdrow");
      System.out.println("3. Balance");
      System.out.println("4. Exit");
      Scanner value = new Scanner(System.in);
      System.out.println("Your choice (1/2/3/4):");
      int number = value.nextInt();

      switch (number) {
        case 1:
          System.out.println("Enter amount to deposit:");
          Scanner d = new Scanner(System.in);
          double amount = d.nextInt();
          Deposite(amount);
          break;
        case 2:
          System.out.println("Enter amount to withdrow:");
          Scanner w = new Scanner(System.in);
          double amount1 = w.nextInt();
          if (amount1 <= balance) {
            Withdrow(amount1);
          } else {
            System.out.println("");
            System.out.println("Your can't withdraw ");
          }
          break;
        case 3:
          System.out.print("Your balance : ");
          System.out.println(balance);
          break;
        case 4:
          f = true;
          break;
        default:
          System.out.println("Your choice is not correct");
          break;
      }
      if (f) {
        break;
      }

    }
  }
}

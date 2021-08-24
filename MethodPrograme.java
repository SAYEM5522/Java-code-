import java.util.*;

public class MethodPrograme {
  public static double balance = 0;

  public static double Deposite(double amount1) {
    return balance = balance + amount1;
  }

  public static double Withdrow(double amount2) {
    return balance = balance - amount2;
  }

  public static void main(String[] args) {
    boolean exit = false;
    while (true) {
      System.out.println(" 1.Deposit \n 2.Withdrow \n 3.Balance \n 4.Exit");
      Scanner value = new Scanner(System.in);
      System.out.println("Your choice (1/2/3/4):");
      int number = value.nextInt();
      int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
      if (number == n1) {
        System.out.println("Enter amount to deposit:");
        Scanner deposit = new Scanner(System.in);
        double amount1 = deposit.nextInt();
        Deposite(amount1);
      } else if (number == n2) {
        System.out.println("Enter amount to withdrow:");
        Scanner withdrow = new Scanner(System.in);
        double amount2 = withdrow.nextInt();
        if (amount2 <= balance) {
          Withdrow(amount2);
        } else {
          System.out.println("");
          System.out.println("You can't withdraw ");
        }
      } else if (number == n3) {
        System.out.print("Your balance : ");
        System.out.println(balance);
      } else if (number == n4) {
        exit = true;
      } else {
        System.out.println("Your choice is not correct");
      }
      if (exit) {
        break;
      }
    }
  }

}

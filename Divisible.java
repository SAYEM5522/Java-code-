import java.util.*;

public class Divisible {

  public static void main(String[] args) {
System.out.println("Enter An Integer : ");
Scanner input = new Scanner(System.in);
int n = input.nextInt();


    for (int i = 1; i <= n; ++i) {


      if (n % i == 0) {
        System.out.print(i + " ");
      }
    }
  }
}
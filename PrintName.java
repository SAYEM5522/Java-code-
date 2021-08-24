import java.util.*;

public class PrintName {
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int num = n.nextInt();
    System.out.println("Enter your name :");
    String name = n.next();
    n.close();
    for (int i = 1; i < num; i++) {
      System.out.println(name);
    }

  }
}

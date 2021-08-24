import java.util.*;

public class Integer {

  public static void main(String[] args) {
    System.out.println("enter the n:");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int p = 0, neg = 0;
    int sum = 0;
    float avg = 0;
    for (int i = 0; i < n; i++) {
      int j = input.nextInt();
      if (j > 0) {
        p++;
      } else if (j < 0) {
        neg++;
      }
      sum = sum + j;
      avg = (sum / n);

    }
    System.out.println("positive:" + p);
    System.out.println("negative:" + neg);
    System.out.println("totl:" + sum);
    System.out.println("Avrage:" + avg);

  }
}

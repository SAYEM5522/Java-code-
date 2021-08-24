
public class Loop {
  public static void main(String[] args) {

    int n = 15;
    int multiple1 = 1;
    for (int i = 5; i <= n; i = i + 5) {
      multiple1 = multiple1 * i;
    }
    System.out.println("multiple forLoop= " + multiple1 + "\n");
    int j = 5;
    int multiple2 = 1;
    while (j <= n) {
      multiple2 = multiple2 * j;
      j = j + 5;
    }
    System.out.println("multiple whileLoop = " + multiple2);
    int k=5;
    int multiple3=1;
    do {
      multiple3 = multiple3 * k;
      k = k + 5;
    }
    while (k <= n);
    System.out.println("multiple whileLoop = " + multiple3);
  }

}

public class Account {
  public static void main(String[] args) {
    int max = 1000;
    int min = 1;
    int lar, sml;

    int ran1 = (int) (min + Math.random() * (max - min + 1));
    int ran2 = (int) (min + Math.random() * (max - min + 1));
    System.out.println("Random 1:" + ran1);
    System.out.println("Random 2:" + ran2);
    if (ran1 > ran2) {
      lar = ran1;
      sml = ran2;
    } else {
      lar = ran2;
      sml = ran1;
    }
    int i = lar;
    while (i >= sml) {
      if (i % 5 == 0 || i % 8 == 0) {
        System.out.print(i + " ");
      }
      i--;
    }
    System.out.println(" ");
    System.out.println("largest:" + lar + "\n" + " " + "smallest:" + sml);

  }
}


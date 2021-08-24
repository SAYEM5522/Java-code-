public class Flipping {

  public static void main(String[] args) {
    int heads = 0;
    int tails = 0;

    for (int x = 0; x < 100; x++) {
      if (Math.random() < 0.5) {
        tails = tails + 1;
      } else {
        heads = heads + 1;
      }
    }

    System.out.println("Heads : " + heads);
    System.out.println("Tails : " + tails);
  }
}

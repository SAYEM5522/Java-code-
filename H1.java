public class H1 extends Fruit {
  public static void main(String[] args) {
    Apple a = new Apple();
  }

}

class Fruit {
  public Fruit(String name) {
    System.out.println("Fruit's constructor is invoked");
  }
}

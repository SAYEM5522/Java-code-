package Home;

public class Exception1 {

  public static void main(String[] args) throws Exception {
    try {
      String s = "abc";

      s.charAt(10);

    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}

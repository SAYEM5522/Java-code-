public class Index {
  public static void main(String[] args) {
    String s = "apple";
    String s1 = "app";
    String s2 = "ple";

    if (s.startsWith(s1)) {
      System.out.println("The string start with, " + s1);
    } else {
      System.out.println("the string does not start with," + s1);
    }

    if (s.endsWith(s2)) {
      System.out.println("the string ends with, " + s2);
    } else {
      System.out.println("the string does not ends with," + s2);
    }
  }
}

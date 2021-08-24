import java.util.*;

public class Method1 {
  public static int countvowel(String s) {
    int c = 0;
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      ch = Character.toUpperCase(ch);
      if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        c++;
      }
    }
    return c;
  }

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    String s = in.nextLine();

    System.out.println(countvowel(s));
  }
}
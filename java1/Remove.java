
package java1;

import java.util.*;

public class Remove {

  public static String[] remove(String[] array, int index) {
    String[] result = new String[array.length - 1];
    System.arraycopy(array, 0, result, 0, index);
    System.arraycopy(array, index + 1, result, index, result.length - index);
    return result;
  }

  public static void main(String[] args) {
    String[] names = { "Testname", "Charel", "Melissa", "Kelly" };
    names = remove(names, 2);
    System.out.println(Arrays.toString(names));
  }

}

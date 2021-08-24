package Lab;

public class Demo {
  static int[] stripZeros(int[] list) {
    int count = 0;
    for (int i = 0; i < list.length; i++) {
      if (list[i] != 0)
        count++;
    }
    int[] newList;
    newList = new int[count];
    int j = 0;
    for (int i = 0; i < list.length; i++) {
      if (list[i] != 0) {
        newList[j] = list[i];
        j++;
      }
    }
    for (int i = 0; i < newList.length; i++) {
      System.out.println(newList[i]);

    }

    return newList;
  }

  public static void main(String args[]) {
    int[] list = { 9, 8, 9, 0 };
    System.out.println(stripZeros(list));
  }

}
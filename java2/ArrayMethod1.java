package java2;

public class ArrayMethod1 {

  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  public static void main(String[] args) {
    int[] list = { 3, 2, 1, 6, 7 };
    printArray(list);

  }
}

package LabFinal;

class Task1 {
  int size;

  public Task1(int size) {
    this.size = size;
  }

  public Task1(int[] students) {
    this.students = students;
  }

  int[] students = new int[size];

  public static void main(String[] args) {
    Task1 T = new Task1(5);
    for (int i = 0; i < 5; i++) {
      T.students[i] = 6;
    }
    System.out.println(T.students[0]);
  }

}
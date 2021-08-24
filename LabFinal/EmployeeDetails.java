package LabFinal;

import java.util.Scanner;

class Employee {
  private int id;
  private String name;
  private String address;
  int n;
  Employee[] e = new Employee[n];

  public Employee(int id, String name, String address) {
    this.id = id;
    this.name = name;
    this.address = address;
  }

  public Employee() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getN() {
    return n;
  }

  public void setN(int n) {
    this.n = n;
  }

  public Employee[] getE() {
    return e;
  }

  public void setE(Employee[] e) {

    this.e = e;
  }

  public void mailCheck() {
  }

}

class Salary extends Employee {
  private double salary;

  public double getSalary() {
    return salary;
  }

  public Salary() {

  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public Salary(int id, String name, String address, double salary) {
    super(id, name, address);
    this.salary = salary;
  }

  public Salary(double salary) {
    this.salary = salary;
  }

  public void mailCheck() {
    System.out.println("Mailing check to " + this.getName() + " with salary " + this.getSalary());

  }

  public double computePay() {
    this.salary = this.salary + salary * 0.30;
    return salary;
  }

}

public class EmployeeDetails {

  public static void main(String[] args) {
    Employee em = new Employee();

    System.out.println("How many employee do you want to add :");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    em.setN(n);
    int id;
    String name;
    String address;
    double sal;
    Salary s;
    for (int i = 0; i < n; i++) {

      System.out.println("Enter Employee Id");
      id = input.nextInt();
      System.out.println("Enter Employee name");
      name = input.next();
      System.out.println("Enter Employee address");
      address = input.next();
      System.out.println("Enter Employee salary");
      sal = input.nextDouble();
      s = new Salary(id, name, address, sal);
      s.computePay();
      s.mailCheck();

    }

  }
}

package java2;

abstract class Employee {
  protected String name;
  protected String MobileNumber;
  protected double salary;

  public Employee(String name, String id) {
    this.name = name;
    this.MobileNumber = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMobileNumber() {
    return MobileNumber;
  }

  public void setMobileNumber(String id) {
    this.MobileNumber = id;
  }

  public abstract double calCulateSalary();

  @Override
  public String toString() {
    return "Employee [id=" + MobileNumber + ", name=" + name + "]";
  }
}

class FiexrSalaryEmployee extends Employee {

  private double basicSalary;

  public FiexrSalaryEmployee(double basicSalary, String name, String id) {
    super(name, id);
    this.basicSalary = basicSalary;
  }

  public double calCulateSalary() {
    return this.basicSalary + this.basicSalary * 0.30 + this.basicSalary * 0.05;
  }

  public double getTotals() {
    return basicSalary;
  }

  public void setTotals(double totals) {
    this.basicSalary = totals;
  }

  @Override
  public String toString() {
    return "FiexrSalaryEmployee [ basicsalary=" + basicSalary + " Name= " + super.getName() + " mobile number= "
        + super.getMobileNumber() + " Salary= " + calCulateSalary() + "]";
  }

}

class HourlyBasisSalary extends Employee {
  private int totalhours;
  private double perHourRate;

  public HourlyBasisSalary(int hour, double perHourRate, String name, String id) {
    super(name, id);
    this.totalhours = hour;
    this.perHourRate = perHourRate;
  }

  public double calCulateSalary() {
    return totalhours * perHourRate;
  }

  public int getHour() {
    return totalhours;
  }

  public void setHour(int hour) {
    this.totalhours = hour;
  }

  public double getMoney() {
    return perHourRate;
  }

  public void setMoney(double money) {
    this.perHourRate = money;
  }

  @Override
  public String toString() {
    return "HourlyBasisSalary [hour=" + totalhours + ", money=" + perHourRate + " Name= " + super.getName()
        + " mobile number = " + super.getMobileNumber() + " Salary= " + calCulateSalary() + "]";
  }

}

public class AbstractClass {
  public static void main(String[] args) {
    FiexrSalaryEmployee e = new FiexrSalaryEmployee(1000, "zarif", "0163237765");
    HourlyBasisSalary e2 = new HourlyBasisSalary(4, 1000, "zawwad", "017252685");
    System.out.println(e2.toString());
    System.out.println(e.toString());

  }

}

package Lab;

class Bank {
  private String accountName;
  private String accountType;
  private double balance;
  private float interestRate;
  private int yearOfOpening;

  public Bank() {
  }

  public Bank(String accountName, String accountType, double balance, float interestRate, int yearOfOpening) {
    this.accountName = accountName;
    this.accountType = accountType;
    this.balance = balance;
    this.interestRate = interestRate;
    this.yearOfOpening = yearOfOpening;
  }

  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public float getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(float interestRate) {
    this.interestRate = interestRate;
  }

  public int getYearOfOpening() {
    return yearOfOpening;
  }

  public void setYearOfOpening(int yearOfOpening) {
    this.yearOfOpening = yearOfOpening;
  }

  public void deposit(double amount) {
    this.balance = this.balance + amount;
    System.out.println("Balance with Deposit = " + balance);
  }

  public void withdraw(double amount) {
    this.balance = this.balance - amount;
    System.out.println("Balance with Withdraw = " + balance);

  }

  public void calculateBalanceWithInterest(double amount) {
    this.balance = this.balance + (this.balance * amount);
    System.out.println("Current balance with interest = " + balance);
  }

  @Override
  public String toString() {
    return "Bank [accountName=" + accountName + ", accountType=" + accountType + ", balance=" + balance
        + ", interestRate=" + interestRate + ", yearOfOpening=" + yearOfOpening + "]";
  }

}

public class Bank1 {

  public static void main(String[] args) {
    Bank b1 = new Bank("a", "bus", 2000.0, 0.25f, 2012);
    Bank b2 = new Bank("b", "bus1", 2000.0, 0.3f, 2017);
    b1.deposit(400);
    b1.withdraw(300);
    b2.deposit(500);
    b2.withdraw(200);
    b1.calculateBalanceWithInterest(b1.getInterestRate());
    b2.calculateBalanceWithInterest(b2.getInterestRate());
    System.out.println(b1.toString());
    System.out.println(b2.toString());

  }
}
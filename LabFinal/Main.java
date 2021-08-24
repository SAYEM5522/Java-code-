package LabFinal;

class BankAccount {
  public String name;
  public String address;
  public int accountId;
  public double balance;

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

  public int getAccountId() {
    return accountId;
  }

  public void setAccountId(int accountId) {
    this.accountId = accountId;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public BankAccount(String name, String address, int accountId, int balance) {
    this.name = name;
    this.address = address;
    this.accountId = accountId;
    this.balance = balance;
  }

  public BankAccount() {
  }

  public void addInterest() {
    this.balance = this.balance + (this.balance * 0.07);
    System.out.println("Balance with Interest 7% = " + balance);
  }

  @Override
  public String toString() {
    return "BankAccount [accountId=" + accountId + ", address=" + address + ", balance=" + balance + ", name=" + name
        + "]";
  }

}

public class Main {
  public static void main(String[] args) {
    BankAccount acc1 = new BankAccount("sayem", "uttara", 201, 2000);
    BankAccount acc2 = new BankAccount("zarif", "uttara", 202, 5000);

    BankAccount acc3 = new BankAccount("md", "uttara", 203, 6000);
    acc1.addInterest();
    acc3.addInterest();
    System.out.println(acc1.toString());
    System.out.println(acc2.toString());

    System.out.println(acc3.toString());

  }
}

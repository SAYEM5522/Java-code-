import java.util.Random;

import java.util.Formatter;

abstract class Person {

  private String fullName;
  private String nationalId;
  private DateOfBirth dateOfBirth;

  public Person() {
  }

  public Person(String fullName, String nationalId, DateOfBirth dateOfBirth) {
    this.fullName = fullName;
    this.nationalId = nationalId;
    this.dateOfBirth = dateOfBirth;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getNationalId() {
    return nationalId;
  }

  public void setNationalId(String nationalId) {
    this.nationalId = nationalId;
  }

  public DateOfBirth getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(DateOfBirth dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  // this abstract method returns id
  public abstract String id();

  @Override
  public String toString() {
    Formatter formatter = new Formatter(new StringBuilder());

    formatter.format("%-20s : %-20s\n", "Full Name", this.fullName);
    formatter.format("%-20s : %-20s\n", "National ID", this.nationalId);
    formatter.format("%-20s : %-20s\n", "Date of Birth", this.dateOfBirth);
    return formatter.toString();
  }
}

interface Teacher {
  String teacherID();
}

interface Student {
  String studentID();
}

class NSUer extends Person implements Student {

  public NSUer() {
  }

  public NSUer(String fullName, String nationalId, DateOfBirth dateOfBirth) {
    super(fullName, nationalId, dateOfBirth);
  }

  @Override
  public String id() {
    return "student ID goes here";
  }

  @Override
  public String studentID() {
    return "student ID goes here";
  }
}

class NSUTeachers extends Person implements Teacher {

  public NSUTeachers() {
  }

  public NSUTeachers(String fullName, String nationalId, DateOfBirth dateOfBirth) {
    super(fullName, nationalId, dateOfBirth);
  }

  @Override
  public String id() {
    return "teacher ID goes here";
  }

  @Override
  public String teacherID() {
    return "teacher ID goes here";
  }
}

class NSUStaff extends Person implements Teacher, Student {

  public NSUStaff() {
  }

  public NSUStaff(String fullName, String nationalId, DateOfBirth dateOfBirth) {
    super(fullName, nationalId, dateOfBirth);
  }

  @Override
  public String id() {
    return "staff id goes here";
  }

  @Override
  public String studentID() {
    return "student id goes here";
  }

  @Override
  public String teacherID() {
    return "teacher id goes here";
  }
}

class DateOfBirth {
  // it is private so that it cannot be accessed from anywhere else
  private int year;
  private int month;
  private int date;

  // public so that it can be accessed from outside
  public DateOfBirth(int year, int month, int date) {

    this.year = year;
    this.month = month;
    this.date = date;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public int getDate() {
    return date;
  }

  public void setDate(int date) {
    this.date = date;
  }

  // to display the format of the DOB
  @Override
  public String toString() {
    return date + "/" + month + "/" + year;
  }
}

public class Runner {
  // to make the full names
  public static String[] fullNameArray = { "Saif Ahmed", "Fatima Majid", "Tasnim Ali", "Mohammad Hassan",
      "Amirul Islam", "Fariha Zahin", "Salma Reaz", "Ibrahim Rafid", "Ayesha Abdullah", "Khadija Ullah", "Talha Noor",
      "Lubaba Rahman", "Hasib Khan", "Labiba Karim", "Zarin Rahman", "Samiha Shahriar", "Anika Islam", "Anika Ahmed",
      "Amrin Mahmud", "Tamim Majid", "Maimuna Haque", "Humaira Islam", "Nusaiba Ullah", "Maryam Rahman",
      "Farzana Shahriar", "Sharmeen Hasib", "Faisal Mahmud", "Yusuf Islam", "Namira Zahin", "Habiba Haque",
      "Busaina Rahman", "Azrin Rahman", "Zeenat Hassan", "Fariza Nawar", "Wasima Azim", "Mushfiq Hasan", "Aqib Ahmed",
      "Khalil Islam", "Lamia Hassan", "Ashraf Uddin" };

  // to store passport info objects
  public static Person[] makePersonInfoArray = new Person[1];

  // this method creates random passport info objects.
  public static Person createRandomPersonInfo() {
    NSUer makePersonInfo = new NSUer();
    Random random = new Random();

    // assigning random full names, DOBs, NID
    makePersonInfo.setFullName(fullNameArray[random.nextInt(fullNameArray.length)]);

    DateOfBirth dateOfBirth = new DateOfBirth(random.nextInt(2000 - 1930 + 1) + 1930, random.nextInt(12) + 1,
        random.nextInt(28) + 1);
    makePersonInfo.setDateOfBirth(dateOfBirth);

    StringBuilder NIDsb = new StringBuilder();
    NIDsb.append(random.nextInt(9) + 1);
    for (int i = 0; i < 9; i++) {
      NIDsb.append(random.nextInt(10));
    }
    makePersonInfo.setNationalId(NIDsb.toString());
    return makePersonInfo;
  }

  /**
   * prints all 15 passport info. then take NID as user input to search though the
   * data base then finds its passport info in the array and prints it.
   */
  public static void main(String[] args) {
    Object[] objects = { new NSUTeachers(), new NSUer(), new NSUStaff() };
    NSUTeachers T = new NSUTeachers();
    System.out.println(T.id());
    makePersonInfoArray[0] = createRandomPersonInfo();
    System.out.println(makePersonInfoArray[0]);
    NSUer S = new NSUer();
    System.out.println(S.id());
    makePersonInfoArray[0] = createRandomPersonInfo();
    System.out.println(makePersonInfoArray[0]);
    NSUStaff ST = new NSUStaff();
    System.out.println(ST.id());
    makePersonInfoArray[0] = createRandomPersonInfo();
    System.out.println(makePersonInfoArray[0]);


  }
}

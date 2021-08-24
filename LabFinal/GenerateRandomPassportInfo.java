
class PassportInfo {
  public String Passport_Number;
  private String First_Name;
  private String Last_Name;
  private String Nid_Number;
  private String DOB;
  private String Picture;
  static private String[] students = new String[100];
  static private String[] All__Nid = new String[100];

  public static String[] getAll__Nid() {
    for (int i = 0; i < 101; i++) {
      System.out.println(All__Nid[i]);
    }
    return All__Nid;
  }

  public static void setAll__Nid(String[] all__Nid) {
    All__Nid = all__Nid;
  }

  public PassportInfo(String passport_Number, String first_Name, String last_Name, String nid_Number, String dOB,
      String picture) {
    Passport_Number = passport_Number;
    First_Name = first_Name;
    Last_Name = last_Name;
    Nid_Number = nid_Number;
    DOB = dOB;
    Picture = picture;
  }

  public String getPassport_Number() {

    return Passport_Number;
  }

  public void setPassport_Number(String passport_Number) {
    Passport_Number = passport_Number;
  }

  public String getFirst_Name() {
    return First_Name;
  }

  public void setFirst_Name(String first_Name) {
    First_Name = first_Name;
  }

  public String getLast_Name() {
    return Last_Name;
  }

  public void setLast_Name(String last_Name) {
    Last_Name = last_Name;
  }

  public String getNid_Number() {
    return Nid_Number;
  }

  public void setNid_Number(String nid_Number) {
    Nid_Number = nid_Number;
  }

  public String getDOB() {
    return DOB;
  }

  public void setDOB(String dOB) {
    DOB = dOB;
  }

  public String getPicture() {
    return Picture;
  }

  public void setPicture(String picture) {
    Picture = picture;
  }

  public PassportInfo() {
  }

  public static String[] getStudents() {

    for (int i = 0; i < 101; i++) {
      System.out.println(students[i]);
    }
    return students;
  }

  public static void setStudents(String[] students) {
    PassportInfo.students = students;
  }

}

public class GenerateRandomPassportInfo {
  public int n = 0;
  public static PassportInfo[] pass = new PassportInfo[100];

  public static PassportInfo[] getPass() {
    return pass;
  }

  public static void setPass(PassportInfo[] pass) {
    GenerateRandomPassportInfo.pass = pass;
  }

  public void AddPass(PassportInfo p) {
    pass[n++] = p;
  }

  public static String r() {
    String AlphaNumericString = "0123456789";
    String str;
    StringBuilder sb = new StringBuilder(7);
    for (int i = 0; i < 7; i++) {
      int index = (int) (AlphaNumericString.length() * Math.random());
      sb.append(AlphaNumericString.charAt(index));
    }
    return str = "AZ" + sb.toString();
  }

  public static String n() {
    String Nid;
    String AlphaNumericString2 = "123456789";
    StringBuilder sb2 = new StringBuilder(10);
    for (int i = 0; i < 10; i++) {
      int index2 = (int) (AlphaNumericString2.length() * Math.random());
      sb2.append(AlphaNumericString2.charAt(index2));
    }
    return Nid = sb2.toString();
  }

  public static void main(String[] args) {

    GenerateRandomPassportInfo p = new GenerateRandomPassportInfo();
    PassportInfo PSI = new PassportInfo(p.r(), "J", "q", p.n(), "12/2/2000", "jpg");
    PassportInfo PSI1 = new PassportInfo(p.r(), "A", "d", p.n(), "12/2/2000", "jpg");
    PassportInfo PSI2 = new PassportInfo(p.r(), "g", "u", p.n(), "12/2/2000", "jpg");
    PassportInfo PSI3 = new PassportInfo(p.r(), "t", "w", p.n(), "12/2/2000", "jpg");
    PassportInfo PSI4 = new PassportInfo(p.r(), "s", "i", p.n(), "12/2/2000", "jpg");
    PassportInfo PSI5 = new PassportInfo(p.r(), "r", "o", p.n(), "12/2/2000", "jpg");
    PassportInfo PSI6 = new PassportInfo(p.r(), "q", "p", p.n(), "12/2/2000", "jpg");
    PassportInfo PSI7 = new PassportInfo(p.r(), "y", "e", p.n(), "12/2/2000", "jpg");
    PassportInfo PSI8 = new PassportInfo(p.r(), "i", "R", p.n(), "12/2/2000", "jpg");
    PassportInfo PSI9 = new PassportInfo(p.r(), "o", "h", p.n(), "12/2/2000", "jpg");
    PassportInfo PSI10 = new PassportInfo(p.r(), "j", "m", p.n(), "12/2/2000", "jpg");
    PassportInfo PSI11 = new PassportInfo(p.r(), "g", "a", p.n(), "12/2/2000", "jpg");
    PassportInfo PSI12 = new PassportInfo(p.r(), "d", "R", p.n(), "12/2/2000", "jpg");
    PassportInfo PSI13 = new PassportInfo(p.r(), "x", "t", p.n(), "12/2/2000", "jpg");

    String[] arr = new String[101];
    String[] arr1 = new String[101];

    for (int i = 0; i < 101; i++) {
      arr[i] = p.r();
    }
    for (int i = 0; i < 101; i++) {
      arr1[i] = p.n();
    }
    PSI.setStudents(arr);
    PSI.setAll__Nid(arr1);
    p.AddPass(PSI);
    p.AddPass(PSI1);
    p.AddPass(PSI2);
    p.AddPass(PSI3);
    p.AddPass(PSI4);
    p.AddPass(PSI5);
    p.AddPass(PSI6);
    p.AddPass(PSI7);
    p.AddPass(PSI8);
    p.AddPass(PSI9);
    p.AddPass(PSI10);
    p.AddPass(PSI11);
    for (int i = 0; i < 10; i++) {
      System.out.println("Nid: " + pass[i].getNid_Number());
      System.out.println("Passport: " + pass[i].getPassport_Number());
      System.out.println("First Name : " + pass[i].getFirst_Name());
      System.out.println("Last  Name : " + pass[i].getLast_Name());
      System.out.println("DOB  : " + pass[i].getDOB());
      System.out.println("\n");

    }

  }
}

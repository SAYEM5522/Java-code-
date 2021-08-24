package Home;

class InvalidNameException extends Exception {
  public String mes;

  public InvalidNameException() {

  }

  public InvalidNameException(String message) {
    this.mes = message;
  }

  public String getMes() {
    return mes;
  }

}

class Patient {
  private String name;
  private int age;
  private String disease;

  public Patient() {

  }

  public Patient(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void setName(String name) throws InvalidNameException {
    if (name.length() < 3) {
      throw new InvalidNameException("Invalid Nmae=  " + name);
    }
    this.name = name;
  }

  public void setAge(int age) throws IllegalArgumentException {
    if (age < 0) {

      throw new IllegalArgumentException("Negative  age= " + Integer.toString(age));

    }
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}

public class ExceptionError {

  public static void main(String[] args) throws InvalidNameException, IllegalArgumentException {
    Patient p = new Patient("se", -4);
    Patient p1 = new Patient("sa", -6);
    Patient p2 = new Patient("Sayem", 20);
    System.out.println("Valid name= " + p2.getName());
    System.out.println("Valid age= " + p2.getAge());

    try {

      p1.setName(p1.getName());

    } catch (InvalidNameException e) {
      System.out.println(e.getMes());
    }

    try {
      p1.setAge(p1.getAge());

    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
    try {

      p.setName(p.getName());

    } catch (InvalidNameException e) {
      System.out.println(e.getMes());
    }

    try {

      p.setAge(p.getAge());

    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

  }
}

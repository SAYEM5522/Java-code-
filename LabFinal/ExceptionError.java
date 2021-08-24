package LabFinal;

class EitaIntegerNoiException extends Exception {
  public EitaIntegerNoiException() {

  }

  public EitaIntegerNoiException(String message) {
    super(message);
  }
}

public class ExceptionError {
  String value;

  public ExceptionError(String Num) {
    this.value = Num;
  }

  int readInteger() throws EitaIntegerNoiException {
    float f = Float.parseFloat(value);
    if (f % 1 != 0) {
      throw new EitaIntegerNoiException("The number is floating point number  = " + value);
    } else {
      int i = Integer.parseInt(value);
      System.out.println("Integer value = " + i);

      return i;
    }
  }

  public static void main(String[] args) throws EitaIntegerNoiException {
    ExceptionError n = new ExceptionError("6.7");

    try {
      n.readInteger();
    } catch (EitaIntegerNoiException x) {
      System.out.println(x.getMessage());

    }

  }
}
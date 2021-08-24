
public class Regestation {
  public Regestation() {
  }

  public static boolean isValidname(String userName) {
    if (userName.toLowerCase().trim().length() >= 4) {
      System.out.println("Valid name");
    } else {
      System.out.println("Invalid name ");
    }
    return true;
  }

  public static boolean isValid(String passwordhere) {
    boolean t = false;
    if (passwordhere.length() < 6) {
      return t = false;
    } else {

      for (int p = 0; p < passwordhere.length(); p++) {
        if (((Character.isUpperCase(passwordhere.charAt(p))) && (Character.isLowerCase(passwordhere.charAt(p))))
            && (Character.isDigit(passwordhere.charAt(p)))) {
          t = true;
        }

      }

      if (t) {
        System.out.println("valid");
      } else {
        System.out.println("invalid");
      }

    }
    return true;
  }

  public static void main(String[] args) {
    isValidname("12222");
    isValid("Sayemee99");
  }

}
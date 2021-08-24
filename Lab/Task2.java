package Lab;

class GFG {

  static void charCheck(char input_char) {
    if ((input_char >= 65 && input_char <= 90) || (input_char >= 97 && input_char <= 122)) {
      System.out.println(" Alphabet ");
      if (input_char == 'a' || input_char == 'e' || input_char == 'i' || input_char == 'o' || input_char == 'u') {
        System.out.println("Vowel");

      }
    }

    else if (input_char >= 48 && input_char <= 57)
      System.out.println(" Digit ");

    else
      System.out.println(" Special Character ");
  }

  public static void main(String[] args) {
    char input_char = 'a';
    charCheck(input_char);
  }
}

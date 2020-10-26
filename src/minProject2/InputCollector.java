package minProject2;

import java.util.Scanner;

public class InputCollector {

  Scanner scan;
  Validation valid;

  public InputCollector() {
    scan = new Scanner(System.in);
    valid = new Validation();
  }

  int optionNumber() {
    String input = scan.next();
    if (valid.run().isNumeric(input)
        .optionNumber(input)
        .result()) {
      return Integer.parseInt(input);
    }
    return -1;
  }

  public String name(ContactList list) {
    String input = scan.nextLine();
    if (valid.run().name(input).exist(list, input).result()) {
      return input;
    }
    return "error";
  }

  public String tel() {
    String input = scan.nextLine();
    if (input.equals("")) {
      return input;
    }
    if (valid.run().tel(input).result()) {
      return input;
    }
    return "error";
  }

  public String city() {
    return scan.nextLine();
  }

  public int removeNumber(int max) {
    String input = scan.nextLine();
    if (valid.run().isNumeric(input)
        .removeNumber(input, max)
        .result()) {
      return Integer.parseInt(input);
    }
    return -1;
  }

}

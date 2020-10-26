package minProject2;

public class Validation {

  boolean now = false;

  Validation run() {
    this.now = true;
    return this;
  }

  boolean result() {
    return this.now;
  }

  Validation isNumeric(String input) {
    if (!this.now) {
      return this;
    }
    this.now = input.matches("-?\\d+(\\.\\d+)?");
    return this;
  }

  Validation name(String name) {
    if (!this.now) {
      return this;
    }
    this.now = name.matches("[a-zA-Z ]+");
    return this;
  }

  Validation tel(String tel) {
    if (!this.now) {
      return this;
    }
    this.now = tel.matches("\\d{3}-\\d{3,4}-\\d{4}|\\d{10,11}");
    return this;
  }

  Validation optionNumber(String number) {
    if (!this.now) {
      return this;
    }
    int num = Math.abs(Integer.parseInt(number));
    this.now = num > 0 && num < 6;
    return this;
  }

  Validation removeNumber(String number, int max) {
    if (!this.now) {
      return this;
    }
    int num = Math.abs(Integer.parseInt(number));
    this.now = num > -1 && num < max;
    return this;
  }

  Validation exist(ContactList list, String name) {
    if (!this.now) {
      return this;
    }
    this.now = list.findByName(name).size() == 0;
    return this;
  }

  Validation error(int code) {
    if (!this.now) {
      return this;
    }
    this.now = code < 0;
    return this;
  }
}

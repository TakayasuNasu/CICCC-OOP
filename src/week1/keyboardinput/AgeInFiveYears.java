package week1.keyboardinput;

import java.util.Scanner;

public class AgeInFiveYears {
  public static void main(String[] args) {
    System.out.print("Hello.  What is your name? ");
    Scanner scan = new Scanner(System.in);
    String name  = scan.next();
    System.out.println();
    System.out.print(String.format("Hi, %s!  How old are you?", name));
    int age = Integer.parseInt(scan.next());
    System.out.println();
    System.out.println(String.format("Did you know that in five years you will be %d years old?", age + 5));
    System.out.println(String.format("And five years ago you were %d! Imagine that!", age - 5));
  }
}

package week1.keyboardinput;

import java.util.Scanner;

public class NameAgeSalary {
  public static void main(String[] args) {
    System.out.println("Hello.  What is your name?");
    Scanner scan = new Scanner(System.in);
    String name  = scan.next();
    System.out.println(String.format("Hi, %s!  How old are you?", name));
    int age = Integer.parseInt(scan.next());
    System.out.println(String.format("So you're %d, eh?  That's not old at all!", age));
    System.out.println(String.format("How much do you make, %s?", name));
    System.out.println(String.format("%.1f!  I hope that's per hour and not per year! LOL!", Double.parseDouble(scan.next())));
  }
}

package week1.ifstatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
  public static void main(String[] args) {
    System.out.print("Hey, what's your name? (Sorry, I keep forgetting.) ");
    Scanner scan = new Scanner(System.in);
    String name  = scan.next();
    System.out.println();
    System.out.print(String.format("Ok, %s, how old are you? ", name));
    int age = Integer.parseInt(scan.next());
    System.out.println();

    if (age < 16) System.out.println(String.format("You can't drive. %s", name));
    if (age > 15 && age < 18) System.out.println(String.format("You can drive but not vote. %s", name));
    if (age > 17 && age < 25) System.out.println(String.format("You can vote but not rent a car. %s", name));
    if (age > 24) System.out.println(String.format("You can do pretty much anything. %s", name));
  }
}

package week1.whileloops;

import java.util.Scanner;

public class AddingValuesInLoop {
  public static void main(String[] args) {
    System.out.println("I will add up the numbers you give me.");
    int sum = 0;
    int num = 1;
    Scanner scan = new Scanner(System.in);

    while (num != 0) {
      System.out.print("Number: ");
      num = Integer.parseInt(scan.next());
      System.out.println(num);
      sum += num;
      System.out.println(String.format("The total so far is %d", sum));
    }
    System.out.println(String.format("\nThe total is %d.", sum));
  }
}

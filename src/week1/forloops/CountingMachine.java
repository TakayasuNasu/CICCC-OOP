package week1.forloops;

import java.util.Scanner;

public class CountingMachine {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Count to: ");
    int num = Integer.parseInt(scan.next());
    for (int i = 0; i <= num; i++) {
      System.out.print(i);
      System.out.print(" ");
    }
  }
}

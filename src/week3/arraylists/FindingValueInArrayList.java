package week3.arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindingValueInArrayList {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add((int) (Math.random() * 49) + 1);
    }
    System.out.println("AllayList: " + list);

    System.out.print("Value to find: ");
    Scanner scan = new Scanner(System.in);
    int input = Integer.parseInt(scan.next());
    for (int n : list) {
      if (n == input) {
        System.out.println(String.format("%d is in the AllayList.", input));
      }
    }
  }
}

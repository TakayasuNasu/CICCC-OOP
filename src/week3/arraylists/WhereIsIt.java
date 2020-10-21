package week3.arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhereIsIt {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add((int) (Math.random() * 49) + 1);
    }
    System.out.println("AllayList: " + list);

    System.out.print("Value to find: ");
    int input = Integer.parseInt(new Scanner(System.in).next());
    int count = 0;
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) == input) {
        System.out.println(String.format("%d is in slot %d.", input, i));
        count++;
      }
    }
    if (count == 0) {
      System.out.println(String.format("%d is not in the array.", input));

    }
  }
}

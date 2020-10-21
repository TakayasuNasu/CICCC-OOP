package week3.arraylists;

import java.util.ArrayList;
import java.util.List;

public class GettingTheLargestValue {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add((int) (Math.random() * 99) + 1);
    }
    System.out.println("AllayList: " + list);

    int largest = list.get(0);
    for (int i = 0; i < list.size(); i++) {
      if (largest < list.get(i)) {
        largest = list.get(i);
      }
    }
    System.out.println(String.format("The largest value is %d", largest));
  }
}

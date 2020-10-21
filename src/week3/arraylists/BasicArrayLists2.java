package week3.arraylists;

import java.util.ArrayList;
import java.util.List;

public class BasicArrayLists2 {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      list.add((int) (Math.random() * 99) + 1);
    }
    System.out.println("AllayList: " + list);
  }
}

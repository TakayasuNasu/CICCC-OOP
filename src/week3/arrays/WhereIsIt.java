package week3.arrays;

import java.util.Scanner;

public class WhereIsIt {

  public static void main(String[] args) {
    int[] nums = new int[10];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = (int) (Math.random() * 49) + 1;
    }
    System.out.print("Array: ");
    for (int n : nums) {
      System.out.print(n + " ");
    }
    System.out.println();

    System.out.print("Value to find: ");
    Scanner scan = new Scanner(System.in);
    int input = Integer.parseInt(scan.next());

    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == input) {
        System.out.println(String.format("%d is in slot %d.", input, i));
        count++;
      }
    }
    if (count == 0) {
      System.out.println(String.format("%d is not in the array.", input));
    }

  }

}

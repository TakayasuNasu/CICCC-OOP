package week3.arrays;

public class BasicArrays2 {

  public static void main(String[] args) {
    int[] nums = new int[10];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = (int) (Math.random() * 99) + 1;
    }

    for (int i = 0; i < nums.length; i++) {
      System.out.println(String.format("Slot %d contains a %d", i, nums[i]));
    }
  }
}

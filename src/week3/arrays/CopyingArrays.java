package week3.arrays;

public class CopyingArrays {

  public static void main(String[] args) {
    int[] nums = new int[10];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = (int) (Math.random() * 99) + 1;
    }

    int[] clone = nums.clone();

    nums[nums.length - 1] = -7;
    System.out.print("Array ");
    for (int n : nums) {
      System.out.print(n + " ");
    }
    System.out.println();

    System.out.print("Array ");
    for (int n : clone) {
      System.out.print(n + " ");
    }

  }
}

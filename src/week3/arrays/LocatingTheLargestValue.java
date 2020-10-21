package week3.arrays;

public class LocatingTheLargestValue {

  public static void main(String[] args) {
    int[] nums = new int[10];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = (int) (Math.random() * 99) + 1;
    }
    System.out.print("Array: ");
    for (int n : nums) {
      System.out.print(n + " ");
    }
    System.out.println();

    int largest = nums[0];
    int slot = 0;
    for (int i = 0; i < nums.length; i++) {
      if (largest < nums[i]) {
        largest = nums[i];
        slot = i;
      }
    }
    System.out.println(String.format("The largest value is %d", largest));
    System.out.println(String.format("It is in slot %d", slot));
  }

}

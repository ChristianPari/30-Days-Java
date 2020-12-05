public class Day7 {
  /*
  Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.
   */
  public static void main(String[] args) {
    int[] nums = {1, 3, 4, 9, 2};
    solution(nums);
  }

  public static void solution(int[] nums) {
    String reversed = "";
    for (int count = nums.length - 1; count >= 0; count--) {
      reversed += nums[count] + " ";
    }
    System.out.println(reversed);
  }
}

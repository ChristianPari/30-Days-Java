import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day20 {
  /*
  Given an array, 'a', of size 'n' distinct elements, sort the array in ascending order using the Bubble Sort algorithm above.
  Once sorted, print the following 3 lines:
  1) "Array is sorted in numSwaps swaps."
    'numSwaps' is the number of swaps that took place.
   2) "First Element: firstElement"
   'firstElement' is the first element in the sorted array.
   3) "Last Element: lastElement"
   'lastElement' is the last element in the sorted array.
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n];
    for(int a_i=0; a_i < n; a_i++){
      a[a_i] = in.nextInt();
    }

    bubbleSort(a);
  }

  private static void bubbleSort(int[] nums) {
    List<Integer> numsList = new ArrayList<>(nums.length);
    for (int num : nums) {
      numsList.add(num);
    }

    int numSwaps = 0;

    for (int count = 0; count < numsList.size(); count++) {
      for (int index = 0; index < numsList.size() - 1; index++) {
        if (numsList.get(index) > numsList.get(index + 1)) {
          int larger = numsList.get(index);
          int smaller = numsList.get(index + 1);
          numsList.set(index, smaller);
          numsList.set(index + 1, larger);
          numSwaps++;
        }
      }

      if (numSwaps == 0) {
        break;
      }
    }

    System.out.println("Array is sorted in " + numSwaps + " swaps.");
    System.out.println("First Element: " + numsList.get(0));
    System.out.println("Last Element: " + numsList.get(numsList.size() - 1));
  }

}

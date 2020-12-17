import java.util.ArrayList;
import java.util.List;

public class Day11 {
  /*
  Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.

  Sample Input

  [1 1 1 0 0 0]
  [0 1 0 0 0 0]
  [1 1 1 0 0 0]
  [0 0 2 4 4 0]
  [0 0 0 2 0 0]
  [0 0 1 2 4 0]

  Sample Output

  19

  Explanation

  A contains the following hourglasses:

  1 1 1   1 1 0   1 0 0   0 0 0
    1       0       0       0
  1 1 1   1 1 0   1 0 0   0 0 0

  0 1 0   1 0 0   0 0 0   0 0 0
    1       1       0       0
  0 0 2   0 2 4   2 4 4   4 4 0

  1 1 1   1 1 0   1 0 0   0 0 0
    0       2       4       4
  0 0 0   0 0 2   0 2 0   2 0 0

  0 0 2   0 2 4   2 4 4   4 4 0
    0       0       2       0
  0 0 1   0 1 2   1 2 4   2 4 0

  The hourglass with the maximum sum (19) is:

  2 4 4
    2
  1 2 4

   */
  public static void main(String[] args) {
    int[][] arr = {
        {0, -4, -6, 0, -7, -6},
        {-1, -2, -6, -8, -3, -1},
        {-8, -4, -2, -8, -8, -6},
        {-3, -1, -2, -5, -7, -4},
        {-3, -5, -3,-6, -6, -6},
        {-3, -6, 0, -8, -6, -7}
    };
    solution(arr);
  }

  private static void solution(int[][] hourglass) {
    // loop through the entire array
      // index[0] - 3 (start 0, end 2) ... (start 1, end 3) ... (start 2, end 4) ... (start 3, end 5)
      // index[1] - 1     (index 1)    ...     (index 2)    ...     (index 3)    ...    (index 4)
      // index[2] - repeat what happened in index[0]
        // continue till starting index == 3
    // total needs to be added and compared to each hourglass

    List<Integer> allTotals = new ArrayList<>();

    for (int index = 0; index < hourglass.length; index++) {
      /*
      the last possible hourglass starts with the array in index 3
      so that is the last time we cycle through and compare totals, this ends the loop
      */
      if (index == 4) break;

      int startingIdx1 = 0; // will increase by 1 till '3' for top and bottom numbers within hourglasses
      int endingIdx1 = 2; // will increase by 1 till '5' for top and bottom numbers within hourglasses
      int startingIdx2 = 1; // wil increase by 1 till '4' for middle number within hourglasses

      int counter = 1; // can only have 4 hourglasses per array set, this ensures we only do this 4 times
      while (counter <= 4) {
        int localTotal = 0;
        // adds the 3 of the top section of hourglass
        for (int count = startingIdx1; count <= endingIdx1; count++) {
          localTotal += hourglass[index][count];
        }
        // adds the middle number
        localTotal += hourglass[index + 1][startingIdx2];
        // adds the bottom 3 of the hourglass
        for (int count = startingIdx1; count <= endingIdx1; count++) {
          localTotal += hourglass[index + 2][count];
        }
        // only assigns the total to total if it is greater than the previous total
        allTotals.add(localTotal);
        counter++;
        startingIdx1++;
        endingIdx1++;
        startingIdx2++;
      }
    }

    int sumTotal = 0;
    for (int index = 0; index < allTotals.size() - 1; index++) {
      int compared = allTotals.get(index) > allTotals.get(index + 1) ? allTotals.get(index) : allTotals.get(index + 1);
      if (index == 0) {
        sumTotal = compared;
      } else {
        sumTotal = sumTotal > compared ? sumTotal : compared;
      }
    }

    System.out.println(sumTotal);
  }
}

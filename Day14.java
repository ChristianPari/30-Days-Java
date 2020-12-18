public class Day14 {
  /*
  Complete the Difference class by writing the following:

    A class constructor that takes an array of integers as a parameter and saves it to the __elements instance variable.
    A computeDifference method that finds the maximum absolute difference between any 2 numbers in __elements and stores it in the maximumDifference instance variable.
   */
  public static void main(String[] args) {
    Difference difference = new Difference(new int[] {1,2,5});
    difference.computeDifference();
    System.out.println(difference.maximumDifference);
  }
}

class Difference {
  private int[] elements;
  public int maximumDifference;

  public Difference(int[] arr) {
    elements = arr;
  }

  public void computeDifference() {
    for (int num : elements) {
      for (int comparingNum : elements) {
        int diff = num > comparingNum ? num - comparingNum : comparingNum - num;
        maximumDifference = maximumDifference > diff ? maximumDifference : diff;
      }
    }
  }
}
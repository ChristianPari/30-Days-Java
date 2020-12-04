import java.util.Scanner;

public class Day5 {
  /*
  Given an integer, n , print its first m multiples. Each multiple n x i (where 1 <= i <= m) should be printed on a new line in the form: n x i = result.
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the number you want to have multiples of...");
    int number = sc.nextInt();
    System.out.println("Now please enter how many multiples you want for that number...");
    int multiples = sc.nextInt();
    Solution(number, multiples);
    sc.close();
  }

  public static void Solution(int num, int multiples) {
    for (int count = 1; count <= multiples; count++){
      System.out.println(num + " x " + count + " = " + (num * count));
    }
  }
}

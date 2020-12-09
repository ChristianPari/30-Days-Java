import java.util.Scanner;

public class Day9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number you would like to have factorialized...");
    int num = sc.nextInt();
    System.out.println("factorial: " + factorial(num));
  }

  public static int factorial(int num) {
    return num == 1 ? num : num * (factorial(num - 1));
  }
}

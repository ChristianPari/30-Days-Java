import java.util.Scanner;

public class Day25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numOfInputs = sc.nextInt();
    for (int count = 0; count < numOfInputs; count++) {
      int num =  sc.nextInt();
      System.out.println(isItPrime(num) ? "Prime" : "Not prime");
    }
  }

  private static boolean isItPrime(int num) {
    if (num == 1) {
      return false;
    }
    for (int test = 2; test <= Math.sqrt(num); test++) {
      if (num % test == 0) {
        return false;
      }
    }
  return true;
  }
}

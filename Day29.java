import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day29 {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int t = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int tItr = 0; tItr < t; tItr++) {
      String[] nk = scanner.nextLine().split(" ");

      int n = Integer.parseInt(nk[0]);

      int k = Integer.parseInt(nk[1]);

      getResult(n, k);
    }

    scanner.close();
  }

  private static void getResult(int n, int k) {
    int finalResult = 0;
    int a = n - 1; // a is constrained by a < b so b would be n to begin and a is n - 1 and so on
    while (a-- > 0) { // while a is greater than 0; decrement a each run through of the while loop
      for (int b = a + 1; b <= n; b++) { // going through the numbers in reverse order;
        // n = 5, a = 4, b = 5 ... a = 3, b = 4 then 5 ... a = 2, b = 3 then 4 then 5 ... so on
        int bitwiseResult = a & b; // evaluates the bitwise expression
        if (bitwiseResult < k && bitwiseResult > finalResult) { // if above is in range and greater than the previous final
          finalResult = bitwiseResult;
        }
      }
    }
    System.out.println(finalResult);
  }
}

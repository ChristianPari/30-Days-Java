import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

    // if n is odd Weird
    // even between 2 and 5 Not Weird
    // even between 6 and 20 Weird
    // even and greater than 20 Not Weird
        if (N % 2 == 1) {
            System.out.println("Weird");
        }
        
        if (N % 2 == 0) {
            if (N == 2 || N == 4) {
                System.out.println("Not Weird");
            }
            else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            }
            else if (N > 20) {
                System.out.print("Not Weird");
            }
        }
    }
}

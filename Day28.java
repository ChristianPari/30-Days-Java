import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day28 {
  /*
  Consider a database table, Emails, which has the attributes First Name and Email ID.
  Given 'N' rows of data simulating the Emails table,
    print an alphabetically-ordered list of people whose email address ends in '@gmail.com'.
   */
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int N = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    List<String> names = new ArrayList<>();

    for (int NItr = 0; NItr < N; NItr++) {
      String[] firstNameEmailID = scanner.nextLine().split(" ");

      String firstName = firstNameEmailID[0];

      String emailID = firstNameEmailID[1];
      if (emailID.contains("@gmail.com")) {
        names.add(firstName);
      }
    }

    scanner.close();

    printNames(names);
  }

  private static void printNames(List<String> names) {
    Collections.sort(names);
    for (String name : names) {
      System.out.println(name);
    }
  }
}

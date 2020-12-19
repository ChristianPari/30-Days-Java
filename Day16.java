import java.util.Scanner;

public class Day16 {
  /*
  Read a string, S, and print its integer value; if S cannot be converted to an integer, print Bad String.
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    checkString(s);
  }

  public static void checkString(String str) {
    try {
      System.out.println(Integer.parseInt(str));
    } catch (Exception e) {
      System.out.println("Bad String");
    }
  }
}
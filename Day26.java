import java.util.Scanner;

public class Day26 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String returned = sc.nextLine();
    String expected = sc.nextLine();
    System.out.println(calculateFine(returned, expected));
  }

  private static int calculateFine(
      String returned,
      String expected
  ) {
    String[] returnedDate = returned.split(" ");
    int returnedDay = Integer.parseInt(returnedDate[0]),
        returnedMonth = Integer.parseInt(returnedDate[1]),
        returnedYear = Integer.parseInt(returnedDate[2]);
    String[] expectedDate = expected.split(" ");
    int expectedDay = Integer.parseInt(expectedDate[0]),
        expectedMonth = Integer.parseInt(expectedDate[1]),
        expectedYear = Integer.parseInt(expectedDate[2]);

    int fineDue = 0;

    if (returnedYear < expectedYear) {
      fineDue = 0;
    }
    if (returnedYear > expectedYear) {
      fineDue = 10000;
    }
    if (returnedYear == expectedYear) {
      if (returnedMonth < expectedMonth) {
        fineDue = 0;
      }
      if (returnedMonth > expectedMonth) {
        fineDue = (returnedMonth - expectedMonth) * 500;
      }
      if (returnedMonth == expectedMonth) {
        if (returnedDay <= expectedDay) {
          fineDue = 0;
        }
        if (returnedDay > expectedDay) {
          fineDue = (returnedDay - expectedDay) * 15;
        }
      }
    }
    return fineDue;
  }
}
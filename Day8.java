import java.util.HashMap;
import java.util.Scanner;

public class Day8 {
  /*
  Given n names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. You will then be given an unknown number of names to query your phone book for. For each name queried, print the associated entry from your phone book on a new line in the form name=phoneNumber; if an entry name for is not found, print Not found instead.
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numOfContacts = sc.nextInt();
    sc.nextLine();
    HashMap<String, String> phoneBook = new HashMap<>();

    int counter = 0;
    while (counter < numOfContacts) {
      String[] contact = sc.nextLine().split(" ");
      phoneBook.put(contact[0], contact[1]);
      counter++;
    }

    counter = 0;
    String[] searcher = new String[numOfContacts];
    while (counter < numOfContacts) {
      searcher[counter] = sc.nextLine();
      counter++;
    }

    for (String name : searcher) {
      if (phoneBook.containsKey(name)) {
        System.out.println(name + "=" + phoneBook.get(name));
      } else {
        System.out.println("Not found");
      }
    }
  }
}

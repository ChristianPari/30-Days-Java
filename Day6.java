import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Day6 {
  /*
  Given a string, S, print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line (see the Sample below for more detail).
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your string!");
    String[] str = sc.nextLine().split(" ");
    solution(str);
  }

  public static void solution(String[] wordsArray) {
    List<String> words = Arrays.asList(wordsArray);
    for (var word : words) {
      String odds = "";
      String evens = "";
      List<String> letters = Arrays.asList(word.split(""));
      for (int index = 0; index < letters.size(); index++) {
        if (index % 2 != 0) {
          odds += letters.get(index);
        } else {
          evens += letters.get(index);
        }
      }
      String separated = evens + " " + odds;
      int wordIdx = words.indexOf(word);
      words.set(wordIdx, separated);
    }
    for (var word : words) {
      System.out.println(word);
    }
  }
}

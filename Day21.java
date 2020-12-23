import java.util.Scanner;

public class Day21 {
  /*
  Write a single generic function named printArray; this function must take an array of generic elements as a parameter and print each
  element
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    Integer[] intArray = new Integer[n];
    for (int i = 0; i < n; i++) {
      intArray[i] = scanner.nextInt();
    }

    n = scanner.nextInt();
    String[] stringArray = new String[n];
    for (int i = 0; i < n; i++) {
      stringArray[i] = scanner.next();
    }

    Printer<Integer> intPrinter = new Printer<Integer>();
    Printer<String> stringPrinter = new Printer<String>();
    intPrinter.printArray( intArray  );
    stringPrinter.printArray( stringArray );
    if(Printer.class.getDeclaredMethods().length > 1){
      System.out.println("The Printer class should only have 1 method named printArray.");
    }
  }
}

class Printer <T> {
  public void printArray(T[] array) {
    for (T item : array) {
      System.out.println(item);
    }
  }
}
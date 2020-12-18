public class Day13 {
  /*
  Given a Book class and a Solution class, write a MyBook class that does the following:

    Inherits from Book
    Has a parameterized constructor taking these 3 parameters:

    string 'title'
    string 'author'
    int 'price'

    Implements the Book class' abstract display() method so it prints these 3 lines:

Title, a space, and then the current instance's title.
Author, a space, and then the current instance's author.
Price, a space, and then the current instance's price.
   */
  public static void main(String[] args) {
    Book book = new MyBook("The Alchemist", "Paulo Coelho", 248);
    book.display();
  }

}

abstract class Book {
  String title;
  String author;

  Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  abstract void display();
}

class MyBook extends Book{
  int price;

  MyBook(
      String title,
      String author,
      int price
  ) {
    super(title, author);
    this.price = price;
  }

  @Override
  void display() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Price: " + price);
  }
}

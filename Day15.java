import java.util.Scanner;

public class Day15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Node next = null;
    int N = sc.nextInt();

    while(N-- > 0) {
      int data = sc.nextInt();
      next = insert(next,data);
    }
    display(next);
    sc.close();
  }

  static class Node {
    Node next;
    int data;
    Node(int d) {
      next = null;
      data = d;
    }
  }

  public static Node insert(
      Node previousNode,
      int data
  ) {
    /*
    Node [data, next]
    next = reference point element - initially null
    data = the value of the data element within the node
     */
    // create a new Node
      // next variable needs to be equal null
      // previous Node next variable needs to equal this Node
      // data is data thats passed as argument
    /*
    List = [] ... Node (next = null, data = 1)
    List = [(next = null, data = 1)]
    Added above ... New Node (next = null, data = 2)
    List = [(next = (next = null, data = 2), data = 1), (next = null, data = 2)]
     */
    Node newNode = new Node(data);
    if (previousNode == null) {
      previousNode = newNode;
    } else {
      Node tempNode = previousNode;
      while (tempNode.next != null) {
        tempNode = tempNode.next;
      }
      tempNode.next = newNode;
    }
    return previousNode;
  }

  public static void display(Node next) {
    Node start = next;
    System.out.println("node " + start);
    while(start != null) {
      System.out.print(start.data + " ");
      start = start.next;
    }
  }
}

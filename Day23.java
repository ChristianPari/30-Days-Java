import java.util.*;

public class Day23 {
  /*
  A level-order traversal, also known as a breadth-first search, visits each level of a tree's nodes from left to right, top to bottom.
  You are given a pointer, root, pointing to the root of a binary search tree. Complete the levelOrder function provided in your editor so
  that it prints the level-order traversal of the binary search tree.
   */
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    Node root = null;
    while (T --> 0) {
      int data = sc.nextInt();
      root = insert(root, data);
    }
    levelOrder(root);
  }

  static void levelOrder(Node root) {
    if (root == null) {
      return;
    }

    Queue<Node> q = new LinkedList<>(); // [ ]
    q.add(root); // [ root ]

    while (q.size() > 0) {
      Node topNode = q.remove(); // topNode = root , q = [ ]
      System.out.print(topNode.data + " "); // 3,

      if (topNode.left != null) {
        q.add(topNode.left); // q = [ ... root.left ] (repeats upper process after loop)
      }
      if (topNode.right != null) {
        q.add(topNode.right); // q = [ ... root.right ] (repeats upper process when loop finishes)
      }
    }
  }

  static class Node {
    Node left,
        right;
    int data;
    Node(int data) {
      this.data = data;
      left = right = null;
    }
  }

  public static Node insert(Node root, int data) {
    if (root == null){
      return new Node(data);
    }
    else {
      Node cur;
      if (data <= root.data){
        cur = insert(root.left, data);
        root.left = cur;
      }
      else {
        cur = insert(root.right, data);
        root.right = cur;
      }
      return root;
    }
  }
}
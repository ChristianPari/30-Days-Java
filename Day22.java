import java.util.Scanner;

public class Day22 {
  /*
  The height of a binary search tree is the number of edges between the tree's root and its furthest leaf. You are given a pointer, root,
  pointing to the root of a binary search tree. Complete the getHeight function provided in your editor so that it returns the height of the binary search tree.
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    Node root = null;
    while(T --> 0){
      int data = sc.nextInt();
      // starting a initial root node and continuing to add nodes to the left right of that node or its child node
      root = insert(root, data);
    }
    int height = getHeight(root);
    System.out.println(height);
  }

  public static int getHeight(Node root) {
    if (root == null) {
      return -1;
    } else {
      return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
  }

  public static Node insert(
      Node root,
      int data
  ){
    // this should only run for the initial root node creation
    if (root == null){
      return new Node(data);
    } else { // if not initial root node then runs this
      Node cur;
      if (data <= root.data) { // if 'data' (value being passed to node) is less than the data within the current node
        cur = insert(root.left, data); // recursive insert of this node to the left node of the parent node
        root.left = cur;
      } else { // if its greater than the data within the current node
        cur = insert(root.right, data); // recursive insert of this node to the right of the parent node
        root.right = cur;
      }
      return root;
    }
  }
}

class Node{
  Node left,
      right;
  int data;

  Node(int data){
    this.data = data;
    left = right = null;
  }
}

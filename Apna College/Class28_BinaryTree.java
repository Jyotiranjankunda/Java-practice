import java.util.LinkedList;
import java.util.Queue;

public class Class28_BinaryTree {
  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  static class BinaryTree {
    static int index = -1;

    public static Node buildTree(int[] nodes) {
      index++;
      if (nodes[index] == -1) {
        return null;
      }
      Node newNode = new Node(nodes[index]);
      newNode.left = buildTree(nodes);
      newNode.right = buildTree(nodes);

      return newNode;
    }

    public static void preorder(Node root) {
      if (root == null) {
        return;
      }

      // Data
      System.out.print(root.data + " ");
      // Left
      preorder(root.left);
      // Right
      preorder(root.right);
    }

    public static void inorder(Node root) {
      if (root == null) {
        return;
      }

      // Left
      inorder(root.left);
      // Data
      System.out.print(root.data + " ");
      // Right
      inorder(root.right);
    }

    public static void postorder(Node root) {
      if (root == null) {
        return;
      }

      // Left
      postorder(root.left);
      // Right
      postorder(root.right);
      // Data
      System.out.print(root.data + " ");
    }

    public static void levelOrder(Node root) {
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      q.add(null);

      while (!q.isEmpty()) {
        Node currNode = q.remove();
        if (currNode == null) {
          System.out.println();
          if (q.isEmpty()) {
            break;
          } else {
            q.add(null);
          }
        } 
        else {
          System.out.print(currNode.data + " ");
          if (currNode.left != null) {
            q.add(currNode.left);
          }
          if (currNode.right != null) {
            q.add(currNode.right);
          }
        }
      }
    }

    public static int countNodes(Node root){
      if(root == null){
        return 0;
      }

      int leftNodes = countNodes(root.left);
      int rightNodes = countNodes(root.right);

      return 1 + leftNodes + rightNodes;
    }

    public static int calculateSum(Node root){
      if(root == null){
        return 0;
      }

      int leftSum = calculateSum(root.left);
      int rightSum = calculateSum(root.right);

      return leftSum + rightSum + root.data;
    }

    public static int height(Node root){
      if(root == null){
        return 0;
      }

      int lh = height(root.left);
      int rh = height(root.right);

      return 1 + Math.max(lh, rh);
    }
  }

  public static void main(String[] args) {
    int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
    BinaryTree tree = new BinaryTree();
    Node root = tree.buildTree(nodes);

    System.out.println(root.data);

    System.out.println("Preorder : ");
    tree.preorder(root);

    System.out.println("\nInorder : ");
    tree.inorder(root);

    System.out.println("\nPostorder : ");
    tree.postorder(root);

    System.out.println("\nLevel order traversal : ");
    tree.levelOrder(root);

    System.out.println("\nNo. of nodes : ");
    System.out.println(tree.countNodes(root));

    System.out.println("\nSum of node values : ");
    System.out.println(tree.calculateSum(root));

    System.out.println("\nHeight of tree : ");
    System.out.println(tree.height(root));
  }
}

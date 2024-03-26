import java.util.LinkedList;

public class Class18_LinkedListDS {
  Node head;

  public class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  // add - first, last
  // Insertion at beginning
  public void insertionAtBeginning(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;
  }

  // Insertion at end
  public void insertionAtEnd(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }

    Node currNode = head;
    while (currNode.next != null) {
      currNode = currNode.next;
    }
    currNode.next = newNode;
  }

  // Deletion from beginning
  public void deletionFromBeginning() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }
    head = head.next;
  }

  // Deletion from end
  public void deletionFromEnd() {
    // If list is empty
    if (head == null) {
      System.out.println("List is empty");
      return;
    }

    // If list has only 1 element
    if (head.next == null) {
      head = null;
      return;
    }

    Node temp = head;
    while (temp.next.next != null) {
      temp = temp.next;
    }
    temp.next = null;
  }

  // Printing the list
  public void printList() {
    if (head == null) {
      System.out.println("List is empty");
      return;
    }

    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.println("NULL");
  }

  public static void main(String[] args) {
    // ArrayList vs LinkedList
    // ArrayList - Insertion : O(n), Searching : O(1)
    // LinkedList - Insertion : o(1), Searching : O(n)

    Class18_LinkedListDS ll = new Class18_LinkedListDS();
    // Insertion
    ll.insertionAtBeginning(5);
    ll.insertionAtBeginning(7);
    ll.insertionAtEnd(15);
    ll.insertionAtBeginning(9);
    ll.insertionAtBeginning(10);
    ll.insertionAtEnd(14);
    ll.insertionAtEnd(2);
    ll.printList();

    // Deletion
    ll.deletionFromBeginning();
    ll.deletionFromEnd();
    ll.deletionFromEnd();
    ll.printList();

    // using collections
    LinkedList<String> list = new LinkedList<String>();
    list.addFirst("how");  // Insertion at beginning
    list.addLast("you");  // Insertion at end
    list.addFirst("Hello");
    list.add(2, "are");  // Insertion at any index
    // if we don't specify the index in .add(), then it by default inserts at last

    // size of linked list
    System.out.println("Size of linked list is : " + list.size());

    System.out.println(list);

    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + "->");
    }
    System.out.println();

    // Deletion from list
    list.removeFirst(); // Remove from first
    System.out.println(list);
    list.removeLast(); // Remove from last
    System.out.println(list);
    list.remove(1); // remove 2nd index
    System.out.println(list);
  }
}

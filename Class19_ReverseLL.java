import java.util.LinkedList;
import java.util.Collections;

public class Class19_ReverseLL {
  Node head;

  class Node{
    int data;
    Node next;

    Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  public void addItem(int item){
    Node newNode = new Node(item);
    if(head == null){
      head = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;
  }

  public void reverse(){
    if(head == null){
      return;
    }

    Node prev = null;
    Node curr = head;
    Node nextptr = null;

    while(curr != null){
      nextptr = curr.next;
      curr.next = prev;
      prev = curr;
      curr = nextptr;
    }

    head = prev;
  }

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
    // Reverse a linked list in O(1) space.

    LinkedList<Integer> ls = new LinkedList<Integer>();
    ls.add(1);
    ls.add(2);
    ls.add(3);
    ls.add(4);
    ls.add(5);

    System.out.println("Before reversing : " + ls);
    Collections.reverse(ls);
    System.out.println("After reversing : " + ls);
    
    Class19_ReverseLL list = new Class19_ReverseLL();
    list.addItem(5);
    list.addItem(7);
    list.addItem(9);
    list.addItem(1);
    list.addItem(10);
    list.addItem(53);
    
    System.out.println("Before reversing : ");
    list.printList();
    list.reverse();
    System.out.println("After reversing : ");
    list.printList();
  }
}

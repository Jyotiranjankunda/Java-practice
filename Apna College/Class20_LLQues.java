import java.util.Scanner;

public class Class20_LLQues{
  Node head;

  class Node{
    int data;
    Node next;

    Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  public void insertElement(int num){
    Node newNode = new Node(num);
    if(head == null){
      head = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;
  }

  public void printList(){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public int findLength(){
    int len = 0;
    Node temp = head;
    while(temp != null){
      len++;
      temp = temp.next;
    }
    return len;
  }

  public void removeNthNodeFromEnd(int pos){
    if(pos == 1){
      head = head.next;
      return;
    }
    
    int index = 1;
    Node temp = head;

    while(index < pos-1){
      temp = temp.next;
      index++;
    }

    temp.next = temp.next.next;
  }

  public static void main(String[] args) {
    Class20_LLQues ll = new Class20_LLQues();
    ll.insertElement(4);
    ll.insertElement(8);
    ll.insertElement(9);
    ll.insertElement(7);
    ll.insertElement(10);
    ll.insertElement(5);
    ll.insertElement(3);

    ll.printList();

    System.out.println("Enter nth element from last to be deleted : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int len = ll.findLength();

    int posFromStarting = len - n + 1;
    ll.removeNthNodeFromEnd(posFromStarting);
    ll.printList();
  }
}
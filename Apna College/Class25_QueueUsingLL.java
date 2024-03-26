public class Class25_QueueUsingLL {
  static class Node{
    int data;
    Node next;

    Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  static class Queue{
    static Node head = null;
    static Node tail = null;

    public static boolean isEmpty(){
      return head == null && tail == null;
    }

    public static void enqueue(int data){
      Node newNode = new Node(data);
      
      // If first element
      if(tail == null){
        head = tail = newNode;
      }

      tail.next = newNode;
      tail = newNode; 
    }

    public static int dequeue(){
      if(isEmpty()){
        System.out.println("Queue is empty");
        return -1;
      }

      // If single element exists
      if(head == tail){
        tail = null;
      }

      int front = head.data;
      head = head.next;

      return front;
    }

    public static int peek(){
      if(isEmpty()){
        System.out.println("Queue is empty");
        return -1;
      }

      return head.data;
    }
  }

  public static void main(String[] args) {
    Queue q = new Queue();
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.enqueue(4);
    q.enqueue(5);
    int dequeue1 = q.dequeue();
    q.enqueue(6);
    int dequeue2 = q.dequeue();
    q.enqueue(7);

    System.out.println("Dequeue 1 : " + dequeue1);
    System.out.println("Dequeue 2 : " + dequeue2);

    System.out.println("Remaining elements of queue : ");
    while (!q.isEmpty()) {
      System.out.print(q.peek() + " ");
      q.dequeue();
    }
  }
}

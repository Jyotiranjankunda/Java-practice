import java.util.LinkedList;
import java.util.Queue;

public class Class26_QueueUsingCollections {
  public static void main(String[] args) {
    // Queue is an interface and LinkedList is a class. We can create an object of class, but not interface. 
    // Linkedlist and ArrayDeque both implements queue interface, so we can use either of them.

    Queue<Integer> q = new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.add(6);

    while (!q.isEmpty()) {
      System.out.print(q.peek() + " ");
      q.remove();
    }
  }
}

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();

    // add () - Inserts the specified element into the queue. If the task is successful, add() returns true, if not it throws an exception.
    // offer() - Inserts the specified element into the queue. If the task is successful, offer () returns true, if not it returns false.

    q.offer(12);
    q.offer(24);
    q.offer(36);
    q.add(48);
    q.add(60);

    System.out.println(q);

    // remove() - Returns and removes the head of the queue. Throws an exception if the queue is empty.
    // poll() - Returns and removes the head of the queue. Returns null if the queue is empty.

    System.out.println(q.poll());
    System.out.println(q.remove());
    System.out.println(q);

    // q.element() - Returns the head of the queue. Throws an exception if the queue
    // is empty.
    // q.peek() - Returns the head of the queue. Returns null if the queue is empty.
    System.out.println(q.peek());
    System.out.println(q.element());

    // It is recommended to use offer, poll and peek instead of add, remove and element.
  }
}

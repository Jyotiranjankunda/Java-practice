import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
  public static void main(String[] args) {
    Queue<Integer> pq = new PriorityQueue<>();  // This is a min-heap
    // Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());  // This is a max-heap

    pq.offer(16);
    pq.offer(120);
    pq.offer(13);
    pq.offer(43);
    pq.offer(20);
    pq.offer(4);
    System.out.println(pq);

    System.out.println(pq.poll());
    System.out.println(pq);

    System.out.println(pq.peek());
  }
}

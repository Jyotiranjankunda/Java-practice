import java.util.ArrayDeque;
import java.util.Queue;

public class LearnArrayDeque {
  public static void main(String[] args) {
    ArrayDeque<Integer> adq = new ArrayDeque<>();  // Can be push and pop from front and back
    
    adq.offer(23);  // push at back
    adq.offer(67);
    adq.offer(90);  
    adq.offerFirst(12);  // push at front
    adq.offerLast(45);  // push at back

    System.out.println(adq);

    System.out.println(adq.peek());  // Peeks from front
    System.out.println(adq.peekFirst());  // Peeks from front
    System.out.println(adq.peekLast());  // Peeks from last

    System.out.println(adq.poll());  // Removes from front
    System.out.println("Poll : " + adq);

    System.out.println(adq.pollFirst());  // Removes from first
    System.out.println("Poll first : " + adq);

    System.out.println(adq.pollLast());  // Removes from last
    System.out.println("Poll last : " + adq);
  }
}

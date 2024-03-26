import java.util.Stack;

public class Class27_QueueUsing2Stacks{
  static class Queue{
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    // Process:
    // 1. First push data into s1
    // 2. Then pop all the elements one by one from s1 to s2.
    // 3. Push the new data to s1.
    // 4. Pop all the elements one by one from s2 to s1.
    // 5. Repeat this process for each element
    // 6. At last pop all elements from s1 one by one, then that is the fifo order.

    public static boolean isEmpty(){
      return s1.isEmpty();
    }

    public static void add(int data){
      while (!s1.isEmpty()) {
        s2.push(s1.pop());
      }

      s1.push(data);

      while (!s2.isEmpty()) {
        s1.push(s2.pop());
      }
    }

    public static int remove(){
      if(isEmpty()){
        System.out.println("Queue is empty");
        return -1;
      }

      return s1.pop();
    }

    public static int peek(){
      if(isEmpty()){
        System.out.println("Queue is empty");
        return -1;
      }

      return s1.peek();
    }
  }

  public static void main(String[] args) {
    Queue q = new Queue();

    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);

    while (!q.isEmpty()) {
      System.out.print(q.peek() + " ");
      q.remove();
    }
  }
}

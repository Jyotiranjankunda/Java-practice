public class Class23_QueueUsingArray {
  static class Queue {
    static int[] arr;
    static int size;
    static int rear = -1;

    Queue(int n) {
      arr = new int[n];
      this.size = n;
    }

    public static boolean isEmpty(){
      return rear == -1;
    }

    public static void enqueue(int data) {
      if (rear == size - 1) {
        System.out.println("Queue is full");
        return;
      }
      rear++;
      arr[rear] = data;
    }

    public static int dequeue() {
      if (rear == -1) {
        System.out.println("Queue is empty");
        return -1;
      }

      int front = arr[0];
      for (int i = 0; i < rear; i++) {
        arr[i] = arr[i + 1];
      }
      rear--;
      return front;
    }

    public static int peek(){
      if(rear == -1){
        System.out.println("Queue is empty");
        return -1;
      }

      return arr[0];
    }
  }

  public static void main(String[] args) {
    Queue q = new Queue(5);
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.enqueue(4);
    q.enqueue(5);

    while (!q.isEmpty()) {
      System.out.print(q.peek() + " ");
      q.dequeue();
    }
  }
}

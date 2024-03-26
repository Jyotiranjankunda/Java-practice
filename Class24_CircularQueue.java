public class Class24_CircularQueue {
  static class Queue {
    static int[] arr;
    static int size;
    static int rear = -1;
    static int front = -1;

    Queue(int n) {
      arr = new int[n];
      this.size = n;
    }

    public static boolean isEmpty() {
      return rear == -1 && front == -1;
    }

    public static boolean isFull() {
      return ((rear + 1) % size) == front;
    }

    public static void enqueue(int data) {
      if (isFull()) {
        System.out.println("Queue is full");
        return;
      }

      // For first element
      if (front == -1) {
        front = 0;
      }

      rear = (rear + 1) % size;
      arr[rear] = data;
    }

    public static int dequeue() {
      if (isEmpty()) {
        System.out.println("Queue is empty");
        return -1;
      }

      int result = arr[front];

      // If queue contains only single element
      if (rear == front) {
        rear = front = -1;
      }
      else{
        front = (front + 1) % size;
      }

      return result;
    }

    public static int peek() {
      if (isEmpty()) {
        System.out.println("Queue is empty");
        return -1;
      }

      return arr[front];
    }
  }

  public static void main(String[] args) {
    Queue q = new Queue(5);
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

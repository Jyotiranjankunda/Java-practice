import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Class21_StackUsingArrays {
  // Stack using Array from scratch
  /*
  static class Stack{
    static ArrayList<Integer> list = new ArrayList<>();
    public static boolean isEmpty(){
      return list.size() == 0;
    }

    // push
    public static void push(int data){
      list.add(data);
    }

    // pop
    public static int pop(){
      if(isEmpty()){
        return -1;
      }

      int top = list.get(list.size() - 1);
      list.remove(list.size() - 1);
      return top;
    }

    // peek
    public static int peek(){
      if(isEmpty()){
        return -1;
      }

      return list.get(list.size() - 1);
    }
  }
  */

  public static void pushAtBottom(int data, Stack<Integer> s){
    if(s.isEmpty()){
      s.push(data);
      return;
    }
    int x = s.peek();
    s.pop();
    pushAtBottom(data, s);
    s.push(x);
  }

  public static void main(String[] args) {
    /*
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);

    while (!s.isEmpty()) {
      System.out.print(s.peek() + " ");
      s.pop();
    }
    */

    // Stack using collections
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);

    System.out.println("Enter an element to push at bottom : ");
    Scanner sc = new Scanner(System.in);
    int data = sc.nextInt();
    pushAtBottom(data, s);

    while (!s.isEmpty()) {
      System.out.print(s.peek() + " ");
      s.pop();
    }
  }
}

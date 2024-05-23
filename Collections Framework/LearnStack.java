import java.util.Stack;

public class LearnStack {
  public static void main(String[] args) {
    Stack<String> animals = new Stack<>();

    animals.push("Lion");
    animals.push("Tiger");
    animals.push("Dog");
    animals.push("Cat");
    animals.push("Horse");

    System.out.println(animals);

    System.out.println(animals.peek());  // Prints the top element
    animals.pop();
    System.out.println(animals);
  }
}

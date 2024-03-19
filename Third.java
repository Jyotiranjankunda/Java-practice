import java.util.Scanner;

public class Third {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age : ");
    int age = sc.nextInt();

    // If else
    if (age > 18) {
      System.out.println("You are eligible to vote.");
    } else {
      System.out.println("You are not eligible for voting.");
    }

    System.out.println("Choose a button : (1, 2 or 3) : ");
    int button = sc.nextInt();
    System.out.println("Output using if-else-if-ladder");
    if (button == 1) {
      System.out.println("Hello");
    } else if (button == 2) {
      System.out.println("How are you");
    } else if (button == 3) {
      System.out.println("I am fine");
    } else {
      System.out.println("Invalid button");
    }

    System.out.println("Output using switch");
    switch (button) {
      case 1:
        System.out.println("Hello");
        break;

      case 2:
        System.out.println("How are you");
        break;

      case 3:
        System.out.println("I am fine");
        break;

      default:
        System.out.println("Invalid button");
    }
  }
}

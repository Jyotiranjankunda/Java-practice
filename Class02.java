import java.util.Scanner;

public class Class02 {
  public static void main(String[] args) {
    
    int a = 25;
    int b = 10;
    String name = "Jyotiranjan";
    double price = 25.00;
  
    /*
    Primitive data types:
    byte - 1 byte
    short - 2 bytes
    char - 2 bytes
    boolean - 1 byte
    int - 4 bytes
    long - 8 bytes
    float - 4 bytes
    double - 8 bytes
  
    Non-primitive :
    String
    Array
    Class
    Object
    Interface
    */

    System.out.println("Sum is (int) : " + (a+b));  // Here, a, b will be considered as numbers, so o/p = 35
    System.out.println("Sum is (string) : " + a+b);   // Here, a and b will considered as string, and o/p = 2510

    System.out.println(a-b);
    System.out.println(a*b);

    // Taking input in java
    System.out.println("Enter your name : ");
    Scanner sc = new Scanner(System.in);

    // sc.next(): Reads the next token from the input, where a token is defined as a sequence of non-whitespace characters. It stops reading when it encounters whitespace (like space or newline)..
    String myName = sc.next();
    System.out.println("Your name is : " + myName);

    // we input our name in sc.next(), and for next input, when we press enter, then that \n will be left out in the input buffer. So to consume that, we put an extra sc.nextLine() function here, otherwise if we don't put this, then in the next input for full name, sc.nextLine() will consume that left out \n, and hence our input becomes empty.
    
    sc.nextLine();  // Consume the newline character left in the buffer

    // nextLine will take the whole input with spaces also until \n is encountered.
    System.out.println("Enter your full name : ");
    String myFullName = sc.nextLine();
    System.out.println("Your full name is : " + myFullName);

    // Similarily, nextInt() is used to take input of integer, nextFloat() for float, etc..

    // Take input of 2 numbers and add them
    System.out.println("Enter two numbers : ");
    int num1 = sc.nextInt();  
    int num2 = sc.nextInt();
    // nextInt() will stop taking input when encounters a non-integer character or white space

    int sum = num1 + num2;
    System.out.println("The sum is : " + sum);
  }  
}

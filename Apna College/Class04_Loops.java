import java.util.Scanner;

public class Class04_Loops {
  public static void main(String[] args) {
    // For loop
    System.out.println("Using for loop");
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }

    // While loop
    System.out.println("Using while loop");
    int counter = 1;
    while (counter <= 10) {
      System.out.println(counter);
      counter++;
    }

    // Do while loop
    System.out.println("Using do-while loop");
    int j = 1;
    do {
      System.out.println(j);
      j++;
    } while (j <= 10);

    // For each loop
    int[] arr = {6,7,3,61,8,3,20,79,8,2,67,56};
    for(int val : arr){
      System.out.print(val + " ");
    }
    System.out.println();

    // Sum of first n natural numbers;
    System.out.println("Enter n : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;

    for (int i = 1; i <= n; i++) {
      sum += i;
    }

    System.out.println("Sum of first " + (n) + " natural numbers is : " + (sum));

    // Table of number input by user
    System.out.println("Enter a number to print its table : ");
    int table = sc.nextInt();
    for (int i = 1; i <= 10; i++) {
      System.out.println(table + " * " + i + " = " + (table * i));
    }
  }
}

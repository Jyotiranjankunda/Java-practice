import java.util.*;

public class Class06 {
  // Q1: Find factorial of any number
  public static void factorial(int num){
    if(num < 0){
      System.out.println("Invalid number");
      return;
    }
    int fact = 1;
    for(int i=1; i<=num; i++){
      fact *= i;
    }
    System.out.println("Factorial is : " + fact);
  }

  // Q2: Find average of three numbers.
  public static float average(int n1, int n2, int n3){
    float avg = (n1 + n2 + n3) / (3 + 0.0f);
    return avg;
  }

  // Q3: Fibonacci Series
  public static void fibonacci(int n){
    int n1 = 0, n2 = 1, n3 = 1;
    if(n > 0){
      for(int i=0; i<n; i++){
        System.out.print(n3 + " ");
        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number : ");
    int num = sc.nextInt();
    factorial(num);

    System.out.println("Enter 3 numbers : ");
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();
    float avg = average(n1, n2, n3);
    System.out.println("Average : " + avg);

    System.out.println("Enter nth term of fibonacci series : ");
    int n_fib = sc.nextInt();
    fibonacci(n_fib);
  }
}

/*
 
Difference between functions and methods : 
Functions are called directly and are independent, But methods are the functions inside class, and are called using objects of class.
*/

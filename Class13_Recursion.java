import java.util.Scanner;

public class Class13_Recursion {
  public static void printName(int count, String name) {
    if (count > 5) {
      return;
    }
    System.out.println(name);
    printName(count + 1, name);
  }

  public static void printNumbers(int counter, int n) {
    if (counter > n) {
      return;
    }
    System.out.print(counter + " ");
    printNumbers(counter + 1, n);
  }

  public static void printReverse(int n) {
    if (n == 0) {
      return;
    }

    System.out.print(n + " ");
    printReverse(n - 1);
  }

  public static void printNumbersBacktrack(int counter, int n) {
    if (counter < 1) {
      return;
    }
    printNumbersBacktrack(counter - 1, n);
    System.out.print(counter + " ");
  }

  public static void printReverseBacktrack(int counter, int n) {
    if (counter > n) {
      return;
    }
    printReverseBacktrack(counter + 1, n);
    System.out.print(counter + " ");
  }

  public static void calculateSum(int sum, int n) {
    if (n < 1) {
      System.out.println("Sum is : " + sum);
      return;
    }
    calculateSum(sum + n, n - 1);
  }

  public static int sum(int n) {
    if (n == 0) {
      return 0;
    }
    return n + sum(n - 1);
  }

  public static long fact(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    return n * fact(n - 1);
  }

  public static void reverseArray(int[] arr, int l, int r) {
    if (l > r) {
      return;
    }
    int temp = arr[l];
    arr[l] = arr[r];
    arr[r] = temp;
    reverseArray(arr, l + 1, r - 1);
  }

  public static void reverseArraySinglePtr(int[] A, int ptr) {
    if (ptr >= (A.length / 2)) {
      return;
    }
    int temp = A[ptr];
    A[ptr] = A[A.length - ptr - 1];
    A[A.length - ptr - 1] = temp;
    reverseArraySinglePtr(A, ptr + 1);
  }

  public static void isPalindrome(int counter, StringBuilder s) {
    if (counter >= s.length() / 2) {
      System.out.println("Palindrome");
      return;
    }
    char ch = s.charAt(counter);
    char ch2 = s.charAt(s.length() - counter - 1);
    if (ch != ch2) {
      System.out.println("Not a palindrome");
      return;
    }
    isPalindrome(counter + 1, s);
  }

  public static int fibonacci(int n) {
    if (n <= 1) {
      return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);

    // For every n, we are calling 2 recursion calls, so for n no.s, there will be
    // approximately 2^n calls
    // T.C = O( 2^n)
  }

  public static void main(String[] args) {
    // Recursion

    // Q1: Print name 5 times
    printName(1, "Jyotiranjan");

    // Q2: Print from 1 to n
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any no. n : ");
    int n = sc.nextInt();
    printNumbers(1, n);
    System.out.println();

    // Q3: Print in reverse order
    printReverse(n);
    System.out.println();

    // Q4: Print 1 to n using backtracking
    printNumbersBacktrack(n, n);
    System.out.println();

    // Q5: Print n to 1 using backtracking
    printReverseBacktrack(1, n);
    System.out.println();

    // Q6: Sum of first n numbers
    calculateSum(0, n); // Void return
    System.out.println("Sum of first " + n + " natural no.s is : " + sum(n)); // int return

    // Q7: Factorial of n
    System.out.println("Factorial of " + n + " is : " + fact(n));

    // Q8: Reverse an array using recursion
    int[] arr = { 1, 2, 3, 4, 5 };
    reverseArray(arr, 0, arr.length - 1);
    System.out.println("After reversing the array is : ");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();

    int[] A = { 6, 7, 4, 5, 2, 1 };
    reverseArraySinglePtr(A, 0);
    System.out.println("After reversing the array is : ");
    for (int i = 0; i < A.length; i++) {
      System.out.print(A[i] + " ");
    }
    System.out.println();

    // String str = sc.nextLine();
    // isPalindrome(0, str);

    System.out.println("Enter n : ");
    int result = fibonacci(n);
    System.out.println(n + "th term of fibonacci series is : " + result);
  }
}

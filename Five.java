import java.util.Scanner;

public class Five {
  public static void main(String[] args) {
    /*
     * Pattern 1:
     * * * * *
     * * * * *
     * * * * *
     */

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n : ");
    int n = sc.nextInt();
    System.out.println("Pattern 1");

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }
    System.out.print("\n");

    /*
     Pattern 2:
     * * * * *
     *       *
     *       *
     * * * * *
    */

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == 0 || i == n - 1 || j == 0 || j == n-1) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.print("\n");
    }
    System.out.print("\n");

    /*
    Pattern 3
    *
    **
    ***
    ****
    */

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }
    System.out.print("\n");

    /*
    Pattern 4
    * * * *
    * * *
    * * 
    *
    */

    for (int i = 1; i <= n; i++) {
      for (int j = n; j >= i; j--) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }
    System.out.print("\n");

    /*
    Pattern 5
          *
        * *
      * * *
    * * * *
    */

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n-i; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }
    System.out.print("\n");

    /*
    Pattern 6
    1
    1 2
    1 2 3
    1 2 3 4
    */

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.print("\n");
    }
    System.out.print("\n");

    /*
    Pattern 7
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
    */

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n-i+1; j++) {
        System.out.print(j + " ");
      }
      System.out.print("\n");
    }
    System.out.print("\n");

    /*
    Pattern 8
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
    */

    int counter = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(counter + " ");
        counter++;
      }
      System.out.print("\n");
    }
    System.out.print("\n");

    /*
    Pattern 9
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1
    */

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if((i + j) % 2 == 0){
          System.out.print("1 ");
        }
        else{
          System.out.print("0 ");
        }
      }
      System.out.print("\n");
    }
    System.out.print("\n");

    /*
    Pattern 10
    *             *
    * *         * *
    * * *     * * *
    * * * * * * * *
    * * * * * * * *
    * * *     * * *
    * *         * *
    *             *
    */

    for (int i = 1; i <= n; i++) {
      for(int j = 1; j <= i; j++){
        System.out.print("* ");
      }
      for (int j = i+1; j <= 2*n - i; j++) {
        System.out.print("  ");
      }
      for (int j = 2*n - i + 1; j <= 2*n; j++) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }

    for (int i = n; i >= 1; i--) {
      for(int j = 1; j <= i; j++){
        System.out.print("* ");
      }
      for (int j = i+1; j <= 2*n - i; j++) {
        System.out.print("  ");
      }
      for (int j = 2*n - i + 1; j <= 2*n; j++) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }
    System.out.print("\n");

    /*
    Pattern 11
            * * * * *
          * * * * *
        * * * * *
      * * * * *
    * * * * *
    */

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n-i; j++) {
        System.out.print("  ");
      }      
      for (int j = 1; j <= n; j++) {
        System.out.print("* ");
      }
      System.out.print("\n");
    }
    System.out.print("\n");

    /*
    Pattern 12
        1
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5
    */

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n-i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print(i + " ");
      }
      System.out.print("\n");
    }
    System.out.print("\n");

    /*
    Pattern 13
            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
    */

    for (int i = 1; i <= n; i++) {
      // Spaces
      for (int j = 1; j <= n-i; j++) {
        System.out.print("  ");
      }

      // First half
      for (int j = i; j >= 1; j--) {
        System.out.print(j + " ");
      }

      // Second half
      for (int j = 2; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.print("\n");
    }
    System.out.print("\n");

    /*
    Pattern 13
         *
        * *
       * * *
      * * * *
     * * * * *
    * * * * * *

    * * * * * *
     * * * * *
       * * *
        * *
         * 
    */

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n-i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= n-i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}

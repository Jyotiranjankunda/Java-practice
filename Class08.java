import java.util.Scanner;

public class Class08 {
  public static void main(String[] args) {
    // 2-D array
    // type[][] arrayName = new type[rows][cols]

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter rows and columns : ");
    int rows = sc.nextInt();
    int cols = sc.nextInt();

    int [][] matrix = new int[rows][cols];

    System.out.println("Enter elements of array : ");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
    System.out.println();

    System.out.println("Your matrix is : ");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

    // Linear search in matrix
    int k;
    System.out.println("Enter your search value : ");
    k = sc.nextInt();

    boolean elementFound = false;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if(matrix[i][j] == k){
          System.out.println(k + " is present at location (" + i + ", " + j + ")");
          elementFound = true;
          break;
        }
      }
      System.out.println();
    }
    if(elementFound == false){
      System.out.println(k + " is not present.");
    }
  }
}

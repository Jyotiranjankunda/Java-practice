import java.util.Scanner;

public class Class07 {
  public static void main(String[] args) {
    // Arrays
    int[] marks = new int[20];

    System.out.println("Enter no. of elements : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0; i<n; i++){
      marks[i] = sc.nextInt();
    }

    System.out.println("Array elements are : ");
    for (int i = 0; i < n; i++) {
      System.out.print(marks[i] + " ");
    }
    System.out.println();

    // Another way to declare array
    int[] arr = {1,4,6,3,32};

    // In java, every declared variable takes null value in memory.
    // i.e, int: 0, float: 0.0, string: "", boolean: false, integer array: {0,0,0,0,0} ...etc
    // But, in c/cpp, it is initialised with garbage values by default

    // Empty array
    int[] A = new int[5];
    System.out.println("Empty array : ");
    for (int i = 0; i < A.length; i++) {
      System.out.print(A[i] + " ");
    }
    System.out.println();

    // Linear Search
    int size;
    System.out.println("Enter size of array : ");
    size = sc.nextInt();

    int[] array = new int[size];

    System.out.println("Enter array elements : ");
    for (int i = 0; i < size; i++) {
      array[i] = sc.nextInt();
    }

    int k;
    System.out.println("Enter your search value : ");
    k = sc.nextInt();

    int i = 0;
    for (i = 0; i < array.length; i++) {
      if(array[i] == k){
        System.out.println(k + " is present at index : " + i);
        break;
      }
    }
    if(i == array.length){
      System.out.println(k + " is not present.");
    }
  }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Class15_ArrayListDS {
  public static void main(String[] args) {
    // ArrayList
    // variable size
    // memory -> non consecutive
    // 0 <-> 1 <-> 2 <-> 3
    // Arraylist only store objects

    ArrayList<Integer> list = new ArrayList<>();
    // ArrayList<String> list2 = new ArrayList<>();

    // add elements
    list.add(56);
    list.add(97);
    list.add(24);
    System.out.println(list);

    // get element by index
    int element = list.get(0);
    System.out.println(element);

    // add element in between
    // add 34 at index 1
    list.add(1, 34);
    System.out.println(list);

    // set elements
    // set/update element at index 0
    list.set(0, 12);
    System.out.println(list);

    // delete element
    list.remove(3);
    System.out.println(list);

    // size of arraylist
    int size = list.size();
    System.out.println(size);

    // iterate over array list
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }
    System.out.println();

    // sorting
    ArrayList<Integer> arr = new ArrayList<>();
    System.out.println("Enter size of array : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Enter elements in the array");
    for (int i = 0; i < n; i++) {
      arr.add(sc.nextInt());
    }
    System.out.println("Sorted array is : ");
    Collections.sort(arr);
    System.out.println(arr);
  }
}

import java.util.HashSet;
import java.util.Iterator;

public class Class30_HashSet {
  public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();
    // Hashset can be unordered set as in cpp

    set.add(5);
    set.add(4);
    set.add(9);
    set.add(1);
    set.add(3);
    set.add(3);

    System.out.println("Size of set is : " + set.size());

    // Printing elements
    Iterator itr = set.iterator();

    while (itr.hasNext()) {
      System.out.print(itr.next() + " ");
    }
    System.out.println();

    // one more way
    System.out.println(set);

    if(set.contains(4)){
      System.out.println("Set contains 4");
    }

    if(!set.contains(56)){
      System.out.println("Set doesn't contain this number");
    }

    set.remove(3);
  }
}

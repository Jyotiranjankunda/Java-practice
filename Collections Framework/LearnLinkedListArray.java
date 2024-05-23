import java.util.List;

public class LearnLinkedListArray {
  public static void main(String[] args) {
    List<Integer> list = new LinkedList<>();

    // All the functions are same as arraylist
    
    list.add(23);
    list.add(56);
    list.add(67);
    list.add(78);

    list.remove(0);
    list.add(2,45);
    System.out.println(list.size());
    System.out.println(list);
  }
}

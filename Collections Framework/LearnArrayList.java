import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4);  // This will add 4 at the end of the list
        System.out.println(list);

        list.add(1, 50);  // This will add 50 at index 1
        System.out.println(list);

        List<Integer> newList = new ArrayList<>(Arrays.asList(150, 200));
        list.addAll(newList);  // This will add all the elements of newList to list
        System.out.println(list);

        System.out.println(list.get(2));  // Get the value at index 2

        // Removing elements from arraylist
        list.remove(1);  // This will remove the element at index 1
        System.out.println(list);

        list.remove(Integer.valueOf(150));  // This will remove the element 150
        System.out.println(list);

        // list.clear();  // Clear the whole list
        // System.out.println(list);

        list.set(1, 20);  // Update the value to 20 at index 1
        System.out.println(list);

        System.out.println(list.contains(200));  // Returns true if list contains 200 else false.

        System.out.println(list.size());

        for(int i=0; i<list.size(); i++){
            System.out.println("For loop : " + list.get(i) + " ");
        }

        for(Integer item : list){
            System.out.println("For each loop : " + item + " ");
        }

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println("Iterator : " + it.next() + " ");
        }
    }
}
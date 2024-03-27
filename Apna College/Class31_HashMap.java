import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Class31_HashMap {
  public static void main(String[] args) {
    // Hashmap also works as unordered map
    HashMap<String, Integer> population = new HashMap<>();

    population.put("India", 120);
    population.put("USA", 30);
    population.put("China", 100);
    population.put("France", 20);

    System.out.println(population);

    // update india's population
    population.put("India", 140);

    // search
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any country name : ");
    String country = sc.nextLine();

    if(population.containsKey(country)){
      System.out.print("Population of " + country + " is : ");
      System.out.println(population.get(country));
    }
    else{
      System.out.println("Data not available - " + population.get(country));
    }

    // Iterator in map
    // yaha pe ham map ke har ek entry ko 'e' me le rahe hai 
    for(Map.Entry<String, Integer> e : population.entrySet()){
      System.out.println(e.getKey() + " : " + e.getValue());
    }

    // One more way
    // yaha pe sirf keys ko le rahe hai, not whole entry
    Set<String> keys = population.keySet();
    for(String key : keys){
      System.out.println(key + " : " + population.get(key));
    }

    // Delete any pair from map - only give the key name
    population.remove("France");
    System.out.println(population);
  }
}

import java.util.*;

public class Class09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your full name : ");
    String name = sc.nextLine();
    System.out.println("Your name is : " + name);

    // Concatenation
    String first = "Jyoti";
    String middle = "ranjan";
    String last = " Kunda";
    String fullName = first + middle + last;
    System.out.println(fullName);

    // Length
    System.out.println(fullName.length());

    // charAt
    for (int i = 0; i < fullName.length(); i++) {
      System.out.print(fullName.charAt(i) + " ");
    }
    System.out.println();

    // Compare two strings
    String name1 = "Aashwasti";
    String name2 = "aashwasti";
    
    // str1 > str2 => return positive value
    // str1 == str2 => return 0
    // str1 < str2 => return negative value

    if(name1.compareTo(name2) == 0){
      System.out.println("Strings are equal");
    }
    else if(name1.compareTo(name2) > 0){
      System.out.println("String 1 is greater");
    }
    else{
      System.out.println("String 2 is greater");
    }

    // Here, string 2 is greater, as 'a' is greater than 'A' in terms of ASCII value

    // Don't use == to compare strings
    if(new String("jyoti") == new String("jyoti")){
      System.out.println("Strings are equal");
    }
    else{
      System.out.println("String are not equal");
    }
    // It outputs not equal, although both are same strings. 

    // Substring
    // substring -> [beginIndex, endIndex)
    String sentence = "My name is Jyotiranjan";
    String nameSubstring = sentence.substring(11, sentence.length());
    System.out.println(nameSubstring);

    // If ending index is last index, then no need to input the endIndex parameter, only beginIndex is enough

    // String are immutable.
  }
}

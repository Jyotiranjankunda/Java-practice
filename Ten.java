public class Ten {
  public static void main(String[] args) {
    // StringBuilder

    // When we create any string, suppose String s = "Hello", then first s points to
    // 'h', then 'h' is deleted from heap, and 'he' is added, so s now points to
    // 'he', then 'he' is deleted, and 'hel' is added.. and so on. So, this is a
    // time taking process, also strings are immutable, so everytime we have to
    // create a new string when any manipulation operation is done on the string.

    // Now, StringBuilder class makes this task easy, it updates the same string
    // there only, rather than creating a new one.

    StringBuilder sb = new StringBuilder("Hello world");
    System.out.println(sb);

    // char at
    System.out.println(sb.charAt(6));

    // set char at index i
    // Here, we are updating the string, but not creating another string to store
    // that, string builder updates the same string.

    sb.setCharAt(1, 'o');
    System.out.println(sb);

    // insert
    sb.insert(2, 'm');
    System.out.println(sb);

    // delete: [start_index, end_index)
    sb.delete(2, 3);
    System.out.println(sb);

    // Append
    sb.append(" Kese ho");
    System.out.println(sb);

    // length
    System.out.println("Length is : " + sb.length());

    // reverse string
    for (int i = 0; i < sb.length()/2; i++) {
      int front = i;
      int back = sb.length() - i - 1;

      char frontChar = sb.charAt(front);
      char backChar = sb.charAt(back);

      // Swap characters to reverse it.
      sb.setCharAt(i, backChar);
      sb.setCharAt(back, frontChar);
    }
    System.out.println(sb);
  }
}

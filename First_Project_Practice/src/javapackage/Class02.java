package javapackage;

public class Class02 {
//	Java is not 100% OOP language, as we can create int, long, char, etc. variables without creating their objects.
	
//	But this issue can be solved by using Wrapper classes.
	
	/*
	 * int -> Integer
	 * char -> Character 
	 * ... etc
	 * */
	
//	Integer.parseInt -> parseInt is a static method in Integer class, as it is called by className.method. Parses the string argument as a signed decimal integer. The characters in the string must all be decimal digits, except that the first character may be an ASCII minus sign '-'('\u002D') to indicate a negative value or anASCII plus sign '+' ('\u002B') to indicate a positive value.
	
//	Integer.valueOf method -> Returns an Integer object holding the value of the specified String. The argument is interpreted as representing a signed decimal integer.
	
//	intValue() => Returns the value of the Integer object as an int; i.e, convert Integer to int.
	
//	Similarity, String.valueOf() converts the arguments to String objects.
	
	public static void main(String[] args) {
		int x = Integer.parseInt("123");
		System.out.println(x);
		
		String s = String.valueOf(34.5);
		System.out.println(s);
		
		Integer i1 = Integer.valueOf("56");
		int k = i1.intValue();  // intValue() is non-static function, so that it is called by object of Integer, and not by class name
		System.out.println(k);
		
//		The work done by Integer.valueOf() and intValue, is alone done by parseInt. Both are doing same function.
		
//		Binary to integer
		int bin = Integer.parseInt("101101", 2);
		System.out.println(bin);
		
//		or, we can also write as 
		Integer b = Integer.valueOf("101101", 2);
		int binary = b.intValue();
		System.out.println(b);
	}
}
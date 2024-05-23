package javapackage;

public class Class02 {
	public static void main(String[] args) {
//		There are 2 ways to create a string in java
//		1. Using string literal
		String str = "Hello";

//		Using new keyword: In this case, JVM will create a new string object in heap memory.
		String s = new String("Jyotiranjan");
		s.concat("kunda");
		System.out.println(s);

//		CharSequence Interface is used for representing the sequence of Characters in Java. 
//		Three classes in CharSequence interface: String, StringBuffer and StringBuilder
//		1. String ->  String is an immutable class which means a constant and cannot be changed once created.
	}
}
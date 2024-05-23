package javapackage;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Class01 {
	public static void main(String[] args) throws IOException {
//      Ways to take input
//      1. Using BufferReader - It has a simple function "read()" that reads a single character, and "readLine()" that reads an array of characters. It throws an IOException, so we need to wrap in that.
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name : ");
		String str = bf.readLine();
		System.out.println("Enter your age : ");
		int i = Integer.parseInt(bf.readLine());
		System.out.println("Name : " + str + " Age : " + i);

//		2. Using Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string : ");
		String s = sc.nextLine();
		System.out.println("Enter any number : ");
		Integer num = sc.nextInt();
		System.out.println("String : " + s + " Integer : " + num);

//		Inputs using scanner
		System.out.println("Character : ");
		char ch = sc.next().charAt(0);
		System.out.println(ch);
		sc.nextLine();

		System.out.println("String : ");
		String s1 = sc.nextLine();
		System.out.println(s1);

		System.out.println("Integer : ");
		int a = sc.nextInt();
		System.out.println(a);

		System.out.println("Double : ");
		double db = sc.nextDouble();
		System.out.println(db);

		/*
		 * Differences between Scanner and BufferedReader Class
		 * 
		 * BufferedReader is synchronous while Scanner is not. 
		 * BufferedReader should be used if we are working with multiple threads. 
		 * BufferedReader has a significantly larger buffer memory than Scanner. 
		 * The Scanner has a little buffer (1KB char buffer) as opposed to the BufferedReader (8KB byte buffer), but it’s more than enough. 
		 * BufferedReader is a bit faster as compared to Scanner because the Scanner does the parsing of input data, it internally uses regular expressions to read different types but BufferedReader simply reads a sequence of characters.
		 */
		
//		3. DataInputStream
		DataInputStream dis = new DataInputStream(System.in);
		String sr = dis.readLine();
		System.out.println("Using data input stream : " + sr);
	}
}
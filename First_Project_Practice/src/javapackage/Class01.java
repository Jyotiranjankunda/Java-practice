package javapackage;

class Example{
//	Instance(object) member variable
	int x = 5;
	int y;
	static int z = 10;
	private int w = 9;  // It will be not accessible outside this class.
	
	static void fun1() {
		System.out.println("Inside Example fun2");
	}
	
	static void fun2() {
		System.out.println("Inside Example fun2");
	}
	
//	Instance(object) member function
	void fun3() {
		System.out.println("Non static method fun3");
		System.out.println("Value of private variable w: " + w);
		System.out.println(z);
	}
}

public class Class01 {
	public static void fun1() {
		System.out.println("Inside fun1");
	}
	
	public static void fun2() {
		System.out.println("Inside fun2");
	}
	
	public static void main(String[] args) {
		System.out.println("Inside main");
//		Static methods can always call other static methods only. If the fun1 and fun2 are not static, then we can't call them from main method.
		fun1();
		fun2();
		
		
//		For calling the static methods or variables of a class, we use ClassName.methodName();
		Example.fun1();
		Example.fun2();
		System.out.println(Example.z);  // 10
		
//		For calling a non-static method or variable of any class, we need to create an object of it.
		Example ex = new Example();
		ex.fun3();
		System.out.println(ex.x + " " + ex.y);  // Here, x = 5, and y is not initialised, so by default it will be 0.
			
//		We can't access the private members outside the class, but we can indirectly access them using functions
//		System.out.println(w);  -> Error
		ex.fun3();  
// 		Here, the private variable is accessible, as main will call f3 of Example class, and all the methods of a particular class have access to their private variables as well.
//		We can't refer to any non-static variable in any static function but vice versa is possible.
	}
}

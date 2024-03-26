/*
Java code executes in 2 phases: Compilation and Execution

JDK(Java Development Kit) = JRE(Java Runtime Environment) + Development tools
                            JRE :- JVM(Java Virtual Machine) + Libraries

All source code is saved in .java file, and the compiler converts it into byte code (.class file) which can be run on any OS

2nd phase - Now, JVM takes the byte code and converts it into native language (i.e, machine language)
*/

public class Class01_HelloWorld {
  public static void main(String[] args) {
    System.out.print("Hello world");  // Next line will be printed in the same line
    System.out.println("Hello world");  // Next line will be printed in the next line.. just like \n
    System.out.print("Hello world\n");

    System.out.println("*");
    System.out.println("**");
    System.out.println("***");
    System.out.println("****");
  }
}

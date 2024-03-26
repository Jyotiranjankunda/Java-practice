class Pen {
  String color;
  String type;

  public void write() {
    System.out.println("Writing something...");
  }

  public void printColor() {
    System.out.println("Color : " + this.color);
  }
}

class Student {
  String name;
  int age;
  static String school;
  // school name is same for every student, so we define it as static.

  // If we are defining parameterised or copy constructor, then default
  // constructor is mandatory.
  Student() {
    System.out.println("Default constructor called");
  }

  Student(String name, int age) {
    this.name = name;
    this.age = age;
    System.out.println("Parameterised constructor called");
  }

  // Copy constructor - copies one object into other.
  Student(Student s) {
    this.name = s.name;
    this.age = s.age;
  }

  // Polymorphism - Function overloading (Compile time polymorphism)
  public void printInfo(String name, int age) {
    System.out.println(name);
    System.out.println(age);
  }

  public void printInfo(String name) {
    System.out.println(name);
  }

  public void printInfo(int age) {
    System.out.println(age);
  }
}

// Inheritance
// Base class
class Shape {
  int sides;

  public void area() {
    System.out.println("Displays area");
  }
}

// Single inheritance
// Shape -> Triangle
class Triangle extends Shape {
  public void area(int l, int h) {
    System.out.println(0.5 * l * h);
  }
}

// Multilevel inheritance
// Shape -> Triangle -> EquilateralTriangle
class EquilateralTriangle extends Triangle {
  public void area(int l, int h) {
    System.out.println(0.5 * l * h);
  }
}

// Hierarchical inheritance
// Shape -> Triangle and Circle
class Circle extends Shape {
  public void area(int r) {
    System.out.println(3.14 * r * r);
  }
}

// Hybrid inheritance -> combination of different types of inheritance.

// Abstraction
abstract class Animal {
  // we can't create objects of animal class as it is abstract.
  // It can have abstract and non-abstract methods
  // It can have constructors and static methods also. But it's constructor will
  // be called, when child class object is created.

  Animal() {
    System.out.println("Animal constructor");
  }

  // abstract methods doesn't have any body, their implementation must be
  // specified in inherited class
  abstract void walk();

  // non-abstract method
  public void eat() {
    System.out.println();
  }
}

class Horse extends Animal {
  Horse() {
    System.out.println("Horse constructor");
  }

  public void walk() {
    System.out.println("Horse walks on 4 legs");
  }
}

class Chicken extends Animal {
  public void walk() {
    System.out.println("Chicken walks on 2 legs");
  }
}

// Interface
// An interface is a reference type that defines a set of abstract methods and
// constants.
// All the fields in interface are public, static and final by default.
// All methods are public and abstract by default.
// A class that implements an interface must implement all the methods declared
// in the interface.
// Interfaces support the functionality of multiple inheritance.

interface Car {
  // public void run();
  // this method is by default abstract and public, so if we don't write public
  // and abstract, it's fine.
  void run();

  int wheels = 4;
  // we can define constants and abstract functions inside interface, that means
  // here the wheels is a constant, and can't be changed.
}

interface SportsCar{
  void runFast();
}

class MarutiCar implements Car {
  // But here, we have to write public, else it will be default access modifier.
  public void run() {
    System.out.println("Maruti Car is running");
  }
}

class Lamborghini implements Car, SportsCar{
  // Here, interface supoprts multiple inheritance, i.e, Lamborghini class can be inherited from both car, and supercar. But we need to implement both abstract functions. It is mandatory

  public void runFast(){
    System.out.println("Lamborghini car runs very fast");
  }
  public void run(){
    System.out.println("Lamborghini is running");
  }
}

public class Class16_OOP {
  public static void main(String[] args) {
    Pen pen1 = new Pen();
    Pen pen2 = new Pen();

    pen1.color = "Blue";
    pen1.type = "Ballpoint";

    pen2.color = "Black";
    pen2.type = "Gel";

    pen1.write();
    pen1.printColor();
    pen2.write();
    pen2.printColor();

    // Student s1 = new Student();
    // s1.name = "Jyotiranjan";
    // s1.age = 22;

    Student s1 = new Student("Jyotiranjan", 22);
    s1.printInfo(s1.name, s1.age);

    Student s2 = new Student();
    s2.name = "Rakesh";
    s2.age = 25;

    Student s3 = new Student(s1);
    s3.printInfo(s3.name);
    s3.printInfo(s3.age);
    s3.printInfo(s2.name, s2.age);

    Student.school = "AASSS";
    // static methods and data members are common for all object, so we can't call it by any specific object. So it will be called by the class name.
    // And this school AASSS is set for every object that will be made.
    System.out.println(Student.school);

    // bank.Account account1 = new bank.Account();
    // account1.name = "Customer1";

    Horse h = new Horse();
    h.walk();

    Chicken c = new Chicken();
    c.walk();

    MarutiCar m = new MarutiCar();
    m.run();

    Lamborghini lm = new Lamborghini();
    lm.runFast();
  }
}
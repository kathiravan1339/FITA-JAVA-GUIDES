package fita.guides.oops.part.two;

//	Abstraction means hiding the implementation details and showing only the essential functionality.
//	It focuses on what an object does, rather than how it does it.

//	A class declared using the abstract keyword is called an abstract class.
//	An abstract class can contain: Abstract methods, Concrete/normal methods, Variables, Constructors
//	We cannot create an object directly from an abstract class.***************
public class AbstractClassDemo {

	public static void main(String[] args) {

		// Cannot create object of abstract class
		// Animal animal = new Animal(); // ERROR

		Dog dog = new Dog(); //child

		dog.eat();
		dog.sound();
	}
}

// Abstract class
abstract class Animal {

	// Normal method
	void eat() {
		System.out.println("Animal is eating");
	}

	// Abstract method
	//	A method declared without a body is called an abstract method.
	//	It must be implemented by the child class.
	abstract void sound();
}

// Child class
class Dog extends Animal {

	// Implementing abstract method
	void sound() {
		System.out.println("Dog is barking");
	}
}

/*

	        Animal
	      (abstract)
	       /      \
	      /        \
	   sound()    eat()
	      |
	      ↓
	     Dog
	      |
	      ↓
	  sound() implemented

*/








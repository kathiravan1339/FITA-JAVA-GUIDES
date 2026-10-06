package fita.guides.oops.part.two;


/*
 * 
	   Runtime Polymorphism
	   Achieved using method overriding.
	   Requires inheritance.
	   The child class provides its own implementation of a parent method.
	   The method that executes is determined at runtime.
 *
 * 
 */
public class MethodOverridingDemo {

    public static void main(String[] args) {

    	Pet animal1 = new Parrot();

        animal1.sound();

        Pet animal2 = new Cat();

        animal2.sound();
    }
}


// Parent class
class Pet {

    void sound() {
        System.out.println("Animal makes sound");
    }
}


// Child class 1
class Parrot extends Pet {

    @Override
    void sound() {
        System.out.println("parrot keech");
    }
}


// Child class 2
class Cat extends Pet {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}


/*
 * 
	   Advantages of Polymorphism
	   --------------------------
	  
	   Provides flexibility.
	   Supports code reusability.
	   Makes applications easier to extend.
	   Reduces code duplication.
	   Allows a common parent/interface reference to work with different implementations.
 * 
 */

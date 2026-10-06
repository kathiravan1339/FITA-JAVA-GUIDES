package fita.guides.oops;

//Hybrid inheritance is a combination of two or more types of inheritance.
//
//In Java, hybrid inheritance can be achieved using classes + interfaces.
public class HybridInheritanceDemo {

	public static void main(String[] args) {

		Doggy doggy = new Doggy();

		doggy.eat(); // came from animal
		doggy.walk(); // own
		doggy.bark(); // came by implements
	}
}

// Child class
class Doggy extends Animal implements Pet {

	public void walk() {
		System.out.println("Dog is walking");
	}

	void bark() {
		System.out.println("Dog is barking");
	}
	
	
}

/*

Animal
|
↓
Dog
↑
|
Pet
(Interface)


*/

// class -> class => extends
// class -> interface => we won't use in java
// interface -> class => implements
//interface -> interface => extends




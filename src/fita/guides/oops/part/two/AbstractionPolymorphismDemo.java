package fita.guides.oops.part.two;

public class AbstractionPolymorphismDemo {

	public static void main(String[] args) {

		// Parent abstract class reference
		WildAnimal wildAnimal;

		wildAnimal = new Lion();
		wildAnimal.sound();

		wildAnimal = new Elephant();
		wildAnimal.sound();

		wildAnimal = new Horse();
		wildAnimal.sound();
	}
}

// Abstract class
abstract class WildAnimal {

	// Abstract method
	abstract void sound();

	// Normal method
	void eat() {
		System.out.println("WildAnimal is eating");
	}
}

// Lion
class Lion extends WildAnimal {

	@Override
	void sound() {
		System.out.println("Lion is roar");
	}
}

// Elephant
class Elephant extends WildAnimal {

	@Override
	void sound() {
		System.out.println("Elephant is Pawoo");
	}
}

// Horse
class Horse extends WildAnimal {

	@Override
	void sound() {
		System.out.println("Horse is Neeee-igh");
	}
}
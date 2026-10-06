package fita.guides.oops;

//One parent → One child
public class SingleInheritanceDemo {

	public static void main(String[] args) {
       Animal animal = new Animal();
       animal.eat();
		
		Dog dog = new Dog();

		dog.eat(); // Parent method
		dog.bark(); // Child method
	}
}


/*
class Animal {

	void eat() {
		System.out.println("Animal is eating");
	}
}
*/

// Child class
/*
class Dog extends Animal {

	(void bark) {
		System.out.println("Dog is barking");
	}
}
*/

/*

Animal
|
↓
Dog

*/
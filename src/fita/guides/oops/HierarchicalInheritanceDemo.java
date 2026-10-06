package fita.guides.oops;

//One parent → Multiple children
public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {

		Dog dog = new Dog();

		dog.eat();
		dog.bark();

		System.out.println("----------------");

		Cat cat = new Cat();

		cat.eat();
		cat.meow();

		System.out.println("----------------");

		Cow cow = new Cow();

		cow.eat();
		cow.moo();
	}
}


/*

  Animal
/   |   \
↓    ↓    ↓
Dog   Cat   Cow

*/






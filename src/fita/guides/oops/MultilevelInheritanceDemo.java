package fita.guides.oops;

//Grandparent → Parent → Child
public class MultilevelInheritanceDemo {

	public static void main(String[] args) {

		Puppy puppy = new Puppy();
		puppy.eat(); // Animal
		puppy.bark(); // Dog
		puppy.play(); // Puppy
	}
}



// Child
//class Puppy extends Dog {
//
//	void play() {
//		System.out.println("Puppy is playing");
//	}
//}

/*

Animal
|
↓
Dog
|
↓
Puppy


*/
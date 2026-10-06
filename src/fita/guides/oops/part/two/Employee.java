package fita.guides.oops.part.two;

/*

	When to use an Abstract Class
	
	Use an abstract class when:
	
	The classes have a strong "is-a" relationship.
	Multiple child classes share common properties.
	You want to provide common implementation that child classes can reuse.
	You need instance variables/state in the parent.
	You need constructors in the base class.
	You want some methods to be common and some to be mandatory for child classes.

*/

abstract class Employee {

	String name;
	double salary;

	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	

	// Common implementation
	void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}

	// Child classes must implement
	abstract void calculateBonus();
	
	
	
	
}

class Developer extends Employee {
	
	//Developer dev = new Developer("kathir", 61);
	

	Developer(String name, double salary) {
		super(name, salary);
	}

	@Override
	void calculateBonus() {
		System.out.println("Developer bonus calculated");
	}
}

class Manager extends Employee {

	Manager(String name, double salary) {
		super(name, salary);
	}

	@Override
	void calculateBonus() {
		System.out.println("Manager bonus calculated");
	}
}
package fita.guides.oops.part.two;

/*

	Constructor
		↓
	Special method used to initialize an object
	----------------
	Constructor name
		↓
	Must be the same as the class name
	----------------
	Return type
		↓
	No return type, not even void
	----------------
	Called when
		↓
	Object is created using new

*/

public class ConstructorDemo {

	public static void main(String[] args) {

		// 1. Default constructor
		Student student1 = new Student();

		student1.displayDetails();

		System.out.println("----------------");

		// 2. Constructor with one parameter
		Student student2 = new Student("Kathiravan");

		student2.displayDetails();

		System.out.println("----------------");

		// 3. Constructor with two parameters
		Student student3 = new Student("Arun", 25);

		student3.displayDetails();

		System.out.println("----------------");

		// 4. Constructor with three parameters
		Student student4 = new Student("Kumar", 26, "Java");

		student4.displayDetails();

		System.out.println("----------------");

		// 5. Another object using the same constructor
		Student student5 = new Student("Raj", 24, "Python");

		student5.displayDetails();
	}
}

// Student class
class Student {

	String name;
	int age;
	String course;

	// 1. Default constructor
	Student() {

		name = "Unknown";
		age = 0;
		course = "Not Assigned";
	}

	// 2. Constructor with one parameter
	Student(String name) {

		this.name = name;
		age = 0;
		course = "Not Assigned";
	}

	// 3. Constructor with two parameters
	Student(String name, int age) {

		this.name = name;
		this.age = age;
		course = "Not Assigned";
	}

	// 4. Constructor with three parameters
	Student(String name, int age, String course) {

		this.name = name;
		this.age = age;
		this.course = course;
	}

	// Method
	void displayDetails() {

		System.out.println("Name   : " + name);
		System.out.println("Age    : " + age);
		System.out.println("Course : " + course);
	}
}
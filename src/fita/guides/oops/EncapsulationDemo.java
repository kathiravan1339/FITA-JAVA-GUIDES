package fita.guides.oops;

public class EncapsulationDemo {

	public static void main(String[] args) {

		Student student = new Student();

		// Public variable - can be accessed directly
		student.name = "Kathiravan";

		// Private variable - cannot be accessed directly
		// student.age = 25; // ERROR

		// Use setter to set private variable
		student.setAge(25);
		

		// Use getter to get private variable
		System.out.println("Name : " + student.name);
		System.out.println("Age  : " + student.getAge());

		// Protected example
		student.displayStudent();

		// Default/package-private example
		student.course = "Java";

		System.out.println("Course : " + student.course);
		
		student.init();
	}
	
	
}

// access modifiers all are used into class, methods, variables.

//public → Accessible from anywhere

//private → Accessible only inside the same class

//default → Accessible within the same package

//protected → Accessible within the same package and through inheritance
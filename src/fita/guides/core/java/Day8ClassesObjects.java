package fita.guides.core.java;

public class Day8ClassesObjects {

	public static void main(String[] args) {

		byte bit = 10;
		short shot = 10;
		int var = 10;
		long lng = 6789;

		String str = "fghj";
		String strObj = new String("cfgyhuibgfcugyh");

		// 1. Creating an object
		Student student1 = new Student();

		// without encapsulation
		// student1.name = "kathir"; //
		// System.out.println("Name : " + student1.name); //

		// 2. Assigning values using object
		student1.setName("kathiravan");
		student1.setAge(25);
		student1.setCourse("Java");

		// 3. Accessing object data
		System.out.println("Student 1");
		System.out.println("Name   : " + student1.getName());
		System.out.println("Age    : " + student1.getAge());
		System.out.println("Course : " + student1.getCourse());

		// 4. Calling object method
		student1.displayDetails(10);

		System.out.println("----------------------");

		// 5. Creating another object
		Student student2 = new Student();

		student2.setName("Arun");
		student2.setAge(24);
		student2.setCourse("Python");

		System.out.println("Student 2");
		System.out.println("Name   : " + student2.getName());
		System.out.println("Age    : " + student2.getAge());
		System.out.println("Course : " + student2.getCourse());

		student2.displayDetails();

		System.out.println("----------------------");

		// 6. Reference variable
		Student student3;

		student3 = student1; // 101 assigned to 103 (student3)

		System.out.println(student3.getAge() + student3.getName());

		student1.setName("ignatius"); // 101
		System.out.println("Student 3");
		System.out.println("Name : " + student3.getName());

		// student3 and student1 refer to the same object
		student3.setName("Changed Name");

		System.out.println("Student 1 Name : " + student1.getName());
		System.out.println("Student 3 Name : " + student3.getName());

		System.out.println("----------------------");

		// 7. Creating object with different values
		Student student4 = new Student();

		student4.setName("Kumar");
		student4.setAge(26);
		student4.setCourse("Java");

		student4.displayDetails();

		System.out.println("Name   : " + student1.getName());
		System.out.println("Age    : " + student1.getAge());
		System.out.println("Course : " + student1.getCourse());
	}
}

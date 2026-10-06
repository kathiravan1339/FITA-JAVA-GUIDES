package fita.guides.core.java;


public class Student {

	// Instance variables
	private String name;
	private int age;
	private String course;
	
	

	public Student() {
		super();
	}
	
	public Student(String string, int i) {
		System.out.println("contruct call");
	}
    
	public Student(String name, int age, String course) {
		super();
		this.name = name;
		this.age = age;
		this.course = course;
	}

	public void displayDetails() {
		System.out.println("Name   : " + name);
		System.out.println("Age    : " + age);
		System.out.println("Course : " + course);
	}

	// Method
	void displayDetails(int i) {

		System.out.println("Name   : " + name);
		System.out.println("Age    : " + age);
		System.out.println("Course : " + course);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
package fita.guides.oops;

public class Student {

	// public - accessible from anywhere
	public String name;

	// private - accessible only inside this class
	private int age;

	// default - accessible within the same package
	String course;

	// protected - accessible within same package
	// and through inheritance
	protected static void displayStudent() {
		System.out.println("Student details");
	}

	// Setter
	public void setAge(int age) {

		if (age > 0) {
			this.age = age;
		}
	}

	// Getter
	public int getAge() {
		return age;
	}

	public void init() {
		System.out.println("ctfgvbuhjn");
	}

}
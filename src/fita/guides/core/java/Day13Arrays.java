package fita.guides.core.java;

public class Day13Arrays {

	public static void main(String[] args) {

		// byte short int long char float double

		// Wrapper classes - non primitive data type
		Byte n1;
		Short n2;
		Integer n3;
		Character char1;
		Float pontVal1;
		Double pointVal2;
		Boolean flag;

		pontVal1 = 10.0f;

		// 1. Creating an array
		int[] numbers = new int[5];

		// Assigning values
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		// numbers[5] = 50; Index 5 out of bounds for length 5

		// Accessing array values
		System.out.println("First number  : " + numbers[0]);
		System.out.println("Third number  : " + numbers[3]);

		System.out.println("----------------------");

		// 2. Array initialization
		int[] marks = { 80, 75, 90, 85, 95 };

		System.out.println("Marks:");

		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}

		System.out.println("----------------------");

		// 3. Enhanced for loop -(for-each)
		System.out.println("Using enhanced for loop:");

		// for (datatype var: list) {
		//
		// }

		for (int mark : marks) {
			System.out.println(mark);
		}

		String str = "kathiravan_name_10";

		String[] strArr = str.split("_");

		for (String ltr : strArr) {
			System.out.println(ltr);
		}

		System.out.println("----------------------");

		// 4. Calculate total
		int total = 0;

		for (int mark : marks) { // 80 75 90 85 95
			total += mark;
		}

		System.out.println("Total = " + total);

		// 5. Calculate average
		double average = (double) total / marks.length;

		System.out.println("Average = " + average);

		System.out.println("----------------------");

		// 6. Find largest number
		int largest = marks[0];

		for (int mark : marks) {

			if (mark > largest) {
				largest = mark;
			}
		}

		System.out.println("Largest mark = " + largest);

		System.out.println("----------------------");

		// 7. Find smallest number
		int smallest = marks[0];

		for (int mark : marks) {

			if (mark < smallest) {
				smallest = mark;
			}
		}

		System.out.println("Smallest mark = " + smallest);

		System.out.println("----------------------");

		// 8. String array
		String[] names = { "Kathiravan", "Arun", "Kumar", "Raj" };

		System.out.println("Student Names:");

		for (String name : names) {
			System.out.println(name);
		}

		System.out.println("----------------------");

		// 9. Two-dimensional array
		
		int[] singleDiamentional = { 80, 75, 90, 85, 95 };
		
		int[][] matrix = { { 10, 20, 30, 40}, { 30, 40, 30, 40}, { 50, 60, 40, 60 } };
		
		System.out.println(matrix[2][2]);

		System.out.println("2D Array:");

		for (int row = 0; row < matrix.length; row++) {

			for (int column = 0; column < matrix[row].length; column++) {

				System.out.print(matrix[row][column] + " ");// arr[2][0], arr[2][1], arr[2][2], arr[2][3]
			}

			System.out.println();
		}

		System.out.println("----------------------");
		

		// 10. Array of objects
		Student[] students = new Student[3];

		students[0] = new Student("Kathiravan", 25);
		students[1] = new Student("Arun", 24);
		students[2] = new Student("Kumar", 26);

		System.out.println("Array of Objects:");

		for (Student student : students) {
			student.displayDetails();
		}
	}

	/*
	 * 
	 * int[] numbers ↓ Array of primitive values
	 * 
	 * String[] names ↓ Array of reference values
	 * 
	 * Student[] students ↓ Array of objects
	 * 
	 * int[][] matrix ↓ Two-dimensional array
	 * 
	 */

}

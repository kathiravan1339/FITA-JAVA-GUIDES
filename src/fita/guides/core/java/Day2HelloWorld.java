package fita.guides.core.java;

public class Day2HelloWorld {

	public static void main(String[] args) {
		
//		System.out.println(1); // numeric
//		
//		System.out.println(10.324); // float and double
//		
//		System.out.println('A'); // single english letter is a char
//		
//		System.out.println("34567rsxdctfvygbuhnij!@#$%^&*()"); // colleaction of character set is a string.
//		
//		System.out.println(true); // boolean vales true or false
		
		/* This ctrl + shift + /
		 * rtyhvejmngbfgb
		 *  grbvfbrntehgrefvrbg
		 *  vefvrbtyn
		 *  is a comment */
		
		// type variableName = value;
		int num, sumValue, minValue, maxValue; 
		int x = 5, y = 6, z = 50;
		String productName = "vivo";
		
		num = 20;
		System.out.println(num + 2);
		num = 240;
		System.out.println((num + 2) + 6);
		
//		For text (strings), it joins them together (called concatenation).
//		For numbers, it adds values together.
		
		System.out.println("value of num : " + num  + " value of productName : " + productName);
		
		// Student data
		String studentName = "John Doe";
		int studentID = 15;
		int studentAge = 23;
		double studentFee = 30.78;
		char studentGrade = 'B';

		// Print variables
		System.out.println("Student name: " + studentName);
		System.out.println("Student id: " + studentID);
		System.out.println("Student age: " + studentAge);
		System.out.println("Student fee: " + studentFee);
		System.out.println("Student grade: " + studentGrade);
		System.out.println(true);
		
//		Widening Casting (automatic) - converting a smaller type to a larger type size
//		byte -> short -> char -> int -> long -> float -> double
		int myInt = 9; 
		double myDouble = myInt; // Automatic casting: int to double

		System.out.println(myInt);    // Outputs 9
		System.out.println(myDouble); // Outputs 9.0
		
//		Narrowing Casting (manual) - converting a larger type to a smaller type size
//		double -> float -> long -> int -> char -> short -> byte
		double doubleVal = 9.78d;
		int intVal = (int) doubleVal; // Manual casting: double to int
		

		System.out.println(doubleVal); // Outputs 9.78
		System.out.println(intVal);    // Outputs 9
		
		
//		/Java Arithmetic Operators
		
		System.out.println(x + y); // 13
		System.out.println(x - y); // 7
		System.out.println(x * y); // 30
		System.out.println(x / y); // 3
		System.out.println(x % y); // 1

		System.out.println();
		++z;
		System.out.println(z); // 6
		--z;
		System.out.println(z); // 5
		
		
		int incre = 5;
		System.out.println(++incre);
		System.out.println(incre); // 6
		
		
		System.out.println(incre++);
		System.out.println(incre); // 5
	}

}

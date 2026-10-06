package fita.guides.oops.part.two;

/*
	   Polymorphism means "many forms."
	   In Java, the same method/interface/reference can behave differently depending on the situation.
 */

/*
	   Achieved using method overloading.
	   Multiple methods have the same name but different parameters.
	   The compiler decides which method to call.
*/

/*
	   Method overloading can differ by:
	   --------------------------------
	   Number of parameters
	   Parameter data types
	   Order of parameter data types
	
	   Return type alone cannot be used for method overloading.
 */


public class MethodOverloadingDemo {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();

		System.out.println(calculator.add(10, 20));

		System.out.println(calculator.add(10, 20, 30));

		System.out.println(calculator.add(10.5, 20.5));
	}
}

class Calculator {

	// Method 1
	int add(int a, int b) {
		return a + b;
	}

	// Method 2
	int add(int a, int b, int c) {
		return a + b + c;
	}

	// Method 3
	double add(double a, double b) {
		return a + b;
	}
	
	int add(int a, double price) {
		return a + (int) price;
	}
	
	int add(double a, int price) {
		return (int) a +  price;
	}
}
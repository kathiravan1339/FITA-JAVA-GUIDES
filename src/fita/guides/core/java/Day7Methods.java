package fita.guides.core.java;

public class Day7Methods {

	private int a = 10; // global
	private static int number = 10; // static instance var

	public static void main(String[] args) {

		// =====================================================
		// 1. CALLING A SIMPLE METHOD
		// =====================================================

		System.out.println("----- SIMPLE METHOD -----");

		sayHello();

		// =====================================================
		// 2. METHOD WITH PARAMETER
		// =====================================================

		System.out.println("\n----- METHOD WITH PARAMETER -----");

		greetUser("Kathiravan");
		greetUser("Arun");

		// =====================================================
		// 3. METHOD WITH MULTIPLE PARAMETERS
		// =====================================================

		System.out.println("\n----- MULTIPLE PARAMETERS -----");

		addNumbers(10, 20, "fcxcghjcv ");

		// =====================================================
		// 4. METHOD WITH RETURN VALUE
		// =====================================================

		System.out.println("\n----- RETURN VALUE -----");

		int result = add(10, 20);

		System.out.println("Result = " + result);

		// =====================================================
		// 5. METHOD RETURNING STRING
		// =====================================================

		System.out.println("\n----- STRING RETURN VALUE -----");

		String message = getMessage();

		System.out.println(message);

		// =====================================================
		// 6. METHOD WITH PARAMETERS AND RETURN VALUE
		// =====================================================

		System.out.println("\n----- PARAMETERS + RETURN VALUE -----");

		int total = calculateTotal(100, 200);

		System.out.println("Total = " + total);

		// =====================================================
		// 7. METHOD FOR EVEN / ODD
		// =====================================================

		System.out.println("\n----- EVEN / ODD METHOD -----");

		checkEvenOdd(10);
		checkEvenOdd(15);

		// =====================================================
		// 8. METHOD FOR FINDING LARGER NUMBER
		// =====================================================

		System.out.println("\n----- LARGER NUMBER -----");

		int largest = findLargest(25, 40);

		System.out.println("Largest = " + largest);

		// =====================================================
		// 9. METHOD OVERLOADING //
		// =====================================================

		System.out.println("\n----- METHOD OVERLOADING -----");

		System.out.println(add(10, 20));

		System.out.println(add(10, 20, 30));

		System.out.println(add(10.5, 20.5));

		// =====================================================
		// 10. PASS BY VALUE - PRIMITIVE
		// =====================================================

		System.out.println("\n----- PASS BY VALUE -----");

		System.out.println("Before method call = " + number);

		changeNumber();

		System.out.println("After method call  = " + number);
	}

	// =========================================================
	// METHOD 1: NO PARAMETER + NO RETURN VALUE
	// =========================================================

	static void sayHello() {

		System.out.println("Hello, Java!");
	}

	// =========================================================
	// METHOD 2: PARAMETER + NO RETURN VALUE
	// =========================================================

	static void greetUser(String name) {

		System.out.println("Hello " + name);
	}

	// =========================================================
	// METHOD 3: MULTIPLE PARAMETERS + NO RETURN VALUE
	// =========================================================

	static void addNumbers(int a, int b, String string) {

		int result = a + b;

		System.out.println(string + " stringSum = " + result);
	}

	// =========================================================
	// METHOD 4: NO PARAMETER + RETURN VALUE
	// =========================================================

	static String getMessage() {

		return "Welcome to Java Programming";
	}

	// =========================================================
	// METHOD 5: PARAMETERS + RETURN VALUE
	// =========================================================

	static int add1(int a, int b) {

		return a + b;
	}

	// =========================================================
	// METHOD 6: CALCULATE TOTAL
	// =========================================================

	static int calculateTotal(int price, int quantity) {

		return price * quantity;
	}

	// =========================================================
	// METHOD 7: EVEN / ODD
	// =========================================================

	static void checkEvenOdd(int number) {

		if (number % 2 == 0) {

			System.out.println(number + " is Even");

		} else {

			System.out.println(number + " is Odd");
		}
	}

	// =========================================================
	// METHOD 8: FIND LARGER NUMBER
	// =========================================================

	static int findLargest(int a, int b) {

		if (a > b) {
			return a;
		}

		return b;
	}

	// =========================================================
	// METHOD OVERLOADING - 2 PARAMETERS
	// =========================================================

	static int add(int a, int b) {

		return a + b;
	}

	// =========================================================
	// METHOD OVERLOADING - 3 PARAMETERS
	// =========================================================

	static int add(int a, int b, int c) {

		return a + b + c;
	}

	// =========================================================
	// METHOD OVERLOADING - DIFFERENT DATA TYPES
	// =========================================================

	static double add(double a, double b) {

		return a + b;
	}

	// =========================================================
	// PASS BY VALUE
	// =========================================================

	static int changeNumber() {

		number = 100;

		System.out.println("Inside method = " + number);

		return number;
	}

}

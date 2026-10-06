package fita.guides.core.java;

public class Day4BitwiseAndCasting {

	public static void main(String[] args) {

		// =====================================================
		// PART 1: BITWISE OPERATORS
		// =====================================================

		int a = 5; // Binary: 0101
		int b = 3; // Binary: 0011

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// Bitwise AND (&) The Bitwise AND operator compares two numbers bit by bit. "It returns 1 only if both bits are 1. If any of the bits are 0, the result is 0."
		// 0101
		// 0011
		// ----
		// 0001 = 1
		System.out.println("a & b = " + (a & b));

		// Bitwise OR (|) The Bitwise OR operator compares two numbers bit by bit. "It returns 1 if at least one of the bits is 1. It only returns 0 if both bits are 0."
		// 0101
		// 0011
		// ----
		// 0111 = 7
		System.out.println("a | b = " + (a | b));

		// Bitwise XOR (^) The XOR operator compares two numbers bit by bit. "It returns 1 if the bits are different, and 0 if the bits are the same".
		// 0101
		// 0011
		// ----
		// 0110 = 6
		System.out.println("a ^ b = " + (a ^ b));

		// Bitwise NOT (~)
		// Changes 0 -> 1 and 1 -> 0
		System.out.println("~a = " + (~a));

		// =====================================================
		// PART 2: LEFT SHIFT AND RIGHT SHIFT
		// =====================================================

		int x = 5; // Binary: 0101

		// Left Shift
		// 0101 << 1
		// 1010 = 10
		System.out.println("x << 1 = " + (x << 2)); // << means * by 2

		// Right Shift
		// 0101 >> 1
		// 0010 = 2
		System.out.println("x >> 1 = " + (x >> 1)); // >> means / by 2

		// Unsigned Right Shift
		System.out.println("x >>> 1 = " + (x >>> 1)); //  means % by 2

		
		// =====================================================
		// PART 3: TYPE CASTING
		// =====================================================

		// -----------------------------------------------------
		// Widening Casting
		// Smaller data type -> Larger data type
		// Done automatically by Java // byte short int long float double char
		// -----------------------------------------------------

		int number = 100;

		long longNumber = number;

		System.out.println("\nWidening Casting:");
		System.out.println("int value  = " + number);
		System.out.println("long value = " + longNumber);

		// -----------------------------------------------------
		// Narrowing Casting
		// Larger data type -> Smaller data type
		// Must be done manually
		// -----------------------------------------------------

		double price = 99.99;

		int intPrice = (int) price;

		System.out.println("\nNarrowing Casting:");
		System.out.println("double value = " + price);
		System.out.println("int value    = " + intPrice);

		// =====================================================
		// PART 4: CHARACTER TO INTEGER
		// =====================================================

		char ch = 'A';

		int asciiValue = ch;

		System.out.println("\nCharacter Casting:");
		System.out.println("Character = " + ch);
		System.out.println("ASCII value = " + asciiValue);

		// =====================================================
		// PART 5: INTEGER TO CHARACTER
		// =====================================================

		int value = 66;

		char character = (char) value;

		System.out.println("\nInteger to Character:");
		System.out.println("Integer = " + value);
		System.out.println("Character = " + character);

		// =====================================================
		// PART 6: DATA LOSS DURING NARROWING
		// =====================================================

		double salary = 45000.75;

		int salaryInt = (int) salary;

		System.out.println("\nData Loss Example:");
		System.out.println("Original double = " + salary);
		System.out.println("After casting   = " + salaryInt);

		// =====================================================
		// PART 7: PRACTICAL BITWISE EXAMPLE
		// =====================================================

		int permission = 5;

		/*
		 * 5 = 0101
		 * 1 = 0001
		 * 2 = 0010
		 * 4 = 0100
		 * Assume: 1 = READ 2 = WRITE 4 = EXECUTE
		 */

		int READ = 1;
		int WRITE = 2;
		int EXECUTE = 4;

		System.out.println("\nPermission Example:");

		// Check READ permission
		if ((permission & READ) != 0) {
			System.out.println(permission + " & " + READ + " = " + (permission & READ) + " READ permission available");
		}

		// Check WRITE permission
		if ((permission & WRITE) != 0) {
			System.out.println(permission + " & " + WRITE + " = " + (permission & WRITE) + " WRITE permission available");
		} else {
			System.out.println(permission + " & " + WRITE + " = " + (permission & WRITE) + " WRITE permission NOT available");
		}

		// Check EXECUTE permission
		if ((permission & EXECUTE) != 0) {
			System.out.println(permission + " & " + EXECUTE + " = " + (permission & EXECUTE) + " EXECUTE permission available");
		}
	}
}

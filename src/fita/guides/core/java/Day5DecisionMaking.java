package fita.guides.core.java;


public class Day5DecisionMaking {

	public static void main(String[] args) {
		
		String str;

		// =====================================================
		// 1. SIMPLE IF
		// =====================================================

		System.out.println("----- SIMPLE IF -----");

		int age = 20;

		if (age >= 18) {
			System.out.println("You are eligible to vote.");
		}

		// =====================================================
		// 2. IF - ELSE
		// =====================================================

		System.out.println("\n----- IF - ELSE -----");

		int mark = 20;

		if (mark >= 35) {
			System.out.println("Student Passed");
		} else {
			System.out.println("Student Failed");
		}

		// =====================================================
		// 3. IF - ELSE IF - ELSE
		// =====================================================

		System.out.println("\n----- IF - ELSE IF - ELSE -----");

		int score = 82;

		if (score >= 90) {
			System.out.println("Grade A+");
		} else if (score >= 80) {
			System.out.println("Grade A");
		} else if (score >= 70) {
			System.out.println("Grade B");
		} else if (score >= 60) {
			System.out.println("Grade C");
		} else if (score >= 35) {
			System.out.println("Grade D");
		} else {
			System.out.println("Fail");
		}

		// =====================================================
		// 4. NESTED IF
		// =====================================================

		System.out.println("\n----- NESTED IF -----");

		int studentAge = 20;
		boolean hasIdCard = true;

		if (studentAge >= 18) {

			if (hasIdCard) {
				System.out.println("Student is allowed to enter.");
			} else {
				System.out.println("ID card is required.");
			}

		} else {
			System.out.println("Student is under 18.");
		}

		// =====================================================
		// 5. MULTIPLE CONDITIONS USING && AND ||
		// =====================================================

		System.out.println("\n----- MULTIPLE CONDITIONS -----");

		int userAge = 25;
		boolean hasDrivingLicense = true;

		if (userAge >= 18 && hasDrivingLicense) {
			System.out.println("You can drive.");
		} else {
			System.out.println("You cannot drive.");
		}

		// OR (||)

		boolean hasEmail = false;
		boolean hasPhone = true;

		if (hasEmail || hasPhone) {
			System.out.println("Contact information available.");
		} else {
			System.out.println("No contact information.");
		}

		// =====================================================
		// 6. SWITCH
		// =====================================================

		System.out.println("\n----- SWITCH -----");

		int day = 3;

		switch (day) {

		case 1: 
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednesday");
			break;

		case 4:
			System.out.println("Thursday");
			break;

		case 5:
			System.out.println("Friday");
			break;

		default:
			System.out.println("Invalid day");
		}

		// =====================================================
		// 7. SWITCH - MENU EXAMPLE
		// =====================================================

		System.out.println("\n----- SWITCH MENU EXAMPLE -----");

		int option = 2;

		switch (option) {

		case 1:
			System.out.println("Add User");
			break;

		case 2:
			System.out.println("View User");
			break;

		case 3:
			System.out.println("Delete User");
			break;

		case 4:
			System.out.println("Exit");
			break;

		default:
			System.out.println("Invalid option");
		}

		// =====================================================
		// 8. PRACTICAL LOGIN EXAMPLE
		// =====================================================

		System.out.println("\n----- LOGIN EXAMPLE -----");

		String username = "admin";
		String password = "admin123";

		String enteredUsername = "admin";
		String enteredPassword = "admin123";

		if (username.equals(enteredUsername) && password.equals(enteredPassword)) {

			System.out.println("Login successful.");

		} else {

			System.out.println("Invalid username or password.");
		}

		// =====================================================
		// 9. PRACTICAL EVEN / ODD EXAMPLE
		// =====================================================

		System.out.println("\n----- EVEN / ODD -----");

		int number = 17;

		if ((number % 2) == 0) {
			System.out.println(number + " is Even");
		} else {
			System.out.println(number + " is Odd");
		}

		// =====================================================
		// 10. TERNARY OPERATOR // (condition) ?  1st result : 2nd result; 
		// =====================================================

		System.out.println("\n----- TERNARY OPERATOR -----");

		int ageValue = 22;

		String result = ageValue >= 18 ? "Eligible" : "Not Eligible";

		System.out.println(result);
	}
}

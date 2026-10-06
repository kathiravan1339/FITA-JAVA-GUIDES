package fita.guides.core.java;

public class Day3Operators {

	public static void main(String[] args) {

		// =====================================================
		// 1. ARITHMETIC OPERATORS
		// =====================================================

		int a = 10;
		int b = 3;

		System.out.println("----- ARITHMETIC OPERATORS -----");

		System.out.println("a + b = " + (a + b)); // Addition
		System.out.println("a - b = " + (a - b)); // Subtraction
		System.out.println("a * b = " + (a * b)); // Multiplication
		System.out.println("a / b = " + (a / b)); // Division
		System.out.println("a % b = " + (a % b)); // Remainder

		// =====================================================
		// 2. ASSIGNMENT OPERATORS
		// =====================================================

		System.out.println("\n----- ASSIGNMENT OPERATORS -----");

		int x = 10;

		System.out.println("Initial x = " + x);

		x += 5; // x = x + 5
		System.out.println("After x += 5 : " + x);

		x -= 3; // x = x - 3
		System.out.println("After x -= 3 : " + x);

		x *= 2; // x = x * 2
		System.out.println("After x *= 2 : " + x);

		x /= 4; // x = x / 4
		System.out.println("After x /= 4 : " + x);

		x %= 3; // x = x % 3
		System.out.println("After x %= 3 : " + x);

		// =====================================================
		// 3. RELATIONAL OPERATORS
		// =====================================================

		System.out.println("\n----- RELATIONAL OPERATORS -----");

		int age = 25;
		int requiredAge = 18;

		System.out.println("age == requiredAge : " + (age == requiredAge));
		System.out.println("age != requiredAge : " + (age != requiredAge));
		System.out.println("age > requiredAge  : " + (age > requiredAge));
		System.out.println("age < requiredAge  : " + (age < requiredAge));
		System.out.println("age >= requiredAge : " + (age >= requiredAge));
		System.out.println("age <= requiredAge : " + (age <= requiredAge));

		// =====================================================
		// 4. LOGICAL OPERATORS
		// =====================================================

		System.out.println("\n----- LOGICAL OPERATORS -----");

		int studentAge = 22;
		boolean hasIdCard = true;

		// AND (&&)
		boolean canEnter = studentAge >= 18 && hasIdCard;
		//T F = F
		//F T = F
		//F F = F
		//T T = T

		System.out.println("Can enter = " + canEnter);

		// OR (||)
		boolean hasEmail = false;
		boolean hasPhone = true;

		boolean canContact = hasEmail || hasPhone;
		// T F = T
		// F T = T
		// F F = F
		// T T = T

		System.out.println("Can contact = " + canContact);

		// NOT (!)
		boolean isLoggedIn = false;
		
		String str = ""; // "" , " ", null, "vfcrd56t7fug9hcobihbhxn"
		
		if(str != null && !str.isBlank()) {
			System.out.println(str.length());
		} else {
			System.out.println("value is null");
		}
		

		System.out.println("isLoggedIn = " + isLoggedIn);
		System.out.println("!isLoggedIn = " + !isLoggedIn);

		// =====================================================
		// 5. PRACTICAL EXAMPLE - STUDENT RESULT
		// =====================================================

		System.out.println("\n----- PRACTICAL EXAMPLE -----");

		int mark1 = 99;
		int mark2 = 99;
		int mark3 = 33;

		int total = mark1 + mark2 + mark3;

		double average = total / 3.0;

		System.out.println("Total = " + total);
		System.out.println("Average = " + average);

		boolean pass = mark1 >= 35 && mark2 >= 35 && mark3 >= 35;

		System.out.println("Student Passed = " + pass);

		// =====================================================
		// 6. PRACTICAL EXAMPLE - LOGIN
		// =====================================================

		System.out.println("\n----- LOGIN EXAMPLE -----");

		String username = "admin"; // DB 
		String password = "admin123"; // DB

		String enteredUsername = "admin";
		String enteredPassword = "admin123";

		boolean usernameCorrect = username.equals(enteredUsername);

		boolean passwordCorrect = password.equals(enteredPassword);

		boolean loginSuccess = usernameCorrect && passwordCorrect;

		System.out.println("Username correct = " + usernameCorrect);
		System.out.println("Password correct = " + passwordCorrect);
		System.out.println("Login Success = " + loginSuccess);

		// =====================================================
		// 7. INCREMENT AND DECREMENT
		// =====================================================

		System.out.println("\n----- INCREMENT / DECREMENT -----");

		int count = 5;

		System.out.println("Initial count = " + count);

		count++;
		System.out.println("After count++ = " + count);

		count--;
		System.out.println("After count-- = " + count);

		// =====================================================
		// 8. PRE-INCREMENT VS POST-INCREMENT
		// =====================================================

		System.out.println("\n----- PRE / POST INCREMENT -----");

		int p = 10;
		
		System.out.println("p++ = " + p++); // 11 but print here only 10
		p--;
		System.out.println("After p++ = " + p++); // 12 but print here only 11
		System.out.println("After p++ = " + p);


		int q = 10;

		System.out.println("decfvgrbtyujnhtbgtr"  + ++q);
		System.out.println("After ++q = " + q);
		
		int s = 10;

		System.out.println("p-- = " + s--);
		System.out.println("After p-- = " + s);

		int s1 = 10;

		System.out.println("--q = " + --s1);
		System.out.println("After --q = " + s1);
	}
}

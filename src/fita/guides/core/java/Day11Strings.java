package fita.guides.core.java;

public class Day11Strings {

	public static void main(String[] args) {

		// =====================================================
		// 1. CREATING A STRING
		// =====================================================

		String name = "Kathiravan";

		System.out.println("Name = " + name);

		// =====================================================
		// 2. STRING LENGTH // int
		// =====================================================

		System.out.println("\n----- LENGTH -----");

		System.out.println("Length = " + name.length());

		// =====================================================
		// 3. TO UPPERCASE / LOWERCASE // str
		// =====================================================

		System.out.println("\n----- CASE CONVERSION -----");

		System.out.println("Uppercase = " + name.toUpperCase());
		System.out.println("Lowercase = " + name.toLowerCase());

		// =====================================================
		// 4. charAt() // char
		// =====================================================

		System.out.println("\n----- charAt() -----");

		String city = "Chennai";

		System.out.println("First character = " + city.charAt(0));
		System.out.println("Second character = " + city.charAt(1));
		System.out.println("Last character = " + city.charAt(city.length() - 1));

		// =====================================================
		// 5. concat() // str
		// =====================================================

		System.out.println("\n----- concat() -----");

		String firstName = "Java";
		String lastName = "Developer";

		String fullName = firstName.concat(" " + lastName).toLowerCase();

		System.out.println("Full Name = " + fullName);

		// =====================================================
		// 6. + OPERATOR WITH STRING // str
		// =====================================================

		System.out.println("\n----- STRING + OPERATOR -----");

		String course = "Java";

		String message = "I am learning " + course;

		System.out.println(message);

		// =====================================================
		// 7. equals() // boolean
		// =====================================================

		System.out.println("\n----- equals() -----");

		String username = "admin";

		System.out.println(username.equals("admin"));

		System.out.println(username.equals("Admin"));

		// =====================================================
		// 8. equalsIgnoreCase() // boolean
		// =====================================================

		System.out.println("\n----- equalsIgnoreCase() -----");

		String userInput = "ADMIN";

		System.out.println(username.equalsIgnoreCase(userInput));

		// =====================================================
		// 9. contains() // boolean
		// =====================================================

		System.out.println("\n----- contains() -----");

		String email = "kathiravan@gmail.com";

		System.out.println(email.contains("@"));

		System.out.println(email.contains("gmail"));

		// =====================================================
		// 10. startsWith() AND endsWith() // boolean
		// =====================================================

		System.out.println("\n----- startsWith() / endsWith() -----");

		String fileName = "student.pdf";

		System.out.println("Starts with student = " + fileName.startsWith("student"));

		System.out.println("Ends with .pdf = " + fileName.endsWith(".pdf"));

		// =====================================================
		// 11. substring() // str
		// =====================================================

		System.out.println("\n----- substring() -----");

		String language = "Java Programming, python, php";

		System.out.println(language.substring(0, 4));

		System.out.println(language.substring(5));

		// =====================================================
		// 12. indexOf() // int
		// =====================================================

		System.out.println("\n----- indexOf() -----");

		String text = "Java Programming";

		System.out.println("Index of J = " + text.indexOf('J'));

		System.out.println("Index of Programming = " + text.indexOf("Programming"));

		// =====================================================
		// 13. replace() // str
		// =====================================================

		System.out.println("\n----- replace() -----");

		String sentence = "I like Java";

		String newSentence = sentence.replace("Java", "Spring Boot");

		System.out.println("Original = " + sentence);
		System.out.println("New      = " + newSentence);

		// =====================================================
		// 14. trim() // str without starting and ending white space.
		// =====================================================

		System.out.println("\n----- trim() -----");

		String value = "   Java Developer also spring boot  ";

		System.out.println("Before trim = [" + value + "]");

		System.out.println("After trim  = [" + value.trim() + "]");

		// =====================================================
		// 15. isEmpty() // boolean
		// =====================================================

		System.out.println("\n----- isEmpty() -----");

		String emptyValue = "";

		System.out.println("Is empty = " + emptyValue.isEmpty());

		// =====================================================
		// 16. PRACTICAL LOGIN EXAMPLE
		// =====================================================

		System.out.println("\n----- LOGIN EXAMPLE -----");

		String correctUsername = "admin";
		String correctPassword = "admin123";

		String enteredUsername = "admin";
		String enteredPassword = "admin123";

		if (correctUsername.equals(enteredUsername) && correctPassword.equals(enteredPassword)) {

			System.out.println("Login successful");

		} else {

			System.out.println("Invalid username or password");
		}

		// =====================================================
		// 17. PRACTICAL EMAIL VALIDATION
		// =====================================================

		System.out.println("\n----- EMAIL VALIDATION -----");

		String inputEmail = "student@gmail.com";

		if (inputEmail.endsWith(".com") && inputEmail.contains("@")) {

			System.out.println("Valid email format");

		} else {

			System.out.println("Invalid email format");
		}

		// =====================================================
		// 18. LOOP THROUGH STRING
		// =====================================================

		System.out.println("\n----- LOOP THROUGH STRING -----");

		String word = "JAVA"; // 4 
        
		// 0 < 3 
		// 1 < 3
		// 2 < 3
		// 3 < 3
		
		for (int i = 0; i < word.length() - 1; i++) {

			System.out.println("Character at " + i + " = " + word.charAt(i));
		}
		
		
		
		
		
	}
}

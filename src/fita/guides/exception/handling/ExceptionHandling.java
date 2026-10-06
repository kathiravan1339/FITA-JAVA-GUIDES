package fita.guides.exception.handling;

public class ExceptionHandling {

	public static void main(String[] args) {

		// 1. Simple try-catch
		
		try {

			int a = 10;
			int b = 0;

			int result = a / b;

			System.out.println("Result = " + result);

		} catch (ArithmeticException e) {

			System.out.println("Cannot divide by zero");
		}

		System.out.println("----------------------");

		// 2. ArrayIndexOutOfBoundsException
		try {

			int[] numbers = { 10, 20, 30 };

			System.out.println(numbers[5]);

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Invalid array index");
		}

		System.out.println("----------------------");

		// 3. NumberFormatException
		try {

			String value = "ABC";

			int number = Integer.parseInt(value);

			System.out.println(number);

		} catch (NumberFormatException e) {

			System.out.println("Invalid number format");
		}

		System.out.println("----------------------");

		// 4. Multiple catch blocks
		try {

			int[] numbers1 = { 10, 20, 30, 20, 30, 30};

			int result3 = numbers1[5] / 0;

			System.out.println(result3);

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Array index is invalid");

		} catch (ArithmeticException e) {

			System.out.println("Cannot divide by zero");

		} catch (Exception e) {

			System.out.println("Some other exception occurred");
		}

		System.out.println("----------------------");

		// 5. finally block
		try {

			int result2 = 10 / 2;

			System.out.println("Result = " + result2);

		} catch (ArithmeticException e) {

			System.out.println("Arithmetic error");

		} finally {

			System.out.println("Finally block executed");
		}

		System.out.println("----------------------");

		// 6. try-catch-finally with exception
		try {

			int result1 = 10 / 0;

			System.out.println(result1);
			
			// JDBC cont
			
			// prepare query
			
			// run
			
			// result set
			
			// load on the array or string
			
			// return

		} catch (ArithmeticException e) {
			System.out.println("Exception handled");
		} finally {
            // JDBC connection close
			System.out.println("This will always execute");
		}

		System.out.println("----------------------");

		// 7. Using getMessage()
		try {

			int number4 = 10 / 0;

		} catch (Exception e) {

			String str = e.getMessage();
			System.out.println("Exception: " + str);
		}

		System.out.println("----------------------");

		// 8. Using printStackTrace()
		try {

			int number5 = 10 / 0;

		} catch (ArithmeticException e) {

			System.out.println("Exception occurred");

			// Displays exception details
			//e.printStackTrace();
		}

		System.out.println("----------------------");

		// 9. Practical example - Login
		String username = "admin@123";
		String password = "1234";

		try {

			if (!username.equals("admin")) {
				throw new Exception("Invalid username");
			}

			if (!password.equals("1234")) {
				throw new Exception("Invalid password");
			}

			System.out.println("Login successful");

		} catch (Exception e) {

			System.out.println("Login failed: " + e.getMessage());
		}

		System.out.println("----------------------");
		
		
//		 The 'throw' Keyword : 
//		The throw keyword manually halts the normal flow of the program and passes the exception object to the Java runtime.
//		It is commonly used to enforce business logic or validate inputs
		
//		
//		 The throws Keyword
//		 The throws keyword does not actually throw an exception itself. 
//		 Instead, it acts as a compiler warning. 
//		 If a method runs code that could produce a checked exception (like file or network issues), 
//		 the method must either handle it with a try-catch block or list it using throws to delegate the responsibility to whatever calls that method.

//		public void myMethod() throws IOException, SQLException {
//		    // Code that might cause these exceptions
//		}
		
		
		// 10. Method that throws an exception
		try {

			checkAge(15);
			
			// validate entire form
			// validate resume.5MP
            // ph num
			// mail
			
			// validate name
			chackName(null);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

	private static void chackName(String name) {
		name = null;
		name.charAt(1);
		System.out.println(name.substring(3));
	}

	// Method using throw
	static void checkAge(int age) throws Exception {

		if (age < 18) {

			throw new Exception("Age must be 18 or above");
		}

		System.out.println("Eligible");
	}
	
	
	
	
	
	
	
	
}
package fita.guides.exercise.task;

import java.util.Scanner; // Step 1: Import the Scanner class

public class Main {
	public static void main(String[] args) {
		// Step 2: Create a Scanner object connected to the keyboard (System.in)
		Scanner scanner = new Scanner(System.in);

		// Step 3: Prompt the user and read a String (text)
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();

		// Step 4: Prompt the user and read an int (integer)
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();

		// Step 5: Use the input
		System.out.println("Hello " + name + "! You are " + age + " years old.");

//		int arr[] = new int[5];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = scanner.nextInt();
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

		String[][][] cenipolly = new String[3][][]; // 3D
		
		cenipolly[0] = new String[4][6];
		cenipolly[1] = new String[10][19];
		cenipolly[2] = new String[5][10];

		for (String[][] screen : cenipolly) { // for each

			for (String[] row : screen) {

				for (String seat : row) {
					System.out.print(seat + " "); // using print for same line
				}
				System.out.println();
			}

			System.out.println();
		}

		System.out.print("Enter seat count : ");
		int seatCount = scanner.nextInt();

		for (int i = 1; i <= seatCount; i++) {
			
			System.out.print("Enter Screen number : ");
			int scrn = scanner.nextInt();
			
			System.out.print("Enter row number : ");
			int rw = scanner.nextInt();
			
			System.out.print("Enter seat number : ");
			int st = scanner.nextInt();

			scanner.nextLine();
			
			System.out.print("Enter viwer name : ");
			String viewer = scanner.nextLine();

			cenipolly[scrn][rw][st] = viewer;
			
			System.out.println("Ticket : " + scrn + " " + rw + " " + st);
		}
		
		System.out.println("------------------------------------");

		for (String[][] screen : cenipolly) {
			for (String[] row : screen) {
				for (String seat : row) {
					System.out.print(seat + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

		// Step 6: Close the scanner to free resources
		scanner.close();
	}
}

/*


• scanner.nextLine() – Reads a full line of text (String).
• scanner.next() – Reads a single word (stops at the first space).
• scanner.nextInt() – Reads a whole number (integer).
• scanner.nextDouble() – Reads a decimal number.

⚠️ A Common Beginner Trap

If you use nextInt() or nextDouble() and then immediately use nextLine() right after, 
the program might skip the text input. 
This happens because the number-reading methods leave behind a "hidden" newline character in the stream.
To fix this, simply add an extra, empty scanner.nextLine(); to clear the buffer before reading your actual text:

int age = scanner.nextInt(); 
scanner.nextLine(); // Clear the hidden newline character from the buffer
String city = scanner.nextLine(); // Now this will successfully wait for input


*/
package fita.guides.core.java;

public class Day6Loops {

    public static void main(String[] args) {

        // =====================================================
        // 1. WHY DO WE NEED LOOPS?
        // =====================================================

        System.out.println("----- WITHOUT LOOP -----");

        System.out.println("Java");
        System.out.println("Java");
        System.out.println("Java");
        System.out.println("Java");
        System.out.println("Java");


        // =====================================================
        // 2. FOR LOOP
        // =====================================================

        System.out.println("\n----- FOR LOOP -----");
        
        // init(assigning but declation is optional) ; condition : incr OR decr

        for (int i = 1; i <= 5; i++) {
            System.out.println("Java " + i);
        }


        // =====================================================
        // 3. PRINT NUMBERS 1 TO 10
        // =====================================================

        System.out.println("\n----- NUMBERS 1 TO 10 -----");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        // =====================================================
        // 4. PRINT EVEN NUMBERS
        // =====================================================

        System.out.println("\n----- EVEN NUMBERS -----");

        for (int i = 1; i <= 10; i++) {
            int reminder = (i % 2);
            if (reminder == 0) {
                System.out.println(i);
            }
        }


        // =====================================================
        // 5. PRINT ODD NUMBERS
        // =====================================================

        System.out.println("\n----- ODD NUMBERS -----");

        for (int i = 1; i <= 10; i++) {
            if ((i % 2) != 0) {
                System.out.println(i);
            }
        }


        // =====================================================
        // 6. SUM OF NUMBERS
        // =====================================================

        System.out.println("\n----- SUM OF NUMBERS -----");

        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            sum += i; // OR sum = sum + i;
        }

        System.out.println("Sum = " + sum);


        // =====================================================
        // 7. WHILE LOOP
        // =====================================================

        System.out.println("\n----- WHILE LOOP -----");

        int count = 15;

        while (count <= 20) {

            System.out.println(count);

            count++; //placed in the method last line
        }


        // =====================================================
        // 8. WHILE LOOP - PASSWORD ATTEMPT EXAMPLE
        // =====================================================

        System.out.println("\n----- WHILE LOOP PRACTICAL EXAMPLE -----");

        int attempts = 3;

        while (attempts >= 1) {

            System.out.println("Login attempt: " + attempts);

            attempts--;
        }


        // =====================================================
        // 9. DO-WHILE LOOP
        // =====================================================

        System.out.println("\n----- DO-WHILE LOOP -----");

        int number = 1;

        do {

            System.out.println(number);

            number++;

        } while (number <= 5);
        
        
        
        boolean flag; // default false
        do {
        	boolean isItSynch = true; // true means done. // dynamic result
            flag = isItSynch;
        } while (!flag);


        // =====================================================
        // 10. IMPORTANT DIFFERENCE
        // =====================================================

        System.out.println("\n----- DO-WHILE EXAMPLE -----");

        int value = 10;

        do {

            System.out.println("This will execute once.");

            value++;

        } while (value <= 5);


        // =====================================================
        // 11. BREAK
        // =====================================================

        System.out.println("\n----- BREAK -----");

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                break;
            }

            System.out.println(i);
        }


        // =====================================================
        // 12. CONTINUE
        // =====================================================

        System.out.println("\n----- CONTINUE -----");

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue;
            }

            System.out.println(i);
        }


        // =====================================================
        // 13. REVERSE LOOP
        // =====================================================

        System.out.println("\n----- REVERSE LOOP -----");

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }


        // =====================================================
        // 14. MULTIPLICATION TABLE
        // =====================================================

        System.out.println("\n----- MULTIPLICATION TABLE -----");

        int bal = 5;

        for (int i = 1; i <= 10; i++) {

            System.out.println( bal + " + " + i + " = " + (bal + i) );
        }


        // =====================================================
        // 15. NESTED LOOP
        // =====================================================

        System.out.println("\n----- NESTED LOOP -----");

        for (int row = 1; row <= 3; row++) {

        	//this will execute until inner loop is done.
            for (int column = 1; column <= 3; column++) {

                System.out.print("* ");
            }

            System.out.println();
        }
        
        
        
    }
}


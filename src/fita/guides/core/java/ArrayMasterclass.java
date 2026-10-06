package fita.guides.core.java;

public class ArrayMasterclass {

    public static void main(String[] args) {
        System.out.println("=== STARTING 1-HOUR JAVA ARRAY MASTERCLASS ===");

        // ==========================================
        // TOPIC 1: Declaration & Grid Visualization
        // ==========================================
        printSectionHeader("1. DECLARATION & INITIALIZATION");
        
        // Method A: Fixed grid dimension up front
        int[][] emptyGrid = new int[3][4]; // 3 rows, 4 columns
        System.out.println("Created an empty " + emptyGrid.length + "x" + emptyGrid[0].length + " matrix.");

        // Method B: Inline literal definition (Visualizing data as rows and columns)
        int[][] seatingChart = {
            {10, 11, 12}, // Row A
            {20, 21, 22}, // Row B
            {30, 31, 32}  // Row C
        };
        System.out.println("Initialized literal 'seatingChart' matrix successfully.");


        // ==========================================
        // TOPIC 2: Accessing & Modifying (0-Indexed)
        // ==========================================
        printSectionHeader("2. DATA MANIPULATION (0-INDEXED)");
        
        // Reading value
        int targetValue = seatingChart[1][2]; // Row 1, Column 2 -> Value 22
        System.out.println("Value at Row index 1, Column index 2 is: " + targetValue);

        // Modifying value
        System.out.println("Original value at [0][1]: " + seatingChart[0][1]);
        seatingChart[0][1] = 99; 
        System.out.println("Updated value at [0][1] (Changed to 99): " + seatingChart[0][1]);


        // ==========================================
        // TOPIC 3: Deep Dive into Iteration/Loops
        // ==========================================
        printSectionHeader("3. ITERATION METHODS");

        System.out.println("--- Method A: Nested Standard 'for' loops (Best for indexes) ---");
        for (int i = 0; i < seatingChart.length; i++) { // .length grabs row count
            for (int j = 0; j < seatingChart[i].length; j++) { // .length grabs column count for *this specific row*
                System.out.print("[" + i + "][" + j + "]=" + seatingChart[i][j] + "  ");
            }
            System.out.println(); // Line break per row
        }

        System.out.println("\n--- Method B: Nested Enhanced 'for-each' loops (Cleanest syntax) ---");
        for (int[] singleRow : seatingChart) { // Extracting the 1D sub-array first
            for (int individualElement : singleRow) { // Extracting values inside the sub-array
                System.out.print(individualElement + "\t");
            }
            System.out.println();
        }


        // ==========================================
        // TOPIC 4: Jagged (Irregular) Arrays
        // ==========================================
        printSectionHeader("4. JAGGED ARRAYS (ARRAYS OF UNEQUAL LENGTHS)");
        
        // Define row size, leave columns completely blank
        int[][] jaggedProfile = new int[3][];
        
        // Manually assign custom size arrays to each row pointer
        jaggedProfile[0] = new int[2]; // Row 0 has 2 columns
        jaggedProfile[1] = new int[5]; // Row 1 has 5 columns
        jaggedProfile[2] = new int[3]; // Row 2 has 3 columns

        // Populating the uneven structure
        int counter = 1;
        for (int r = 0; r < jaggedProfile.length; r++) {
            for (int c = 0; c < jaggedProfile[r].length; c++) {
                jaggedProfile[r][c] = counter++;
            }
        }

        // Displaying the jagged shape
        System.out.println("Printing uneven rows safely using .length property:");
        for (int[] row : jaggedProfile) {
            for (int item : row) { //1 2 , 3 4 5 6 7 , 8 9 10 
                System.out.print(item + " ");
            }
            System.out.println();
        }


        // ==========================================
        // TOPIC 5: Deep Multi-Dimensionality (3D Arrays)
        // ==========================================
        printSectionHeader("5. MULTI-DIMENSIONAL (3D ARRAY CUBE)");

        // Syntax: [Layers/Pages] [Rows] [Columns]
        // Analogy: A book with 2 pages, where each page has 3 rows and 3 columns of text.
        int[][][] spaceCube = {
            {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            }, // Layer 0
            {
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18}
            }  // Layer 1
        };
        
        String[][][] cenipolly = new String[3][][]; // 3D
        
        cenipolly[0] = new String[4][6];
        cenipolly[1] = new String[10][19];
        cenipolly[2] = new String[5][10];
        
        cenipolly[0][0][3] = "kathir";//

        cenipolly[1][4][9] = "ignatius";
        
        cenipolly[2][1][4] = "visa";
        
        for(String[][] screen : cenipolly) {
        	
        	for (String[] row : screen) {
        		
                for (String seat : row) { 
                    System.out.print(seat + " ");
                }
                
                System.out.println();
            }
        	System.out.println();
        }
        
        

        System.out.println("Accessing data points in a 3D coordinate map:");
        System.out.println("Value at Layer 1, Row 0, Column 2 -> " + spaceCube[1][0][2]); // Output: 12

        System.out.println("\nTraversing a entire 3D data space cleanly:");
        for (int screen = 0; screen < spaceCube.length; screen++) {
            System.out.println("--- Layer " + screen + " ---");
            for (int row = 0; row < spaceCube[screen].length; row++) {
                for (int col = 0; col < spaceCube[screen][row].length; col++) {
                    System.out.print(spaceCube[screen][row][col] + "\t");
                }
                System.out.println();
            }
        }
        
        printSectionHeader("CLASS ADJOURNED - CODE COMPLETION SUCCESSFUL");
    }

    /**
     * Helper utility method to organize the console outputs visually during the lesson.
     */
    private static void printSectionHeader(String heading) {
        System.out.println("\n========================================================");
        System.out.println(" " + heading);
        System.out.println("========================================================");
    }
}

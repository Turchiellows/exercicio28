// IMPORTS
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


public class Exercicio28 {
	public static void main(String[] args) {
		// =============================================================
		// INSTANTIATE
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		


		
		// =============================================================
		// DECLARATE
		int line				= 10;
		int col					= 10;
		int limit				= 100;
		int db[][]				= new int[line][col];
		ArrayList<Integer> overAverage		= new ArrayList<Integer>();
		int bigger				= 0;
		String biggerPosition			= "";
		int lesser				= 0;
		String lesserPosition			= "";
		int sumMatrix				= 0;
		int aveMatrix				= 0;
		int sumFirstColumn			= 0;
		int sumSecondColumn			= 0;
		int sumThirdColumn			= 0;
		int prodFirstLine			= 1;
		int sumMainDiagonal			= 0;
		int sumSecondaryDiagonal		= 0;

		


		
		// =============================================================
		// CREATE A RANDOM MATRIX
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < col; j++) {
				db[i][j] = rand.nextInt(limit);
			}
		}




		
		// =============================================================
		// SHOW MATRIX AND CALCULATE
		System.out.println("\n============================================");
		System.out.println("MATRIX");
		System.out.println("============================================");
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < col; j++) {
				// SHOW MATRIX
				// System.out.print(db[i][j] + " ");
				System.out.format("%-5s", Integer.toString(db[i][j]));
				
				
				
				// SUM ALL
				// D
				sumMatrix += db[i][j];
				
				
				
				// FIND BIGGER
				// G
				if (i == 0 && j == 0) {
					bigger		= db[i][j];
					biggerPosition	= "[" + Integer.toString(i) + "][" + Integer.toString(j) + "]";
				} else if (db[i][j] > bigger) {
					bigger		= db[i][j];
					biggerPosition	= "[" + Integer.toString(i) + "][" + Integer.toString(j) + "]";
				}
				
				
				
				// FIND LESSER
				// H
				if (i == 0 && j == 0) {
					lesser		= db[i][j];
					lesserPosition	= "[" + Integer.toString(i) + "][" + Integer.toString(j) + "]";
				} else if (db[i][j] < lesser) {
					lesser		= db[i][j];
					lesserPosition	= "[" + Integer.toString(i) + "][" + Integer.toString(j) + "]";
				}
				
				
				
				// SUM COLUMNS
				if (j == 0) {
					// A, B
					sumFirstColumn += db[i][j];
				} else if (j == 1) {
					// B
					sumSecondColumn += db[i][j];
				} else {
					// B
					sumThirdColumn += db[i][j];
				}
				
				
				
				// PRODUCT FIRST LINE
				// C
				if (i == 0) {
					prodFirstLine *= db[i][j];
				}
				
				
				
				// SUM MAIN DIAGONAL
				// I
				if (i == j) {
					sumMainDiagonal += db[i][j];
				}
				
				
				
				// SUM REVERSE DIAGONAL
				// J
				if (i == j) {
					sumSecondaryDiagonal += db[i][col - 1 -i];
				}	
			}
			
			// BREAK LINE
			System.out.println("");
		}
		
		
		
		// MATRIX AVERAGE
		// E
		aveMatrix = sumMatrix /(line * col);
		
		
		
		// FIND OVER AVERAGE
		// F
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < col; j++) {
				if (db[i][j] > aveMatrix) {
					overAverage.add(db[i][j]);
				}
			}
		}
		
		
		
		
				
				
		
		//==============================================================
		// ANSWERS
		System.out.println("\n\n============================================");
		System.out.println("A) - Sum first column: " + sumFirstColumn);
		System.out.println("============================================");
		
		System.out.println("============================================");
		System.out.println("B) - Sum second column: " + sumSecondColumn);
		System.out.println("============================================");
		
		System.out.println("============================================");
		System.out.println("B) - Sum third column: " + sumThirdColumn);
		System.out.println("============================================");
		
		System.out.println("============================================");
		System.out.println("C) - Prod first line: " + prodFirstLine);
		System.out.println("============================================");
		
		System.out.println("============================================");
		System.out.println("D) - Matrix sum: " + sumMatrix);
		System.out.println("============================================");
		
		System.out.println("============================================");
		System.out.println("E) - Matrix average: " + aveMatrix);
		System.out.println("============================================");
		
		System.out.println("============================================");
		System.out.print("F) - Matrix over average: ");
		for (int x : overAverage ) { 
			System.out.print(x + " ");
		    }
		System.out.println("\n============================================");
		
		System.out.println("============================================");
		System.out.println("G) - Matrix bigger: " + bigger + " at positiion " + biggerPosition);
		System.out.println("============================================");
		
		System.out.println("============================================");
		System.out.println("H) - Matrix lesser: " + lesser + " at positiion " + lesserPosition);
		System.out.println("============================================");
		
		System.out.println("============================================");
		System.out.println("I) - Sum main diagonal: " + sumMainDiagonal);
		System.out.println("============================================");
		
		System.out.println("============================================");
		System.out.println("J) - Sum secondary diagonal: " + sumSecondaryDiagonal);
		System.out.println("============================================");
	}
}

// IMPORTS

import java.util.Random;
import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		// INSTANTIATE
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		// DECLARATE
		int line = 3;
		int col = 3;
		int limit = 50;
		int db[][] = new int[line][col];

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < col; j++) {
				db[i][j] = rand.nextInt(limit);
			}
		}

		// SHOW DATA
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(db[i][j] + " ");
			}
			System.out.println("");
		}

	}
}

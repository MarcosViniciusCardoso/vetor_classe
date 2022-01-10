package Matriz;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int mat[][] = { { 5, -3, 10 }, { 15, 8, 2 }, { 7, 9, -4 } };

		for (int i = 0; i < mat.length; i++) {
			System.out.println(" ");
			for (int j = 0; j < mat.length; j++) {
				System.out.printf(" " + mat[i][j]);
			}
		}
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println("");
		System.out.println("Diagonal Principal");
		for (int i = 0; i < mat.length; i++) {
			System.out.println(mat[i][i]);
		}
		System.out.println("-------------------------------");
		System.out.println("Diagonal Secundária: ");

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (i + j == mat.length - 1) {
					System.out.println(mat[i][j]);
				}
			}
		}
		System.out.println("-------------------------------");
		int cont = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j] < 0) {
					cont++;
				}
			}
		}
		System.out.println("Quantos numero negativos tem: " + cont);
	}

}

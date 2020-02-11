package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Rows: ");
		int rows = sc.nextInt();
		System.out.print("Cols: ");
		int cols = sc.nextInt();

		System.out.println();

		int[][] vec = new int[rows][cols];

		System.out.println("Enter with " + (rows * cols) + " elements:");

		for (int i = 0; i != vec.length; i++) {

			for (int x = 0; x != vec[i].length; x++) {
				vec[i][x] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.println("Matrix: ");
		for (int i = 0; i != vec.length; i++) {
			for (int x = 0; x != vec[i].length; x++) {
				System.out.print(vec[i][x] + "  ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.print("Chose a number: ");
		int choice = sc.nextInt();
		boolean invalid = true;

		while (invalid) {
			for (int i = 0; i != vec.length && invalid == true; i++) {
				for (int x = 0; x != vec[i].length && invalid == true; x++) {
					if (vec[i][x] == choice)
						invalid = false;
				}
			}

			if (invalid == true) {
				System.out.println();
				System.out.print("Invalid number! \nChose a number: ");
				choice = sc.nextInt();
			}
		}

		System.out.println();
		
		for (int i = 0; i != vec.length; i++) {
			for (int x = 0; x != vec[i].length; x++) {
				if (choice == vec[i][x]) {
					
					System.out.println("Position: " + i + ", " + x +":");
					
					if (x > 0 ) 
						System.out.println("Right: " + vec[i][x - 1]);
					if ((x+1) < vec[i].length) 
						System.out.println("Left: " + vec[i][x + 1]);
					if (i > 0)				
						System.out.println("Top: " + vec[i - 1][x]);
					if ((i+1) < vec.length)
						System.out.println("Botton: " + vec[i + 1][x]);
					
					System.out.println("--------------------");
				}
			}
		}

		sc.close();
	}

}

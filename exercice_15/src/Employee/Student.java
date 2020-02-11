package Employee;

import java.util.Scanner;

public class Student {

	public String name = "";
	public double grade1, grade2, grade3 = 0;

	public void TotalGrade() {
		double finalGrade = grade1 + grade2 + grade3;
		if (finalGrade >= 60) {
			System.out.printf("FINAL GRADE = %.2f", finalGrade);
			System.out.println();
			System.out.println("PASS");
		} else {
			System.out.printf("FINAL GRADE = %.2f", finalGrade);
			System.out.println();
			System.out.printf("FAILED");
			System.out.println();
			System.out.println("MISSING " + String.format("%.2f", (60 - finalGrade)) + " POINTS");
		}

	}

	public void AddStudent() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.println("Grade between 0 and 100 (%)");
		System.out.print("1º Grade: ");
		grade1 = sc.nextDouble() * 0.30;
		System.out.print("2º Grade: ");
		grade2 = sc.nextDouble() * 0.35;
		System.out.print("3º Grade: ");
		grade3 = sc.nextDouble() * 0.35;

		sc.close();
	}

}

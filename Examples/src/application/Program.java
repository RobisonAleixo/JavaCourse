package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the measures of triangules X: ");
		Triangle x = new Triangle();
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangules Y: ");
		Triangle y = new Triangle();
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		sc.close();

	}

}

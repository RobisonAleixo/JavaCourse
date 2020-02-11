package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.print("Height: ");
		rectangle.height = sc.nextDouble();
		System.out.print("Width: ");
		rectangle.width = sc.nextDouble();
	
		System.out.print("AREA: " + String.format("%.2f", rectangle.area()));
		System.out.println();
		System.out.print("PERIMETER: " + String.format("%.2f", rectangle.perimeter()));
		System.out.println();
		System.out.print("DIAGONAL: " + String.format("%.2f", rectangle.diagonal()));
		
		sc.close();

	}

}

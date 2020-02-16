package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Shape> list = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");
		int numberOfShapes = sc.nextInt();

		for (int i = 1; i <= numberOfShapes; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char shapeChoice = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());

			if (shapeChoice == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
				System.out.println();
			} else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		}

		System.out.println();
		
		for(Shape shape : list) {
			System.out.println("SHAPE AREAS:");
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();
	}
}

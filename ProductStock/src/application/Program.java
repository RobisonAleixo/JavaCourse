package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product prod = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		prod.name = sc.nextLine();
		System.out.print("Price: ");
		prod.price = sc.nextDouble();
		System.out.print("Quantity: ");
		prod.quantity = sc.nextInt();
		System.out.println(prod);
		
		System.out.println();
		System.out.println("Updade data: " + prod);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		prod.addProducts(sc.nextInt());
		
		System.out.println();
		System.out.println("Updade data: " + prod);
				
		sc.close();

	}

}

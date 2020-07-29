package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double dollarPrice;
		double dollarAmount;
		
		System.out.print("What is the dollar price: ");
		dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will br bouht: ");
		dollarAmount = sc.nextDouble();

		System.out.printf("Amount to be paid in reais: %.2f%n", 
				CurrencyConverter.converter(dollarPrice, dollarAmount));
		
		sc.close();

	}

}

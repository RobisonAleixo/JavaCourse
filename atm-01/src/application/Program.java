package application;

import java.util.Scanner;

import entities.Client;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Client client01;
		

		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)?");
		char answer = sc.next().charAt(0);
		
		if (answer == 'y') {
			System.out.print("Enter initial deposit value: ");
			double balance = sc.nextDouble();
			client01 = new Client(accountNumber, name, balance);
		} else {
			client01 = new Client(accountNumber, name);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(client01);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		client01.deposit(amount);
		System.out.println("Updated account data:");
		System.out.println(client01);
		System.out.println();

		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		client01.withdraw(amount);
		System.out.println("Updated account data:");
		System.out.println(client01);
		System.out.println();

		sc.close();
	}

}


// Essa parte do jogo terá intuito de testar
// a rolagem dos numeros afim de testar 
// o extresse de memoria.


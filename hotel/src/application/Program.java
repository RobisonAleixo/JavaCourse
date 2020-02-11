package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Room[] room = new Room[10];

		System.out.print("How many rooms will be rented? ");
		int rented = sc.nextInt();

		System.out.println();

		for (int i = 0; i != rented; i++) {
			System.out.println("Rent #" + (1 + i) + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int numberRoom = sc.nextInt();
			room[numberRoom] = new Room(name, email, numberRoom);
			System.out.println();
		}

		System.out.println("Busy rooms: ");

		for (int i = 0; i != room.length; i++) {
			if (room[i] != null) {
				System.out.println(i + ": " + room[i].getName() + ", " + room[i].getEmail());
			}

		}

		sc.close();

	}

}
